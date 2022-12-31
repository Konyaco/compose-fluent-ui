

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSyncCheckmark: ImageVector
    get() {
        if (_arrowSyncCheckmark != null) {
            return _arrowSyncCheckmark!!
        }
        _arrowSyncCheckmark = fluentIcon(name = "Filled.ArrowSyncCheckmark") {
            fluentPath {
                moveTo(16.25f, 5.18f)
                curveToRelative(-0.25f, 0.33f, -0.19f, 0.8f, 0.14f, 1.05f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, true, -3.6f, 12.98f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.05f, -0.07f)
                lineToRelative(-0.33f, 0.33f)
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
                horizontalLineToRelative(-0.01f)
                arcToRelative(7.32f, 7.32f, 0.0f, false, true, 2.06f, 0.07f)
                lineToRelative(0.33f, -0.33f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(15.03f, 9.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineTo(11.0f, 12.94f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                close()
            }
        }
        return _arrowSyncCheckmark!!
    }

private var _arrowSyncCheckmark: ImageVector? = null
