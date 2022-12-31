

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowCircleDownSplit: ImageVector
    get() {
        if (_arrowCircleDownSplit != null) {
            return _arrowCircleDownSplit!!
        }
        _arrowCircleDownSplit = fluentIcon(name = "Filled.ArrowCircleDownSplit") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
                moveTo(11.0f, 14.0f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineToRelative(-0.44f, 0.44f)
                lineTo(9.5f, 10.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.94f)
                lineToRelative(-0.51f, -0.44f)
                lineToRelative(-0.09f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, 1.13f)
                lineToRelative(1.79f, 1.72f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.71f, 0.2f, 0.98f, -0.07f)
                lineToRelative(1.72f, -1.72f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.72f, -0.07f, -0.98f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineToRelative(-0.44f, 0.44f)
                verticalLineToRelative(-4.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.64f)
                horizontalLineToRelative(-2.5f)
                lineTo(12.75f, 5.65f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 12.0f, 5.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                lineTo(11.25f, 9.0f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                verticalLineToRelative(4.69f)
                lineTo(7.56f, 14.0f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 1.13f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.71f, 0.2f, 0.98f, -0.07f)
                lineTo(11.0f, 15.06f)
                lineToRelative(0.07f, -0.09f)
                curveToRelative(0.22f, -0.29f, 0.2f, -0.7f, -0.07f, -0.97f)
                close()
            }
        }
        return _arrowCircleDownSplit!!
    }

private var _arrowCircleDownSplit: ImageVector? = null
