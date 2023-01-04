

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableStackAbove: ImageVector
    get() {
        if (_tableStackAbove != null) {
            return _tableStackAbove!!
        }
        _tableStackAbove = fluentIcon(name = "Filled.TableStackAbove") {
            fluentPath {
                moveTo(20.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(14.5f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(9.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 9.5f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 14.5f)
                verticalLineToRelative(-4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(8.0f, 9.5f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(1.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 16.0f)
                close()
                moveTo(16.0f, 14.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(16.0f, 9.5f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        return _tableStackAbove!!
    }

private var _tableStackAbove: ImageVector? = null
