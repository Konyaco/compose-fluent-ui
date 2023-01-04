

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = fluentIcon(name = "Filled.Accessibility") {
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
                lineToRelative(1.38f, -4.02f)
                curveToRelative(0.08f, -0.23f, 0.4f, -0.23f, 0.48f, 0.0f)
                lineToRelative(1.38f, 4.02f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 4.26f, -1.46f)
                lineTo(16.0f, 13.56f)
                verticalLineToRelative(-3.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.61f, -0.92f)
                lineToRelative(3.02f, -1.28f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, 1.18f, -2.96f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, -2.96f, -1.18f)
                lineToRelative(-1.6f, 0.68f)
                curveToRelative(-0.35f, 0.14f, -0.58f, 0.42f, -0.7f, 0.73f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -7.1f, 0.0f)
                curveToRelative(-0.12f, -0.3f, -0.35f, -0.59f, -0.7f, -0.73f)
                lineToRelative(-1.6f, -0.68f)
                close()
            }
        }
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
