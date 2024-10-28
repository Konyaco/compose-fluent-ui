import com.android.build.api.variant.impl.VariantOutputImpl
import com.konyaco.fluent.plugin.build.BuildConfig
import com.konyaco.fluent.plugin.build.applyTargets
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
}

kotlin {
    applyTargets(publish = false)
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
                "proguard-rules.android.pro"
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
    }
}

compose.desktop {
    application {
        mainClass = "${BuildConfig.packageName}.gallery.MainKt"
        buildTypes.release.proguard {
            configurationFiles.from(project.file("proguard-rules.desktop.pro"))
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
            }
            linux {
                iconFile.set(project.file("icons/icon.png"))
            }
        }
    }
}

dependencies {
    val processor = project(":gallery-processor")
    add("kspCommonMainMetadata", processor)
}

// workaround for KSP only in Common Main.
// https://github.com/google/ksp/issues/567
tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().all {
    if (name != "kspCommonMainKotlinMetadata") {
        dependsOn("kspCommonMainKotlinMetadata")
    }
}