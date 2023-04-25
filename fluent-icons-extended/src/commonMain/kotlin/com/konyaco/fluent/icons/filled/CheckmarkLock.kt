

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CheckmarkLock: ImageVector
    get() {
        if (_checkmarkLock != null) {
            return _checkmarkLock!!
        }
        _checkmarkLock = fluentIcon(name = "Filled.CheckmarkLock") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.92f, 11.26f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.0f, 14.0f)
                verticalLineToRelative(0.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, 2.45f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.15f, 0.01f, 0.3f, 0.04f, 0.45f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                close()
                moveTo(15.22f, 8.97f)
                lineTo(10.75f, 13.44f)
                lineTo(8.78f, 11.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                close()
                moveTo(18.5f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.54f)
                curveToRelative(0.81f, 0.02f, 1.46f, 0.69f, 1.46f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                close()
                moveTo(18.1f, 19.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.35f, -1.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.34f, 1.24f)
                close()
                moveTo(17.5f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
        }
        return _checkmarkLock!!
    }

private var _checkmarkLock: ImageVector? = null
