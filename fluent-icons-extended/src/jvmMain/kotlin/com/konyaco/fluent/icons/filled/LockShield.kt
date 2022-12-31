

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LockShield: ImageVector
    get() {
        if (_lockShield != null) {
            return _lockShield!!
        }
        _lockShield = fluentIcon(name = "Filled.LockShield") {
            fluentPath {
                moveTo(10.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(18.0f, 11.0f)
                curveToRelative(-0.32f, 0.0f, -0.64f, 0.11f, -0.9f, 0.33f)
                lineToRelative(-0.1f, 0.1f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -2.6f, 1.24f)
                curveToRelative(-0.78f, 0.0f, -1.4f, 0.64f, -1.4f, 1.41f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 2.38f, 0.92f, 4.22f, 2.68f, 5.42f)
                lineTo(3.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 20.5f)
                verticalLineToRelative(-11.0f)
                curveTo(2.0f, 8.67f, 2.67f, 8.0f, 3.5f, 8.0f)
                lineTo(6.0f, 8.0f)
                lineTo(6.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(18.28f, 12.12f)
                curveToRelative(1.0f, 1.04f, 2.1f, 1.55f, 3.32f, 1.55f)
                curveToRelative(0.2f, 0.0f, 0.35f, 0.14f, 0.4f, 0.33f)
                verticalLineToRelative(2.58f)
                curveToRelative(0.0f, 2.69f, -1.31f, 4.51f, -3.87f, 5.4f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, -0.26f, 0.0f)
                curveToRelative(-2.47f, -0.86f, -3.78f, -2.6f, -3.87f, -5.13f)
                verticalLineToRelative(-2.77f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.4f, -0.41f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.32f, -1.55f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.56f, 0.0f)
                close()
                moveTo(10.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        return _lockShield!!
    }

private var _lockShield: ImageVector? = null
