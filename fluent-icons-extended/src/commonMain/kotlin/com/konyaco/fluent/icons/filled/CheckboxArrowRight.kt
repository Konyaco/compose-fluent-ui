

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CheckboxArrowRight: ImageVector
    get() {
        if (_checkboxArrowRight != null) {
            return _checkboxArrowRight!!
        }
        _checkboxArrowRight = fluentIcon(name = "Filled.CheckboxArrowRight") {
            fluentPath {
                moveTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(6.25f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 8.5f, -8.5f)
                lineTo(20.0f, 5.25f)
                curveTo(20.0f, 3.45f, 18.54f, 2.0f, 16.75f, 2.0f)
                lineTo(5.25f, 2.0f)
                close()
                moveTo(16.28f, 8.28f)
                lineTo(9.53f, 15.03f)
                curveToRelative(-0.3f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f)
                lineToRelative(-2.75f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineTo(9.0f, 13.44f)
                lineToRelative(6.22f, -6.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
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
