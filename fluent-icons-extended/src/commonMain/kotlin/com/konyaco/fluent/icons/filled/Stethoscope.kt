

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = fluentIcon(name = "Filled.Stethoscope") {
            fluentPath {
                moveTo(3.0f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(2.0f, 9.0f)
                curveToRelative(0.0f, 1.74f, 0.61f, 3.26f, 1.71f, 4.34f)
                curveToRelative(0.87f, 0.86f, 2.01f, 1.4f, 3.29f, 1.59f)
                verticalLineToRelative(0.82f)
                arcToRelative(6.25f, 6.25f, 0.0f, true, false, 12.5f, 0.0f)
                verticalLineToRelative(-0.66f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(0.66f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, -8.5f, 0.0f)
                verticalLineToRelative(-0.82f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, false, 3.29f, -1.6f)
                arcTo(5.97f, 5.97f, 0.0f, false, false, 14.0f, 9.0f)
                lineTo(14.0f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 9.0f)
                curveToRelative(0.0f, 1.26f, -0.44f, 2.24f, -1.11f, 2.91f)
                arcTo(4.02f, 4.02f, 0.0f, false, true, 8.0f, 13.0f)
                curveToRelative(-1.22f, 0.0f, -2.2f, -0.42f, -2.89f, -1.09f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 4.0f, 9.0f)
                lineTo(4.0f, 4.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(3.0f, 2.5f)
                close()
                moveTo(18.5f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
