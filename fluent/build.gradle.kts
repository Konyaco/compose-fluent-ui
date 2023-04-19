plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("com.android.library")
    id("maven-publish")
    signing
}

group = "com.konyaco"
version = "0.0.1-dev4"

kotlin {
    jvm()
    android("android") {
        publishLibraryVariants("release")
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.foundation)
                api(project(":fluent-icons-core"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                api("androidx.appcompat:appcompat:1.6.1")
                api("androidx.core:core-ktx:1.10.0")
            }
        }
        val androidUnitTest by getting
        val androidInstrumentedTest by getting
        val jvmMain by getting {
            dependencies {
                api(compose.preview)
            }
        }
        val jvmTest by getting
    }
}

android {
    compileSdk = 33
    namespace = "com.konyaco.fluent"
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        jvmToolchain(11)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    publications.withType<MavenPublication> {
        artifact(javadocJar.get())
        pom {
            name.set("compose-fluent-ui")
            description.set("A Fluent Design UI library for compose-multiplatform.")
            url.set("https://github.com/Konyaco/compose-fluent-ui")

            licenses {
                license {
                    name.set("The Apache License, Version 2.0")
                    url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                }
            }

            developers {
                developer {
                    name.set("Kon Yaco")
                    email.set("atwzj233@gmail.com")
                    url.set("https://github.com/Konyaco")
                }
            }

            scm {
                url.set("https://github.com/Konyaco/compose-fluent-ui")
                connection.set("scm:git:git://github.com/Konyaco/compose-fluent-ui.git")
                developerConnection.set("scm:git:ssh://github.com/Konyaco/compose-fluent-ui.git")
            }
        }
    }
    repositories {
        maven {
            val releasesUrl ="https://s01.oss.sonatype.org/content/repositories/snapshots/"
            val snapshotsUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            name = "OSSRH"
            url = uri(
                if (version.toString().endsWith("SNAPSHOT")) releasesUrl
                else snapshotsUrl
            )
            credentials {
                username = System.getenv("OSSRH_USERNAME")
                password = System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}

signing {
    useInMemoryPgpKeys(
        System.getenv("SIGNING_KEY_ID"),
        System.getenv("SIGNING_KEY"),
        System.getenv("SIGNING_PASSWORD")
    )
    sign(publishing.publications)
}