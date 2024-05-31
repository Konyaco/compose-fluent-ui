import com.konyaco.fluent.plugin.build.BuildConfig
import com.konyaco.fluent.plugin.build.applyTargets

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.library)
    alias(libs.plugins.ksp)
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
                implementation(project(":fluent"))
                implementation(project(":fluent-icons-core"))
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
    namespace = "${BuildConfig.packageName}.icons.extended"
    defaultConfig {
        minSdk = BuildConfig.Android.minSdkVersion
    }
    compileOptions {
        sourceCompatibility = BuildConfig.Jvm.javaVersion
        targetCompatibility = BuildConfig.Jvm.javaVersion
    }
}

dependencies {
    val processor = (project(":source-generated-processor"))
    add("kspCommonMainMetadata", processor)
}

ksp {
    arg("source.generated.module.name", "FluentIconExtended")
    arg("source.generated.module.enabled", false.toString())
    arg("source.generated.icon.enabled", true.toString())
}