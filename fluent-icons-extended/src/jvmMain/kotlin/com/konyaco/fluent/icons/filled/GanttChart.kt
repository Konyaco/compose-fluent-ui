

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.GanttChart: ImageVector
    get() {
        if (_ganttChart != null) {
            return _ganttChart!!
        }
        _ganttChart = fluentIcon(name = "Filled.GanttChart") {
            fluentPath {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.45f, 3.46f, 4.0f, 5.25f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(9.25f, 20.0f)
                verticalLineToRelative(-9.0f)
                lineTo(10.0f, 11.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.75f, 1.98f)
                lineTo(14.75f, 20.0f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(12.0f, 10.0f)
                horizontalLineToRelative(2.75f)
                lineTo(14.75f, 4.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(3.0f)
                lineTo(10.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                lineTo(16.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(15.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        return _ganttChart!!
    }

private var _ganttChart: ImageVector? = null
