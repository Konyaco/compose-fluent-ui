

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = fluentIcon(name = "Regular.Stethoscope") {
            fluentPath {
                moveTo(2.75f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(2.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.25f, 5.95f)
                verticalLineToRelative(0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-0.84f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -1.5f, 0.0f)
                verticalLineToRelative(0.84f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -9.0f, 0.0f)
                verticalLineToRelative(-0.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 14.0f, 9.0f)
                lineTo(14.0f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f)
                lineTo(3.5f, 4.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(18.5f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
