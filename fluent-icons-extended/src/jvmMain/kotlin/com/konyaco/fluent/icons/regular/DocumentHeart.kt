

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentHeart: ImageVector
    get() {
        if (_documentHeart != null) {
            return _documentHeart!!
        }
        _documentHeart = fluentIcon(name = "Regular.DocumentHeart") {
            fluentPath {
                moveTo(18.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(18.5f, 10.0f)
                lineTo(14.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(12.0f, 3.5f)
                lineTo(6.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7.31f)
                curveToRelative(-0.5f, -0.1f, -1.0f, -0.13f, -1.5f, -0.08f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.17f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.08f, 0.0f)
                lineToRelative(0.06f, 0.01f)
                curveToRelative(0.22f, 0.02f, 0.43f, 0.06f, 0.63f, 0.14f)
                lineToRelative(0.16f, 0.09f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.02f, 0.05f, 0.03f)
                lineToRelative(0.05f, 0.02f)
                lineToRelative(0.08f, 0.05f)
                curveToRelative(0.08f, 0.05f, 0.15f, 0.11f, 0.22f, 0.18f)
                lineToRelative(0.04f, 0.03f)
                lineToRelative(0.05f, 0.04f)
                lineTo(19.4f, 8.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 9.83f)
                lineTo(20.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.49f, 22.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(18.0f, 20.5f)
                close()
                moveTo(17.38f, 8.5f)
                lineTo(13.5f, 4.62f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.38f)
                close()
                moveTo(6.48f, 22.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(4.41f, -4.4f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, false, -4.9f, -4.91f)
                lineToRelative(-0.04f, 0.04f)
                lineToRelative(-0.03f, -0.04f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, false, -4.9f, 4.9f)
                lineToRelative(4.4f, 4.41f)
                close()
            }
        }
        return _documentHeart!!
    }

private var _documentHeart: ImageVector? = null
