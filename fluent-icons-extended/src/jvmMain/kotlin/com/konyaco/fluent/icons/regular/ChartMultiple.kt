

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChartMultiple: ImageVector
    get() {
        if (_chartMultiple != null) {
            return _chartMultiple!!
        }
        _chartMultiple = fluentIcon(name = "Regular.ChartMultiple") {
            fluentPath {
                moveTo(13.0f, 11.75f)
                horizontalLineToRelative(6.71f)
                curveToRelative(0.34f, -0.35f, 0.79f, -0.6f, 1.28f, -0.7f)
                arcTo(9.5f, 9.5f, 0.0f, true, false, 11.0f, 21.0f)
                verticalLineToRelative(-1.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.25f, -15.98f)
                lineTo(11.25f, 10.0f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                close()
                moveTo(13.0f, 10.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(12.75f, 3.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.65f, 6.65f)
                lineTo(13.0f, 10.25f)
                close()
                moveTo(21.5f, 12.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 18.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16.0f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        return _chartMultiple!!
    }

private var _chartMultiple: ImageVector? = null
