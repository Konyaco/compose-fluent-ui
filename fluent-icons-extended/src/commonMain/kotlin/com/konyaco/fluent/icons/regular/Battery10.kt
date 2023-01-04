

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Battery10: ImageVector
    get() {
        if (_battery10 != null) {
            return _battery10!!
        }
        _battery10 = fluentIcon(name = "Regular.Battery10") {
            fluentPath {
                moveTo(17.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(5.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(17.0f, 7.5f)
                lineTo(5.0f, 7.5f)
                curveToRelative(-0.78f, 0.0f, -1.42f, 0.6f, -1.5f, 1.36f)
                lineTo(3.5f, 15.0f)
                curveToRelative(0.0f, 0.78f, 0.6f, 1.42f, 1.36f, 1.5f)
                lineTo(17.0f, 16.5f)
                curveToRelative(0.78f, 0.0f, 1.42f, -0.6f, 1.5f, -1.36f)
                lineTo(18.5f, 9.0f)
                curveToRelative(0.0f, -0.78f, -0.6f, -1.42f, -1.36f, -1.5f)
                lineTo(17.0f, 7.5f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(17.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                lineTo(6.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                lineTo(5.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -1.0f)
                lineTo(16.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                close()
            }
        }
        return _battery10!!
    }

private var _battery10: ImageVector? = null
