

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookCoins: ImageVector
    get() {
        if (_bookCoins != null) {
            return _bookCoins!!
        }
        _bookCoins = fluentIcon(name = "Filled.BookCoins") {
            fluentPath {
                moveTo(4.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 2.0f)
                lineTo(18.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(5.5f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(10.2f, 7.46f)
                curveTo(9.62f, 7.74f, 9.0f, 8.24f, 9.0f, 9.0f)
                reflectiveCurveToRelative(0.62f, 1.26f, 1.2f, 1.54f)
                curveToRelative(0.62f, 0.3f, 1.43f, 0.46f, 2.3f, 0.46f)
                curveToRelative(0.87f, 0.0f, 1.68f, -0.17f, 2.3f, -0.46f)
                curveToRelative(0.58f, -0.28f, 1.2f, -0.78f, 1.2f, -1.54f)
                reflectiveCurveToRelative(-0.62f, -1.26f, -1.2f, -1.54f)
                arcTo(5.46f, 5.46f, 0.0f, false, false, 12.5f, 7.0f)
                curveToRelative(-0.87f, 0.0f, -1.68f, 0.17f, -2.3f, 0.46f)
                close()
                moveTo(16.0f, 10.9f)
                arcTo(5.58f, 5.58f, 0.0f, false, true, 12.5f, 12.0f)
                arcTo(5.58f, 5.58f, 0.0f, false, true, 9.0f, 10.89f)
                lineTo(9.0f, 11.0f)
                curveToRelative(0.0f, 1.1f, 1.57f, 2.0f, 3.5f, 2.0f)
                reflectiveCurveToRelative(3.5f, -0.9f, 3.5f, -2.0f)
                verticalLineToRelative(-0.11f)
                close()
                moveTo(12.5f, 14.0f)
                arcTo(5.58f, 5.58f, 0.0f, false, true, 9.0f, 12.89f)
                lineTo(9.0f, 13.0f)
                curveToRelative(0.0f, 1.1f, 1.57f, 2.0f, 3.5f, 2.0f)
                reflectiveCurveToRelative(3.5f, -0.9f, 3.5f, -2.0f)
                verticalLineToRelative(-0.11f)
                arcTo(5.58f, 5.58f, 0.0f, false, true, 12.5f, 14.0f)
                close()
            }
        }
        return _bookCoins!!
    }

private var _bookCoins: ImageVector? = null
