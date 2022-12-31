

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = fluentIcon(name = "Regular.Link") {
            fluentPath {
                moveTo(9.25f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.11f, 1.5f)
                horizontalLineTo(7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.2f, 7.0f)
                horizontalLineToRelative(2.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.11f, 1.5f)
                horizontalLineTo(7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.25f, -10.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(17.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.25f, 10.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.11f, -1.5f)
                horizontalLineTo(17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.2f, -7.0f)
                horizontalLineToRelative(-2.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.11f, -1.5f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 11.25f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineTo(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineTo(17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        return _link!!
    }

private var _link: ImageVector? = null
