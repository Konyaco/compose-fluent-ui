plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("com.android.library")
}

kotlin {
    android()
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":fluent"))
                api(project(":fluent-icons-extended"))
            }
        }
        val commonTest by getting
        val androidMain by getting
        val androidUnitTest by getting
        val androidInstrumentedTest by getting
        val jvmMain by getting
        val jvmTest by getting
    }
    jvmToolchain(11)
}

android {
    compileSdk = 33
    namespace = "com.konyaco.fluent.example"
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}