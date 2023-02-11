

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MathSymbols: ImageVector
    get() {
        if (_mathSymbols != null) {
            return _mathSymbols!!
        }
        _mathSymbols = fluentIcon(name = "Filled.MathSymbols") {
            fluentPath {
                moveTo(6.5f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(7.5f, 5.0f)
                lineTo(10.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(7.5f, 7.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(5.5f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                lineTo(5.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(14.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(13.0f, 17.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(17.5f, 15.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(18.75f, 20.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(2.29f, 13.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 0.0f)
                lineToRelative(2.79f, 2.8f)
                lineToRelative(2.8f, -2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.42f)
                lineTo(7.92f, 17.5f)
                lineToRelative(2.8f, 2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 1.4f)
                lineTo(6.5f, 18.92f)
                lineToRelative(-2.8f, 2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.42f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(-2.8f, -2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                close()
            }
        }
        return _mathSymbols!!
    }

private var _mathSymbols: ImageVector? = null
