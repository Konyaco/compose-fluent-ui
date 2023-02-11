

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = fluentIcon(name = "Filled.History") {
            fluentPath {
                moveTo(19.25f, 12.0f)
                arcTo(7.25f, 7.25f, 0.0f, false, false, 7.58f, 6.25f)
                horizontalLineToRelative(0.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(0.03f, -0.05f)
                verticalLineToRelative(-2.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(9.25f, 9.25f, 0.0f, true, true, -3.43f, 6.12f)
                curveToRelative(0.06f, -0.51f, 0.51f, -0.87f, 1.03f, -0.87f)
                curveToRelative(0.6f, 0.0f, 1.02f, 0.57f, 0.95f, 1.16f)
                arcToRelative(7.25f, 7.25f, 0.0f, true, false, 14.45f, 0.84f)
                close()
                moveTo(13.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        return _history!!
    }

private var _history: ImageVector? = null
