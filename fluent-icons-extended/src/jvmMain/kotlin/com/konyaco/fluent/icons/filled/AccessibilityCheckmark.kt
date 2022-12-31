

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AccessibilityCheckmark: ImageVector
    get() {
        if (_accessibilityCheckmark != null) {
            return _accessibilityCheckmark!!
        }
        _accessibilityCheckmark = fluentIcon(name = "Filled.AccessibilityCheckmark") {
            fluentPath {
                moveTo(12.0f, 6.5f)
                arcTo(2.25f, 2.25f, 0.0f, true, false, 12.0f, 2.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                close()
                moveTo(6.15f, 4.18f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, -2.96f, 1.18f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, 1.18f, 2.96f)
                lineTo(7.39f, 9.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.61f, 0.92f)
                verticalLineToRelative(3.04f)
                lineToRelative(-1.88f, 5.46f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 4.26f, 1.46f)
                lineToRelative(0.7f, -2.01f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 4.93f, -7.3f)
                verticalLineToRelative(-0.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.6f, -0.92f)
                lineToRelative(3.02f, -1.28f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, 1.18f, -2.96f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, -2.96f, -1.18f)
                lineToRelative(-1.6f, 0.68f)
                curveToRelative(-0.35f, 0.14f, -0.58f, 0.42f, -0.7f, 0.73f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -7.1f, 0.0f)
                curveToRelative(-0.12f, -0.3f, -0.35f, -0.59f, -0.7f, -0.73f)
                lineToRelative(-1.6f, -0.68f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(20.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-3.65f, 3.64f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _accessibilityCheckmark!!
    }

private var _accessibilityCheckmark: ImageVector? = null
