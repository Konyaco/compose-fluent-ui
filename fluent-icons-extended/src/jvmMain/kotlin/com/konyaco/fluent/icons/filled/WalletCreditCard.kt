

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WalletCreditCard: ImageVector
    get() {
        if (_walletCreditCard != null) {
            return _walletCreditCard!!
        }
        _walletCreditCard = fluentIcon(name = "Filled.WalletCreditCard") {
            fluentPath {
                moveTo(14.36f, 2.6f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.36f, -0.04f)
                lineToRelative(0.92f, 0.81f)
                lineTo(12.74f, 7.0f)
                horizontalLineToRelative(1.92f)
                lineToRelative(2.1f, -2.63f)
                lineToRelative(1.66f, 1.45f)
                curveToRelative(0.1f, 0.1f, 0.11f, 0.25f, 0.02f, 0.35f)
                lineToRelative(-0.69f, 0.83f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.5f, -0.72f, 0.38f, -1.71f, -0.3f, -2.3f)
                lineToRelative(-3.69f, -3.26f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.53f, 0.23f)
                lineTo(8.98f, 7.0f)
                horizontalLineToRelative(1.9f)
                lineToRelative(3.48f, -4.4f)
                close()
                moveTo(5.25f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-12.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 7.25f)
                curveTo(3.0f, 6.01f, 4.0f, 5.0f, 5.25f, 5.0f)
                horizontalLineToRelative(4.32f)
                lineToRelative(-1.2f, 1.5f)
                lineTo(5.26f, 6.5f)
                close()
                moveTo(15.5f, 14.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
            }
        }
        return _walletCreditCard!!
    }

private var _walletCreditCard: ImageVector? = null
