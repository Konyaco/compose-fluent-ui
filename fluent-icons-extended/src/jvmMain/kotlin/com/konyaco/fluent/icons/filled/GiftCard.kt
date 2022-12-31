

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = fluentIcon(name = "Filled.GiftCard") {
            fluentPath {
                moveTo(9.5f, 19.0f)
                lineTo(19.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-4.5f)
                lineTo(10.56f, 11.5f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(9.5f, 12.56f)
                lineTo(9.5f, 19.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.5f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                close()
                moveTo(9.5f, 6.7f)
                lineTo(9.5f, 4.0f)
                lineTo(19.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-9.2f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.3f, -3.5f)
                curveToRelative(-0.36f, 0.0f, -0.7f, 0.07f, -1.0f, 0.2f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineToRelative(2.7f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 9.0f)
                curveToRelative(0.0f, 0.36f, 0.07f, 0.7f, 0.2f, 1.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 12.56f)
                lineTo(8.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(4.94f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(8.0f, 12.56f)
                close()
            }
        }
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
