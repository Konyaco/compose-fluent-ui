import com.konyaco.fluent.plugin.build.BuildConfig
import com.konyaco.fluent.plugin.build.androidInstrumentedTest
import com.konyaco.fluent.plugin.build.applyTargets
import com.konyaco.fluent.plugin.build.desktopMain
import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsTargetDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.android.application)
    id("com.google.devtools.ksp") version libs.versions.ksp.get()
}

kotlin {
    applyTargets {
        publish = false
        fun KotlinJsTargetDsl.setup() {
            browser {
                commonWebpackConfig {
                    outputFileName = "gallery.js"
                    devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                        static = (static ?: mutableListOf()).apply {
                            add(project.projectDir.path)
                        }
                    }
                }
            }
            nodejs()
            binaries.executable()
        }
        configWasmJs { setup() }
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(compose.foundation)
                implementation(project(":fluent"))
                implementation(project(":fluent-icons-extended"))
                implementation(compose("org.jetbrains.compose.ui:ui-util"))
            }
            kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin")
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        androidMain.dependencies {
            implementation("androidx.activity:activity-compose:1.6.1")
        }
        androidInstrumentedTest.dependencies {
            implementation(libs.androidx.test.junit)
        }
        desktopMain {
            dependencies {
                implementation(compose.preview)
                implementation("com.mayakapps.compose:window-styler:0.3.3-SNAPSHOT")
            }
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
        versionName = "1.0"
        vectorDrawables {
            useSupportLibrary = true
        }

    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.android.pro")
        }
    }

    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }

    compileOptions {
        sourceCompatibility = BuildConfig.Jvm.javaVersion
        targetCompatibility = BuildConfig.Jvm.javaVersion
    }
}

compose {
    desktop {
        application {
            mainClass = "${BuildConfig.packageName}.gallery.MainKt"
            nativeDistributions {
                targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
                packageName = "Compose Fluent Design Gallery"
                packageVersion = "1.0.0"
            }
        }
    }
    experimental.web.application {}
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