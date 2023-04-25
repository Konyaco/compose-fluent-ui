

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Dishwasher: ImageVector
    get() {
        if (_dishwasher != null) {
            return _dishwasher!!
        }
        _dishwasher = fluentIcon(name = "Regular.Dishwasher") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(7.0f, 19.5f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.77f, 0.1f, 1.37f, 0.71f, 1.48f, 1.48f)
                horizontalLineToRelative(9.27f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(19.5f, 8.0f)
                horizontalLineToRelative(-15.0f)
                lineTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(19.5f, 8.0f)
                close()
                moveTo(9.0f, 6.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.75f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(2.0f, 11.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 6.0f, 16.91f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-3.59f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 13.75f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        return _dishwasher!!
    }

private var _dishwasher: ImageVector? = null
