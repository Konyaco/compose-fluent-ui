

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextDirectionRotate90Ltr: ImageVector
    get() {
        if (_textDirectionRotate90Ltr != null) {
            return _textDirectionRotate90Ltr!!
        }
        _textDirectionRotate90Ltr = fluentIcon(name = "Regular.TextDirectionRotate90Ltr") {
            fluentPath {
                moveTo(6.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(14.69f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-0.72f, 0.72f)
                lineTo(7.5f, 3.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 6.75f, 3.0f)
                close()
                moveTo(11.03f, 3.05f)
                lineTo(20.53f, 6.81f)
                curveToRelative(0.6f, 0.23f, 0.63f, 1.04f, 0.1f, 1.34f)
                lineToRelative(-0.1f, 0.05f)
                lineToRelative(-9.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.65f, -1.35f)
                lineToRelative(0.1f, -0.05f)
                lineToRelative(2.52f, -1.0f)
                verticalLineToRelative(-4.1f)
                lineToRelative(-2.52f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.45f, -0.88f)
                lineToRelative(0.03f, -0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.87f, -0.45f)
                lineToRelative(0.1f, 0.03f)
                close()
                moveTo(18.21f, 7.5f)
                lineTo(14.5f, 6.04f)
                verticalLineToRelative(2.92f)
                lineToRelative(3.7f, -1.46f)
                close()
                moveTo(15.5f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(5.69f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.72f, 0.72f)
                verticalLineToRelative(-5.69f)
                close()
            }
        }
        return _textDirectionRotate90Ltr!!
    }

private var _textDirectionRotate90Ltr: ImageVector? = null
