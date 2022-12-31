

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentHeader: ImageVector
    get() {
        if (_documentHeader != null) {
            return _documentHeader!!
        }
        _documentHeader = fluentIcon(name = "Regular.DocumentHeader") {
            fluentPath {
                moveTo(8.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(20.0f, 4.1f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 17.74f, 2.0f)
                horizontalLineTo(6.1f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 4.0f, 4.26f)
                verticalLineTo(19.9f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 6.26f, 22.0f)
                horizontalLineTo(17.9f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 2.1f, -2.25f)
                verticalLineTo(4.1f)
                close()
                moveTo(6.24f, 3.5f)
                horizontalLineToRelative(11.6f)
                curveToRelative(0.37f, 0.06f, 0.65f, 0.37f, 0.65f, 0.75f)
                verticalLineToRelative(15.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.65f)
                horizontalLineTo(6.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.65f, -0.75f)
                verticalLineTo(4.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.65f)
                close()
            }
        }
        return _documentHeader!!
    }

private var _documentHeader: ImageVector? = null
