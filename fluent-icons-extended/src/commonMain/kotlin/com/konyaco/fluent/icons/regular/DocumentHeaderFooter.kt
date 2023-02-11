

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentHeaderFooter: ImageVector
    get() {
        if (_documentHeaderFooter != null) {
            return _documentHeaderFooter!!
        }
        _documentHeaderFooter = fluentIcon(name = "Regular.DocumentHeaderFooter") {
            fluentPath {
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 5.68f, 7.69f, 5.0f, 8.5f, 5.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 6.5f)
                close()
                moveTo(7.0f, 17.5f)
                curveToRelative(0.0f, -0.82f, 0.68f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 17.5f)
                close()
                moveTo(20.0f, 4.1f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 17.74f, 2.0f)
                lineTo(6.1f, 2.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 4.0f, 4.26f)
                lineTo(4.0f, 19.9f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 6.26f, 22.0f)
                lineTo(17.9f, 22.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 2.1f, -2.25f)
                lineTo(20.0f, 4.1f)
                close()
                moveTo(6.24f, 3.5f)
                horizontalLineToRelative(11.6f)
                curveToRelative(0.37f, 0.06f, 0.65f, 0.37f, 0.65f, 0.75f)
                verticalLineToRelative(15.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.65f)
                lineTo(6.15f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.65f, -0.75f)
                lineTo(5.5f, 4.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.65f)
                close()
            }
        }
        return _documentHeaderFooter!!
    }

private var _documentHeaderFooter: ImageVector? = null
