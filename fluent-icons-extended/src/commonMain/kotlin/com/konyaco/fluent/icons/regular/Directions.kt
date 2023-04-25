

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Directions: ImageVector
    get() {
        if (_directions != null) {
            return _directions!!
        }
        _directions = fluentIcon(name = "Regular.Directions") {
            fluentPath {
                moveToRelative(14.3f, 2.99f)
                lineToRelative(6.72f, 6.71f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, 4.6f)
                lineToRelative(-6.72f, 6.72f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -4.6f, 0.0f)
                lineTo(2.98f, 14.3f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -4.6f)
                lineTo(9.7f, 3.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 4.6f, 0.0f)
                close()
                moveTo(10.76f, 4.05f)
                lineTo(4.04f, 10.76f)
                curveToRelative(-0.68f, 0.69f, -0.68f, 1.8f, 0.0f, 2.48f)
                lineToRelative(6.72f, 6.72f)
                curveToRelative(0.69f, 0.68f, 1.8f, 0.68f, 2.48f, 0.0f)
                lineToRelative(6.71f, -6.72f)
                curveToRelative(0.69f, -0.69f, 0.69f, -1.8f, 0.0f, -2.48f)
                lineToRelative(-6.71f, -6.71f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.48f, 0.0f)
                close()
                moveTo(12.46f, 7.31f)
                lineTo(12.53f, 7.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.97f)
                lineToRelative(0.07f, -0.09f)
                lineToRelative(0.72f, -0.72f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.65f, 0.0f, -1.18f, 0.5f, -1.24f, 1.12f)
                lineToRelative(-0.01f, 0.13f)
                lineTo(10.5f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-3.35f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.58f, -2.74f)
                horizontalLineToRelative(0.17f)
                lineToRelative(1.5f, -0.01f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.97f)
                lineToRelative(0.07f, -0.09f)
                lineToRelative(-0.07f, 0.09f)
                close()
            }
        }
        return _directions!!
    }

private var _directions: ImageVector? = null
