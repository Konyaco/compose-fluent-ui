

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NumberRow: ImageVector
    get() {
        if (_numberRow != null) {
            return _numberRow!!
        }
        _numberRow = fluentIcon(name = "Filled.NumberRow") {
            fluentPath {
                moveTo(4.75f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 8.75f, 20.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 17.25f)
                lineTo(2.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(7.5f, 9.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 6.0f, 9.0f)
                close()
                moveTo(15.25f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 20.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, -2.75f)
                lineTo(12.5f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 15.25f, 4.0f)
                close()
                moveTo(17.5f, 9.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(17.0f, 14.25f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(19.0f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }
        return _numberRow!!
    }

private var _numberRow: ImageVector? = null
