

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Patient: ImageVector
    get() {
        if (_patient != null) {
            return _patient!!
        }
        _patient = fluentIcon(name = "Regular.Patient") {
            fluentPath {
                moveTo(17.75f, 2.0f)
                curveTo(18.99f, 2.0f, 20.0f, 3.0f, 20.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveTo(20.0f, 21.0f, 19.0f, 22.0f, 17.75f, 22.0f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(6.25f, 2.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(18.5f, 16.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.42f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                lineTo(18.5f, 16.0f)
                close()
                moveTo(7.75f, 17.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(8.6f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(17.75f, 3.5f)
                lineTo(6.15f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                lineTo(5.5f, 14.5f)
                lineTo(8.0f, 14.5f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -0.65f, 0.5f, -1.18f, 1.12f, -1.25f)
                horizontalLineToRelative(5.63f)
                curveToRelative(0.65f, 0.0f, 1.18f, 0.49f, 1.24f, 1.12f)
                lineToRelative(0.01f, 0.13f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(2.5f)
                lineTo(18.5f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(14.5f, 12.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(12.0f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        return _patient!!
    }

private var _patient: ImageVector? = null
