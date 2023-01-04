

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Payment: ImageVector
    get() {
        if (_payment != null) {
            return _payment!!
        }
        _payment = fluentIcon(name = "Regular.Payment") {
            fluentPath {
                moveTo(15.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(2.0f, 8.25f)
                curveTo(2.0f, 6.45f, 3.46f, 5.0f, 5.25f, 5.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 5.0f, 22.0f, 6.46f, 22.0f, 8.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(5.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 15.75f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(20.5f, 9.5f)
                verticalLineTo(8.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(3.5f, 11.0f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-17.0f)
                close()
            }
        }
        return _payment!!
    }

private var _payment: ImageVector? = null
