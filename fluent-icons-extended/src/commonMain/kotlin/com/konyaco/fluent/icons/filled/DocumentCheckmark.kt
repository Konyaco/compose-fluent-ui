

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentCheckmark: ImageVector
    get() {
        if (_documentCheckmark != null) {
            return _documentCheckmark!!
        }
        _documentCheckmark = fluentIcon(name = "Filled.DocumentCheckmark") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-6.81f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 4.0f, 11.5f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
            fluentPath {
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                close()
            }
            fluentPath {
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(9.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineTo(5.5f, 18.79f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _documentCheckmark!!
    }

private var _documentCheckmark: ImageVector? = null
