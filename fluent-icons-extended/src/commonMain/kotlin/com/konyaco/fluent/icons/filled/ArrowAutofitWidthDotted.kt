

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowAutofitWidthDotted: ImageVector
    get() {
        if (_arrowAutofitWidthDotted != null) {
            return _arrowAutofitWidthDotted!!
        }
        _arrowAutofitWidthDotted = fluentIcon(name = "Filled.ArrowAutofitWidthDotted") {
            fluentPath {
                moveTo(20.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 4.0f)
                horizontalLineToRelative(-11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 6.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.2f, 19.7f)
                lineTo(20.7f, 17.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.4f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(-1.8f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.4f)
                close()
                moveTo(3.3f, 15.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.4f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.4f)
                lineToRelative(-1.79f, -1.8f)
                lineToRelative(1.8f, -1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.42f, -1.4f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(13.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(9.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(8.0f, 17.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        return _arrowAutofitWidthDotted!!
    }

private var _arrowAutofitWidthDotted: ImageVector? = null
