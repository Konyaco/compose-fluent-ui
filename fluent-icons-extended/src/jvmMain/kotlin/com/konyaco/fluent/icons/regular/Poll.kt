

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Poll: ImageVector
    get() {
        if (_poll != null) {
            return _poll!!
        }
        _poll = fluentIcon(name = "Regular.Poll") {
            fluentPath {
                moveTo(11.75f, 2.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(14.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                lineTo(9.0f, 4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 11.75f, 2.0f)
                close()
                moveTo(18.75f, 7.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(9.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                verticalLineToRelative(-9.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.75f, 7.0f)
                close()
                moveTo(4.75f, 12.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 12.0f)
                close()
                moveTo(11.75f, 3.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(14.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                lineTo(13.0f, 4.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveTo(18.75f, 8.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(9.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveTo(4.75f, 13.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(4.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
            }
        }
        return _poll!!
    }

private var _poll: ImageVector? = null
