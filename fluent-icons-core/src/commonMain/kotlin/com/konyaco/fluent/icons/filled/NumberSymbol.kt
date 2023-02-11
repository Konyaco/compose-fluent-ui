

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NumberSymbol: ImageVector
    get() {
        if (_numberSymbol != null) {
            return _numberSymbol!!
        }
        _numberSymbol = fluentIcon(name = "Filled.NumberSymbol") {
            fluentPath {
                moveTo(10.98f, 3.16f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.97f, -0.32f)
                lineTo(8.15f, 8.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.82f)
                lineToRelative(-0.67f, 4.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.82f)
                lineTo(6.0f, 20.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.97f, 0.32f)
                lineTo(8.84f, 16.0f)
                horizontalLineToRelative(4.98f)
                lineToRelative(-0.8f, 4.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.97f, 0.32f)
                lineToRelative(0.86f, -5.17f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-3.82f)
                lineToRelative(0.67f, -4.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-3.82f)
                lineToRelative(0.8f, -4.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.97f, -0.32f)
                lineToRelative(-0.86f, 5.15f)
                horizontalLineToRelative(-4.97f)
                lineToRelative(0.8f, -4.83f)
                close()
                moveTo(9.85f, 10.0f)
                horizontalLineToRelative(4.97f)
                lineToRelative(-0.67f, 4.0f)
                horizontalLineTo(9.18f)
                lineToRelative(0.67f, -4.0f)
                close()
            }
        }
        return _numberSymbol!!
    }

private var _numberSymbol: ImageVector? = null
