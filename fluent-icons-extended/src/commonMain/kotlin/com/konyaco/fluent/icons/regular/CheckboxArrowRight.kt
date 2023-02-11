

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CheckboxArrowRight: ImageVector
    get() {
        if (_checkboxArrowRight != null) {
            return _checkboxArrowRight!!
        }
        _checkboxArrowRight = fluentIcon(name = "Regular.CheckboxArrowRight") {
            fluentPath {
                moveTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(6.25f)
                curveToRelative(-0.2f, -0.47f, -0.34f, -0.98f, -0.42f, -1.5f)
                lineTo(5.25f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(3.5f, 5.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(5.83f)
                curveToRelative(0.52f, 0.08f, 1.03f, 0.22f, 1.5f, 0.42f)
                lineTo(20.0f, 5.25f)
                curveTo(20.0f, 3.45f, 18.54f, 2.0f, 16.75f, 2.0f)
                lineTo(5.25f, 2.0f)
                close()
                moveTo(16.28f, 8.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(9.0f, 13.44f)
                lineToRelative(-2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.06f, 0.0f)
                lineToRelative(6.75f, -6.75f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(14.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(14.5f, 17.0f)
                close()
            }
        }
        return _checkboxArrowRight!!
    }

private var _checkboxArrowRight: ImageVector? = null
