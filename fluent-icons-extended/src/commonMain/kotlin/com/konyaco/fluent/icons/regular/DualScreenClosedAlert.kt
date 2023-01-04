

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DualScreenClosedAlert: ImageVector
    get() {
        if (_dualScreenClosedAlert != null) {
            return _dualScreenClosedAlert!!
        }
        _dualScreenClosedAlert = fluentIcon(name = "Regular.DualScreenClosedAlert") {
            fluentPath {
                moveTo(16.5f, 2.0f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(2.52f)
                lineToRelative(1.38f, 1.66f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.38f, 0.82f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.38f, -0.82f)
                lineToRelative(1.38f, -1.66f)
                lineTo(12.5f, 6.0f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(5.75f, 5.0f)
                horizontalLineToRelative(5.85f)
                curveToRelative(-0.06f, 0.33f, -0.1f, 0.66f, -0.1f, 1.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(8.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.92f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.5f, 0.13f)
                verticalLineToRelative(4.79f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(5.0f, 5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(15.5f, 12.73f)
                curveToRelative(-0.3f, -0.17f, -0.55f, -0.43f, -0.72f, -0.73f)
                horizontalLineToRelative(3.44f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, -2.72f, 0.73f)
                close()
            }
        }
        return _dualScreenClosedAlert!!
    }

private var _dualScreenClosedAlert: ImageVector? = null
