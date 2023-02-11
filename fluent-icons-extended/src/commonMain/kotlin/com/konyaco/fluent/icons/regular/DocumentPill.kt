

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentPill: ImageVector
    get() {
        if (_documentPill != null) {
            return _documentPill!!
        }
        _documentPill = fluentIcon(name = "Regular.DocumentPill") {
            fluentPath {
                moveTo(5.5f, 4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(12.0f, 3.5f)
                lineTo(12.0f, 8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.43f)
                curveToRelative(0.48f, -0.2f, 0.99f, -0.3f, 1.5f, -0.3f)
                lineTo(20.0f, 9.66f)
                curveToRelative(0.0f, -0.46f, -0.18f, -0.9f, -0.51f, -1.23f)
                lineTo(13.57f, 2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.34f, 2.0f)
                lineTo(6.25f, 2.0f)
                curveTo(5.01f, 2.0f, 4.0f, 3.0f, 4.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(5.43f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -0.52f, -1.5f)
                lineTo(6.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(5.5f, 4.25f)
                close()
                moveTo(17.44f, 8.5f)
                lineTo(14.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(13.5f, 4.56f)
                lineToRelative(3.94f, 3.94f)
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
