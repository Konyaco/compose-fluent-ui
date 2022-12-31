

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentHeaderArrowDown: ImageVector
    get() {
        if (_documentHeaderArrowDown != null) {
            return _documentHeaderArrowDown!!
        }
        _documentHeaderArrowDown = fluentIcon(name = "Regular.DocumentHeaderArrowDown") {
            fluentPath {
                moveTo(8.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(20.0f, 4.1f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 17.74f, 2.0f)
                lineTo(6.1f, 2.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 4.0f, 4.26f)
                lineTo(4.0f, 19.9f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 6.26f, 22.0f)
                horizontalLineToRelative(6.56f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -1.08f, -1.5f)
                lineTo(6.15f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.65f, -0.75f)
                lineTo(5.5f, 4.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.65f)
                horizontalLineToRelative(11.6f)
                curveToRelative(0.37f, 0.06f, 0.65f, 0.37f, 0.65f, 0.75f)
                verticalLineToRelative(6.83f)
                curveToRelative(0.52f, 0.08f, 1.03f, 0.22f, 1.5f, 0.42f)
                lineTo(20.0f, 4.1f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(4.8f)
                lineToRelative(-1.65f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(18.0f, 19.29f)
                lineTo(18.0f, 14.5f)
                close()
            }
        }
        return _documentHeaderArrowDown!!
    }

private var _documentHeaderArrowDown: ImageVector? = null
