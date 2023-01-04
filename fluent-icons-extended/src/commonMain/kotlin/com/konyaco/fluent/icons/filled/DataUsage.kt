

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataUsage: ImageVector
    get() {
        if (_dataUsage != null) {
            return _dataUsage!!
        }
        _dataUsage = fluentIcon(name = "Filled.DataUsage") {
            fluentPath {
                moveTo(18.25f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(7.75f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 7.75f, 9.0f)
                close()
                moveTo(16.25f, 7.0f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, -0.75f, 0.73f)
                verticalLineToRelative(8.54f)
                curveToRelative(0.0f, 0.4f, 0.34f, 0.73f, 0.75f, 0.73f)
                reflectiveCurveToRelative(0.75f, -0.33f, 0.75f, -0.73f)
                lineTo(17.0f, 7.73f)
                curveToRelative(0.0f, -0.4f, -0.34f, -0.73f, -0.75f, -0.73f)
                close()
                moveTo(11.98f, 12.0f)
                curveToRelative(-0.4f, 0.0f, -0.73f, 0.33f, -0.73f, 0.73f)
                lineToRelative(0.04f, 3.55f)
                curveToRelative(0.0f, 0.4f, 0.33f, 0.72f, 0.73f, 0.72f)
                curveToRelative(0.4f, 0.0f, 0.73f, -0.34f, 0.73f, -0.74f)
                lineToRelative(-0.04f, -3.54f)
                curveToRelative(0.0f, -0.4f, -0.33f, -0.73f, -0.73f, -0.72f)
                close()
            }
        }
        return _dataUsage!!
    }

private var _dataUsage: ImageVector? = null
