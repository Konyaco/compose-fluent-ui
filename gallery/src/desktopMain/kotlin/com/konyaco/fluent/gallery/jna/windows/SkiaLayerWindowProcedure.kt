package com.konyaco.fluent.gallery.jna.windows

import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTCLIENT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTMAXBUTTON
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTTRANSPANRENT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_LBUTTONDOWN
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_LBUTTONUP
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_MOUSEMOVE
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_NCHITTEST
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_NCLBUTTONDOWN
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_NCLBUTTONUP
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.WM_NCMOUSEMOVE
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.BaseTSD
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinDef.HWND
import com.sun.jna.platform.win32.WinDef.LRESULT
import com.sun.jna.platform.win32.WinDef.POINT
import com.sun.jna.platform.win32.WinUser
import org.jetbrains.skiko.SkiaLayer

class SkiaLayerWindowProcedure(
    skiaLayer: SkiaLayer,
    private val hitTest: (x: Float, y: Float) -> Int
): WindowProcedure {

    private val windowHandle = HWND(Pointer(skiaLayer.windowHandle))
    private val contentHandle = HWND(skiaLayer.canvas.let(Native::getComponentPointer))
    private val defaultWindowProcedure = User32Extend.instance?.setWindowLong(contentHandle, WinUser.GWL_WNDPROC, this) ?: BaseTSD.LONG_PTR(-1)

    private var hitResult = 1

     override fun callback(
        hwnd: HWND,
        uMsg: Int,
        wParam: WinDef.WPARAM,
        lParam: WinDef.LPARAM
    ): LRESULT {

        return when(uMsg) {

            WM_NCHITTEST -> {
                val x = lParam.toInt() and 0xFFFF
                val y = (lParam.toInt() shr 16) and 0xFFFF
                val point = POINT(x, y)
                User32Extend.instance?.ScreenToClient(windowHandle, point)
                hitResult = hitTest(point.x.toFloat(), point.y.toFloat())
                point.clear()
                when(hitResult) {
                    HTCLIENT, HTMAXBUTTON -> LRESULT(hitResult.toLong())
                    else -> LRESULT(HTTRANSPANRENT.toLong())
                }
            }

            WM_NCMOUSEMOVE -> {
                User32Extend.instance?.SendMessage(contentHandle, WM_MOUSEMOVE, wParam, lParam)
                LRESULT(0)
            }

            WM_NCLBUTTONDOWN -> {
                User32Extend.instance?.SendMessage(contentHandle, WM_LBUTTONDOWN, wParam, lParam)
                LRESULT(0)
            }

            WM_NCLBUTTONUP -> {
                User32Extend.instance?.SendMessage(contentHandle, WM_LBUTTONUP, wParam, lParam)
                return LRESULT(0)
            }

            else -> {
                User32Extend.instance?.CallWindowProc(defaultWindowProcedure, hwnd, uMsg, wParam, lParam) ?: LRESULT(0)
            }
        }
    }
}