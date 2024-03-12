import com.konyaco.fluent.plugin.build.BuildConfig
import com.konyaco.fluent.plugin.build.applyTargets

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
    applyTargets()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.foundation)
            }
        }
        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
        val desktopTest by getting
    }
}

android {
    compileSdk = BuildConfig.Android.compileSdkVersion
    namespace = "${BuildConfig.packageName}.icons"
    defaultConfig {
        minSdk = BuildConfig.Android.minSdkVersion
    }
    compileOptions {
        sourceCompatibility = BuildConfig.Jvm.javaVersion
        targetCompatibility = BuildConfig.Jvm.javaVersion
    }
}