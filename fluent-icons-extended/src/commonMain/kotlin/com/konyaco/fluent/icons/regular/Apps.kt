

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = fluentIcon(name = "Regular.Apps") {
            fluentPath {
                moveToRelative(18.5f, 2.33f)
                lineToRelative(3.17f, 3.18f)
                curveToRelative(0.88f, 0.88f, 0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(-2.58f, 2.59f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 21.0f, 13.5f)
                verticalLineToRelative(5.25f)
                curveTo(21.0f, 20.0f, 20.0f, 21.0f, 18.75f, 21.0f)
                lineTo(5.25f, 21.0f)
                curveTo(4.01f, 21.0f, 3.0f, 20.0f, 3.0f, 18.75f)
                lineTo(3.0f, 5.25f)
                curveTo(3.0f, 4.01f, 4.0f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(5.25f)
                curveToRelative(1.13f, 0.0f, 2.06f, 0.83f, 2.23f, 1.92f)
                lineToRelative(2.58f, -2.59f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                close()
                moveTo(4.5f, 18.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.75f)
                lineTo(4.5f, 12.75f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(12.75f, 19.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(19.5f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.75f)
                close()
                moveTo(10.5f, 4.5f)
                lineTo(5.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(12.75f, 9.31f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(1.94f)
                lineToRelative(-1.94f, -1.94f)
                close()
                moveTo(16.37f, 3.39f)
                lineTo(13.2f, 6.57f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(3.18f, 3.18f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(3.18f, -3.18f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-3.18f, -3.18f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        return _apps!!
    }

private var _apps: ImageVector? = null
