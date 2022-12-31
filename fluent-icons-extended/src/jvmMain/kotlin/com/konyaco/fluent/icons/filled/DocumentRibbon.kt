

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentRibbon: ImageVector
    get() {
        if (_documentRibbon != null) {
            return _documentRibbon!!
        }
        _documentRibbon = fluentIcon(name = "Filled.DocumentRibbon") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(-3.67f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -5.0f, -7.07f)
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
                moveTo(9.0f, 15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                close()
                moveTo(3.0f, 19.24f)
                verticalLineToRelative(3.05f)
                curveToRelative(0.0f, 0.63f, 0.76f, 0.95f, 1.21f, 0.5f)
                lineTo(5.5f, 21.5f)
                lineToRelative(1.29f, 1.3f)
                arcTo(0.71f, 0.71f, 0.0f, false, false, 8.0f, 22.28f)
                verticalLineToRelative(-3.05f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, -5.0f, 0.0f)
                close()
            }
        }
        return _documentRibbon!!
    }

private var _documentRibbon: ImageVector? = null
