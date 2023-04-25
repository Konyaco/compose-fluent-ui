

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BeakerEdit: ImageVector
    get() {
        if (_beakerEdit != null) {
            return _beakerEdit!!
        }
        _beakerEdit = fluentIcon(name = "Filled.BeakerEdit") {
            fluentPath {
                moveTo(7.0f, 3.5f)
                verticalLineToRelative(6.24f)
                curveToRelative(0.0f, 0.37f, -0.1f, 0.74f, -0.27f, 1.07f)
                lineTo(5.53f, 13.0f)
                horizontalLineToRelative(8.93f)
                lineToRelative(-1.19f, -2.19f)
                curveToRelative(-0.18f, -0.33f, -0.27f, -0.7f, -0.27f, -1.07f)
                lineTo(13.0f, 3.5f)
                horizontalLineToRelative(1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.27f, 14.5f)
                lineTo(4.73f, 14.5f)
                lineToRelative(-1.59f, 2.91f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 4.68f, 20.0f)
                horizontalLineToRelative(6.74f)
                lineToRelative(0.1f, -0.42f)
                curveToRelative(0.16f, -0.65f, 0.5f, -1.24f, 0.97f, -1.72f)
                lineToRelative(2.99f, -2.98f)
                lineToRelative(-0.2f, -0.38f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.2f, 18.57f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _beakerEdit!!
    }

private var _beakerEdit: ImageVector? = null
