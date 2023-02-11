

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextAlignJustifyLowRotate270: ImageVector
    get() {
        if (_textAlignJustifyLowRotate270 != null) {
            return _textAlignJustifyLowRotate270!!
        }
        _textAlignJustifyLowRotate270 = fluentIcon(name = "Regular.TextAlignJustifyLowRotate270") {
            fluentPath {
                moveTo(5.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                close()
                moveTo(18.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(18.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                close()
                moveTo(11.5f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(7.5f)
                close()
            }
        }
        return _textAlignJustifyLowRotate270!!
    }

private var _textAlignJustifyLowRotate270: ImageVector? = null
