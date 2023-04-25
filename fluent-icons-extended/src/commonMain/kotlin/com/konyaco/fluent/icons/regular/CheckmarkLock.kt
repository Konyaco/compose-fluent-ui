

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CheckmarkLock: ImageVector
    get() {
        if (_checkmarkLock != null) {
            return _checkmarkLock!!
        }
        _checkmarkLock = fluentIcon(name = "Regular.CheckmarkLock") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.92f, 11.26f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.47f, -2.17f)
                arcTo(8.5f, 8.5f, 0.0f, true, false, 13.0f, 20.44f)
                verticalLineToRelative(1.06f)
                curveToRelative(0.0f, 0.15f, 0.01f, 0.3f, 0.04f, 0.45f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                close()
                moveTo(20.49f, 12.48f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                lineToRelative(0.03f, 0.3f)
                curveToRelative(0.14f, 0.68f, 0.74f, 1.2f, 1.47f, 1.2f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(21.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.57f, -0.2f, -1.1f, -0.51f, -1.52f)
                close()
                moveTo(18.11f, 19.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.78f, -1.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.78f, 1.84f)
                close()
                moveTo(17.5f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.75f, 13.44f)
                lineTo(15.22f, 8.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -1.13f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(1.97f, 1.97f)
                close()
            }
        }
        return _checkmarkLock!!
    }

private var _checkmarkLock: ImageVector? = null
