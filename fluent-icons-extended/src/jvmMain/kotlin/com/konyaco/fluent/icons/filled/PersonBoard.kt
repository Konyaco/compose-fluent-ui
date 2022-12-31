

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonBoard: ImageVector
    get() {
        if (_personBoard != null) {
            return _personBoard!!
        }
        _personBoard = fluentIcon(name = "Filled.PersonBoard") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(8.5f)
                curveTo(3.0f, 16.55f, 4.46f, 18.0f, 6.25f, 18.0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-8.5f)
                curveTo(18.0f, 4.45f, 16.54f, 3.0f, 14.75f, 3.0f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(12.75f, 7.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.5f, 0.0f)
                close()
                moveTo(13.5f, 10.75f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.5f, -0.09f, 0.86f, -0.25f, 1.16f)
                curveToRelative(-0.17f, 0.3f, -0.43f, 0.56f, -0.82f, 0.83f)
                curveToRelative(-0.73f, 0.5f, -1.86f, 0.76f, -3.43f, 0.76f)
                arcToRelative(6.12f, 6.12f, 0.0f, false, true, -3.24f, -0.76f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.94f, -0.83f)
                curveToRelative(-0.2f, -0.3f, -0.32f, -0.66f, -0.32f, -1.16f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(6.01f, 19.0f)
                curveToRelative(0.58f, 0.9f, 1.59f, 1.5f, 2.74f, 1.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.9f, 0.0f, 5.25f, -2.35f, 5.25f, -5.25f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.15f, -0.6f, -2.16f, -1.5f, -2.74f)
                verticalLineToRelative(9.24f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 15.25f, 19.0f)
                lineTo(6.01f, 19.0f)
                close()
            }
        }
        return _personBoard!!
    }

private var _personBoard: ImageVector? = null
