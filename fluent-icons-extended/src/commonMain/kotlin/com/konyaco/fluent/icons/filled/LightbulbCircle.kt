

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LightbulbCircle: ImageVector
    get() {
        if (_lightbulbCircle != null) {
            return _lightbulbCircle!!
        }
        _lightbulbCircle = fluentIcon(name = "Filled.LightbulbCircle") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(14.48f, 17.0f)
                lineTo(9.52f, 17.0f)
                lineToRelative(0.1f, 0.45f)
                lineToRelative(0.05f, 0.16f)
                lineToRelative(0.05f, 0.14f)
                curveToRelative(0.29f, 0.64f, 0.9f, 1.05f, 1.59f, 1.05f)
                horizontalLineToRelative(1.38f)
                lineToRelative(0.16f, -0.01f)
                lineToRelative(0.15f, -0.02f)
                lineToRelative(0.14f, -0.04f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, 1.24f, -1.27f)
                lineToRelative(0.1f, -0.46f)
                close()
                moveTo(12.0f, 5.2f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(0.27f)
                lineToRelative(0.03f, 0.26f)
                lineToRelative(0.03f, 0.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.64f, 2.98f)
                lineToRelative(0.16f, 0.13f)
                lineToRelative(0.32f, 1.41f)
                horizontalLineToRelative(5.64f)
                lineToRelative(0.32f, -1.41f)
                lineToRelative(0.16f, -0.14f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.7f, -3.5f)
                verticalLineToRelative(-0.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                close()
            }
        }
        return _lightbulbCircle!!
    }

private var _lightbulbCircle: ImageVector? = null
