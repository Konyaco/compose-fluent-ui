package com.konyaco.fluent.plugin.build

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

fun KotlinMultiplatformExtension.applyTargets(publish: Boolean = true) {
    jvm("desktop")
    androidTarget {
        if (publish) publishLibraryVariants("release")
    }
    jvmToolchain(BuildConfig.Jvm.jvmToolchainVersion)
}