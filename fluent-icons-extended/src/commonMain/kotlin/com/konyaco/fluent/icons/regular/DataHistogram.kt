

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataHistogram: ImageVector
    get() {
        if (_dataHistogram != null) {
            return _dataHistogram!!
        }
        _dataHistogram = fluentIcon(name = "Regular.DataHistogram") {
            fluentPath {
                moveTo(8.5f, 5.23f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                lineTo(15.5f, 7.0f)
                horizontalLineToRelative(3.25f)
                curveTo(19.99f, 7.0f, 21.0f, 8.0f, 21.0f, 9.25f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(3.75f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-8.0f)
                curveTo(3.0f, 11.01f, 4.0f, 10.0f, 5.25f, 10.0f)
                lineTo(8.5f, 10.0f)
                lineTo(8.5f, 5.23f)
                close()
                moveTo(10.0f, 19.5f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 5.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(10.0f, 19.5f)
                close()
                moveTo(8.5f, 11.5f)
                lineTo(5.25f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(7.25f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(15.5f, 19.5f)
                horizontalLineToRelative(4.0f)
                lineTo(19.5f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(15.5f, 8.5f)
                verticalLineToRelative(11.0f)
                close()
            }
        }
        return _dataHistogram!!
    }

private var _dataHistogram: ImageVector? = null
