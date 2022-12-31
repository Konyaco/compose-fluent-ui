

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Directions: ImageVector
    get() {
        if (_directions != null) {
            return _directions!!
        }
        _directions = fluentIcon(name = "Filled.Directions") {
            fluentPath {
                moveTo(14.3f, 2.99f)
                lineToRelative(6.72f, 6.71f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, 4.6f)
                lineToRelative(-6.72f, 6.72f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -4.6f, 0.0f)
                lineTo(2.98f, 14.3f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -4.6f)
                lineTo(9.7f, 3.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 4.6f, 0.0f)
                close()
                moveTo(13.6f, 7.22f)
                lineToRelative(-0.1f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.88f, 0.0f)
                lineToRelative(-0.09f, 0.07f)
                lineToRelative(-0.07f, 0.09f)
                curveToRelative(-0.2f, 0.26f, -0.2f, 0.61f, 0.0f, 0.88f)
                lineToRelative(0.07f, 0.1f)
                lineToRelative(0.72f, 0.71f)
                horizontalLineToRelative(-1.67f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.57f, 2.58f)
                lineToRelative(-0.01f, 0.17f)
                verticalLineToRelative(3.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0.07f, -0.59f, 0.53f, -1.05f, 1.12f, -1.11f)
                horizontalLineToRelative(0.13f)
                lineToRelative(1.5f, -0.01f)
                lineToRelative(-0.72f, 0.72f)
                lineToRelative(-0.07f, 0.09f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.05f, 1.04f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.2f, -0.26f, 0.2f, -0.62f, 0.01f, -0.88f)
                lineToRelative(-0.08f, -0.1f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                close()
            }
        }
        return _directions!!
    }

private var _directions: ImageVector? = null
