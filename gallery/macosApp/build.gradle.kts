import io.github.composefluent.plugin.build.applyDistributions
import io.github.composefluent.plugin.build.getTarget
import io.github.composefluent.plugin.build.mac.configureMacOSPackageTask
import org.gradle.kotlin.dsl.support.uppercaseFirstChar
import org.gradle.kotlin.dsl.withType
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.compose.desktop.application.tasks.AbstractNativeMacApplicationPackageAppDirTask
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import org.jetbrains.kotlin.gradle.plugin.mpp.Executable
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.KonanTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    listOf(
        macosX64(),
        macosArm64()
    ).forEach {
        it.binaries {
            executable {
                entryPoint = "io.github.composefluent.gallery.main"
                freeCompilerArgs += listOf(
                    "-linker-option", "-framework", "-linker-option", "Metal"
                )
                // TODO: the current release binary surprises LLVM, so disable checks for now.
                freeCompilerArgs += "-Xdisable-phases=VerifyBitcode"
            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":gallery:sharedApp"))
            }
        }
    }
}

compose.desktop {
    nativeApplication {
        targets(
            targets = kotlin.targets.filter {
                        it.platformType == KotlinPlatformType.native &&
                                it.name.contains("macos")
                    }.toTypedArray()
        )

        distributions {
            applyDistributions(TargetFormat.Dmg)
            macOS {
                iconFile.set(project.file("../icons/icon.icns"))
            }
        }
    }
}

val target = getTarget()
if (target.startsWith("macos")) {

    //Workaround for https://youtrack.jetbrains.com/issue/CMP-9568
    val syncComposeResourceForDebug by tasks.registering(Sync::class) {
        group = "build"
        into(layout.buildDirectory.dir("bin/${target}/debugExecutable/compose-resources/composeResources"))
        from(layout.buildDirectory.dir("kotlin-multiplatform-resources/aggregated-resources/${target}/composeResources"))
    }

    tasks.register("desktopNativeRun") {
        group = "run"
        dependsOn(tasks.named("runDebugExecutable${target.uppercaseFirstChar()}") {
            dependsOn(syncComposeResourceForDebug)
        })
    }

    tasks.named("linkDebugExecutable${getTarget().uppercaseFirstChar()}") {
        finalizedBy(syncComposeResourceForDebug)
    }
    listOf("Release", "Debug").forEach { buildType ->
        listOf("createDistributable", "packageDistribution").forEach { name ->
            tasks.register("${name}Native${buildType.uppercaseFirstChar()}ForCurrentOS") {
                group = "compose desktop (native)"
                val target = getTarget()
                val taskName = if (name == "packageDistribution") {
                    val targetFormat =
                        compose.desktop.nativeApplication.distributions.targetFormats.first { it.isCompatibleWithCurrentOS }
                    "package${targetFormat.name}Native${buildType}${target.uppercaseFirstChar()}"
                } else {
                    "${name}Native${buildType}${target.uppercaseFirstChar()}"
                }
                dependsOn(tasks.named(taskName))
            }
        }
    }
}

// Resource processor for macos arm64 target
kotlin.targets.withType<KotlinNativeTarget> {
    if (konanTarget === KonanTarget.MACOS_X64 || konanTarget === KonanTarget.MACOS_ARM64) {
        binaries.withType<Executable> {
            val packageTasks = tasks.withType<AbstractNativeMacApplicationPackageAppDirTask>()
            packageTasks.configureEach {

                configureMacOSPackageTask(
                    packageName = packageName,
                    iconFile = iconFile,
                    destinationDir = destinationDir,
                    replaceIconFile = true,
                    assetsCarFile = project.file("../icons/Assets.car"),
                )

            }
        }
    }
}
