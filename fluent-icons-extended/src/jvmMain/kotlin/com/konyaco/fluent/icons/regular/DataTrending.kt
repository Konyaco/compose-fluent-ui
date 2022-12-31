

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataTrending: ImageVector
    get() {
        if (_dataTrending != null) {
            return _dataTrending!!
        }
        _dataTrending = fluentIcon(name = "Regular.DataTrending") {
            fluentPath {
                moveTo(5.0f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(5.25f, 19.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(5.0f, 4.25f)
                close()
                moveTo(14.0f, 6.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.42f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.2f)
                lineToRelative(-5.22f, 5.23f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-1.97f, -1.97f)
                lineToRelative(-3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(1.97f, 1.97f)
                lineToRelative(4.69f, -4.69f)
                horizontalLineToRelative(-3.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _dataTrending!!
    }

private var _dataTrending: ImageVector? = null
