

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BorderTopBottom: ImageVector
    get() {
        if (_borderTopBottom != null) {
            return _borderTopBottom!!
        }
        _borderTopBottom = fluentIcon(name = "Regular.BorderTopBottom") {
            fluentPath {
                moveTo(3.75f, 7.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 6.25f)
                verticalLineToRelative(-0.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(5.75f, 4.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                close()
                moveTo(4.5f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(19.5f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(3.0f, 17.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(0.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        return _borderTopBottom!!
    }

private var _borderTopBottom: ImageVector? = null
