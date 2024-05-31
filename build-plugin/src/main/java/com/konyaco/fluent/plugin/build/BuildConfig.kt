package com.konyaco.fluent.plugin.build

import org.gradle.api.JavaVersion

object BuildConfig {

    const val group = "com.konyaco"

    const val packageName = "$group.fluent"

    const val libraryVersion = "0.0.1-dev.8"

    object Android {
        const val compileSdkVersion = 34

        const val minSdkVersion = 24
    }

    object Jvm {
        const val jvmToolchainVersion = 17
        val javaVersion = JavaVersion.VERSION_17
    }
}