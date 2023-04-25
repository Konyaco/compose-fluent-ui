

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = fluentIcon(name = "Regular.Couch") {
            fluentPath {
                moveTo(7.25f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.5f, 6.75f)
                verticalLineToRelative(1.34f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 11.25f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.43f, 1.1f, 2.61f, 2.5f, 2.74f)
                verticalLineToRelative(1.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(6.0f, 17.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.26f)
                curveToRelative(1.4f, -0.13f, 2.5f, -1.3f, 2.5f, -2.74f)
                verticalLineToRelative(-3.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -2.5f, -3.16f)
                lineTo(19.5f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 16.75f, 4.0f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(19.25f, 15.5f)
                lineTo(4.75f, 15.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(18.0f, 8.09f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 15.5f, 11.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 6.0f, 8.09f)
                lineTo(6.0f, 6.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(1.34f)
                close()
            }
        }
        return _couch!!
    }

private var _couch: ImageVector? = null
