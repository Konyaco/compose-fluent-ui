

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = fluentIcon(name = "Filled.Trophy") {
            fluentPath {
                moveTo(15.25f, 2.0f)
                curveToRelative(1.16f, 0.0f, 2.12f, 0.88f, 2.24f, 2.0f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.92f, 0.0f, 1.67f, 0.7f, 1.74f, 1.6f)
                verticalLineToRelative(3.15f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.06f, 3.24f)
                lineToRelative(-0.2f, 0.01f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, -4.74f, 3.95f)
                verticalLineToRelative(1.55f)
                horizontalLineToRelative(1.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.25f, 3.07f)
                lineTo(17.5f, 21.25f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.65f)
                verticalLineToRelative(-0.6f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.06f, -3.24f)
                lineToRelative(0.18f, -0.01f)
                lineTo(11.0f, 17.5f)
                verticalLineToRelative(-1.55f)
                arcTo(5.76f, 5.76f, 0.0f, false, true, 6.27f, 12.0f)
                horizontalLineToRelative(-0.02f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 8.75f)
                verticalLineToRelative(-3.0f)
                curveTo(3.0f, 4.78f, 3.78f, 4.0f, 4.75f, 4.0f)
                lineTo(6.0f, 4.0f)
                curveToRelative(0.13f, -1.12f, 1.08f, -2.0f, 2.24f, -2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(18.75f, 5.5f)
                lineTo(17.5f, 5.5f)
                verticalLineToRelative(4.98f)
                curveToRelative(0.8f, -0.11f, 1.43f, -0.76f, 1.5f, -1.58f)
                lineTo(19.0f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.18f, -0.24f)
                lineToRelative(-0.06f, -0.01f)
                close()
                moveTo(6.0f, 5.5f)
                lineTo(4.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.88f, 0.65f, 1.61f, 1.5f, 1.73f)
                lineTo(6.0f, 5.5f)
                close()
            }
        }
        return _trophy!!
    }

private var _trophy: ImageVector? = null
