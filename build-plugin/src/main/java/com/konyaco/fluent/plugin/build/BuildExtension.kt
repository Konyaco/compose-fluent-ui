@file:OptIn(ExperimentalKotlinGradlePluginApi::class)

package com.konyaco.fluent.plugin.build

import org.gradle.api.NamedDomainObjectContainer
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinWasmJsTargetDsl
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinSourceSetConvention
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree

@OptIn(ExperimentalWasmDsl::class, ExperimentalKotlinGradlePluginApi::class)
fun KotlinMultiplatformExtension.applyTargets(action: TargetSetupDsl.() -> Unit = {}) {
    val setup = TargetSetupDsl().apply(action)

    applyDefaultHierarchyTemplate {
        sourceSetTrees(KotlinSourceSetTree.main, KotlinSourceSetTree.test)
        common {
            group("skiko") {
                withIos()
                withJvm()
                withWasm()
            }
            group("nonDesktop") {
                withIos()
                withAndroidTarget()
                withWasm()
            }
        }
    }

    jvm("desktop")
    androidTarget { if (setup.publish) publishLibraryVariants("release") }
    wasmJs(setup.jsWasmTargetAction)

    jvmToolchain(BuildConfig.Jvm.jvmToolchainVersion)
}

class TargetSetupDsl {
    var publish: Boolean = true

    internal var jsWasmTargetAction: KotlinWasmJsTargetDsl.() -> Unit = {
        browser()
        binaries.library()
    }
        private set

    fun configWasmJs(action: KotlinWasmJsTargetDsl.() -> Unit) {
        jsWasmTargetAction = action
    }
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
val NamedDomainObjectContainer<KotlinSourceSet>.wasmJsMain by KotlinSourceSetConvention
val NamedDomainObjectContainer<KotlinSourceSet>.desktopMain by KotlinSourceSetConvention
val NamedDomainObjectContainer<KotlinSourceSet>.desktopTest by KotlinSourceSetConvention
val NamedDomainObjectContainer<KotlinSourceSet>.androidUnitTest by KotlinSourceSetConvention
val NamedDomainObjectContainer<KotlinSourceSet>.androidInstrumentedTest by KotlinSourceSetConvention