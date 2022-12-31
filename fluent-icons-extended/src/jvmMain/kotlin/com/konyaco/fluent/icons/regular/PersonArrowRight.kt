

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonArrowRight: ImageVector
    get() {
        if (_personArrowRight != null) {
            return _personArrowRight!!
        }
        _personArrowRight = fluentIcon(name = "Regular.PersonArrowRight") {
            fluentPath {
                moveTo(11.31f, 15.5f)
                curveToRelative(0.18f, -0.53f, 0.42f, -1.04f, 0.71f, -1.5f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveTo(4.47f, 21.1f, 6.85f, 22.0f, 10.0f, 22.0f)
                curveToRelative(0.93f, 0.0f, 1.8f, -0.08f, 2.6f, -0.24f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, true, -0.92f, -1.36f)
                curveToRelative(-0.52f, 0.07f, -1.08f, 0.1f, -1.68f, 0.1f)
                curveToRelative(-2.74f, 0.0f, -4.7f, -0.74f, -5.96f, -2.21f)
                curveToRelative(-0.35f, -0.4f, -0.54f, -0.93f, -0.54f, -1.46f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.06f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(10.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(18.35f, 14.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(15.0f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.3f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.15f, -0.34f)
                verticalLineToRelative(-0.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.15f, -0.36f)
                lineToRelative(-2.5f, -2.5f)
                close()
            }
        }
        return _personArrowRight!!
    }

private var _personArrowRight: ImageVector? = null
