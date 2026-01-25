package io.github.composefluent.plugin.build

import org.gradle.api.JavaVersion

object BuildConfig {

    const val group = "io.github.compose-fluent"

    const val packageName = "io.github.composefluent"

    internal const val snapshotLibraryVersion = "0.2.0-SNAPSHOT"

    val isRelease = System.getenv("PROJECT_BUILD_TYPE") == "release"

    var libraryVersion: String = snapshotLibraryVersion
        internal set

    var integerVersionName: String = ""
        internal set

    var branch: String = "dev"
        internal set

    object Android {
        const val compileSdkVersion = 36

        const val minSdkVersion = 24
    }

    object Jvm {
        const val jvmToolchainVersion = 17
        val javaVersion = JavaVersion.VERSION_17
    }
}