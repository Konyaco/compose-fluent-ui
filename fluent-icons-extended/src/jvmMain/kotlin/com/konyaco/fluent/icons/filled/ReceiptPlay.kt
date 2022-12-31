

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ReceiptPlay: ImageVector
    get() {
        if (_receiptPlay != null) {
            return _receiptPlay!!
        }
        _receiptPlay = fluentIcon(name = "Filled.ReceiptPlay") {
            fluentPath {
                moveTo(5.0f, 4.25f)
                curveTo(5.0f, 3.01f, 6.0f, 2.0f, 7.25f, 2.0f)
                horizontalLineToRelative(8.5f)
                curveTo(16.99f, 2.0f, 18.0f, 3.0f, 18.0f, 4.25f)
                lineTo(18.0f, 12.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.33f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, false, -0.65f, -4.0f)
                horizontalLineToRelative(1.98f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.06f)
                arcTo(6.48f, 6.48f, 0.0f, false, false, 5.0f, 11.17f)
                lineTo(5.0f, 4.25f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(20.0f, 13.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 17.0f)
                close()
                moveTo(8.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(8.75f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(6.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(5.0f, 14.96f)
                verticalLineToRelative(5.08f)
                curveToRelative(0.0f, 0.4f, 0.46f, 0.64f, 0.79f, 0.4f)
                lineToRelative(3.62f, -2.53f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.82f)
                lineTo(5.8f, 14.55f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.79f, 0.41f)
                close()
            }
        }
        return _receiptPlay!!
    }

private var _receiptPlay: ImageVector? = null
