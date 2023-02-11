

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentRibbon: ImageVector
    get() {
        if (_documentRibbon != null) {
            return _documentRibbon!!
        }
        _documentRibbon = fluentIcon(name = "Regular.DocumentRibbon") {
            fluentPath {
                moveTo(18.5f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(9.0f, 20.5f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 9.83f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.42f)
                lineTo(13.6f, 2.6f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.05f, -0.04f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, -0.34f, -0.25f)
                lineToRelative(-0.05f, -0.03f)
                lineToRelative(-0.05f, -0.03f)
                lineToRelative(-0.16f, -0.09f)
                curveToRelative(-0.2f, -0.08f, -0.41f, -0.12f, -0.63f, -0.14f)
                horizontalLineToRelative(-0.06f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.08f, -0.01f)
                lineTo(6.0f, 2.01f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(7.26f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 5.5f, 11.0f)
                lineTo(5.5f, 4.0f)
                curveToRelative(0.0f, -0.27f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(13.5f, 4.62f)
                lineToRelative(3.88f, 3.88f)
                lineTo(14.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(13.5f, 4.62f)
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
