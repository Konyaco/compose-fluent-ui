package com.konyaco.fluent.gallery.jna.windows

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.ui.awt.ComposeWindow
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTBOTTOM
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTBOTTOMLEFT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTBOTTOMRIGHT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTLEFT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTRIGHT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTTOP
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTTOPLEFT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTTOPRIGHT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_NCCALCSIZE
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_NCHITTEST
import com.konyaco.fluent.gallery.jna.windows.structure.WindowMargins
import com.mayakapps.compose.windowstyler.findSkiaLayer
import com.sun.jna.Native
import com.sun.jna.NativeLibrary
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinDef.HWND
import com.sun.jna.platform.win32.WinDef.UINT
import com.sun.jna.platform.win32.WinDef.LPARAM
import com.sun.jna.platform.win32.WinDef.WPARAM
import com.sun.jna.platform.win32.WinDef.LRESULT
import com.sun.jna.platform.win32.BaseTSD.LONG_PTR
import com.sun.jna.platform.win32.WinUser
import com.sun.jna.platform.win32.WinUser.WM_DESTROY
import com.sun.jna.platform.win32.WinUser.WM_SIZE
import com.sun.jna.platform.win32.WinUser.WS_CAPTION
import com.sun.jna.platform.win32.WinUser.WS_SYSMENU
import java.awt.Window

internal class ComposeWindowProcedure(
    private val window: Window,
    private val hitTest: (x: Float, y: Float) -> Int,
    private val onWindowInsetUpdate: (WindowInsets) -> Unit
) : WindowProcedure {
    private val windowPointer = (this.window as? ComposeWindow)
        ?.windowHandle
        ?.let(::Pointer)
        ?: Native.getWindowPointer(this.window)

    val windowHandle = HWND(windowPointer)

    private var hitResult = 1

    private val margins = WindowMargins(
        leftBorderWidth = 0,
        topBorderHeight = 0,
        rightBorderWidth = -1,
        bottomBorderHeight = -1
    )

    //     The default window procedure to call its methods when the default method behaviour is desired/sufficient
    private var defaultWindowProcedure = User32Extend.instance?.setWindowLong(windowHandle, WinUser.GWL_WNDPROC, this) ?: LONG_PTR(-1)

    private var dpi = UINT(0)
    private var width = 0
    private var height = 0
    private var frameX = 0
    private var frameY = 0
    private var edgeX = 0
    private var edgeY = 0
    private var padding = 0
    private var isMaximized = User32Extend.instance?.isWindowInMaximized(windowHandle) ?: false

    val skiaLayerProcedure = (window as? ComposeWindow)?.findSkiaLayer()?.let {
        SkiaLayerWindowProcedure(
            skiaLayer = it,
            hitTest = { x, y ->
                val horizontalPadding = frameX
                val verticalPadding = frameY
                // Hit test for resizer border
                hitResult = when {
                    // skip resizer border hit test if window is maximized
                    isMaximized -> hitTest(x, y)
                    x <= horizontalPadding && y > verticalPadding && y < height - verticalPadding -> HTLEFT
                    x <= horizontalPadding && y <= verticalPadding -> HTTOPLEFT
                    x <= horizontalPadding -> HTBOTTOMLEFT
                    y <= verticalPadding && x > horizontalPadding && x < width - horizontalPadding -> HTTOP
                    y <= verticalPadding && x <= horizontalPadding -> HTTOPLEFT
                    y <= verticalPadding -> HTTOPRIGHT
                    x >= width - horizontalPadding && y > verticalPadding && y < height - verticalPadding -> HTRIGHT
                    x >= width - horizontalPadding && y <= verticalPadding -> HTTOPRIGHT
                    x >= width - horizontalPadding -> HTBOTTOMRIGHT
                    y >= height - verticalPadding && x > horizontalPadding && x < width - horizontalPadding -> HTBOTTOM
                    y >= height - verticalPadding && x <= horizontalPadding -> HTBOTTOMLEFT
                    y >= height - verticalPadding -> HTBOTTOMRIGHT
                    // else hit test by user
                    else -> hitTest(x, y)
                }
                hitResult
            }
        )
    }

    init {
        enableResizability()
        enableBorderAndShadow()
    }

    override fun callback(hWnd: HWND, uMsg: Int, wParam: WPARAM, lParam: LPARAM): LRESULT {
        return when (uMsg) {
            // Returns 0 to make the window not draw the non-client area (title bar and border)
            // thus effectively making all the window our client area
            WM_NCCALCSIZE -> {
                if (wParam.toInt() == 0) {
                    User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hWnd, uMsg, wParam, lParam) ?: LRESULT(0)
                } else {
                    val user32 = User32Extend.instance ?: return LRESULT(0)
                    dpi = user32.GetDpiForWindow(hWnd)
                    frameX = user32.GetSystemMetricsForDpi(WinUser.SM_CXFRAME, dpi)
                    frameY = user32.GetSystemMetricsForDpi(WinUser.SM_CYFRAME, dpi)
                    edgeX = user32.GetSystemMetricsForDpi(WinUser.SM_CXEDGE, dpi)
                    edgeY = user32.GetSystemMetricsForDpi(WinUser.SM_CYEDGE, dpi)
                    padding = user32.GetSystemMetricsForDpi(WinUser.SM_CXPADDEDBORDER, dpi)
                    isMaximized = user32.isWindowInMaximized(hWnd)
                    // Edge inset padding for non-client area
                    onWindowInsetUpdate(
                        WindowInsets(
                            left = if (isMaximized) {
                                frameX + padding
                            } else {
                                edgeX
                            },
                            right = if (isMaximized) {
                                frameX + padding
                            } else {
                                edgeX
                            },
                            top = if (isMaximized) {
                                frameY + padding
                            } else {
                                edgeY
                            },
                            bottom = if (isMaximized) {
                                frameY + padding
                            } else {
                                edgeY
                            }
                        )
                    )
                    LRESULT(0)
                }

            }

            WM_NCHITTEST -> {
                // Hit test result return
                return LRESULT(hitResult.toLong())
            }

            WM_DESTROY -> {
                User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hWnd, uMsg, wParam, lParam) ?: LRESULT(0)
            }

            WM_SIZE -> {
                width = lParam.toInt() and 0xFFFF
                height = (lParam.toInt() shr 16) and 0xFFFF
                User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hWnd, uMsg, wParam, lParam) ?: LRESULT(0)
            }

            else -> {
                User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hWnd, uMsg, wParam, lParam) ?: LRESULT(0)
            }
        }
    }

    /**
     * For this to take effect, also set `resizable` argument of Compose Window to `true`.
     */
    private fun enableResizability() {
        // Enable window resizing and remove standard caption bar
        User32Extend.instance?.updateWindowStyle(windowHandle) { oldStyle ->
            (oldStyle or WS_CAPTION) and WS_SYSMENU.inv()
        }
    }

    /**
     * To disable window border and shadow, pass (0, 0, 0, 0) as window margins
     * (or, simply, don't call this function).
     */
    private fun enableBorderAndShadow() {
        val dwmApi = "dwmapi"
            .runCatching(NativeLibrary::getInstance)
            .onFailure { println("Could not load dwmapi library") }
            .getOrNull()
        dwmApi
            ?.runCatching { getFunction("DwmExtendFrameIntoClientArea") }
            ?.onFailure { println("Could not enable window native decorations (border/shadow/rounded corners)") }
            ?.getOrNull()
            ?.invoke(arrayOf(windowHandle, margins))
    }



}