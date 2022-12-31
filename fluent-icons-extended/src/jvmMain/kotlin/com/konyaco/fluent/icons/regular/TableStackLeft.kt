

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TableStackLeft: ImageVector
    get() {
        if (_tableStackLeft != null) {
            return _tableStackLeft!!
        }
        _tableStackLeft = fluentIcon(name = "Regular.TableStackLeft") {
            fluentPath {
                moveTo(4.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(4.5f, 3.75f)
                close()
                moveTo(8.5f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(8.5f, 3.75f)
                close()
                moveTo(10.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 15.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15.5f, 15.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.5f, 15.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15.5f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.5f, 8.5f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(15.5f, 4.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 4.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        return _tableStackLeft!!
    }

private var _tableStackLeft: ImageVector? = null
