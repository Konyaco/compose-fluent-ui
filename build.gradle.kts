plugins {
    kotlin("multiplatform") version "1.8.0" apply false
    id("org.jetbrains.compose") version "1.3.1" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

group = "com.konyaco"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
