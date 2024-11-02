package com.konyaco.fluent.plugin.build

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

@OptIn(ExperimentalWasmDsl::class)
fun KotlinMultiplatformExtension.applyTargets(publish: Boolean = true) {
    jvm("desktop")
    androidTarget {
        if (publish) publishLibraryVariants("release")
    }
    jvmToolchain(BuildConfig.Jvm.jvmToolchainVersion)
    wasmJs { browser() }
    js { browser() }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
}