

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = fluentIcon(name = "Filled.Apps") {
            fluentPath {
                moveTo(18.5f, 2.33f)
                lineToRelative(3.17f, 3.18f)
                curveToRelative(0.88f, 0.88f, 0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(-2.42f, 2.42f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.75f, 2.4f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.39f, 1.74f)
                lineToRelative(2.42f, -2.42f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(18.5f, 13.0f)
                lineTo(13.0f, 13.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(14.44f, 11.0f)
                lineTo(13.0f, 9.56f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(1.44f)
                close()
                moveTo(10.5f, 5.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(5.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        return _apps!!
    }

private var _apps: ImageVector? = null
