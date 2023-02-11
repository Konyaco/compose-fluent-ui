

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentPill: ImageVector
    get() {
        if (_documentPill != null) {
            return _documentPill!!
        }
        _documentPill = fluentIcon(name = "Filled.DocumentPill") {
            fluentPath {
                moveTo(12.0f, 8.0f)
                lineTo(12.0f, 2.0f)
                lineTo(5.5f, 2.0f)
                curveTo(4.67f, 2.0f, 4.0f, 2.67f, 4.0f, 3.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.97f)
                lineToRelative(0.2f, -0.01f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, 0.6f, -4.73f)
                lineToRelative(5.0f, -5.0f)
                arcTo(3.86f, 3.86f, 0.0f, false, true, 20.0f, 11.13f)
                lineTo(20.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(13.5f, 8.0f)
                lineTo(13.5f, 2.5f)
                lineToRelative(6.0f, 6.0f)
                lineTo(14.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(22.03f, 12.97f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, -4.06f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(2.87f, 2.87f, 0.0f, true, false, 4.06f, 4.06f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 0.0f, -4.06f)
                close()
                moveTo(19.03f, 14.03f)
                arcToRelative(1.37f, 1.37f, 0.0f, true, true, 1.94f, 1.94f)
                lineTo(19.0f, 17.94f)
                lineTo(17.06f, 16.0f)
                lineToRelative(1.97f, -1.97f)
                close()
                moveTo(17.03f, 18.97f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.0f, -1.0f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _documentPill!!
    }

private var _documentPill: ImageVector? = null
