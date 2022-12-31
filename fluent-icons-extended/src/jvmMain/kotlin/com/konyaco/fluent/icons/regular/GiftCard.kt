

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = fluentIcon(name = "Regular.GiftCard") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(8.5f)
                curveTo(2.0f, 17.55f, 3.46f, 19.0f, 5.25f, 19.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-8.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(3.5f, 7.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                lineTo(8.0f, 5.5f)
                verticalLineToRelative(1.2f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 9.0f)
                curveToRelative(0.0f, 0.36f, 0.07f, 0.7f, 0.2f, 1.0f)
                lineTo(3.5f, 10.0f)
                lineTo(3.5f, 7.25f)
                close()
                moveTo(9.5f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(9.5f, 9.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 12.56f)
                verticalLineToRelative(4.94f)
                lineTo(5.25f, 17.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(3.5f, 11.5f)
                horizontalLineToRelative(3.44f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(8.0f, 12.56f)
                close()
                moveTo(9.5f, 17.5f)
                verticalLineToRelative(-4.94f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.72f, -1.72f)
                horizontalLineToRelative(9.94f)
                verticalLineToRelative(4.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(9.5f, 17.5f)
                close()
                moveTo(9.5f, 6.7f)
                lineTo(9.5f, 5.5f)
                horizontalLineToRelative(9.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(20.5f, 10.0f)
                horizontalLineToRelative(-7.7f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.3f, -3.5f)
                curveToRelative(-0.36f, 0.0f, -0.7f, 0.07f, -1.0f, 0.2f)
                close()
            }
        }
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
