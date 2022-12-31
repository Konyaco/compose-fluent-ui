

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TableCellEdit: ImageVector
    get() {
        if (_tableCellEdit != null) {
            return _tableCellEdit!!
        }
        _tableCellEdit = fluentIcon(name = "Regular.TableCellEdit") {
            fluentPath {
                moveTo(3.0f, 8.75f)
                curveTo(3.0f, 7.51f, 4.0f, 6.5f, 5.25f, 6.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.98f, 0.0f, 1.82f, 0.63f, 2.12f, 1.5f)
                horizontalLineToRelative(-0.15f)
                curveToRelative(-0.47f, 0.0f, -0.94f, 0.1f, -1.37f, 0.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.6f, -0.3f)
                horizontalLineTo(15.5f)
                verticalLineToRelative(3.85f)
                lineToRelative(-1.5f, 1.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.35f)
                lineToRelative(-0.86f, 0.86f)
                curveToRelative(-0.2f, 0.2f, -0.37f, 0.41f, -0.51f, 0.64f)
                horizontalLineTo(5.25f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(5.25f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.25f)
                close()
            }
            fluentPath {
                moveTo(20.72f, 9.0f)
                curveToRelative(-0.6f, 0.0f, -1.18f, 0.22f, -1.62f, 0.67f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.71f, 1.25f)
                lineToRelative(-0.46f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.52f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcTo(2.29f, 2.29f, 0.0f, false, false, 20.72f, 9.0f)
                close()
            }
        }
        return _tableCellEdit!!
    }

private var _tableCellEdit: ImageVector? = null
