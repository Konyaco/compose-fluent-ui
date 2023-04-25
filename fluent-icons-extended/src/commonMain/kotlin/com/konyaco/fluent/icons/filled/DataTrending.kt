

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataTrending: ImageVector
    get() {
        if (_dataTrending != null) {
            return _dataTrending!!
        }
        _dataTrending = fluentIcon(name = "Filled.DataTrending") {
            fluentPath {
                moveTo(5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(13.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 21.0f)
                lineTo(20.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(6.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 17.5f)
                lineTo(5.0f, 4.0f)
                close()
                moveTo(15.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-3.84f, 3.84f)
                lineToRelative(-1.8f, -1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineTo(6.78f, 13.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.42f, 1.42f)
                lineToRelative(2.54f, -2.55f)
                lineToRelative(1.8f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineTo(18.5f, 9.4f)
                verticalLineToRelative(2.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(20.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(15.0f, 6.0f)
                close()
            }
        }
        return _dataTrending!!
    }

private var _dataTrending: ImageVector? = null
