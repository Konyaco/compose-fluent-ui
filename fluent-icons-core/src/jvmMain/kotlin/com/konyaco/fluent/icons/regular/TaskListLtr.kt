

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TaskListLtr: ImageVector
    get() {
        if (_taskListLtr != null) {
            return _taskListLtr!!
        }
        _taskListLtr = fluentIcon(name = "Regular.TaskListLtr") {
            fluentPath {
                moveTo(6.78f, 4.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(3.75f, 5.69f)
                lineToRelative(-0.47f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                close()
                moveTo(21.25f, 18.01f)
                lineTo(9.65f, 18.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(11.5f)
                lineToRelative(0.1f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(21.25f, 11.5f)
                lineTo(9.65f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(11.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(21.25f, 5.0f)
                lineTo(9.65f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(11.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(6.78f, 17.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.97f, 1.97f)
                lineToRelative(-0.47f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                close()
                moveTo(6.78f, 10.22f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-1.0f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.47f, 0.47f)
                lineToRelative(1.97f, -1.97f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _taskListLtr!!
    }

private var _taskListLtr: ImageVector? = null
