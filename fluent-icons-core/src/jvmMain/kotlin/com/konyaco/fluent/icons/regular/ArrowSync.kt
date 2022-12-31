

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSync: ImageVector
    get() {
        if (_arrowSync != null) {
            return _arrowSync!!
        }
        _arrowSync = fluentIcon(name = "Regular.ArrowSync") {
            fluentPath {
                moveTo(16.25f, 5.18f)
                curveToRelative(-0.25f, 0.33f, -0.19f, 0.8f, 0.14f, 1.05f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, true, -3.6f, 12.98f)
                lineToRelative(0.68f, -0.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, -1.13f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(-0.75f, -0.75f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 17.3f, 5.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.05f, 0.14f)
                close()
                moveTo(10.53f, 1.47f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(0.75f, 0.75f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -4.85f, 15.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.96f, -1.16f)
                arcTo(7.23f, 7.23f, 0.0f, false, true, 11.2f, 4.8f)
                lineToRelative(-0.68f, 0.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        return _arrowSync!!
    }

private var _arrowSync: ImageVector? = null
