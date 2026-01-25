package io.github.composefluent.gallery.jna.windows.structure

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
    // non client area right mouse up message
    val WM_NCRBUTTONUP: Int = 0x00A5

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
    // min button
    internal val HTMINBUTTON = 8
    // max button
    internal val HTMAXBUTTON = 9
    // close button
    internal val HTCLOSE = 20
    // window edges
    internal val HTLEFT = 10
    internal val HTRIGHT = 11
    internal val HTTOP = 12
    internal val HTTOPLEFT = 13
    internal val HTTOPRIGHT = 14
    internal val HTBOTTOM = 15
    internal val HTBOTTOMLEFT = 16
    internal val HTBOTTOMRIGHT = 17

    // setting changed message
    const val WM_SETTINGCHANGE: Int = 0x001A

    // window active event
    const val WM_ACTIVATE: Int = 0x0006

    // window is deactivated
    const val WA_INACTIVE: Int = 0x00000000

    const val SC_RESTORE: Int = 0x0000f120
    const val SC_MOVE: Int = 0xF010
    const val SC_SIZE: Int = 0xF000
    const val SC_CLOSE: Int = 0xF060

    const val WINT_MAX: Int = 0xFFFF

    const val MIIM_STATE: Int = 0x00000001 // The `fState` member is valid.

    const val MFT_STRING: Int = 0x00000000 // The item is a text string.b

    const val TPM_RETURNCMD: Int =
        0x0100 // Returns the menu item identifier of the user's selection instead of sending a message.

    const val MFS_ENABLED: Int = 0x00000000 // The item is enabled.

    const val MFS_DISABLED: Int = 0x00000003 // The item is disabled.
}
