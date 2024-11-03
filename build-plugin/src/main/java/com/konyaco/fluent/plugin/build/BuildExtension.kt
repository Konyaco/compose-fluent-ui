package com.konyaco.fluent.plugin.build

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree

@OptIn(ExperimentalWasmDsl::class, ExperimentalKotlinGradlePluginApi::class)
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

    applyHierarchyTemplate {
        sourceSetTrees(KotlinSourceSetTree.main, KotlinSourceSetTree.test)

        common {
            group("skiko") {
                withCompilations {
                    it.target.platformType != KotlinPlatformType.androidJvm
                }
            }

            group("jvmAndAndroid") {
                withJvm()
                withAndroidTarget()
            }

            group("jsAndWasm") {
                withJs()
                withWasmJs()
            }

            group("apple") {
                withApple()
            }

            group("ios") {
                withIos()
            }
        }
    }
}