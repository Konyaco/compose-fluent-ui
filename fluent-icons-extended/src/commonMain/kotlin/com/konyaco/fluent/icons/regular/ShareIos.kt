

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShareIos: ImageVector
    get() {
        if (_shareIos != null) {
            return _shareIos!!
        }
        _shareIos = fluentIcon(name = "Regular.ShareIos") {
            fluentPath {
                moveTo(19.75f, 11.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.75f, 0.65f)
                verticalLineToRelative(7.1f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 17.44f, 22.0f)
                horizontalLineTo(6.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.06f)
                verticalLineToRelative(-7.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.49f, -0.1f)
                verticalLineToRelative(7.1f)
                curveToRelative(0.0f, 0.92f, 0.71f, 1.67f, 1.61f, 1.75f)
                horizontalLineToRelative(11.14f)
                curveToRelative(0.92f, 0.0f, 1.68f, -0.7f, 1.75f, -1.6f)
                verticalLineToRelative(-7.15f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(6.22f, 7.22f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.97f, -0.07f)
                lineToRelative(0.09f, 0.07f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-3.72f, -3.72f)
                verticalLineToRelative(11.7f)
                curveToRelative(0.0f, 0.37f, -0.28f, 0.69f, -0.65f, 0.74f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.64f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineTo(4.55f)
                lineTo(7.28f, 8.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(-5.0f, 5.0f)
                close()
            }
        }
        return _shareIos!!
    }

private var _shareIos: ImageVector? = null
