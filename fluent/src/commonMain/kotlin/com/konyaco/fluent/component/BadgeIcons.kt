package com.konyaco.fluent.component

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

val Icons.Filled.BadgeImportant: ImageVector
    get() {
        if (_badgeImportant == null) {
            _badgeImportant = fluentIcon(name = "Filled.BadgeImportant") {
                fluentPath {
                    //Draw line
                    moveTo(10f, 4f)
                    arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                    verticalLineToRelative(8f)
                    arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                    verticalLineToRelative(-8f)
                    close()

                    //Draw dot
                    moveTo(14.5f, 20f)
                    arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5f, 0.0f)
                    arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5f, 0.0f)
                    close()
                }
            }
        }
        return _badgeImportant!!
    }

private var _badgeImportant: ImageVector? = null

val Icons.Filled.BadgeInformation: ImageVector
    get() {
        if (_badgeInformation == null) {
            _badgeInformation = fluentIcon(name = "Filled.BadgeInformation") {
                fluentPath {
                    //Draw dot
                    moveTo(14.5f, 4f)
                    arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5f, 0.0f)
                    arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5f, 0.0f)
                    close()

                    //Draw line
                    moveTo(10f, 12f)
                    arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                    verticalLineToRelative(8f)
                    arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                    verticalLineToRelative(-8f)
                    close()
                }
            }
        }
        return _badgeInformation!!
    }

private var _badgeInformation: ImageVector? = null

val Icons.Filled.BadgeAttention: ImageVector
    get() {
        if (_badgeAttention == null) {
            _badgeAttention = fluentIcon(name = "Filled.BadgeAttention") {
                fluentPath {
                    moveTo(20.214f, 15.938f)
                    curveTo(20.214f, 16.11f, 20.18f, 16.274f, 20.11f, 16.43f)
                    curveTo(20.046f, 16.578f, 19.958f, 16.71f, 19.84f, 16.828f)
                    curveTo(19.73f, 16.938f, 19.598f, 17.028f, 19.442f, 17.098f)
                    curveTo(19.292f, 17.16f, 19.132f, 17.192f, 18.96f, 17.192f)
                    curveTo(18.75f, 17.192f, 18.546f, 17.136f, 18.352f, 17.028f)
                    lineTo(13.254f, 14.144f)
                    verticalLineTo(20.004f)
                    curveTo(13.254f, 20.176f, 13.218f, 20.34f, 13.148f, 20.496f)
                    curveTo(13.086f, 20.644f, 12.996f, 20.774f, 12.878f, 20.882f)
                    curveTo(12.77f, 20.992f, 12.636f, 21.082f, 12.48f, 21.152f)
                    curveTo(12.332f, 21.214f, 12.172f, 21.246f, 12f, 21.246f)
                    curveTo(11.828f, 21.246f, 11.664f, 21.214f, 11.508f, 21.152f)
                    curveTo(11.36f, 21.082f, 11.226f, 20.992f, 11.11f, 20.882f)
                    curveTo(11f, 20.774f, 10.91f, 20.644f, 10.84f, 20.496f)
                    curveTo(10.778f, 20.34f, 10.746f, 20.176f, 10.746f, 20.004f)
                    verticalLineTo(14.144f)
                    lineTo(5.648f, 17.028f)
                    curveTo(5.454f, 17.136f, 5.25f, 17.192f, 5.04f, 17.192f)
                    curveTo(4.868f, 17.192f, 4.704f, 17.16f, 4.546f, 17.098f)
                    curveTo(4.398f, 17.028f, 4.266f, 16.938f, 4.148f, 16.828f)
                    curveTo(4.04f, 16.71f, 3.95f, 16.578f, 3.878f, 16.43f)
                    curveTo(3.816f, 16.274f, 3.786f, 16.11f, 3.786f, 15.938f)
                    curveTo(3.786f, 15.718f, 3.844f, 15.512f, 3.96f, 15.316f)
                    curveTo(4.078f, 15.114f, 4.23f, 14.958f, 4.418f, 14.848f)
                    lineTo(9.458f, 12f)
                    lineTo(4.418f, 9.152f)
                    curveTo(4.23f, 9.042f, 4.078f, 8.886f, 3.96f, 8.684f)
                    curveTo(3.844f, 8.488f, 3.786f, 8.282f, 3.786f, 8.062f)
                    curveTo(3.786f, 7.89f, 3.816f, 7.73f, 3.878f, 7.582f)
                    curveTo(3.95f, 7.426f, 4.04f, 7.292f, 4.148f, 7.184f)
                    curveTo(4.266f, 7.066f, 4.398f, 6.972f, 4.546f, 6.914f)
                    curveTo(4.704f, 6.844f, 4.868f, 6.808f, 5.04f, 6.808f)
                    curveTo(5.266f, 6.808f, 5.468f, 6.864f, 5.648f, 6.972f)
                    lineTo(10.746f, 9.856f)
                    verticalLineTo(3.996f)
                    curveTo(10.746f, 3.824f, 10.778f, 3.664f, 10.84f, 3.516f)
                    curveTo(10.91f, 3.36f, 11f, 3.226f, 11.11f, 3.118f)
                    curveTo(11.226f, 3.008f, 11.36f, 2.922f, 11.508f, 2.86f)
                    curveTo(11.664f, 2.79f, 11.828f, 2.754f, 12f, 2.754f)
                    curveTo(12.172f, 2.754f, 12.332f, 2.79f, 12.48f, 2.86f)
                    curveTo(12.636f, 2.922f, 12.77f, 3.008f, 12.878f, 3.118f)
                    curveTo(12.996f, 3.226f, 13.086f, 3.36f, 13.148f, 3.516f)
                    curveTo(13.218f, 3.664f, 13.254f, 3.824f, 13.254f, 3.996f)
                    verticalLineTo(9.856f)
                    lineTo(18.352f, 6.972f)
                    curveTo(18.546f, 6.864f, 18.75f, 6.808f, 18.96f, 6.808f)
                    curveTo(19.132f, 6.808f, 19.292f, 6.844f, 19.442f, 6.914f)
                    curveTo(19.598f, 6.976f, 19.73f, 7.066f, 19.84f, 7.184f)
                    curveTo(19.958f, 7.292f, 20.046f, 7.426f, 20.11f, 7.582f)
                    curveTo(20.18f, 7.73f, 20.214f, 7.89f, 20.214f, 8.062f)
                    curveTo(20.214f, 8.282f, 20.156f, 8.492f, 20.038f, 8.696f)
                    curveTo(19.922f, 8.89f, 19.77f, 9.042f, 19.582f, 9.152f)
                    lineTo(14.542f, 12f)
                    lineTo(19.582f, 14.848f)
                    curveTo(19.77f, 14.958f, 19.922f, 15.114f, 20.038f, 15.316f)
                    curveTo(20.156f, 15.512f, 20.214f, 15.718f, 20.214f, 15.938f)
                    close()

                }
            }
        }
        return _badgeAttention!!
    }

private var _badgeAttention: ImageVector? = null