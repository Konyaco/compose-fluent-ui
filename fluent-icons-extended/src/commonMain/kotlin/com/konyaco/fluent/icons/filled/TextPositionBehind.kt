

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextPositionBehind: ImageVector
    get() {
        if (_textPositionBehind != null) {
            return _textPositionBehind!!
        }
        _textPositionBehind = fluentIcon(name = "Filled.TextPositionBehind") {
            fluentPath {
                moveTo(3.75f, 3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.75f, 3.75f)
                close()
                moveTo(10.75f, 11.0f)
                curveToRelative(0.0f, -0.09f, 0.0f, -0.17f, 0.03f, -0.25f)
                horizontalLineToRelative(2.45f)
                lineToRelative(0.02f, 0.25f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-2.5f)
                lineTo(10.75f, 11.0f)
                close()
                moveTo(14.24f, 10.75f)
                lineToRelative(0.01f, 0.25f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(16.25f, 11.0f)
                verticalLineToRelative(-0.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -8.5f, 0.25f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(9.75f, 11.0f)
                lineToRelative(0.01f, -0.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.48f, 0.0f)
                close()
                moveTo(20.25f, 12.75f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.25f, 11.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                close()
                moveTo(6.75f, 11.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.75f, 11.0f)
                close()
                moveTo(2.75f, 18.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(3.75f, 19.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        return _textPositionBehind!!
    }

private var _textPositionBehind: ImageVector? = null
