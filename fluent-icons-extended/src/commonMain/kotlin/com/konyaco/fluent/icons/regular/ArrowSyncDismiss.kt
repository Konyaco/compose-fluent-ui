

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSyncDismiss: ImageVector
    get() {
        if (_arrowSyncDismiss != null) {
            return _arrowSyncDismiss!!
        }
        _arrowSyncDismiss = fluentIcon(name = "Regular.ArrowSyncDismiss") {
            fluentPath {
                moveTo(16.27f, 6.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.03f, -1.08f)
                arcToRelative(8.74f, 8.74f, 0.0f, false, true, -4.58f, 15.68f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(0.07f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, 0.98f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.07f, -0.98f)
                lineToRelative(0.31f, -0.31f)
                arcToRelative(7.27f, 7.27f, 0.0f, false, false, 5.55f, -13.04f)
                close()
                moveTo(13.27f, 4.84f)
                arcTo(7.27f, 7.27f, 0.0f, false, false, 7.5f, 17.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.05f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, true, 4.85f, -15.47f)
                lineToRelative(-0.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-0.31f, 0.31f)
                close()
                moveTo(9.47f, 9.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineTo(12.0f, 10.94f)
                lineToRelative(1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(13.06f, 12.0f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(12.0f, 13.06f)
                lineToRelative(-1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(10.94f, 12.0f)
                lineToRelative(-1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
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
        return _arrowSyncDismiss!!
    }

private var _arrowSyncDismiss: ImageVector? = null
