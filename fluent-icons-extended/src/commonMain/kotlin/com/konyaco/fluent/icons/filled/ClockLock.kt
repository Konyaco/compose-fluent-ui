

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClockLock: ImageVector
    get() {
        if (_clockLock != null) {
            return _clockLock!!
        }
        _clockLock = fluentIcon(name = "Filled.ClockLock") {
            fluentPath {
                moveTo(15.25f, 13.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(12.0f, 12.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -9.92f, 11.26f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.0f, 14.0f)
                verticalLineToRelative(0.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, 2.45f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.15f, -0.01f, 0.3f, -0.04f, 0.45f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 2.0f)
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
