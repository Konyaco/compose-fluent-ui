plugins {
    kotlin("multiplatform") version "1.7.20" apply false
    id("org.jetbrains.compose") version "1.3.0-beta04-dev873" apply false
    id("com.android.library") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}

group = "com.konyaco.fluent"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}