package com.konyaco.fluent.plugin.build

import org.gradle.api.JavaVersion

object BuildConfig {

    const val group = "com.konyaco"

    const val packageName = "$group.fluent"

    internal const val snapshotLibraryVersion = "0.1.0-SNAPSHOT"

    val isRelease = System.getenv("PROJECT_BUILD_TYPE") == "release"

    var libraryVersion: String = snapshotLibraryVersion
        internal set

    var integerVersionName: String = ""
        internal set

    object Android {
        const val compileSdkVersion = 34

        const val minSdkVersion = 24
    }

    object Jvm {
        const val jvmToolchainVersion = 17
        val javaVersion = JavaVersion.VERSION_17
    }
}