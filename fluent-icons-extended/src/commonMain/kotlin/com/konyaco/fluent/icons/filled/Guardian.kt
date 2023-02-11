

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Guardian: ImageVector
    get() {
        if (_guardian != null) {
            return _guardian!!
        }
        _guardian = fluentIcon(name = "Filled.Guardian") {
            fluentPath {
                moveTo(10.5f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(16.5f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(13.4f, 10.75f)
                curveToRelative(0.06f, 0.24f, 0.1f, 0.49f, 0.1f, 0.75f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.5f, 1.94f)
                lineTo(11.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.25f, 1.56f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.5f, 20.0f)
                verticalLineToRelative(-3.56f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 14.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, -2.75f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.26f, 0.0f, 2.32f, 0.85f, 2.65f, 2.0f)
                close()
                moveTo(14.43f, 10.75f)
                horizontalLineToRelative(5.32f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(1.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.5f, 1.94f)
                lineTo(20.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.25f, 1.56f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.5f, 20.0f)
                verticalLineToRelative(-3.26f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.0f, -2.24f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.26f, -0.03f, -0.5f, -0.07f, -0.75f)
                close()
            }
        }
        return _guardian!!
    }

private var _guardian: ImageVector? = null
