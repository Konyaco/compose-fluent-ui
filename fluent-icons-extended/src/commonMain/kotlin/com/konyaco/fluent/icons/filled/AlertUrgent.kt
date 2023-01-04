

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlertUrgent: ImageVector
    get() {
        if (_alertUrgent != null) {
            return _alertUrgent!!
        }
        _alertUrgent = fluentIcon(name = "Filled.AlertUrgent") {
            fluentPath {
                moveTo(10.43f, 19.92f)
                lineToRelative(3.56f, -1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.56f, 1.5f)
                close()
                moveTo(15.86f, 2.1f)
                arcToRelative(11.72f, 11.72f, 0.0f, false, true, 4.68f, 4.4f)
                arcTo(11.72f, 11.72f, 0.0f, false, true, 22.0f, 12.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, -0.04f)
                curveToRelative(0.05f, -2.1f, -0.37f, -3.92f, -1.26f, -5.46f)
                arcToRelative(10.23f, 10.23f, 0.0f, false, false, -4.1f, -3.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.72f, -1.32f)
                close()
                moveTo(6.71f, 6.52f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, true, 7.6f, 2.74f)
                lineToRelative(0.1f, 0.21f)
                lineToRelative(1.29f, 2.9f)
                lineToRelative(1.7f, 1.46f)
                curveToRelative(0.09f, 0.08f, 0.17f, 0.18f, 0.26f, 0.33f)
                lineToRelative(0.06f, 0.11f)
                curveToRelative(0.28f, 0.63f, 0.0f, 1.37f, -0.64f, 1.65f)
                lineTo(6.76f, 20.49f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 5.0f, 19.35f)
                lineTo(5.0f, 17.0f)
                lineToRelative(-1.24f, -2.79f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, true, 2.95f, -7.7f)
                close()
                moveTo(15.62f, 5.69f)
                curveToRelative(0.97f, 0.53f, 1.75f, 1.3f, 2.32f, 2.3f)
                curveToRelative(0.57f, 0.99f, 0.85f, 2.04f, 0.82f, 3.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, -0.03f)
                curveToRelative(0.02f, -0.82f, -0.18f, -1.6f, -0.62f, -2.37f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, false, -1.73f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.71f, -1.32f)
                close()
            }
        }
        return _alertUrgent!!
    }

private var _alertUrgent: ImageVector? = null
