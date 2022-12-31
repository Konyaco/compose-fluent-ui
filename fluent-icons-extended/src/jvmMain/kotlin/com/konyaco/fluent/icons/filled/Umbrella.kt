

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = fluentIcon(name = "Filled.Umbrella") {
            fluentPath {
                moveTo(10.25f, 10.91f)
                curveToRelative(0.47f, -0.4f, 1.07f, -0.73f, 1.75f, -0.73f)
                curveToRelative(0.68f, 0.0f, 1.28f, 0.33f, 1.75f, 0.73f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 0.68f, 0.71f)
                lineToRelative(0.03f, 0.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.24f, 0.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 0.71f, -0.76f)
                curveToRelative(0.48f, -0.4f, 1.08f, -0.73f, 1.76f, -0.73f)
                curveToRelative(0.67f, 0.0f, 1.28f, 0.33f, 1.75f, 0.73f)
                curveToRelative(0.23f, 0.2f, 0.41f, 0.4f, 0.54f, 0.54f)
                lineToRelative(0.17f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, -0.42f)
                curveTo(22.0f, 6.57f, 17.95f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.57f, 2.0f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.42f)
                lineToRelative(0.17f, -0.22f)
                curveToRelative(0.13f, -0.15f, 0.31f, -0.34f, 0.54f, -0.54f)
                curveToRelative(0.47f, -0.4f, 1.08f, -0.73f, 1.75f, -0.73f)
                curveToRelative(0.68f, 0.0f, 1.28f, 0.33f, 1.76f, 0.73f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 0.7f, 0.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.25f, 0.0f)
                lineToRelative(0.03f, -0.05f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.68f, -0.7f)
                close()
                moveTo(12.0f, 11.18f)
                curveToRelative(-0.24f, 0.0f, -0.49f, 0.08f, -0.75f, 0.24f)
                lineTo(11.25f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(6.75f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                verticalLineToRelative(-7.58f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, false, -0.75f, -0.24f)
                close()
            }
        }
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
