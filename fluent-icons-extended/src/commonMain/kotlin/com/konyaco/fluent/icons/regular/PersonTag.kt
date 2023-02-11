

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonTag: ImageVector
    get() {
        if (_personTag != null) {
            return _personTag!!
        }
        _personTag = fluentIcon(name = "Regular.PersonTag") {
            fluentPath {
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(1.5f)
                lineTo(4.25f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.74f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.54f, 0.2f, 1.06f, 0.54f, 1.46f)
                curveTo(5.29f, 19.75f, 7.26f, 20.5f, 10.0f, 20.5f)
                curveToRelative(1.1f, 0.0f, 2.08f, -0.12f, 2.94f, -0.37f)
                lineToRelative(1.17f, 1.2f)
                curveToRelative(-1.18f, 0.44f, -2.55f, 0.67f, -4.11f, 0.67f)
                curveToRelative(-3.15f, 0.0f, -5.53f, -0.9f, -7.1f, -2.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.9f, -2.44f)
                verticalLineToRelative(-0.58f)
                curveTo(2.0f, 15.0f, 3.0f, 14.0f, 4.25f, 14.0f)
                lineTo(11.0f, 14.0f)
                close()
                moveTo(15.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 5.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(6.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                close()
                moveTo(16.57f, 22.4f)
                lineToRelative(-4.0f, -4.07f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.57f, -1.4f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.92f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, 0.58f)
                lineToRelative(4.08f, 4.02f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.02f, 2.83f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.85f, -0.02f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _personTag!!
    }

private var _personTag: ImageVector? = null
