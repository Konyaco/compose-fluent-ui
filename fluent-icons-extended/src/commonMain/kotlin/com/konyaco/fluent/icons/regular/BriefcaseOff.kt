

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BriefcaseOff: ImageVector
    get() {
        if (_briefcaseOff != null) {
            return _briefcaseOff!!
        }
        _briefcaseOff = fluentIcon(name = "Regular.BriefcaseOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(3.73f, 3.73f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 10.25f)
                verticalLineToRelative(6.5f)
                curveTo(3.0f, 18.55f, 4.46f, 20.0f, 6.25f, 20.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.36f, 0.0f, 0.7f, -0.06f, 1.02f, -0.16f)
                lineToRelative(1.95f, 1.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.44f, 18.5f)
                lineTo(6.25f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(1.19f)
                lineToRelative(10.0f, 10.0f)
                close()
                moveTo(19.5f, 10.25f)
                verticalLineToRelative(6.07f)
                lineToRelative(1.36f, 1.36f)
                curveToRelative(0.1f, -0.3f, 0.14f, -0.6f, 0.14f, -0.93f)
                verticalLineToRelative(-6.5f)
                curveTo(21.0f, 8.45f, 19.55f, 7.0f, 17.75f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 3.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.65f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                verticalLineToRelative(1.07f)
                lineToRelative(1.5f, 1.5f)
                lineTo(9.5f, 4.5f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 7.0f)
                horizontalLineToRelative(-4.32f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(6.07f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                close()
            }
        }
        return _briefcaseOff!!
    }

private var _briefcaseOff: ImageVector? = null
