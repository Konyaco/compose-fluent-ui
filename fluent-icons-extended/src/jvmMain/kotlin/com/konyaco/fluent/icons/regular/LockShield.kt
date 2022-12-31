

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LockShield: ImageVector
    get() {
        if (_lockShield != null) {
            return _lockShield!!
        }
        _lockShield = fluentIcon(name = "Regular.LockShield") {
            fluentPath {
                moveTo(10.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.75f)
                curveTo(16.99f, 8.0f, 18.0f, 9.0f, 18.0f, 10.25f)
                lineTo(18.0f, 11.0f)
                curveToRelative(-0.32f, 0.0f, -0.64f, 0.11f, -0.9f, 0.33f)
                lineToRelative(-0.1f, 0.1f)
                curveToRelative(-0.17f, 0.17f, -0.33f, 0.32f, -0.5f, 0.46f)
                verticalLineToRelative(-1.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(4.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.4f, 0.58f, 0.92f, 1.08f, 1.54f, 1.5f)
                lineTo(4.25f, 22.0f)
                curveTo(3.01f, 22.0f, 2.0f, 21.0f, 2.0f, 19.75f)
                verticalLineToRelative(-9.5f)
                curveTo(2.0f, 9.01f, 3.0f, 8.0f, 4.25f, 8.0f)
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
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(10.0f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(12.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.0f, 3.5f)
                close()
            }
        }
        return _lockShield!!
    }

private var _lockShield: ImageVector? = null
