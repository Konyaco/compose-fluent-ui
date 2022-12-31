

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FixedWidth: ImageVector
    get() {
        if (_fixedWidth != null) {
            return _fixedWidth!!
        }
        _fixedWidth = fluentIcon(name = "Filled.FixedWidth") {
            fluentPath {
                moveTo(3.75f, 4.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.3f, 0.75f, 0.69f)
                lineTo(4.5f, 6.0f)
                horizontalLineToRelative(6.75f)
                lineTo(11.25f, 4.69f)
                curveToRelative(0.0f, -0.38f, 0.34f, -0.69f, 0.75f, -0.69f)
                reflectiveCurveToRelative(0.75f, 0.3f, 0.75f, 0.69f)
                lineTo(12.75f, 6.0f)
                horizontalLineToRelative(6.75f)
                lineTo(19.5f, 4.69f)
                curveToRelative(0.0f, -0.38f, 0.34f, -0.69f, 0.75f, -0.69f)
                reflectiveCurveToRelative(0.75f, 0.3f, 0.75f, 0.69f)
                lineTo(21.0f, 8.8f)
                curveToRelative(0.0f, 0.38f, -0.34f, 0.69f, -0.75f, 0.69f)
                reflectiveCurveToRelative(-0.75f, -0.3f, -0.75f, -0.69f)
                lineTo(19.5f, 7.5f)
                horizontalLineToRelative(-6.75f)
                verticalLineToRelative(1.31f)
                curveToRelative(0.0f, 0.38f, -0.34f, 0.69f, -0.75f, 0.69f)
                reflectiveCurveToRelative(-0.75f, -0.3f, -0.75f, -0.69f)
                lineTo(11.25f, 7.5f)
                lineTo(4.5f, 7.5f)
                verticalLineToRelative(1.31f)
                curveToRelative(0.0f, 0.38f, -0.34f, 0.69f, -0.75f, 0.69f)
                reflectiveCurveTo(3.0f, 9.2f, 3.0f, 8.81f)
                lineTo(3.0f, 4.7f)
                curveToRelative(0.0f, -0.38f, 0.34f, -0.69f, 0.75f, -0.69f)
                close()
                moveTo(5.75f, 11.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 13.75f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, 2.75f)
                horizontalLineToRelative(5.5f)
                lineTo(11.25f, 11.0f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(18.25f, 20.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(12.75f, 11.0f)
                horizontalLineToRelative(5.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 13.75f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                close()
            }
        }
        return _fixedWidth!!
    }

private var _fixedWidth: ImageVector? = null
