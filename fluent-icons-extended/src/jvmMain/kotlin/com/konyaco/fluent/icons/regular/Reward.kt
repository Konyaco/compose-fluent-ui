

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Reward: ImageVector
    get() {
        if (_reward != null) {
            return _reward!!
        }
        _reward = fluentIcon(name = "Regular.Reward") {
            fluentPath {
                moveTo(20.25f, 2.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(3.04f)
                curveToRelative(0.0f, 1.03f, -0.57f, 1.97f, -1.48f, 2.44f)
                lineToRelative(-6.28f, 3.28f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -4.48f, 0.0f)
                lineTo(3.48f, 9.23f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 6.79f)
                lineTo(2.0f, 3.75f)
                curveTo(2.0f, 2.78f, 2.78f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(12.0f, 13.48f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(15.5f, 3.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(6.66f)
                lineToRelative(3.38f, 1.77f)
                curveToRelative(0.08f, 0.04f, 0.16f, 0.04f, 0.24f, 0.0f)
                lineToRelative(3.38f, -1.77f)
                lineTo(15.5f, 3.5f)
                close()
                moveTo(7.0f, 3.5f)
                lineTo(3.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(3.04f)
                curveToRelative(0.0f, 0.47f, 0.26f, 0.9f, 0.67f, 1.11f)
                lineTo(7.0f, 9.38f)
                lineTo(7.0f, 3.5f)
                close()
                moveTo(20.25f, 3.5f)
                lineTo(17.0f, 3.5f)
                verticalLineToRelative(5.88f)
                lineToRelative(2.83f, -1.48f)
                curveToRelative(0.41f, -0.22f, 0.67f, -0.64f, 0.67f, -1.1f)
                lineTo(20.5f, 3.74f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        return _reward!!
    }

private var _reward: ImageVector? = null
