import com.android.build.api.variant.impl.VariantOutputImpl
import com.codingfeline.buildkonfig.compiler.FieldSpec
import io.github.composefluent.plugin.build.BuildConfig
import io.github.composefluent.plugin.build.applyTargets
import org.gradle.kotlin.dsl.newInstance
import org.gradle.kotlin.dsl.support.uppercaseFirstChar
import org.gradle.kotlin.dsl.withType
import org.jetbrains.compose.desktop.application.dsl.AbstractDistributions
import org.jetbrains.compose.desktop.application.dsl.AbstractMacOSPlatformSettings
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.compose.desktop.application.tasks.AbstractNativeMacApplicationPackageAppDirTask
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import org.jetbrains.kotlin.gradle.plugin.mpp.Executable
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jetbrains.kotlin.konan.target.KonanTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.hotReload)
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.build.konfig)
}

kotlin {
    applyTargets()
    wasmJs { binaries.executable() }
    js { binaries.executable() }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }

    listOf(
        macosX64(),
        macosArm64()
    ).forEach {
        it.binaries {
            executable {
                entryPoint = "io.github.composefluent.gallery.main"
                freeCompilerArgs += listOf(
                    "-linker-option", "-framework", "-linker-option", "Metal"
                )
                // TODO: the current release binary surprises LLVM, so disable checks for now.
                freeCompilerArgs += "-Xdisable-phases=VerifyBitcode"
            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(compose.foundation)
                implementation(compose.components.resources)
                implementation(project(":fluent"))
                implementation(project(":fluent-icons-extended"))
                implementation(compose.uiUtil)
                implementation(libs.highlights)
                implementation(project(":source-generated"))
            }
            kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin")
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        androidMain.dependencies {
            implementation(libs.androidx.activity.compose)
        }
        androidInstrumentedTest.dependencies {
            implementation(libs.androidx.test.junit)
        }
        named("desktopMain").dependencies {
            implementation(compose.desktop.currentOs)
            implementation(compose.preview)
            implementation(libs.window.styler)
            implementation(libs.jna.platform)
            implementation(libs.jna)
        }
    }
}

android {
    compileSdk = BuildConfig.Android.compileSdkVersion
    namespace = BuildConfig.packageName + ".gallery"

    defaultConfig {
        minSdk = BuildConfig.Android.minSdkVersion
        targetSdk = BuildConfig.Android.compileSdkVersion
        versionCode = 1
        versionName = BuildConfig.libraryVersion
        vectorDrawables {
            useSupportLibrary = true
        }

    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.android.pro",
                "proguard-rules.common.pro"
            )
            val signFile = System.getenv("ANDROID_SIGNING_FILE")
            signFile?.let {
                val password = System.getenv("ANDROID_SIGNING_PASSWORD")
                val keyAlias = System.getenv("ANDROID_SIGNING_KEY_ALIAS")
                val keyPassword = System.getenv("ANDROID_SIGNING_KEY_PASSWORD")
                signingConfig = signingConfigs.register("release") {
                    this.storeFile = file(signFile)
                    this.storePassword = password
                    this.keyAlias = keyAlias
                    this.keyPassword = keyPassword
                }.get()
            }
        }
    }

    androidComponents.onVariants { variant ->
        variant.outputs.forEach { output ->
            if (output is VariantOutputImpl) {
               output.apply {
                   outputFileName.set(
                       "${variant.applicationId.get()}-" +
                       "${versionName.get()}-" +
                       "${variant.buildType}.apk"
                   )
               }
            }
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }

    compileOptions {
        sourceCompatibility = BuildConfig.Jvm.javaVersion
        targetCompatibility = BuildConfig.Jvm.javaVersion
        isCoreLibraryDesugaringEnabled = true
    }
    dependencies {
        coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")
    }
}

compose.desktop {
    application {
        mainClass = "${BuildConfig.packageName}.gallery.MainKt"
        buildTypes.release.proguard {
            configurationFiles.from(
                project.file("proguard-rules.desktop.pro"),
                project.file("proguard-rules.common.pro")
            )
        }
        nativeDistributions {
            applyDistributions()
            macOS {
                applyCommonSetup()
                jvmArgs(
                    "-Dapple.awt.application.appearance=system"
                )
            }
            windows {
                iconFile.set(project.file("icons/icon.ico"))
                upgradeUuid = "a23572e1-c6fd-4b76-98ec-1e45953eb941"
                shortcut = true
                menu = true
                perUserInstall = true
            }
            linux {
                iconFile.set(project.file("icons/icon.png"))
            }
        }
    }

    nativeApplication {
        targets(
            targets = kotlin.targets.filter {
                        it.platformType == KotlinPlatformType.native &&
                                it.name.contains("macos")
                    }.toTypedArray()
        )

        distributions {
            applyDistributions(TargetFormat.Dmg)
            macOS {
                applyCommonSetup()
            }
        }
    }
}

