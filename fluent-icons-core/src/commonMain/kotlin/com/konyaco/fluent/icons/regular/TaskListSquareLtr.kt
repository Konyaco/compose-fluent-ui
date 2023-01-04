

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TaskListSquareLtr: ImageVector
    get() {
        if (_taskListSquareLtr != null) {
            return _taskListSquareLtr!!
        }
        _taskListSquareLtr = fluentIcon(name = "Regular.TaskListSquareLtr") {
            fluentPath {
                moveTo(12.5f, 9.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(13.25f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(10.78f, 8.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(8.25f, 9.19f)
                lineToRelative(-0.47f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(10.78f, 13.22f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-1.0f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.47f, 0.47f)
                lineToRelative(1.47f, -1.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.5f, 6.25f)
                close()
            }
        }
        return _taskListSquareLtr!!
    }

private var _taskListSquareLtr: ImageVector? = null
