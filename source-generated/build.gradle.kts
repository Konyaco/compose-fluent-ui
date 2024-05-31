import com.konyaco.fluent.plugin.build.BuildConfig
import com.konyaco.fluent.plugin.build.applyTargets

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.library)
}

kotlin {
    applyTargets(publish = false)
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":fluent-icons-core"))
                implementation(project(":fluent-icons-extended"))
                implementation(compose.ui)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "${BuildConfig.packageName}.generated"
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