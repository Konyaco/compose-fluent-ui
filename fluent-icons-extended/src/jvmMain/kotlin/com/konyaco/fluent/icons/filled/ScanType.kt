

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ScanType: ImageVector
    get() {
        if (_scanType != null) {
            return _scanType!!
        }
        _scanType = fluentIcon(name = "Filled.ScanType") {
            fluentPath {
                moveTo(5.5f, 4.0f)
                curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f)
                lineTo(4.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(2.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 2.0f)
                lineTo(8.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(5.5f, 4.0f)
                close()
                moveTo(5.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 18.5f)
                lineTo(4.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(2.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 22.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(5.5f, 20.0f)
                close()
                moveTo(20.0f, 5.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(16.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.0f, 5.5f)
                lineTo(22.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(20.0f, 5.5f)
                close()
                moveTo(18.5f, 20.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                lineTo(16.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(7.75f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(8.75f, 8.0f)
                lineTo(11.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(9.75f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(13.0f, 16.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(17.25f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-8.5f)
                close()
            }
        }
        return _scanType!!
    }

private var _scanType: ImageVector? = null
