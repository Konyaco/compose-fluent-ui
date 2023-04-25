

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ReceiptAdd: ImageVector
    get() {
        if (_receiptAdd != null) {
            return _receiptAdd!!
        }
        _receiptAdd = fluentIcon(name = "Filled.ReceiptAdd") {
            fluentPath {
                moveTo(5.0f, 6.25f)
                curveTo(5.0f, 5.01f, 6.0f, 4.0f, 7.25f, 4.0f)
                horizontalLineToRelative(8.5f)
                curveTo(16.99f, 4.0f, 18.0f, 5.0f, 18.0f, 6.25f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.98f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -1.08f, -7.5f)
                horizontalLineToRelative(3.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(9.0f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -4.0f, -0.33f)
                verticalLineTo(6.25f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(15.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(8.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        return _receiptAdd!!
    }

private var _receiptAdd: ImageVector? = null
