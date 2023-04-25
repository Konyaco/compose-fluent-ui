

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = fluentIcon(name = "Filled.Gavel") {
            fluentPath {
                moveTo(10.73f, 2.71f)
                curveToRelative(0.98f, -0.98f, 2.6f, -0.85f, 3.4f, 0.27f)
                lineToRelative(0.33f, 0.44f)
                lineToRelative(-6.47f, 6.47f)
                lineToRelative(-0.38f, -0.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.35f, -3.46f)
                lineToRelative(3.47f, -3.47f)
                close()
                moveTo(9.26f, 10.74f)
                lineTo(11.82f, 12.44f)
                curveToRelative(0.09f, 0.07f, 0.16f, 0.14f, 0.22f, 0.23f)
                lineToRelative(1.23f, 1.94f)
                lineToRelative(6.01f, -6.01f)
                lineToRelative(-2.15f, -1.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.16f, -0.16f)
                lineToRelative(-1.62f, -2.22f)
                lineToRelative(-6.1f, 6.1f)
                close()
                moveTo(14.36f, 16.33f)
                lineTo(14.1f, 15.91f)
                lineTo(20.51f, 9.49f)
                lineTo(21.02f, 9.86f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.27f, 3.41f)
                lineToRelative(-3.44f, 3.44f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -3.49f, -0.38f)
                close()
                moveTo(9.34f, 12.3f)
                lineToRelative(-6.07f, 5.96f)
                arcToRelative(1.76f, 1.76f, 0.0f, true, false, 2.47f, 2.5f)
                lineToRelative(6.09f, -6.09f)
                lineToRelative(-0.8f, -1.24f)
                lineToRelative(-1.69f, -1.13f)
                close()
                moveTo(14.75f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }
        return _gavel!!
    }

private var _gavel: ImageVector? = null
