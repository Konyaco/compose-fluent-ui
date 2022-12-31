

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowAutofitContent: ImageVector
    get() {
        if (_arrowAutofitContent != null) {
            return _arrowAutofitContent!!
        }
        _arrowAutofitContent = fluentIcon(name = "Filled.ArrowAutofitContent") {
            fluentPath {
                moveTo(6.06f, 5.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.12f, -0.98f)
                lineToRelative(-1.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 0.98f)
                lineToRelative(1.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.12f, -0.98f)
                lineTo(5.4f, 7.5f)
                horizontalLineToRelative(2.86f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(5.4f)
                lineToRelative(0.66f, -0.76f)
                close()
                moveTo(18.02f, 4.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 1.05f)
                lineToRelative(0.66f, 0.76f)
                horizontalLineToRelative(-2.86f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.86f)
                lineToRelative(-0.66f, 0.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, 0.98f)
                lineToRelative(1.75f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -0.98f)
                lineToRelative(-1.75f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -0.07f)
                close()
                moveTo(5.75f, 11.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 13.75f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, 2.75f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 17.75f)
                verticalLineToRelative(-4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 11.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(6.0f, 15.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _arrowAutofitContent!!
    }

private var _arrowAutofitContent: ImageVector? = null
