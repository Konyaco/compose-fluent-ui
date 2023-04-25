

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NumberSymbolSquare: ImageVector
    get() {
        if (_numberSymbolSquare != null) {
            return _numberSymbolSquare!!
        }
        _numberSymbolSquare = fluentIcon(name = "Filled.NumberSymbolSquare") {
            fluentPath {
                moveToRelative(13.44f, 11.0f)
                lineToRelative(-0.4f, 2.0f)
                horizontalLineToRelative(-2.47f)
                lineToRelative(0.4f, -2.0f)
                horizontalLineToRelative(2.47f)
                close()
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(10.9f, 7.51f)
                curveToRelative(0.4f, 0.09f, 0.67f, 0.48f, 0.59f, 0.89f)
                lineToRelative(-0.22f, 1.1f)
                horizontalLineToRelative(2.47f)
                lineToRelative(0.28f, -1.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.47f, 0.3f)
                lineToRelative(-0.22f, 1.1f)
                horizontalLineToRelative(0.98f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.28f)
                lineToRelative(-0.4f, 2.0f)
                horizontalLineToRelative(1.18f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.48f)
                lineToRelative(-0.28f, 1.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, -0.3f)
                lineToRelative(0.23f, -1.1f)
                horizontalLineToRelative(-2.47f)
                lineToRelative(-0.28f, 1.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, -0.3f)
                lineToRelative(0.23f, -1.1f)
                horizontalLineToRelative(-0.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.29f)
                lineToRelative(0.4f, -2.0f)
                lineTo(8.25f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.49f)
                lineToRelative(0.28f, -1.4f)
                curveToRelative(0.08f, -0.4f, 0.47f, -0.67f, 0.88f, -0.59f)
                close()
            }
        }
        return _numberSymbolSquare!!
    }

private var _numberSymbolSquare: ImageVector? = null
