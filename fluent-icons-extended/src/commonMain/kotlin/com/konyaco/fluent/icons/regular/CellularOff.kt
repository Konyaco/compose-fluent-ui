

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CellularOff: ImageVector
    get() {
        if (_cellularOff != null) {
            return _cellularOff!!
        }
        _cellularOff = fluentIcon(name = "Regular.CellularOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(11.0f, 12.06f)
                verticalLineToRelative(7.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                verticalLineToRelative(-5.69f)
                lineToRelative(2.5f, 2.5f)
                verticalLineToRelative(3.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                verticalLineToRelative(-1.69f)
                lineToRelative(4.22f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(19.0f, 15.82f)
                lineToRelative(1.5f, 1.5f)
                lineTo(20.5f, 5.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.12f)
                verticalLineToRelative(10.06f)
                close()
                moveTo(15.0f, 11.82f)
                lineToRelative(1.5f, 1.5f)
                lineTo(16.5f, 8.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(3.07f)
                close()
                moveTo(3.75f, 17.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(7.75f, 14.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-4.6f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _cellularOff!!
    }

private var _cellularOff: ImageVector? = null
