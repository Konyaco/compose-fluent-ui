

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BriefcaseMedical: ImageVector
    get() {
        if (_briefcaseMedical != null) {
            return _briefcaseMedical!!
        }
        _briefcaseMedical = fluentIcon(name = "Regular.BriefcaseMedical") {
            fluentPath {
                moveTo(11.5f, 12.5f)
                verticalLineToRelative(-1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.5f, 14.0f)
                lineTo(9.75f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.75f)
                close()
                moveTo(8.75f, 3.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(1.75f)
                curveTo(19.55f, 7.0f, 21.0f, 8.46f, 21.0f, 10.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 16.75f)
                verticalLineToRelative(-6.5f)
                curveTo(3.0f, 8.45f, 4.46f, 7.0f, 6.25f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 3.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                close()
                moveTo(17.75f, 8.5f)
                lineTo(6.25f, 8.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(14.5f, 4.5f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 7.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 4.5f)
                close()
            }
        }
        return _briefcaseMedical!!
    }

private var _briefcaseMedical: ImageVector? = null
