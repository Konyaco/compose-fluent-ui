import com.android.build.api.variant.impl.VariantOutputImpl
import com.codingfeline.buildkonfig.compiler.FieldSpec
import com.konyaco.fluent.plugin.build.BuildConfig
import com.konyaco.fluent.plugin.build.applyTargets
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.build.konfig)
}

kotlin {
    applyTargets(publish = false)
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

    sourceSets {
        val commonMain by getting {
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
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(libs.androidx.activity.compose)
            }
        }
        val androidUnitTest by getting
        val androidInstrumentedTest by getting {
            dependencies {
                implementation(libs.androidx.test.junit)
            }
        }
        val desktopMain by getting {
            dependencies {
                implementation(compose.preview)
                implementation(libs.window.styler)
                implementation(libs.jna.platform)
                implementation(libs.jna)
            }
        }
        val desktopTest by getting
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
        coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.9")
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
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Compose Fluent Design Gallery"
            packageVersion = BuildConfig.integerVersionName
            macOS {
                iconFile.set(project.file("icons/icon.icns"))
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