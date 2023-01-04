

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BriefcaseMedical: ImageVector
    get() {
        if (_briefcaseMedical != null) {
            return _briefcaseMedical!!
        }
        _briefcaseMedical = fluentIcon(name = "Filled.BriefcaseMedical") {
            fluentPath {
                moveTo(16.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                lineTo(8.0f, 7.0f)
                lineTo(6.25f, 7.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 10.25f)
                verticalLineToRelative(6.5f)
                curveTo(3.0f, 18.55f, 4.46f, 20.0f, 6.25f, 20.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-6.5f)
                curveTo(21.0f, 8.45f, 19.54f, 7.0f, 17.75f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 3.75f)
                close()
                moveTo(9.5f, 4.5f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 7.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 4.5f)
                close()
                moveTo(11.5f, 15.75f)
                lineTo(11.5f, 14.0f)
                lineTo(9.75f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
            }
        }
        return _briefcaseMedical!!
    }

private var _briefcaseMedical: ImageVector? = null
