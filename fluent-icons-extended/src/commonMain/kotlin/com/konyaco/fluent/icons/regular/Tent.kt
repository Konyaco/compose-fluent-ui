

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = fluentIcon(name = "Regular.Tent") {
            fluentPath {
                moveTo(11.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.04f, -0.02f)
                lineToRelative(1.76f, 1.64f)
                curveToRelative(1.28f, 1.2f, 2.7f, 2.22f, 4.23f, 3.06f)
                curveToRelative(0.43f, 0.23f, 0.73f, 0.66f, 0.8f, 1.15f)
                lineToRelative(1.35f, 9.45f)
                horizontalLineToRelative(0.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.85f)
                lineTo(4.96f, 8.0f)
                curveToRelative(0.06f, -0.45f, 0.33f, -0.85f, 0.72f, -1.08f)
                curveToRelative(1.4f, -0.84f, 2.69f, -1.85f, 3.84f, -3.0f)
                lineToRelative(1.7f, -1.7f)
                close()
                moveTo(5.12f, 17.5f)
                horizontalLineToRelative(2.13f)
                arcToRelative(23.31f, 23.31f, 0.0f, false, false, 3.5f, -7.16f)
                lineToRelative(0.53f, -1.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.44f, 0.0f)
                lineToRelative(0.52f, 1.8f)
                curveToRelative(0.75f, 2.57f, 1.94f, 5.0f, 3.51f, 7.16f)
                horizontalLineToRelative(2.14f)
                lineToRelative(-1.33f, -9.24f)
                arcTo(22.31f, 22.31f, 0.0f, false, true, 13.0f, 4.94f)
                lineToRelative(-1.22f, -1.15f)
                lineToRelative(-1.19f, 1.19f)
                arcToRelative(21.43f, 21.43f, 0.0f, false, true, -4.14f, 3.24f)
                lineTo(5.11f, 17.5f)
                close()
                moveTo(14.92f, 17.5f)
                arcTo(24.81f, 24.81f, 0.0f, false, true, 12.0f, 11.4f)
                arcToRelative(24.81f, 24.81f, 0.0f, false, true, -2.93f, 6.1f)
                horizontalLineToRelative(5.86f)
                close()
            }
        }
        return _tent!!
    }

private var _tent: ImageVector? = null
