package com.konyaco.fluent.gallery.jna.windows.structure

object WinUserConst {

    //calculate non client area size message
    val WM_NCCALCSIZE = 0x0083
    // non client area hit test message
    val WM_NCHITTEST = 0x0084
    // mouse move message
    val WM_MOUSEMOVE = 0x0200
    // left mouse button down message
    val WM_LBUTTONDOWN = 0x0201
    // left mouse button up message
    val WM_LBUTTONUP = 0x0202
    // non client area mouse move message
    val WM_NCMOUSEMOVE = 0x00A0
    // non client area left mouse down message
    val WM_NCLBUTTONDOWN = 0x00A1
    // non client area left mouse up message
    val WM_NCLBUTTONUP = 0x00A2

    /**
     * [WM_NCHITTEST] Mouse Position Codes
     */
    // pass the hit test to parent window
    internal val HTTRANSPANRENT = -1
    // no hit test
    internal val HTNOWHERE = 0
    // client area
    internal val HTCLIENT = 1
    // title bar
    internal val HTCAPTION = 2
    // max button
    internal val HTMAXBUTTON = 9
    // window edges
    internal val HTLEFT = 10
    internal val HTRIGHT = 11
    internal val HTTOP = 12
    internal val HTTOPLEFT = 13
    internal val HTTOPRIGHT = 14
    internal val HTBOTTOM = 15
    internal val HTBOTTOMLEFT = 16
    internal val HTBOTTOMRIGHT = 17
}