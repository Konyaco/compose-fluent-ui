

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BriefcaseOff: ImageVector
    get() {
        if (_briefcaseOff != null) {
            return _briefcaseOff!!
        }
        _briefcaseOff = fluentIcon(name = "Filled.BriefcaseOff") {
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
                moveTo(21.0f, 16.75f)
                curveToRelative(0.0f, 0.32f, -0.05f, 0.64f, -0.14f, 0.93f)
                lineTo(10.18f, 7.0f)
                horizontalLineToRelative(4.32f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.82f)
                lineTo(8.0f, 4.82f)
                verticalLineTo(3.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.75f)
                curveTo(19.55f, 7.0f, 21.0f, 8.46f, 21.0f, 10.25f)
                verticalLineToRelative(6.5f)
                close()
            }
        }
        return _briefcaseOff!!
    }

private var _briefcaseOff: ImageVector? = null
