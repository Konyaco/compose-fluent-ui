package com.konyaco.fluent.gallery.jna.windows

import com.sun.jna.Native
import com.sun.jna.Platform
import com.sun.jna.platform.win32.User32
import com.sun.jna.platform.win32.WinDef.HWND
import com.sun.jna.platform.win32.WinDef.WPARAM
import com.sun.jna.platform.win32.WinDef.LPARAM
import com.sun.jna.platform.win32.WinDef.LRESULT
import com.sun.jna.platform.win32.WinUser.WindowProc
import com.sun.jna.platform.win32.BaseTSD.LONG_PTR
import com.sun.jna.platform.win32.WinDef.POINT
import com.sun.jna.platform.win32.WinDef.UINT
import com.sun.jna.platform.win32.WinUser
import com.sun.jna.win32.W32APIOptions

@Suppress("FunctionName")
internal interface User32Extend : User32 {

    fun SetWindowLong(hWnd: HWND, nIndex: Int, wndProc: WindowProc): LONG_PTR

    fun SetWindowLongPtr(hWnd: HWND, nIndex: Int, wndProc: WindowProc): LONG_PTR

    fun CallWindowProc(
        proc: LONG_PTR,
        hWnd: HWND,
        uMsg: Int,
        uParam: WPARAM,
        lParam: LPARAM
    ): LRESULT

    fun GetSystemMetricsForDpi(nIndex: Int, dpi: UINT): Int

    fun GetDpiForWindow(hWnd: HWND): UINT

    fun ScreenToClient(hWnd: HWND, lpPoint: POINT): Boolean


    companion object {

        val instance by lazy {
            runCatching {
                Native.load(
                    "user32",
                    User32Extend::class.java,
                    W32APIOptions.DEFAULT_OPTIONS
                )
            }
                .onFailure { println("Could not load user32 library") }
                .getOrNull()
        }
    }
}

internal fun User32Extend.setWindowLong(hWnd: HWND, nIndex: Int, procedure: WindowProcedure): LONG_PTR {
    return if (Platform.is64Bit()) {
        SetWindowLongPtr(hWnd, nIndex, procedure)
    } else {
        SetWindowLong(hWnd, nIndex, procedure)
    }
}

internal fun User32.isWindowInMaximized(hWnd: HWND): Boolean {
    val placement = WinUser.WINDOWPLACEMENT()
    val result = GetWindowPlacement(hWnd, placement)
        .booleanValue() && placement.showCmd == WinUser.SW_SHOWMAXIMIZED
    placement.clear()
    return result
}

internal fun User32.updateWindowStyle(hWnd: HWND, styleBlock: (oldStyle: Int) -> Int) {
    val oldStyle = GetWindowLong(hWnd, WinUser.GWL_STYLE)
    SetWindowLong(hWnd, WinUser.GWL_STYLE, styleBlock(oldStyle))
}