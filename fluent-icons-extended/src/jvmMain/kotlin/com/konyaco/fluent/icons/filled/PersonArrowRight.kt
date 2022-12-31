

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonArrowRight: ImageVector
    get() {
        if (_personArrowRight != null) {
            return _personArrowRight!!
        }
        _personArrowRight = fluentIcon(name = "Filled.PersonArrowRight") {
            fluentPath {
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -1.29f, 0.37f, -2.49f, 1.02f, -3.5f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(4.06f, 20.92f, 6.58f, 22.0f, 10.0f, 22.0f)
                curveToRelative(0.93f, 0.0f, 1.8f, -0.08f, 2.6f, -0.24f)
                arcTo(6.47f, 6.47f, 0.0f, false, true, 11.0f, 17.5f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
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
