

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonEdit: ImageVector
    get() {
        if (_personEdit != null) {
            return _personEdit!!
        }
        _personEdit = fluentIcon(name = "Filled.PersonEdit") {
            fluentPath {
                moveTo(12.5f, 17.86f)
                lineTo(16.35f, 14.0f)
                lineTo(6.26f, 14.0f)
                curveTo(5.0f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveToRelative(1.4f, 1.94f, 3.57f, 3.0f, 6.49f, 3.2f)
                curveToRelative(0.0f, -0.18f, 0.02f, -0.37f, 0.06f, -0.56f)
                lineToRelative(0.46f, -1.83f)
                curveToRelative(0.16f, -0.65f, 0.5f, -1.24f, 0.97f, -1.71f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(19.1f, 12.67f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _personEdit!!
    }

private var _personEdit: ImageVector? = null
