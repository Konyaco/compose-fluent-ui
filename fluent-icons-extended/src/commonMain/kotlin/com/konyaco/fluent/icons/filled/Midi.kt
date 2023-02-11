

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Midi: ImageVector
    get() {
        if (_midi != null) {
            return _midi!!
        }
        _midi = fluentIcon(name = "Filled.Midi") {
            fluentPath {
                moveTo(21.25f, 4.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.29f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                lineTo(2.75f, 20.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(2.0f, 4.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.69f, 0.65f, -0.74f)
                horizontalLineToRelative(18.6f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(3.5f, 12.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(17.0f)
                lineTo(20.5f, 12.0f)
                lineTo(18.0f, 12.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(16.5f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(13.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(9.5f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(17.25f, 7.5f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(6.25f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(9.25f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _midi!!
    }

private var _midi: ImageVector? = null
