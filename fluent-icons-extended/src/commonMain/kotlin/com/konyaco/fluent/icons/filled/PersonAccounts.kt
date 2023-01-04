

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonAccounts: ImageVector
    get() {
        if (_personAccounts != null) {
            return _personAccounts!!
        }
        _personAccounts = fluentIcon(name = "Filled.PersonAccounts") {
            fluentPath {
                moveTo(13.0f, 14.05f)
                lineTo(13.0f, 14.0f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(4.06f, 20.92f, 6.58f, 22.0f, 10.0f, 22.0f)
                curveToRelative(0.36f, 0.0f, 0.7f, -0.01f, 1.04f, -0.03f)
                curveToRelative(-0.03f, -0.15f, -0.04f, -0.31f, -0.04f, -0.47f)
                verticalLineToRelative(-5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, -2.45f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(21.0f, 15.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(14.0f, 15.0f)
                close()
                moveTo(15.5f, 13.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.11f, 0.25f, 0.25f)
                lineTo(19.5f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.25f)
                close()
            }
        }
        return _personAccounts!!
    }

private var _personAccounts: ImageVector? = null
