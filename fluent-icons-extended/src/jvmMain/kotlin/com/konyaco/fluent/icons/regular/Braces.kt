

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Braces: ImageVector
    get() {
        if (_braces != null) {
            return _braces!!
        }
        _braces = fluentIcon(name = "Regular.Braces") {
            fluentPath {
                moveTo(4.5f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 7.25f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                curveTo(6.56f, 4.5f, 6.0f, 5.06f, 6.0f, 5.75f)
                verticalLineToRelative(4.3f)
                curveToRelative(0.0f, 0.75f, -0.3f, 1.45f, -0.8f, 1.95f)
                curveToRelative(0.5f, 0.5f, 0.8f, 1.2f, 0.8f, 1.94f)
                verticalLineToRelative(4.31f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, -2.75f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0.0f, -0.55f, -0.34f, -1.02f, -0.85f, -1.2f)
                lineToRelative(-0.14f, -0.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.42f)
                lineToRelative(0.14f, -0.05f)
                curveToRelative(0.5f, -0.17f, 0.85f, -0.64f, 0.85f, -1.18f)
                lineTo(4.5f, 5.75f)
                close()
                moveTo(19.5f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 16.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(4.3f)
                curveToRelative(0.0f, 0.75f, 0.3f, 1.45f, 0.8f, 1.95f)
                curveToRelative(-0.5f, 0.5f, -0.8f, 1.2f, -0.8f, 1.94f)
                verticalLineToRelative(4.31f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, -2.75f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0.0f, -0.55f, 0.34f, -1.02f, 0.85f, -1.2f)
                lineToRelative(0.14f, -0.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.42f)
                lineToRelative(-0.14f, -0.05f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -0.85f, -1.18f)
                lineTo(19.5f, 5.75f)
                close()
            }
        }
        return _braces!!
    }

private var _braces: ImageVector? = null
