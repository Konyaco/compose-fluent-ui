

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonLightbulb: ImageVector
    get() {
        if (_personLightbulb != null) {
            return _personLightbulb!!
        }
        _personLightbulb = fluentIcon(name = "Regular.PersonLightbulb") {
            fluentPath {
                moveTo(13.02f, 15.5f)
                curveToRelative(0.06f, -0.53f, 0.2f, -1.03f, 0.4f, -1.5f)
                lineTo(6.25f, 14.0f)
                curveTo(5.01f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveTo(6.47f, 21.1f, 8.85f, 22.0f, 12.0f, 22.0f)
                curveToRelative(1.17f, 0.0f, 2.24f, -0.13f, 3.2f, -0.38f)
                lineToRelative(-0.29f, -1.47f)
                curveToRelative(-0.85f, 0.23f, -1.82f, 0.35f, -2.91f, 0.35f)
                curveToRelative(-2.74f, 0.0f, -4.7f, -0.74f, -5.96f, -2.21f)
                curveToRelative(-0.35f, -0.4f, -0.54f, -0.93f, -0.54f, -1.46f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.77f)
                close()
                moveTo(17.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 7.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                close()
                moveTo(22.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.76f, 3.32f)
                lineToRelative(-0.14f, 0.68f)
                horizontalLineToRelative(-4.2f)
                lineToRelative(-0.14f, -0.68f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 22.0f, 16.0f)
                close()
                moveTo(16.1f, 21.0f)
                lineToRelative(0.16f, 0.8f)
                curveToRelative(0.14f, 0.7f, 0.75f, 1.2f, 1.47f, 1.2f)
                horizontalLineToRelative(0.54f)
                curveToRelative(0.72f, 0.0f, 1.33f, -0.5f, 1.47f, -1.2f)
                lineToRelative(0.16f, -0.8f)
                horizontalLineToRelative(-3.8f)
                close()
            }
        }
        return _personLightbulb!!
    }

private var _personLightbulb: ImageVector? = null
