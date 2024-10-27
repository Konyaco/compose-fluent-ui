package com.konyaco.fluent.plugin.build

import org.gradle.api.JavaVersion

object BuildConfig {

    const val group = "com.konyaco"

    const val packageName = "$group.fluent"

    private const val snapshotLibraryVersion = "0.1.0-SNAPSHOT"

    val isRelease = System.getenv("PROJECT_BUILD_TYPE") == "release"

    val gitTag = Runtime
        .getRuntime()
        .exec("git describe --abbrev=0 --tags")
        .inputReader()
        .readLine()

    val relativeCommitCount = Runtime
        .getRuntime()
        .exec("git describe --tags")
        .inputReader()
        .readLine()
        .removePrefix(gitTag)
        .let {
            if (it.isNotEmpty()) {
                it.split("-")[1].toInt()
            } else {
                0
            }
        }

    val libraryVersion = when {
        isRelease -> gitTag
        else -> snapshotLibraryVersion
    }

    val integerVersionName = libraryVersion
        .removePrefix("v")
        .removeSuffix("-SNAPSHOT")
        .substringBefore("-dev")
        .let {
            val parts = it.split(".")
            var major = parts.getOrNull(0) ?: "0"
            var minor = parts.getOrNull(1) ?: "0"
            if (major.startsWith("0")) {
                major = "1"
                minor = "0"
            }
            when(parts.size) {
                1, 2 -> "${major}.$minor.$relativeCommitCount"
                else -> {
                    val patchVersion = parts[2].toIntOrNull() ?: 0
                    "${major}.${minor}.${patchVersion * 200 + relativeCommitCount}"
                }
            }
        }

    object Android {
        const val compileSdkVersion = 34

        const val minSdkVersion = 24
    }

    object Jvm {
        const val jvmToolchainVersion = 17
        val javaVersion = JavaVersion.VERSION_17
    }
}