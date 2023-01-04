

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentPercent: ImageVector
    get() {
        if (_documentPercent != null) {
            return _documentPercent!!
        }
        _documentPercent = fluentIcon(name = "Filled.DocumentPercent") {
            fluentPath {
                moveTo(12.0f, 8.0f)
                lineTo(12.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(7.04f)
                curveToRelative(1.7f, 0.24f, 3.0f, 1.7f, 3.0f, 3.46f)
                verticalLineToRelative(0.03f)
                lineToRelative(2.01f, -2.02f)
                arcTo(1.75f, 1.75f, 0.0f, true, true, 11.5f, 15.0f)
                lineTo(9.47f, 17.0f)
                horizontalLineToRelative(0.03f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.16f, 5.0f)
                lineTo(18.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(5.13f, 16.4f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 1.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 4.13f, 1.9f)
                close()
                moveTo(4.0f, 13.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.73f)
                close()
                moveTo(10.78f, 14.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-7.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(7.5f, -7.5f)
                close()
                moveTo(7.0f, 20.5f)
                arcTo(2.49f, 2.49f, 0.0f, false, false, 9.5f, 23.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 7.0f, 20.5f)
                close()
                moveTo(10.5f, 20.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(13.5f, 8.0f)
                lineTo(13.5f, 2.5f)
                lineToRelative(6.0f, 6.0f)
                lineTo(14.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        return _documentPercent!!
    }

private var _documentPercent: ImageVector? = null
