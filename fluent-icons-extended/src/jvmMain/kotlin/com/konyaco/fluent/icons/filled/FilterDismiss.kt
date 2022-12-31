

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FilterDismiss: ImageVector
    get() {
        if (_filterDismiss != null) {
            return _filterDismiss!!
        }
        _filterDismiss = fluentIcon(name = "Filled.FilterDismiss") {
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
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(4.02f)
                curveToRelative(0.52f, 0.8f, 1.2f, 1.49f, 2.01f, 2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineTo(8.0f)
                close()
            }
            fluentPath {
                moveTo(5.0f, 6.0f)
                horizontalLineToRelative(6.17f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -0.15f, 2.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineTo(5.0f)
                close()
            }
            fluentPath {
                moveTo(9.88f, 16.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                close()
            }
        }
        return _filterDismiss!!
    }

private var _filterDismiss: ImageVector? = null
