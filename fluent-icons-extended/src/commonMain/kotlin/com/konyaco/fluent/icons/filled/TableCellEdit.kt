

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableCellEdit: ImageVector
    get() {
        if (_tableCellEdit != null) {
            return _tableCellEdit!!
        }
        _tableCellEdit = fluentIcon(name = "Filled.TableCellEdit") {
            fluentPath {
                moveTo(5.25f, 6.5f)
                curveTo(4.01f, 6.5f, 3.0f, 7.5f, 3.0f, 8.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(5.25f)
                close()
            }
            fluentPath {
                moveTo(12.49f, 14.86f)
                curveToRelative(-0.2f, 0.2f, -0.37f, 0.41f, -0.51f, 0.64f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.35f)
                lineToRelative(-2.01f, 2.01f)
                close()
            }
            fluentPath {
                moveTo(20.72f, 8.0f)
                horizontalLineToRelative(0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.12f, -1.5f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(4.85f)
                lineToRelative(2.4f, -2.39f)
                arcTo(3.28f, 3.28f, 0.0f, false, true, 20.7f, 8.0f)
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
