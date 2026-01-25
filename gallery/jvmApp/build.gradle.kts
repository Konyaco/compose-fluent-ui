import io.github.composefluent.plugin.build.BuildConfig
import io.github.composefluent.plugin.build.applyDistributions
import io.github.composefluent.plugin.build.getTarget
import io.github.composefluent.plugin.build.mac.configureMacOSPackageTask
import org.jetbrains.compose.desktop.application.tasks.AbstractJPackageTask
import kotlin.text.startsWith

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
}
kotlin {
    jvmToolchain(BuildConfig.Jvm.jvmToolchainVersion)
}
dependencies {
    implementation(compose.desktop.currentOs)
    implementation(libs.compose.components.resources)
    implementation(project(":gallery:sharedApp"))
}

compose.desktop {
    application {
        mainClass = "${BuildConfig.packageName}.gallery.MainKt"
        buildTypes.release.proguard {
            configurationFiles.from(
                project.file("proguard-rules.jvm.pro"),
                project.file("../sharedApp/proguard-rules.common.pro")
            )
        }
        nativeDistributions {
            applyDistributions()
            macOS {
                iconFile.set(project.file("../icons/icon.icns"))
                jvmArgs(
                    "-Dapple.awt.application.appearance=system"
                )
            }
            windows {
                iconFile.set(project.file("../icons/icon.ico"))
                upgradeUuid = "a23572e1-c6fd-4b76-98ec-1e45953eb941"
                shortcut = true
                menu = true
                perUserInstall = true
            }
            linux {
                iconFile.set(project.file("../icons/icon.png"))
            }
        }
    }
}

if (getTarget().startsWith("macos")) {

    project.afterEvaluate {

        listOf(
            "createDistributable",
            "createReleaseDistributable",
        ).forEach { name ->
            tasks.named<AbstractJPackageTask>(name) {
                configureMacOSPackageTask(
                    packageName = packageName,
                    iconFile = iconFile,
                    destinationDir = destinationDir,
                    replaceIconFile = false,
                    assetsCarFile = project.file("../icons/Assets.car"),
                )
            }
        }
    }

}
