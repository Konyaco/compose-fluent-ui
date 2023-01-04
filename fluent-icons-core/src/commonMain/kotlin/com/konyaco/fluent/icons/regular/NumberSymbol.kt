

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.NumberSymbol: ImageVector
    get() {
        if (_numberSymbol != null) {
            return _numberSymbol!!
        }
        _numberSymbol = fluentIcon(name = "Regular.NumberSymbol") {
            fluentPath {
                moveTo(10.99f, 2.89f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.48f, -0.28f)
                lineTo(8.5f, 8.0f)
                lineTo(3.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.46f)
                lineToRelative(-0.95f, 5.0f)
                lineTo(2.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.23f)
                lineToRelative(-0.97f, 5.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.48f, 0.28f)
                lineTo(8.5f, 16.0f)
                horizontalLineToRelative(5.47f)
                lineToRelative(-0.97f, 5.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.48f, 0.28f)
                lineTo(15.5f, 16.0f)
                horizontalLineToRelative(4.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.46f)
                lineToRelative(0.95f, -5.0f)
                horizontalLineToRelative(4.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.23f)
                lineTo(18.0f, 2.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.48f, -0.28f)
                lineTo(15.5f, 8.0f)
                horizontalLineToRelative(-5.47f)
                lineTo(11.0f, 2.9f)
                close()
                moveTo(9.74f, 9.49f)
                horizontalLineToRelative(5.47f)
                lineToRelative(-0.94f, 5.0f)
                lineTo(8.79f, 14.49f)
                lineToRelative(0.95f, -5.0f)
                close()
            }
        }
        return _numberSymbol!!
    }

private var _numberSymbol: ImageVector? = null
