

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DecimalArrowRight: ImageVector
    get() {
        if (_decimalArrowRight != null) {
            return _decimalArrowRight!!
        }
        _decimalArrowRight = fluentIcon(name = "Regular.DecimalArrowRight") {
            fluentPath {
                moveTo(10.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                lineTo(13.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(11.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(8.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(19.5f, 7.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(-0.03f, 0.3f)
                curveToRelative(0.49f, 0.16f, 0.95f, 0.37f, 1.38f, 0.63f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 11.0f)
                lineTo(21.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.16f, 0.01f, 0.33f, 0.04f, 0.48f)
                curveToRelative(0.46f, -0.19f, 0.95f, -0.33f, 1.46f, -0.4f)
                lineTo(16.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(14.5f, 17.0f)
                close()
            }
        }
        return _decimalArrowRight!!
    }

private var _decimalArrowRight: ImageVector? = null
