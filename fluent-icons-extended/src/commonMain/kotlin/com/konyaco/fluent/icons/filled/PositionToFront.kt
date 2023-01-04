

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PositionToFront: ImageVector
    get() {
        if (_positionToFront != null) {
            return _positionToFront!!
        }
        _positionToFront = fluentIcon(name = "Filled.PositionToFront") {
            fluentPath {
                moveTo(1.0f, 3.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.75f, 1.0f)
                horizontalLineToRelative(3.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 10.0f, 3.75f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-0.26f, 0.0f, -0.5f, 0.02f, -0.75f, 0.07f)
                verticalLineTo(3.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(1.32f)
                curveToRelative(-0.05f, 0.24f, -0.07f, 0.5f, -0.07f, 0.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 1.0f, 7.25f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(14.0f, 19.0f)
                verticalLineToRelative(1.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 16.75f, 23.0f)
                horizontalLineToRelative(3.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 23.0f, 20.25f)
                verticalLineToRelative(-3.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 20.25f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, 0.26f, -0.02f, 0.5f, -0.07f, 0.75f)
                horizontalLineToRelative(1.32f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-1.32f)
                curveToRelative(-0.24f, 0.05f, -0.5f, 0.07f, -0.75f, 0.07f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 9.25f)
                curveTo(6.0f, 7.45f, 7.46f, 6.0f, 9.25f, 6.0f)
                horizontalLineToRelative(5.5f)
                curveTo(16.55f, 6.0f, 18.0f, 7.46f, 18.0f, 9.25f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 6.0f, 14.75f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }
        return _positionToFront!!
    }

private var _positionToFront: ImageVector? = null
