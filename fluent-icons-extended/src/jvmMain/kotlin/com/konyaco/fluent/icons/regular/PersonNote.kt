

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonNote: ImageVector
    get() {
        if (_personNote != null) {
            return _personNote!!
        }
        _personNote = fluentIcon(name = "Regular.PersonNote") {
            fluentPath {
                moveTo(11.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.17f, -1.0f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveTo(4.47f, 21.1f, 6.85f, 22.0f, 10.0f, 22.0f)
                curveToRelative(0.4f, 0.0f, 0.78f, -0.01f, 1.16f, -0.04f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 21.0f)
                verticalLineToRelative(-0.53f)
                curveToRelative(-0.32f, 0.02f, -0.65f, 0.03f, -1.0f, 0.03f)
                curveToRelative(-2.74f, 0.0f, -4.7f, -0.74f, -5.96f, -2.21f)
                curveToRelative(-0.34f, -0.4f, -0.54f, -0.93f, -0.54f, -1.46f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(11.0f, 15.5f)
                lineTo(11.0f, 15.0f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(10.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(14.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.5f, 19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        return _personNote!!
    }

private var _personNote: ImageVector? = null
