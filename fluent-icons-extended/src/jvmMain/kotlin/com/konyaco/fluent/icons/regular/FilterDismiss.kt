

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FilterDismiss: ImageVector
    get() {
        if (_filterDismiss != null) {
            return _filterDismiss!!
        }
        _filterDismiss = fluentIcon(name = "Regular.FilterDismiss") {
            fluentPath {
                moveTo(23.0f, 7.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(15.85f, 5.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineTo(18.21f, 7.5f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(17.5f, 6.79f)
                lineToRelative(-1.65f, -1.64f)
                close()
            }
            fluentPath {
                moveTo(13.35f, 12.5f)
                arcToRelative(6.54f, 6.54f, 0.0f, false, true, -1.33f, -1.5f)
                horizontalLineTo(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.85f)
                close()
            }
            fluentPath {
                moveTo(11.0f, 7.5f)
                curveToRelative(0.0f, -0.52f, 0.06f, -1.02f, 0.17f, -1.5f)
                horizontalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineTo(11.0f)
                close()
            }
            fluentPath {
                moveTo(13.5f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        return _filterDismiss!!
    }

private var _filterDismiss: ImageVector? = null
