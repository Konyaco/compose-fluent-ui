

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonFeedback: ImageVector
    get() {
        if (_personFeedback != null) {
            return _personFeedback!!
        }
        _personFeedback = fluentIcon(name = "Filled.PersonFeedback") {
            fluentPath {
                moveTo(10.75f, 14.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(1.61f)
                curveToRelative(-0.32f, 2.13f, -2.23f, 3.15f, -5.43f, 3.15f)
                curveTo(4.37f, 21.0f, 2.43f, 20.0f, 2.0f, 17.9f)
                lineTo(2.0f, 17.75f)
                verticalLineToRelative(-1.5f)
                curveTo(2.0f, 15.01f, 3.0f, 14.0f, 4.25f, 14.0f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(7.5f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                close()
                moveTo(19.75f, 2.0f)
                curveTo(20.99f, 2.0f, 22.0f, 3.0f, 22.0f, 4.25f)
                verticalLineToRelative(3.5f)
                curveTo(22.0f, 8.99f, 21.0f, 10.0f, 19.75f, 10.0f)
                lineTo(18.2f, 10.0f)
                lineToRelative(-2.54f, 2.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.66f, -0.75f)
                lineTo(14.0f, 10.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.0f, -2.24f)
                verticalLineToRelative(-3.5f)
                curveTo(12.0f, 3.01f, 13.0f, 2.0f, 14.25f, 2.0f)
                horizontalLineToRelative(5.5f)
                close()
            }
        }
        return _personFeedback!!
    }

private var _personFeedback: ImageVector? = null
