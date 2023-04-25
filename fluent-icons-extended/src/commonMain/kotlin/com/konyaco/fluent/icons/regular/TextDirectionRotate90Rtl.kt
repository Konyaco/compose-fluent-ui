

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextDirectionRotate90Rtl: ImageVector
    get() {
        if (_textDirectionRotate90Rtl != null) {
            return _textDirectionRotate90Rtl!!
        }
        _textDirectionRotate90Rtl = fluentIcon(name = "Regular.TextDirectionRotate90Rtl") {
            fluentPath {
                moveTo(6.75f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(6.0f, 5.56f)
                lineToRelative(-0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-0.72f, -0.72f)
                verticalLineToRelative(14.69f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                close()
                moveTo(11.03f, 20.95f)
                lineTo(20.53f, 17.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.34f)
                lineToRelative(-0.1f, -0.05f)
                lineToRelative(-9.5f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 1.35f)
                lineToRelative(0.1f, 0.05f)
                lineToRelative(2.52f, 1.0f)
                verticalLineToRelative(4.1f)
                lineToRelative(-2.52f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.45f, 0.88f)
                lineToRelative(0.03f, 0.1f)
                curveToRelative(0.14f, 0.35f, 0.51f, 0.54f, 0.87f, 0.45f)
                lineToRelative(0.1f, -0.03f)
                close()
                moveTo(18.21f, 16.5f)
                lineTo(14.5f, 17.96f)
                verticalLineToRelative(-2.92f)
                lineToRelative(3.7f, 1.46f)
                close()
                moveTo(15.5f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(17.0f, 5.56f)
                lineToRelative(0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(0.72f, -0.72f)
                verticalLineToRelative(5.69f)
                close()
            }
        }
        return _textDirectionRotate90Rtl!!
    }

private var _textDirectionRotate90Rtl: ImageVector? = null
