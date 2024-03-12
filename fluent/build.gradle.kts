import com.konyaco.fluent.plugin.build.BuildConfig
import com.konyaco.fluent.plugin.build.applyTargets
import org.jetbrains.compose.compose

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
                api(compose.foundation)
                api(project(":fluent-icons-core"))
                implementation(compose("org.jetbrains.compose.ui:ui-util"))
                implementation(libs.uuid)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting
        val androidUnitTest by getting
        val androidInstrumentedTest by getting
        val desktopMain by getting {
            dependencies {
                api(compose.preview)
            }
        }
        val desktopTest by getting
    }
}

android {
    compileSdk = BuildConfig.Android.compileSdkVersion
    namespace = BuildConfig.packageName
    defaultConfig {
        minSdk = BuildConfig.Android.minSdkVersion
    }
    compileOptions {
        sourceCompatibility = BuildConfig.Jvm.javaVersion
        targetCompatibility = BuildConfig.Jvm.javaVersion
    }
}