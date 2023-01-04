

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentLink: ImageVector
    get() {
        if (_documentLink != null) {
            return _documentLink!!
        }
        _documentLink = fluentIcon(name = "Filled.DocumentLink") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.0f, -8.0f)
                lineTo(4.0f, 14.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.5f, 2.5f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(5.75f, 15.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 5.0f, 15.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.2f, 8.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                horizontalLineToRelative(-0.16f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.16f, -5.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(13.0f, 19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(0.16f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.16f, 5.0f)
                horizontalLineToRelative(-0.1f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 9.0f, 23.0f)
                horizontalLineToRelative(0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, -4.0f)
                close()
                moveTo(8.75f, 18.25f)
                horizontalLineToRelative(-3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
            }
        }
        return _documentLink!!
    }

private var _documentLink: ImageVector? = null