buildkonfig {
    packageName = "${BuildConfig.packageName}.build"

    defaultConfigs {
        buildConfigField(FieldSpec.Type.STRING, "LIBRARY_VERSION", BuildConfig.libraryVersion, const = true)
        buildConfigField(FieldSpec.Type.STRING, "GALLERY_VERSION", BuildConfig.integerVersionName, const = true)
        buildConfigField(FieldSpec.Type.STRING, "COMPOSE_VERSION", libs.versions.compose.get(), const = true)
        buildConfigField(FieldSpec.Type.STRING, "KOTLIN_VERSION", libs.versions.kotlin.get(), const = true)
        buildConfigField(FieldSpec.Type.STRING, "HAZE_VERSION", libs.versions.haze.get(), const = true)

        buildConfigField(FieldSpec.Type.STRING, "CURRENT_BRANCH", BuildConfig.branch, const = true)
    }
}

dependencies {
    val processor = project(":gallery-processor")
    add("kspCommonMainMetadata", processor)
}

// workaround for KSP only in Common Main.
// https://github.com/google/ksp/issues/567
tasks.withType<KotlinCompilationTask<*>>().configureEach {
    if (name != "kspCommonMainKotlinMetadata") {
        dependsOn("kspCommonMainKotlinMetadata")
    }
}

fun AbstractDistributions.applyDistributions(
    vararg formats: TargetFormat = arrayOf(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
) {
    targetFormats(formats = formats)
    packageName = "Compose Fluent Design Gallery"
    packageVersion = BuildConfig.integerVersionName

}

fun AbstractMacOSPlatformSettings.applyCommonSetup() {
    iconFile.set(project.file("icons/icon.icns"))
}

tasks.register("desktopNativeRun") {
    group = "run"
    dependsOn(tasks.named("runDebugExecutable${getTarget().uppercaseFirstChar()}"))
}

listOf("Release", "Debug").forEach { buildType ->
    listOf("createDistributable", "packageDistribution").forEach { name ->
        tasks.register("${name}Native${buildType.uppercaseFirstChar()}ForCurrentOS") {
            group = "compose desktop (native)"
            val target = getTarget()
            val taskName = if (name == "packageDistribution") {
                val targetFormat = compose.desktop.nativeApplication.distributions.targetFormats.first { it.isCompatibleWithCurrentOS }
                "package${targetFormat.name}Native${buildType}${target.uppercaseFirstChar()}"
            } else {
                "${name}Native${buildType}${target.uppercaseFirstChar()}"
            }
            dependsOn(tasks.named(taskName))
        }
    }
}

interface Injected {
    @get:Inject val fs: FileSystemOperations
}

// Resource processor for macos arm64 target
kotlin.targets.withType<KotlinNativeTarget> {
    if (konanTarget === KonanTarget.MACOS_X64 || konanTarget === KonanTarget.MACOS_ARM64) {
        binaries.withType<Executable> {
            val packageTasks = tasks.withType<AbstractNativeMacApplicationPackageAppDirTask>()
            packageTasks.configureEach {
                val packageTask = this
                val allResourceFiles: FileCollection = project.files(
                    (compilation.associatedCompilations + compilation).flatMap { compilation ->
                        compilation.allKotlinSourceSets.map { it.resources }
                    }
                )
                inputs.files(allResourceFiles)
                val injected = project.objects.newInstance<Injected>()
                doLast {
                    val bundleResourceDir = packageTask.destinationDir.dir("${packageName.get()}.app/Contents/Resources")
                    val targetPath = bundleResourceDir.get().dir("compose-resources")
                    injected.fs.copy {
                        from(allResourceFiles)
                        into(targetPath)
                    }
                    val oldIconFile = bundleResourceDir.get().file("${packageName.get()}.icns")
                    oldIconFile.asFile.renameTo(bundleResourceDir.get().file(iconFile.get().asFile.name).asFile)
                }

            }
        }
    }
}

fun getTarget(): String {
    // 1. 动态确定当前平台对应的 Kotlin/Native 目标名称
    val os = System.getProperty("os.name")
    val arch = System.getProperty("os.arch")
    val currentTargetName = when {
        os.startsWith("Mac OS X") -> if (arch == "aarch64") "macosArm64" else "macosX64"
        os.startsWith("Windows") -> "windowsX64"
        os.startsWith("Linux") -> "linuxX64"
        else -> throw GradleException("Unsupported OS for native distribution: '$os'")
    }
    return currentTargetName
}