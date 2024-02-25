import com.konyaco.fluent.plugin.build.BuildConfig

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = BuildConfig.group
version = BuildConfig.libraryVersion

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(libs.squareup.kotlinpoet)
                implementation("com.google.devtools.ksp:symbol-processing-api:${libs.versions.ksp.get()}")
                implementation("com.google.devtools.ksp:symbol-processing:${libs.versions.ksp.get()}")
                implementation(kotlin("compiler"))
            }
        }
    }
}