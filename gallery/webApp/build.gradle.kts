@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    listOf(wasmJs(), js()).forEach { target ->
        target.binaries.executable()
        target.browser()
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.compose.ui)
                implementation(project(":gallery:sharedApp"))
            }
        }
    }
}
