

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AutoFitHeight: ImageVector
    get() {
        if (_autoFitHeight != null) {
            return _autoFitHeight!!
        }
        _autoFitHeight = fluentIcon(name = "Regular.AutoFitHeight") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(5.75f, 3.0f)
                close()
                moveTo(9.22f, 14.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(1.22f, 1.22f)
                lineTo(11.5f, 8.56f)
                lineToRelative(-1.22f, 1.22f)
                lineToRelative(-0.08f, 0.07f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.15f, 8.8f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(2.37f, -2.37f)
                curveToRelative(0.12f, -0.2f, 0.37f, -0.35f, 0.66f, -0.35f)
                curveToRelative(0.25f, 0.0f, 0.48f, 0.1f, 0.61f, 0.28f)
                lineToRelative(0.05f, 0.07f)
                lineToRelative(2.37f, 2.37f)
                lineToRelative(0.07f, 0.08f)
                curveToRelative(0.2f, 0.27f, 0.2f, 0.62f, 0.01f, 0.89f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-0.08f, 0.06f)
                curveToRelative(-0.26f, 0.2f, -0.62f, 0.2f, -0.88f, 0.01f)
                lineToRelative(-0.1f, -0.08f)
                lineTo(13.0f, 8.56f)
                lineTo(13.0f, 15.44f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.08f, 0.98f)
                lineToRelative(-0.08f, 0.08f)
                lineToRelative(-2.36f, 2.37f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, -0.67f, 0.35f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, -0.66f, -0.35f)
                lineToRelative(-2.37f, -2.37f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(5.0f, 20.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(5.75f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _autoFitHeight!!
    }

private var _autoFitHeight: ImageVector? = null
