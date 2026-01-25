package io.github.composefluent.gallery.screen.menus

import org.jetbrains.skiko.hostOs

actual fun isMacOs(): Boolean {
    return hostOs.isMacOS
}