package io.github.composefluent.plugin.build

import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import org.gradle.api.GradleException
import org.gradle.kotlin.dsl.findByType
import org.jetbrains.compose.desktop.application.dsl.AbstractDistributions
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree

@OptIn(ExperimentalWasmDsl::class, ExperimentalKotlinGradlePluginApi::class)
fun KotlinMultiplatformExtension.applyTargets(namespaceModule: String = "") {
    jvm()

    extensions.findByType<KotlinMultiplatformAndroidLibraryTarget>()?.apply {
        compileSdk = BuildConfig.Android.compileSdkVersion
        namespace = "${BuildConfig.packageName}$namespaceModule"
        androidResources.enable = true
    }

    jvmToolchain(BuildConfig.Jvm.jvmToolchainVersion)
    wasmJs { browser() }
    js { browser() }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    macosX64()

    applyDefaultHierarchyTemplate {
        sourceSetTrees(KotlinSourceSetTree.main, KotlinSourceSetTree.test)

        common {
            group("jvm") {
                withJvm()
            }

            group("skiko") {
                withJvm()
                group("native")
                group("web")
            }

            group("jvmCommon") {
                group("jvm")
                group("android")
            }

            group("desktop") {
                group("macos")
                group("mingw")
                group("linux")
                group("jvm")
            }

            group("android") {
                withCompilations { it.platformType == KotlinPlatformType.androidJvm }
            }
        }

    }
}

fun getTarget(): String {
    // 1. 动态确定当前平台对应的 Kotlin/Native 目标名称
    val os = System.getProperty("os.name")
    val arch = System.getProperty("os.arch")
    val currentTargetName = when {
        os.startsWith("Mac OS X") -> if (arch == "aarch64") "macosArm64" else "macosX64"
        os.startsWith("Windows") -> "windowsX64"
        os.startsWith("Linux") -> "linuxX64"
        else -> throw GradleException("Unsupported OS for native distribution: '$os'")
    }
    return currentTargetName
}

fun AbstractDistributions.applyDistributions(
    vararg formats: TargetFormat = arrayOf(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
) {
    targetFormats(formats = formats)
    packageName = "Compose Fluent Design Gallery"
    packageVersion = BuildConfig.integerVersionName

}
