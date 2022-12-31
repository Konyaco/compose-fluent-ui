

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentEdit: ImageVector
    get() {
        if (_documentEdit != null) {
            return _documentEdit!!
        }
        _documentEdit = fluentIcon(name = "Regular.DocumentEdit") {
            fluentPath {
                moveTo(6.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.78f)
                curveToRelative(-0.1f, 0.55f, 0.0f, 1.07f, 0.27f, 1.5f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(6.09f)
                curveToRelative(0.46f, 0.0f, 0.9f, 0.18f, 1.23f, 0.51f)
                lineToRelative(5.92f, 5.92f)
                curveToRelative(0.33f, 0.32f, 0.51f, 0.77f, 0.51f, 1.23f)
                lineTo(20.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(12.0f, 3.5f)
                lineTo(6.25f, 3.5f)
                close()
                moveTo(13.5f, 4.56f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.44f)
                lineTo(13.5f, 4.56f)
                close()
                moveTo(19.71f, 11.0f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 1.62f, 3.9f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.35f, -0.78f, 0.6f, -1.25f, 0.71f)
                lineToRelative(-1.83f, 0.46f)
                curveToRelative(-0.8f, 0.2f, -1.52f, -0.52f, -1.32f, -1.32f)
                lineToRelative(0.46f, -1.83f)
                curveToRelative(0.12f, -0.47f, 0.36f, -0.9f, 0.7f, -1.25f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 1.62f, -0.67f)
                close()
            }
        }
        return _documentEdit!!
    }

private var _documentEdit: ImageVector? = null
