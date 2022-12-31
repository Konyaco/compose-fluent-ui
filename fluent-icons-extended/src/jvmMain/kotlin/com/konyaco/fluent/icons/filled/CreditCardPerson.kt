

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CreditCardPerson: ImageVector
    get() {
        if (_creditCardPerson != null) {
            return _creditCardPerson!!
        }
        _creditCardPerson = fluentIcon(name = "Filled.CreditCardPerson") {
            fluentPath {
                moveTo(5.25f, 5.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 8.25f)
                lineTo(2.0f, 9.5f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 8.25f)
                curveTo(22.0f, 6.45f, 20.54f, 5.0f, 18.75f, 5.0f)
                lineTo(5.25f, 5.0f)
                close()
                moveTo(2.0f, 15.75f)
                lineTo(2.0f, 11.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.45f, 6.0f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-1.26f, 0.0f, -2.33f, 0.84f, -2.66f, 2.0f)
                lineTo(5.25f, 19.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 15.75f)
                close()
                moveTo(21.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(23.0f, 19.88f)
                curveToRelative(0.0f, 1.55f, -1.29f, 3.12f, -4.5f, 3.12f)
                reflectiveCurveTo(14.0f, 21.44f, 14.0f, 19.87f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.98f, 0.8f, -1.77f, 1.77f, -1.77f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _creditCardPerson!!
    }

private var _creditCardPerson: ImageVector? = null
