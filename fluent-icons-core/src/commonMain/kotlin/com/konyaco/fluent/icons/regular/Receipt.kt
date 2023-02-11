

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = fluentIcon(name = "Regular.Receipt") {
            fluentPath {
                moveTo(4.0f, 6.25f)
                curveTo(4.0f, 5.01f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(8.5f)
                curveTo(15.99f, 4.0f, 17.0f, 5.0f, 17.0f, 6.25f)
                lineTo(17.0f, 14.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-10.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.0f, 17.25f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(17.0f, 15.5f)
                lineTo(17.0f, 19.0f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.0f, 15.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.5f, 19.0f)
                lineTo(15.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.25f)
                close()
                moveTo(7.0f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 8.75f)
                close()
                moveTo(7.0f, 12.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(7.0f, 15.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _receipt!!
    }

private var _receipt: ImageVector? = null
