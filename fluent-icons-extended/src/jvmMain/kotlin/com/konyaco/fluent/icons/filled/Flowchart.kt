

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Flowchart: ImageVector
    get() {
        if (_flowchart != null) {
            return _flowchart!!
        }
        _flowchart = fluentIcon(name = "Filled.Flowchart") {
            fluentPath {
                moveTo(3.0f, 5.25f)
                curveTo(3.0f, 4.0f, 4.0f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(2.5f)
                curveTo(9.0f, 3.0f, 10.0f, 4.0f, 10.0f, 5.25f)
                verticalLineToRelative(2.5f)
                curveTo(10.0f, 9.0f, 9.0f, 10.0f, 7.75f, 10.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.71f)
                curveToRelative(0.05f, 0.03f, 0.1f, 0.07f, 0.13f, 0.12f)
                lineToRelative(2.8f, 2.79f)
                lineToRelative(0.11f, 0.13f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.24f, 1.01f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(2.5f)
                curveTo(21.0f, 20.0f, 20.0f, 21.0f, 18.75f, 21.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(15.01f, 21.0f, 14.0f, 20.0f, 14.0f, 18.75f)
                verticalLineToRelative(-0.5f)
                horizontalLineTo(10.3f)
                curveToRelative(-0.03f, 0.05f, -0.07f, 0.1f, -0.12f, 0.13f)
                lineToRelative(-2.79f, 2.8f)
                curveToRelative(-0.48f, 0.48f, -1.28f, 0.48f, -1.76f, 0.0f)
                lineToRelative(-2.8f, -2.8f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -1.76f)
                lineToRelative(2.8f, -2.8f)
                lineToRelative(0.13f, -0.11f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-0.5f)
                curveTo(4.0f, 10.0f, 3.0f, 9.0f, 3.0f, 7.74f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }
        return _flowchart!!
    }

private var _flowchart: ImageVector? = null
