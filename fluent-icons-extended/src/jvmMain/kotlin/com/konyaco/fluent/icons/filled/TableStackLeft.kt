

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableStackLeft: ImageVector
    get() {
        if (_tableStackLeft != null) {
            return _tableStackLeft!!
        }
        _tableStackLeft = fluentIcon(name = "Filled.TableStackLeft") {
            fluentPath {
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 14.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.5f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(16.0f, 3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.5f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.25f)
                close()
                moveTo(14.5f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(9.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(4.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(4.5f, 3.75f)
                close()
            }
        }
        return _tableStackLeft!!
    }

private var _tableStackLeft: ImageVector? = null
