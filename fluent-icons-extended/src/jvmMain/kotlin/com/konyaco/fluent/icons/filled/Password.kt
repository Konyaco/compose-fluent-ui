

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = fluentIcon(name = "Filled.Password") {
            fluentPath {
                moveTo(5.25f, 5.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 8.25f)
                verticalLineToRelative(7.5f)
                curveTo(2.0f, 17.55f, 3.46f, 19.0f, 5.25f, 19.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-7.5f)
                curveTo(22.0f, 6.45f, 20.55f, 5.0f, 18.75f, 5.0f)
                lineTo(5.25f, 5.0f)
                close()
                moveTo(6.28f, 10.22f)
                lineToRelative(0.72f, 0.72f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-0.72f, 0.72f)
                lineToRelative(0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(7.0f, 13.06f)
                lineToRelative(-0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(0.72f, -0.72f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                close()
                moveTo(11.78f, 10.22f)
                lineToRelative(0.72f, 0.72f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-0.72f, 0.72f)
                lineToRelative(0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-0.72f, -0.72f)
                lineToRelative(-0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(0.72f, -0.72f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                close()
                moveTo(15.75f, 14.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(16.5f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _password!!
    }

private var _password: ImageVector? = null
