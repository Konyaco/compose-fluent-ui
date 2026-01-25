package io.github.composefluent.plugin.build.mac

import org.gradle.api.Task
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.newInstance
import java.io.File
import javax.inject.Inject

interface Injected {
    @get:Inject
    val fs: FileSystemOperations
}

// apply the icon composer for macos distributable
fun Task.configureMacOSPackageTask(
    packageName: Property<String>,
    iconFile: RegularFileProperty,
    destinationDir: DirectoryProperty,
    replaceIconFile: Boolean = false,
    assetsCarFile: File,
    doLast: (resourceDir: File, injected: Injected) -> Unit = { _, _ -> }
) {
    inputs.file(assetsCarFile)
    val injected = project.objects.newInstance<Injected>()

    doLast {
        val appContentDir = destinationDir.get().asFile.resolve("${packageName.get()}.app").resolve("Contents")
        val bundleResourceDir = appContentDir.resolve("Resources")
        val infoListFile = appContentDir.resolve("Info.plist")
        val infoListFileContent = infoListFile.readText()
        if (!infoListFileContent.contains("CFBundleIconName")) {
            infoListFile.writeText(
                text = infoListFileContent.replace(
                    "<key>CFBundleIconFile</key>","<key>CFBundleIconName</key>\n<string>${iconFile.get().asFile.nameWithoutExtension}</string>\n<key>CFBundleIconFile</key>"
                )
            )

        }
        injected.fs.copy {
            from(assetsCarFile)
            into(bundleResourceDir)
        }
        if (replaceIconFile) {
            val oldIconFile = bundleResourceDir.resolve("${packageName}.icns")
            oldIconFile.renameTo(bundleResourceDir.resolve(iconFile.get().asFile.name))
        }
        doLast(bundleResourceDir, injected)
    }
}