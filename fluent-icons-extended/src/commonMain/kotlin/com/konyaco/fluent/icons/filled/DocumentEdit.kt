

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentEdit: ImageVector
    get() {
        if (_documentEdit != null) {
            return _documentEdit!!
        }
        _documentEdit = fluentIcon(name = "Filled.DocumentEdit") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.92f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -1.56f, 0.97f)
                lineToRelative(-6.05f, 6.1f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.79f, -0.73f, 1.27f)
                lineToRelative(-0.52f, 2.03f)
                curveToRelative(-0.16f, 0.6f, -0.04f, 1.17f, 0.24f, 1.63f)
                lineTo(5.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 20.5f)
                verticalLineToRelative(-17.0f)
                curveTo(4.0f, 2.67f, 4.67f, 2.0f, 5.5f, 2.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(13.5f, 2.5f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(12.2f, 17.57f)
                lineTo(18.1f, 11.67f)
                arcToRelative(2.29f, 2.29f, 0.0f, true, true, 3.23f, 3.23f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.35f, -0.78f, 0.6f, -1.25f, 0.71f)
                lineToRelative(-1.83f, 0.46f)
                curveToRelative(-0.8f, 0.2f, -1.52f, -0.52f, -1.32f, -1.32f)
                lineToRelative(0.46f, -1.83f)
                curveToRelative(0.12f, -0.47f, 0.36f, -0.9f, 0.7f, -1.25f)
                close()
            }
        }
        return _documentEdit!!
    }

private var _documentEdit: ImageVector? = null
