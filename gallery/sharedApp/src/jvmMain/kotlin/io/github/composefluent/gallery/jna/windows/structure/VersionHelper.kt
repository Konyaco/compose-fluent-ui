package io.github.composefluent.gallery.jna.windows.structure

import com.sun.jna.platform.win32.Kernel32

val windowsBuildNumber by lazy {
    val buildNumber = Kernel32.INSTANCE.GetVersion().high.toInt()
    buildNumber
}

fun isWindows10OrLater() = windowsBuildNumber >= 10240

fun isWindows11OrLater() = windowsBuildNumber >= 22000

fun isWindows1122H2OrLater() = windowsBuildNumber >= 22621