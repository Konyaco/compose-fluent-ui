plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.konyaco.fluent"
version = "0.0.1-dev3"

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":fluent"))
                implementation(compose.desktop.currentOs)
            }
        }
        val jvmTest by getting
    }
}
