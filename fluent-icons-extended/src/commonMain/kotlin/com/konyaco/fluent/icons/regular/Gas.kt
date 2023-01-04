

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Gas: ImageVector
    get() {
        if (_gas != null) {
            return _gas!!
        }
        _gas = fluentIcon(name = "Regular.Gas") {
            fluentPath {
                moveTo(8.22f, 10.22f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineTo(12.0f, 12.94f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(13.06f, 14.0f)
                lineToRelative(0.47f, 0.47f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.25f, 0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-0.25f, -0.25f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.47f, -0.47f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineTo(10.94f, 14.0f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(13.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.6f, 0.3f)
                lineTo(10.44f, 6.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(-0.25f)
                curveTo(9.0f, 3.95f, 7.54f, 2.5f, 5.75f, 2.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(7.5f, 6.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.0f, 8.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 6.75f, 22.0f)
                horizontalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 20.0f, 19.25f)
                lineTo(20.0f, 8.75f)
                curveToRelative(0.0f, -0.86f, -0.4f, -1.63f, -1.01f, -2.13f)
                lineTo(19.0f, 6.5f)
                lineTo(19.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(17.5f, 6.01f)
                lineTo(17.25f, 6.0f)
                lineTo(12.3f, 6.0f)
                lineToRelative(1.83f, -2.5f)
                horizontalLineToRelative(3.37f)
                verticalLineToRelative(2.51f)
                close()
                moveTo(6.75f, 7.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(6.75f, 20.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(5.5f, 8.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                close()
            }
        }
        return _gas!!
    }

private var _gas: ImageVector? = null
