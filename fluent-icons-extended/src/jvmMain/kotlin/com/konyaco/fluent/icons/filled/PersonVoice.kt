

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonVoice: ImageVector
    get() {
        if (_personVoice != null) {
            return _personVoice!!
        }
        _personVoice = fluentIcon(name = "Filled.PersonVoice") {
            fluentPath {
                moveTo(14.75f, 15.0f)
                curveTo(16.0f, 15.0f, 17.0f, 16.0f, 17.0f, 17.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, -0.18f, 1.13f, -0.5f, 1.6f)
                curveTo(14.93f, 21.93f, 12.41f, 23.0f, 9.0f, 23.0f)
                reflectiveCurveToRelative(-5.94f, -1.07f, -7.49f, -3.24f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.5f, -1.6f)
                verticalLineToRelative(-0.91f)
                curveTo(1.0f, 16.0f, 2.0f, 15.0f, 3.24f, 15.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(19.05f, 1.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.03f, 0.28f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -0.01f, 12.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.3f, -0.75f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 0.0f, -11.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.28f, -1.03f)
                close()
                moveTo(9.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 9.0f, 3.0f)
                close()
                moveTo(15.59f, 3.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.02f, 0.28f)
                arcToRelative(8.71f, 8.71f, 0.0f, false, true, 0.0f, 8.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.3f, -0.74f)
                arcToRelative(7.21f, 7.21f, 0.0f, false, false, 0.0f, -7.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.28f, -1.02f)
                close()
            }
        }
        return _personVoice!!
    }

private var _personVoice: ImageVector? = null
