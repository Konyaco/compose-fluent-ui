

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonAdd: ImageVector
    get() {
        if (_personAdd != null) {
            return _personAdd!!
        }
        _personAdd = fluentIcon(name = "Filled.PersonAdd") {
            fluentPath {
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -1.29f, 0.38f, -2.49f, 1.02f, -3.5f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(4.06f, 20.92f, 6.58f, 22.0f, 10.0f, 22.0f)
                curveToRelative(0.93f, 0.0f, 1.8f, -0.08f, 2.6f, -0.24f)
                arcTo(6.48f, 6.48f, 0.0f, false, true, 11.0f, 17.5f)
                close()
                moveTo(15.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 5.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(17.41f, 14.0f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.2f, 0.05f, 0.37f, 0.2f, 0.4f, 0.41f)
                lineToRelative(0.01f, 0.09f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.2f, 0.05f, 0.36f, 0.2f, 0.4f, 0.41f)
                verticalLineToRelative(0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, 0.4f)
                lineToRelative(-0.1f, 0.01f)
                lineTo(18.0f, 18.0f)
                verticalLineToRelative(2.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.41f, 0.4f)
                lineToRelative(-0.09f, 0.01f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, -0.41f)
                lineTo(17.0f, 20.5f)
                lineTo(17.0f, 18.0f)
                lineTo(14.4f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, -0.41f)
                verticalLineToRelative(-0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.4f, -0.4f)
                lineToRelative(0.1f, -0.01f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-2.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.41f, -0.4f)
                close()
            }
        }
        return _personAdd!!
    }

private var _personAdd: ImageVector? = null
