

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSyncCheckmark: ImageVector
    get() {
        if (_arrowSyncCheckmark != null) {
            return _arrowSyncCheckmark!!
        }
        _arrowSyncCheckmark = fluentIcon(name = "Regular.ArrowSyncCheckmark") {
            fluentPath {
                moveTo(16.4f, 6.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.9f, -1.2f)
                arcToRelative(8.74f, 8.74f, 0.0f, false, true, -4.58f, 15.7f)
                lineToRelative(0.75f, 0.74f)
                lineToRelative(0.07f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, 0.98f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.07f, -0.98f)
                lineToRelative(0.33f, -0.33f)
                arcToRelative(7.29f, 7.29f, 0.0f, false, false, 2.06f, 0.06f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 3.6f, -12.97f)
                close()
                moveTo(10.53f, 2.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-0.33f, 0.33f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, -2.06f, -0.06f)
                arcTo(7.25f, 7.25f, 0.0f, false, false, 7.4f, 17.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.96f, 1.15f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, true, 4.85f, -15.47f)
                lineToRelative(-0.75f, -0.75f)
                close()
                moveTo(15.03f, 11.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(11.0f, 12.94f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(12.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, -9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 9.0f)
                close()
            }
        }
        return _arrowSyncCheckmark!!
    }

private var _arrowSyncCheckmark: ImageVector? = null
