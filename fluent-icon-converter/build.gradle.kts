plugins {
    kotlin("multiplatform")
    application
}

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
                implementation("io.ktor:ktor-client-java:2.2.1")
                implementation("org.jsoup:jsoup:1.15.3")
//                implementation("com.github.DevSrSouza:svg-to-compose:0.8.1")
                // https://mvnrepository.com/artifact/com.google.guava/guava
                implementation("com.google.guava:guava:31.1-jre")
                implementation("com.android.tools:common:27.2.0-alpha16")
                implementation("com.android.tools:sdk-common:27.2.0-alpha16")
                // https://mvnrepository.com/artifact/com.squareup/kotlinpoet
                implementation("com.squareup:kotlinpoet:1.12.0")

//                implementation(compose.desktop.currentOs)
//                implementation(project(":fluent"))
            }
        }
        val jvmTest by getting
    }
}

application {
    mainClass.set("ConvertToXmlKt")
}