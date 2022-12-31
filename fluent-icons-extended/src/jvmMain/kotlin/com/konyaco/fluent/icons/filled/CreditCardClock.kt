

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CreditCardClock: ImageVector
    get() {
        if (_creditCardClock != null) {
            return _creditCardClock!!
        }
        _creditCardClock = fluentIcon(name = "Filled.CreditCardClock") {
            fluentPath {
                moveTo(2.0f, 8.25f)
                curveTo(2.0f, 6.45f, 3.46f, 5.0f, 5.25f, 5.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 5.0f, 22.0f, 6.46f, 22.0f, 8.25f)
                lineTo(22.0f, 9.5f)
                lineTo(2.0f, 9.5f)
                lineTo(2.0f, 8.25f)
                close()
                moveTo(11.17f, 19.0f)
                lineTo(5.25f, 19.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 15.75f)
                lineTo(2.0f, 11.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -6.33f, 8.0f)
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
