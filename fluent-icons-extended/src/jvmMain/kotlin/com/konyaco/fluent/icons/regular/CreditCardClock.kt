

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CreditCardClock: ImageVector
    get() {
        if (_creditCardClock != null) {
            return _creditCardClock!!
        }
        _creditCardClock = fluentIcon(name = "Regular.CreditCardClock") {
            fluentPath {
                moveTo(5.25f, 5.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 8.25f)
                verticalLineToRelative(7.5f)
                curveTo(2.0f, 17.55f, 3.46f, 19.0f, 5.25f, 19.0f)
                horizontalLineToRelative(5.92f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -0.17f, -1.5f)
                lineTo(5.25f, 17.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(3.5f, 11.0f)
                lineTo(22.0f, 11.0f)
                lineTo(22.0f, 8.25f)
                curveTo(22.0f, 6.45f, 20.54f, 5.0f, 18.75f, 5.0f)
                lineTo(5.25f, 5.0f)
                close()
                moveTo(20.5f, 8.25f)
                lineTo(20.5f, 9.5f)
                horizontalLineToRelative(-17.0f)
                lineTo(3.5f, 8.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(19.5f, 17.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
            }
        }
        return _creditCardClock!!
    }

private var _creditCardClock: ImageVector? = null
