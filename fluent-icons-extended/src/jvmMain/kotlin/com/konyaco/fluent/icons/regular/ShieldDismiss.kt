

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShieldDismiss: ImageVector
    get() {
        if (_shieldDismiss != null) {
            return _shieldDismiss!!
        }
        _shieldDismiss = fluentIcon(name = "Regular.ShieldDismiss") {
            fluentPath {
                moveTo(12.45f, 2.15f)
                curveTo(14.99f, 4.05f, 17.59f, 5.0f, 20.25f, 5.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 5.0f, -2.96f, 8.68f, -8.73f, 10.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.0f)
                curveTo(5.96f, 19.68f, 3.0f, 16.0f, 3.0f, 11.0f)
                verticalLineTo(5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                curveToRelative(2.66f, 0.0f, 5.26f, -0.94f, 7.8f, -2.85f)
                curveToRelative(0.27f, -0.2f, 0.63f, -0.2f, 0.9f, 0.0f)
                close()
                moveTo(12.0f, 3.68f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, 2.8f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 4.26f, 2.45f, 7.38f, 7.5f, 9.44f)
                curveToRelative(5.05f, -2.06f, 7.5f, -5.18f, 7.5f, -9.44f)
                verticalLineTo(6.48f)
                arcToRelative(14.36f, 14.36f, 0.0f, false, true, -7.5f, -2.8f)
                close()
                moveTo(9.28f, 8.22f)
                lineTo(12.0f, 10.94f)
                lineToRelative(2.73f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.97f, -0.07f)
                lineToRelative(0.09f, 0.07f)
                curveToRelative(0.26f, 0.27f, 0.29f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineTo(13.06f, 12.0f)
                lineToRelative(2.73f, 2.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(12.0f, 13.06f)
                lineTo(9.28f, 15.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.97f, 0.07f)
                lineToRelative(-0.09f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineTo(10.94f, 12.0f)
                lineTo(8.22f, 9.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                close()
            }
        }
        return _shieldDismiss!!
    }

private var _shieldDismiss: ImageVector? = null
