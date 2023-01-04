

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalculatorArrowClockwise: ImageVector
    get() {
        if (_calculatorArrowClockwise != null) {
            return _calculatorArrowClockwise!!
        }
        _calculatorArrowClockwise = fluentIcon(name = "Filled.CalculatorArrowClockwise") {
            fluentPath {
                moveTo(4.0f, 5.25f)
                curveTo(4.0f, 3.45f, 5.46f, 2.0f, 7.25f, 2.0f)
                horizontalLineToRelative(9.5f)
                curveTo(18.55f, 2.0f, 20.0f, 3.46f, 20.0f, 5.25f)
                verticalLineToRelative(5.03f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -0.23f, 0.29f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.1f, 22.0f)
                lineTo(7.25f, 22.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.0f, 18.75f)
                lineTo(4.0f, 5.25f)
                close()
                moveTo(9.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(17.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(9.5f, 13.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(8.25f, 18.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(21.25f, 15.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(22.0f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(0.63f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 23.0f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -1.69f, -3.51f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(0.01f)
                lineTo(18.5f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.75f)
                close()
            }
        }
        return _calculatorArrowClockwise!!
    }

private var _calculatorArrowClockwise: ImageVector? = null
