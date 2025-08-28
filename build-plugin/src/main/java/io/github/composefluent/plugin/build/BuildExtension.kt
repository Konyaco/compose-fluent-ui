package io.github.composefluent.plugin.build

import com.android.build.api.dsl.androidLibrary
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree

@OptIn(ExperimentalWasmDsl::class, ExperimentalKotlinGradlePluginApi::class)
fun KotlinMultiplatformExtension.applyTargets(namespaceModule: String = "") {
    jvm("desktop")

    try {
        androidLibrary {
            compileSdk = 35
            namespace = "${BuildConfig.packageName}$namespaceModule"
        }
    } catch (_: IllegalStateException) {
        // handle exception when android library plugin was not applied
        androidTarget()
    }

    jvmToolchain(BuildConfig.Jvm.jvmToolchainVersion)
    wasmJs { browser() }
    js { browser() }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    macosX64()

    applyHierarchyTemplate {
        sourceSetTrees(KotlinSourceSetTree.main, KotlinSourceSetTree.test)

        common {
            group("skiko") {
                group("jvm")
                group("native")
                group("web")
            }

            group("android") {
                withAndroidTarget()
                withCompilations { it.target.name == "android" }
            }

            group("jvm") {
                withJvm()
            }

            group("jvmCommon") {
                group("jvm")
                group("android")
            }

            group("web") {
                withJs()
                withWasmJs()
            }

            group("native") {
                group("apple")
                group("mingw")
                group("linux")
            }

            group("apple") {
                group("ios")
                group("macos")
                group("tvos")
                group("watchos")
            }

            group("tvos") {
                withTvos()
            }

            group("watchos") {
                withWatchos()
            }

            group("ios") {
                withIos()
            }

            group("macos") {
                withMacos()
            }

            group("mingw") {
                withMingw()
            }

            group("linux") {
                withLinux()
            }

            group("desktopCommon") {
                group("macos")
                group("mingw")
                group("linux")
                group("jvm")
            }
        }
    }
}