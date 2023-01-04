

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableBottomRow: ImageVector
    get() {
        if (_tableBottomRow != null) {
            return _tableBottomRow!!
        }
        _tableBottomRow = fluentIcon(name = "Filled.TableBottomRow") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(8.25f)
                horizontalLineToRelative(1.5f)
                lineTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(8.25f)
                lineTo(21.0f, 14.5f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(4.5f, 20.49f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                lineTo(6.25f, 21.0f)
                curveToRelative(-0.64f, 0.0f, -1.24f, -0.19f, -1.75f, -0.51f)
                close()
                moveTo(20.91f, 18.5f)
                curveToRelative(0.06f, -0.24f, 0.09f, -0.5f, 0.09f, -0.75f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, 3.16f, -2.5f)
                close()
                moveTo(14.5f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        return _tableBottomRow!!
    }

private var _tableBottomRow: ImageVector? = null
