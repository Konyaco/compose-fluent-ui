

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Dishwasher: ImageVector
    get() {
        if (_dishwasher != null) {
            return _dishwasher!!
        }
        _dishwasher = fluentIcon(name = "Filled.Dishwasher") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(8.99f, 10.51f)
                lineTo(8.97f, 10.5f)
                lineTo(21.0f, 10.5f)
                verticalLineToRelative(7.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(8.48f, 21.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 7.0f, 19.52f)
                verticalLineToRelative(-1.9f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 2.5f, -3.87f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.46f, -0.18f, -0.9f, -0.51f, -1.24f)
                close()
                moveTo(9.0f, 6.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(12.75f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(2.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 2.5f, 3.16f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(6.0f, 20.5f)
                verticalLineToRelative(-3.59f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 2.5f, -3.16f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        return _dishwasher!!
    }

private var _dishwasher: ImageVector? = null
