

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = fluentIcon(name = "Regular.Clover") {
            fluentPath {
                moveTo(6.75f, 2.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 0.0f, 9.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 6.75f, 2.0f)
                close()
                moveTo(3.5f, 6.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                lineTo(10.0f, 10.0f)
                lineTo(6.75f, 10.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.5f, 6.75f)
                close()
                moveTo(6.75f, 22.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 0.0f, -9.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 6.75f, 22.0f)
                close()
                moveTo(3.5f, 17.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 6.5f, 0.0f)
                lineTo(10.0f, 14.0f)
                lineTo(6.75f, 14.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, 3.25f)
                close()
                moveTo(22.0f, 6.75f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, -9.5f, 0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 22.0f, 6.75f)
                close()
                moveTo(17.25f, 3.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, 6.5f)
                lineTo(14.0f, 10.0f)
                lineTo(14.0f, 6.75f)
                curveToRelative(0.0f, -1.8f, 1.46f, -3.25f, 3.25f, -3.25f)
                close()
                moveTo(17.25f, 22.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, 0.0f, -9.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 17.25f, 22.0f)
                close()
                moveTo(20.5f, 17.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                lineTo(14.0f, 14.0f)
                horizontalLineToRelative(3.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                close()
            }
        }
        return _clover!!
    }

private var _clover: ImageVector? = null
