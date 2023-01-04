

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonLightbulb: ImageVector
    get() {
        if (_personLightbulb != null) {
            return _personLightbulb!!
        }
        _personLightbulb = fluentIcon(name = "Filled.PersonLightbulb") {
            fluentPath {
                moveTo(13.0f, 16.0f)
                curveToRelative(0.0f, -0.71f, 0.15f, -1.39f, 0.42f, -2.0f)
                lineTo(6.25f, 14.0f)
                curveTo(5.01f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(6.06f, 20.92f, 8.58f, 22.0f, 12.0f, 22.0f)
                curveToRelative(1.17f, 0.0f, 2.24f, -0.13f, 3.2f, -0.38f)
                lineToRelative(-0.34f, -1.73f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 16.0f)
                close()
                moveTo(17.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 7.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
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
