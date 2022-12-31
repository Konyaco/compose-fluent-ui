

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WindowArrowUp: ImageVector
    get() {
        if (_windowArrowUp != null) {
            return _windowArrowUp!!
        }
        _windowArrowUp = fluentIcon(name = "Filled.WindowArrowUp") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(17.51f, 14.0f)
                horizontalLineToRelative(-0.08f)
                lineToRelative(-0.06f, 0.02f)
                lineToRelative(-0.08f, 0.03f)
                lineToRelative(-0.07f, 0.04f)
                lineToRelative(-0.06f, 0.04f)
                lineToRelative(-2.51f, 2.52f)
                lineToRelative(-0.06f, 0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.56f)
                lineToRelative(0.06f, 0.07f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.17f, 0.12f, 0.4f, 0.12f, 0.56f, 0.0f)
                lineToRelative(0.07f, -0.06f)
                lineTo(17.0f, 15.71f)
                verticalLineToRelative(5.38f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                lineToRelative(0.09f, 0.01f)
                horizontalLineToRelative(0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                lineTo(18.0f, 21.0f)
                verticalLineToRelative(-5.3f)
                lineToRelative(1.65f, 1.65f)
                lineToRelative(0.07f, 0.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineToRelative(-0.07f, -0.06f)
                lineToRelative(-2.54f, -2.55f)
                lineToRelative(-0.05f, -0.03f)
                lineToRelative(-0.07f, -0.03f)
                lineToRelative(-0.06f, -0.02f)
                lineToRelative(-0.06f, -0.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.06f, -0.01f)
                close()
                moveTo(6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.24f, 3.07f)
                lineToRelative(0.01f, 0.18f)
                verticalLineToRelative(5.77f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, false, -2.0f, -0.85f)
                lineTo(19.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(9.75f)
                curveToRelative(0.0f, 0.65f, 0.5f, 1.18f, 1.12f, 1.24f)
                lineToRelative(0.13f, 0.01f)
                horizontalLineToRelative(4.92f)
                curveToRelative(0.17f, 0.72f, 0.46f, 1.4f, 0.85f, 2.0f)
                lineTo(6.25f, 21.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(6.25f, 3.0f)
                close()
            }
        }
        return _windowArrowUp!!
    }

private var _windowArrowUp: ImageVector? = null
