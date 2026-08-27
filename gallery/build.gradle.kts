import com.android.build.api.variant.impl.VariantOutputImpl
import com.codingfeline.buildkonfig.compiler.FieldSpec
import dev.nucleusframework.desktop.application.dsl.CompressionLevel
import dev.nucleusframework.desktop.application.dsl.NativeImageOptimization
import dev.nucleusframework.desktop.application.dsl.TargetFormat
import io.github.composefluent.plugin.build.BuildConfig
import io.github.composefluent.plugin.build.applyTargets
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose)
    alias(libs.plugins.compose.hotReload)
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.build.konfig)
    alias(libs.plugins.stability.analyzer)
    alias(libs.plugins.nucleus)
}

composeCompiler {
    stabilityConfigurationFiles.add(
        rootProject.layout.projectDirectory.file("compose_stability.conf")
    )
    if (providers.gradleProperty("composeReports").orNull == "true") {
        reportsDestination = layout.buildDirectory.dir("compose_compiler")
        metricsDestination = layout.buildDirectory.dir("compose_compiler")
    }
}

composeStabilityAnalyzer {
    // Gallery: opt-in module-wide recomposition tracing for IDE Heatmap / Doctor.
    // Off by default (noisy logs); enable with -PcomposeTrace=true.
    traceAll {
        enabled.set(providers.gradleProperty("composeTrace").orNull == "true")
        threshold.set(3)
        // KMP/desktop has no Android variants; runtime enable gate is the safety net.
        variants.set(listOf("debug", "desktop"))
    }
    stabilityValidation {
        enabled.set(true)
        outputDir.set(layout.projectDirectory.dir("stability"))
        includeTests.set(false)
        failOnStabilityChange.set(true)
        allowMissingBaseline.set(providers.environmentVariable("CI").orNull != "true")
        stabilityConfigurationFiles.add(
            rootProject.layout.projectDirectory.file("compose_stability.conf")
        )
    }
}

kotlin {
    applyTargets()
    wasmJs { binaries.executable() }
    js { binaries.executable() }

    // iosX64 dropped: Compose Multiplatform 1.11 no longer publishes iosx64 artifacts.
    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
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
                implementation(libs.kotlinx.datetime)
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
            implementation(libs.nucleus.application)
            implementation(libs.nucleus.window.tao)
            implementation(libs.nucleus.graalvm.runtime)
            // Live OS dark mode for ThemeMode.System (Tao has no AWT LocalSystemTheme).
            implementation(libs.nucleus.darkmode.detector)
            implementation(project(":decorated-window-fluent"))
        }
    }
}

android {
    compileSdk = BuildConfig.Android.compileSdkVersion
    namespace = BuildConfig.packageName + ".gallery"

    defaultConfig {
        minSdk = BuildConfig.Android.minSdkVersion
        targetSdk = BuildConfig.Android.compileSdkVersion
        versionCode = BuildConfig.androidVersionCode
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

nucleus.application {
    mainClass = "${BuildConfig.packageName}.gallery.MainKt"
    nativeDistributions {
        packageName = "compose-fluent-gallery"
        // Native installers only accept numeric versions: `integerVersionName` is
        // the plain X.Y.Z form of the version, without any pre-release suffix.
        packageVersion = BuildConfig.integerVersionName
        targetFormats(TargetFormat.Dmg, TargetFormat.Nsis, TargetFormat.Deb)
        compressionLevel = CompressionLevel.Ultra
        cleanupNativeLibs = true
        linux {
            debMaintainer = "Nucleus"
            homepage = BuildConfig.repositoryUrl
        }
    }
    graalvm {
        isEnabled = true
        javaLanguageVersion = 25
        imageName = "compose-fluent-gallery"
        optimization = NativeImageOptimization.SIZE
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

        buildConfigField(FieldSpec.Type.STRING, "PROJECT_URL", BuildConfig.repositoryUrl, const = true)
        // Git ref the source deep links resolve against: the tag on a release
        // build, the checked-out branch otherwise.
        buildConfigField(FieldSpec.Type.STRING, "SOURCE_REF", BuildConfig.branch, const = true)
        buildConfigField(FieldSpec.Type.BOOLEAN, "IS_RELEASE", BuildConfig.isReleaseBuild.toString(), const = true)
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