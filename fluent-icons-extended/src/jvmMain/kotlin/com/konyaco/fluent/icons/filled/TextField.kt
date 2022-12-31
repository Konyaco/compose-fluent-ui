

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextField: ImageVector
    get() {
        if (_textField != null) {
            return _textField!!
        }
        _textField = fluentIcon(name = "Filled.TextField") {
            fluentPath {
                moveTo(2.0f, 7.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 5.75f, 4.0f)
                horizontalLineToRelative(12.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 22.0f, 7.75f)
                verticalLineToRelative(8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 18.25f, 20.0f)
                horizontalLineTo(5.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 2.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(8.25f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        return _textField!!
    }

private var _textField: ImageVector? = null
