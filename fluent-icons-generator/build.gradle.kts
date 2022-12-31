plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-java:2.2.1")
                implementation("org.jsoup:jsoup:1.15.3")
                implementation("com.google.guava:guava:31.1-jre")
                implementation("com.android.tools:common:27.2.0-alpha16")
                implementation("com.android.tools:sdk-common:27.2.0-alpha16")
                implementation("com.squareup:kotlinpoet:1.12.0")
            }
        }
        val jvmTest by getting
    }
}