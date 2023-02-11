

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Reward: ImageVector
    get() {
        if (_reward != null) {
            return _reward!!
        }
        _reward = fluentIcon(name = "Filled.Reward") {
            fluentPath {
                moveTo(20.25f, 2.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(3.04f)
                curveToRelative(0.0f, 1.03f, -0.57f, 1.97f, -1.48f, 2.44f)
                lineToRelative(-6.3f, 3.29f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -4.44f, 0.0f)
                lineToRelative(-6.3f, -3.3f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 6.8f)
                lineTo(2.0f, 3.75f)
                curveTo(2.0f, 2.78f, 2.78f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(12.0f, 13.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(16.0f, 3.5f)
                lineTo(8.0f, 3.5f)
                verticalLineToRelative(6.4f)
                lineToRelative(3.88f, 2.03f)
                curveToRelative(0.08f, 0.04f, 0.16f, 0.04f, 0.24f, 0.0f)
                lineTo(16.0f, 9.9f)
                lineTo(16.0f, 3.5f)
                close()
            }
        }
        return _reward!!
    }

private var _reward: ImageVector? = null
