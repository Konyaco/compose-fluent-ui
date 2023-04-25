

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = fluentIcon(name = "Regular.Code") {
            fluentPath {
                moveToRelative(8.07f, 18.94f)
                lineToRelative(6.5f, -14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.4f, 0.52f)
                lineToRelative(-0.04f, 0.1f)
                lineToRelative(-6.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.4f, -0.52f)
                lineToRelative(0.04f, -0.1f)
                lineToRelative(6.5f, -14.5f)
                lineToRelative(-6.5f, 14.5f)
                close()
                moveTo(2.22f, 11.47f)
                lineTo(6.47f, 7.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineTo(3.81f, 12.0f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(-4.25f, 4.25f)
                close()
                moveTo(16.47f, 7.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineTo(20.19f, 12.0f)
                lineToRelative(-3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        return _code!!
    }

private var _code: ImageVector? = null
