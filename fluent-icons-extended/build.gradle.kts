import com.konyaco.fluent.plugin.build.BuildConfig

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.library)
    id("maven-publish")
    signing
}

group = BuildConfig.group
version = BuildConfig.libraryVersion

kotlin {
    jvm()
    androidTarget {
        publishLibraryVariants("release")
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.foundation)
                implementation(project(":fluent"))
                implementation(project(":fluent-icons-core"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
        val jvmTest by getting
    }
    jvmToolchain(BuildConfig.Jvm.jvmToolchainVersion)
}

android {
    compileSdk = BuildConfig.Android.compileSdkVersion
    namespace = "${BuildConfig.packageName}.icons.extended"
    defaultConfig {
        minSdk = BuildConfig.Android.minSdkVersion
    }
    compileOptions {
        sourceCompatibility = BuildConfig.Jvm.javaVersion
        targetCompatibility = BuildConfig.Jvm.javaVersion
    }
}