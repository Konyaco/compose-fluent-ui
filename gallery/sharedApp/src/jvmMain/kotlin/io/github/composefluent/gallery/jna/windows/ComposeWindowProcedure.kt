package io.github.composefluent.gallery.jna.windows

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.awt.ComposeWindow
import androidx.compose.ui.graphics.Color
import io.github.composefluent.gallery.jna.windows.structure.MENUITEMINFO
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTBOTTOM
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTBOTTOMLEFT
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTBOTTOMRIGHT
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTCAPTION
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTLEFT
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTRIGHT
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTTOP
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTTOPLEFT
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTTOPRIGHT
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.MFT_STRING
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.MIIM_STATE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.SC_CLOSE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.SC_MOVE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.SC_RESTORE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.SC_SIZE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.TPM_RETURNCMD
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WA_INACTIVE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WINT_MAX
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WM_ACTIVATE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WM_NCCALCSIZE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WM_NCHITTEST
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WM_NCMOUSEMOVE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WM_NCRBUTTONUP
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.WM_SETTINGCHANGE
import io.github.composefluent.gallery.jna.windows.structure.WindowMargins
import io.github.composefluent.gallery.jna.windows.structure.isWindows11OrLater
import com.sun.jna.Native
import com.sun.jna.NativeLibrary
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Advapi32Util
import com.sun.jna.platform.win32.WinDef.HWND
import com.sun.jna.platform.win32.WinDef.UINT
import com.sun.jna.platform.win32.WinDef.LPARAM
import com.sun.jna.platform.win32.WinDef.WPARAM
import com.sun.jna.platform.win32.WinDef.LRESULT
import com.sun.jna.platform.win32.BaseTSD.LONG_PTR
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinDef.HMENU
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.platform.win32.WinReg
import com.sun.jna.platform.win32.WinUser
import com.sun.jna.platform.win32.WinUser.WM_DESTROY
import com.sun.jna.platform.win32.WinUser.WM_SIZE
import com.sun.jna.platform.win32.WinUser.WS_CAPTION
import com.sun.jna.platform.win32.WinUser.WS_SYSMENU
import com.sun.jna.ptr.IntByReference
import io.github.composefluent.gallery.window.findSkiaLayer
import org.jetbrains.skiko.currentSystemTheme
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
    private var isMaximized = User32Extend.instance?.isWindowInMaximized(windowHandle) == true

    var isWindowFrameAccentColorEnabled by mutableStateOf(isAccentColorWindowFrame())

    var windowFrameColor by mutableStateOf(currentAccentColor())

    var windowTheme by mutableStateOf(currentSystemTheme)

    var isWindowActive by mutableStateOf(true)

    val skiaLayerProcedure = (window as? ComposeWindow)?.findSkiaLayer()?.let {
        SkiaLayerWindowProcedure(
            skiaLayer = it,
            hitTest = { x, y ->
                updateWindowInfo()
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

            WM_NCRBUTTONUP -> {
                if (wParam.toInt() == HTCAPTION) {
                    val user32 = User32Extend.instance ?: return LRESULT(0)
                    val oldStyle = user32.GetWindowLong(hWnd, WinUser.GWL_STYLE)
                    user32.SetWindowLong(hWnd, WinUser.GWL_STYLE, oldStyle or WS_SYSMENU)
                    val menu = user32.GetSystemMenu(hWnd, false)
                    user32.SetWindowLong(hWnd, WinUser.GWL_STYLE, oldStyle)
                    isMaximized = user32.isWindowInMaximized(hWnd)
                    if (menu != null) {
                        // 更新菜单项状态
                        val menuItemInfo = MENUITEMINFO().apply {
                            cbSize = this.size()
                            fMask = MIIM_STATE
                            fType = MFT_STRING
                        }

                        updateMenuItemInfo(menu, menuItemInfo, SC_RESTORE, isMaximized)
                        updateMenuItemInfo(menu, menuItemInfo, SC_MOVE, !isMaximized)
                        updateMenuItemInfo(menu, menuItemInfo, SC_SIZE, !isMaximized)
                        updateMenuItemInfo(menu, menuItemInfo, WinUser.SC_MINIMIZE, true)
                        updateMenuItemInfo(menu, menuItemInfo, WinUser.SC_MAXIMIZE, !isMaximized)
                        updateMenuItemInfo(menu, menuItemInfo, SC_CLOSE, true)

                        // 设置默认菜单项
                        user32.SetMenuDefaultItem(menu, WINT_MAX, false)

                        // 获取鼠标位置
                        val lParamValue = lParam.toInt()
                        val x = lParamValue.lowWord
                        val y = lParamValue.highWord

                        // 显示菜单并获取用户选择
                        val ret = user32.TrackPopupMenu(menu, TPM_RETURNCMD, x, y, 0, hWnd, null)
                        if (ret != 0) {
                            // 发送系统命令
                            user32.PostMessage(
                                hWnd,
                                WinUser.WM_SYSCOMMAND,
                                WPARAM(ret.toLong()),
                                LPARAM(0),
                            )
                        }
                    }
                }
                User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hWnd, uMsg, wParam, lParam) ?: LRESULT(0)
            }

            WM_SETTINGCHANGE -> {
                val changedKey = Pointer(lParam.toLong()).getWideString(0)
                // theme changed for color and darkTheme
                if (changedKey == "ImmersiveColorSet") {
                    windowTheme = currentSystemTheme
                    windowFrameColor = currentAccentColor()
                    isWindowFrameAccentColorEnabled = isAccentColorWindowFrame()
                }
                User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hWnd, uMsg, wParam, lParam) ?: LRESULT(0)
            }

            else -> {
                if (uMsg == WM_ACTIVATE) {
                    isWindowActive = wParam.toInt() != WA_INACTIVE
                }
                if (uMsg == WM_NCMOUSEMOVE) {
                     skiaLayerProcedure?.let {
                        User32Extend.instance?.PostMessage(it.contentHandle, uMsg, wParam, lParam)
                    }
                }
                User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hWnd, uMsg, wParam, lParam) ?: LRESULT(0)
            }
        }
    }

    // Force update window info that resolve the hit test result is incorrect when user moving window to another monitor.
    private fun updateWindowInfo() {
        User32Extend.instance?.apply {
            dpi = GetDpiForWindow(windowHandle)
            frameX = GetSystemMetricsForDpi(WinUser.SM_CXFRAME, dpi)
            frameY = GetSystemMetricsForDpi(WinUser.SM_CYFRAME, dpi)

            val rect = WinDef.RECT()
            if (GetWindowRect(windowHandle, rect)) {
                rect.read()
                width = rect.right - rect.left
                height = rect.bottom - rect.top
            }
            rect.clear()
        }
    }

    private fun updateMenuItemInfo(menu: HMENU, menuItemInfo: MENUITEMINFO, item: Int, enabled: Boolean) {
        menuItemInfo.fState = if (enabled) WinUserConst.MFS_ENABLED else WinUserConst.MFS_DISABLED
        User32Extend.instance?.SetMenuItemInfo(menu, item, false, menuItemInfo)
    }

    fun currentAccentColor(): Color {
        val value = Advapi32Util.registryGetIntValue(
            WinReg.HKEY_CURRENT_USER,
            "SOFTWARE\\Microsoft\\Windows\\DWM",
            "AccentColor",
        ).toLong()
        val alpha = (value and 0xFF000000)
        val green = (value and 0xFF).shl(16)
        val blue = (value and 0xFF00)
        val red = (value and 0xFF0000).shr(16)
        return Color((alpha or green or blue or red).toInt())
    }

    fun isAccentColorWindowFrame(): Boolean {
        return Advapi32Util.registryGetIntValue(
            WinReg.HKEY_CURRENT_USER,
            "SOFTWARE\\Microsoft\\Windows\\DWM",
            "ColorPrevalence",
        ) != 0
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

        if (isWindows11OrLater()) {
            dwmApi?.getFunction("DwmSetWindowAttribute")?.apply {
                invoke(
                    WinNT.HRESULT::class.java,
                    arrayOf(windowHandle, 35, IntByReference((0xFFFFFFFE).toInt()), 4)
                )
                invoke(
                    WinNT.HRESULT::class.java,
                    arrayOf(windowHandle, 38, IntByReference(2), 4)
                )
            }
        }
    }

}