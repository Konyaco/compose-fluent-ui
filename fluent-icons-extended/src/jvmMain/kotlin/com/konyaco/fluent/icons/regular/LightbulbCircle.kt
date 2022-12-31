

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LightbulbCircle: ImageVector
    get() {
        if (_lightbulbCircle != null) {
            return _lightbulbCircle!!
        }
        _lightbulbCircle = fluentIcon(name = "Regular.LightbulbCircle") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(12.0f, 5.2f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 3.11f, 8.92f)
                lineToRelative(0.03f, -0.03f)
                lineToRelative(-0.76f, 3.37f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -1.38f, 1.3f)
                lineToRelative(-0.15f, 0.03f)
                lineTo(11.3f, 18.79f)
                curveToRelative(-0.74f, 0.0f, -1.39f, -0.45f, -1.64f, -1.18f)
                lineToRelative(-0.05f, -0.16f)
                lineToRelative(-0.76f, -3.36f)
                lineToRelative(-0.16f, -0.13f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.67f, -3.23f)
                lineTo(7.0f, 10.47f)
                lineTo(7.0f, 10.2f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(13.17f, 16.0f)
                horizontalLineToRelative(-2.34f)
                lineToRelative(0.24f, 1.08f)
                lineToRelative(0.02f, 0.07f)
                curveToRelative(0.03f, 0.09f, 0.12f, 0.15f, 0.22f, 0.15f)
                lineTo(12.72f, 17.3f)
                curveToRelative(0.1f, -0.01f, 0.17f, -0.09f, 0.2f, -0.18f)
                lineToRelative(0.25f, -1.12f)
                close()
                moveTo(12.0f, 6.7f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.48f)
                verticalLineToRelative(0.23f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.46f, 2.64f)
                curveToRelative(0.15f, 0.1f, 0.26f, 0.26f, 0.3f, 0.44f)
                lineToRelative(0.23f, 1.01f)
                horizontalLineToRelative(3.02f)
                lineToRelative(0.23f, -1.0f)
                curveToRelative(0.03f, -0.14f, 0.1f, -0.27f, 0.2f, -0.37f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(0.17f, -0.13f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 6.7f)
                close()
            }
        }
        return _lightbulbCircle!!
    }

private var _lightbulbCircle: ImageVector? = null
