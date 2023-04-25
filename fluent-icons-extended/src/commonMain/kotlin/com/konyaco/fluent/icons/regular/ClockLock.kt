

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClockLock: ImageVector
    get() {
        if (_clockLock != null) {
            return _clockLock!!
        }
        _clockLock = fluentIcon(name = "Regular.ClockLock") {
            fluentPath {
                moveTo(11.0f, 21.5f)
                verticalLineToRelative(-1.06f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -7.45f, -9.35f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.47f, 2.17f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 8.88f, 8.69f)
                curveToRelative(0.03f, -0.15f, 0.04f, -0.3f, 0.04f, -0.45f)
                close()
                moveTo(12.0f, 6.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(6.1f)
                curveToRelative(0.06f, 0.37f, 0.37f, 0.65f, 0.75f, 0.65f)
                horizontalLineToRelative(4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 6.65f)
                close()
                moveTo(3.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 21.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(3.0f, 15.0f)
                close()
                moveTo(4.5f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                close()
                moveTo(6.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        return _clockLock!!
    }

private var _clockLock: ImageVector? = null
