

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PointScan: ImageVector
    get() {
        if (_pointScan != null) {
            return _pointScan!!
        }
        _pointScan = fluentIcon(name = "Regular.PointScan") {
            fluentPath {
                moveTo(10.25f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(4.8f)
                arcTo(6.25f, 6.25f, 0.0f, false, true, 16.46f, 13.0f)
                horizontalLineToRelative(4.79f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(16.45f, 14.5f)
                arcTo(6.25f, 6.25f, 0.0f, false, true, 11.0f, 19.96f)
                verticalLineToRelative(1.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(9.5f, 19.95f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, -5.46f, -5.45f)
                lineTo(2.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(4.05f, 13.0f)
                arcTo(6.25f, 6.25f, 0.0f, false, true, 9.5f, 7.54f)
                lineTo(9.5f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(9.5f, 14.5f)
                lineTo(5.56f, 14.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 3.94f, 3.94f)
                lineTo(9.5f, 14.5f)
                close()
                moveTo(14.94f, 14.5f)
                lineTo(11.0f, 14.5f)
                verticalLineToRelative(3.94f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 3.94f, -3.94f)
                close()
                moveTo(9.5f, 9.06f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 5.56f, 13.0f)
                lineTo(9.5f, 13.0f)
                lineTo(9.5f, 9.06f)
                close()
                moveTo(11.0f, 9.06f)
                lineTo(11.0f, 13.0f)
                horizontalLineToRelative(3.94f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -3.72f, -3.9f)
                lineTo(11.0f, 9.06f)
                close()
            }
        }
        return _pointScan!!
    }

private var _pointScan: ImageVector? = null
