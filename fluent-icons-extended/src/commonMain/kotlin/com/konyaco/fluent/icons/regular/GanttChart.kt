

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.GanttChart: ImageVector
    get() {
        if (_ganttChart != null) {
            return _ganttChart!!
        }
        _ganttChart = fluentIcon(name = "Regular.GanttChart") {
            fluentPath {
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
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(8.0f, 5.5f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(1.5f)
                lineTo(9.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 10.0f)
                lineTo(16.0f, 10.0f)
                lineTo(16.0f, 5.5f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(16.0f, 18.5f)
                lineTo(16.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.5f, -0.06f)
                verticalLineToRelative(1.56f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 11.0f)
                lineTo(8.0f, 11.0f)
                verticalLineToRelative(7.5f)
                lineTo(5.25f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                lineTo(8.0f, 5.5f)
                close()
            }
        }
        return _ganttChart!!
    }

private var _ganttChart: ImageVector? = null
