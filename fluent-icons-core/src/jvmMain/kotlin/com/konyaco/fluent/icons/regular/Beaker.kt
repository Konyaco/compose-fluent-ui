

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = fluentIcon(name = "Regular.Beaker") {
            fluentPath {
                moveTo(8.0f, 4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.24f)
                curveToRelative(0.0f, 0.37f, -0.1f, 0.74f, -0.27f, 1.07f)
                lineToRelative(-3.59f, 6.6f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 6.68f, 21.0f)
                horizontalLineToRelative(10.64f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.54f, -2.59f)
                lineToRelative(-3.59f, -6.6f)
                curveToRelative(-0.18f, -0.33f, -0.27f, -0.7f, -0.27f, -1.07f)
                lineTo(15.0f, 4.5f)
                horizontalLineToRelative(1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(10.5f, 10.74f)
                lineTo(10.5f, 4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.24f)
                curveToRelative(0.0f, 0.62f, 0.16f, 1.24f, 0.45f, 1.79f)
                lineToRelative(0.8f, 1.47f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(0.8f, -1.47f)
                curveToRelative(0.3f, -0.55f, 0.45f, -1.17f, 0.45f, -1.8f)
                close()
                moveTo(8.43f, 15.5f)
                horizontalLineToRelative(7.14f)
                lineToRelative(1.97f, 3.63f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.22f, 0.37f)
                lineTo(6.68f, 19.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.22f, -0.37f)
                lineToRelative(1.97f, -3.63f)
                close()
            }
        }
        return _beaker!!
    }

private var _beaker: ImageVector? = null
