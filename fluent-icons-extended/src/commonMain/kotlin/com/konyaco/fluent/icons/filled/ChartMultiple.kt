

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChartMultiple: ImageVector
    get() {
        if (_chartMultiple != null) {
            return _chartMultiple!!
        }
        _chartMultiple = fluentIcon(name = "Filled.ChartMultiple") {
            fluentPath {
                moveTo(19.0f, 13.5f)
                curveToRelative(0.0f, -0.68f, 0.27f, -1.3f, 0.71f, -1.75f)
                lineTo(13.0f, 11.75f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(11.25f, 2.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 11.0f, 21.0f)
                lineTo(11.0f, 19.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.75f, 2.08f)
                lineTo(12.75f, 10.0f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.92f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -8.17f, -8.17f)
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
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        return _chartMultiple!!
    }

private var _chartMultiple: ImageVector? = null
