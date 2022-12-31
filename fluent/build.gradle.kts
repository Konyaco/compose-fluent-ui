plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.konyaco.fluent"
version = "0.0.1-dev2"

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
                implementation(compose.desktop.currentOs)
                api(project(":fluent-icons-core"))
            }
        }
        val jvmTest by getting
    }
}
