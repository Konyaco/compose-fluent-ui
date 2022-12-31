

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Notepad: ImageVector
    get() {
        if (_notepad != null) {
            return _notepad!!
        }
        _notepad = fluentIcon(name = "Filled.Notepad") {
            fluentPath {
                moveTo(16.25f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                lineTo(20.0f, 16.0f)
                horizontalLineToRelative(-3.91f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 14.0f, 18.1f)
                lineTo(14.0f, 22.0f)
                lineTo(5.75f, 22.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(0.85f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(0.85f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(19.55f, 17.5f)
                lineToRelative(-4.06f, 4.07f)
                verticalLineToRelative(-3.32f)
                lineToRelative(0.01f, -0.1f)
                curveToRelative(0.05f, -0.33f, 0.31f, -0.6f, 0.64f, -0.64f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(3.32f)
                close()
                moveTo(11.25f, 16.0f)
                horizontalLineToRelative(-4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(11.35f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(16.25f, 12.0f)
                horizontalLineToRelative(-9.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(16.25f, 8.0f)
                horizontalLineToRelative(-9.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _notepad!!
    }

private var _notepad: ImageVector? = null
