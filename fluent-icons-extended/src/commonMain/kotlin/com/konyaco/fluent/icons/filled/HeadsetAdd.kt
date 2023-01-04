

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HeadsetAdd: ImageVector
    get() {
        if (_headsetAdd != null) {
            return _headsetAdd!!
        }
        _headsetAdd = fluentIcon(name = "Filled.HeadsetAdd") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 7.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(17.5f, 13.0f)
                curveToRelative(0.52f, 0.0f, 1.02f, -0.06f, 1.5f, -0.17f)
                lineTo(19.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.02f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 17.5f, 13.0f)
                close()
                moveTo(12.02f, 3.0f)
                curveToRelative(-0.3f, 0.48f, -0.55f, 1.0f, -0.72f, 1.54f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.5f, 10.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.5f, -0.06f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 1.2f, 0.93f, 2.17f, 2.1f, 2.24f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(1.13f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(8.75f, 21.0f)
                curveToRelative(-2.0f, 0.0f, -3.64f, -1.57f, -3.74f, -3.55f)
                lineToRelative(-0.01f, -0.2f)
                lineTo(5.0f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                horizontalLineToRelative(0.02f)
                close()
            }
        }
        return _headsetAdd!!
    }

private var _headsetAdd: ImageVector? = null
