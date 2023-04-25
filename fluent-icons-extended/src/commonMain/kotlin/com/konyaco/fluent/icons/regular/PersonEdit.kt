

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonEdit: ImageVector
    get() {
        if (_personEdit != null) {
            return _personEdit!!
        }
        _personEdit = fluentIcon(name = "Regular.PersonEdit") {
            fluentPath {
                moveToRelative(14.86f, 15.5f)
                lineToRelative(1.5f, -1.5f)
                lineTo(6.26f, 14.0f)
                curveTo(5.0f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveToRelative(1.4f, 1.64f, 3.44f, 2.53f, 6.1f, 2.7f)
                curveToRelative(0.0f, -0.17f, 0.02f, -0.36f, 0.06f, -0.55f)
                lineToRelative(0.23f, -0.93f)
                curveToRelative(-2.37f, -0.12f, -4.1f, -0.85f, -5.25f, -2.2f)
                curveToRelative(-0.34f, -0.4f, -0.54f, -0.92f, -0.54f, -1.45f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(8.6f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.2f, 18.57f)
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
