

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextField: ImageVector
    get() {
        if (_textField != null) {
            return _textField!!
        }
        _textField = fluentIcon(name = "Regular.TextField") {
            fluentPath {
                moveTo(15.0f, 8.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(8.5f)
                close()
                moveTo(5.75f, 4.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 2.0f, 7.75f)
                verticalLineToRelative(8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 5.75f, 20.0f)
                horizontalLineToRelative(12.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 22.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 18.25f, 4.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(3.5f, 7.75f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineTo(5.75f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-8.5f)
                close()
            }
        }
        return _textField!!
    }

private var _textField: ImageVector? = null
