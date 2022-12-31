

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Diversity: ImageVector
    get() {
        if (_diversity != null) {
            return _diversity!!
        }
        _diversity = fluentIcon(name = "Filled.Diversity") {
            fluentPath {
                moveTo(16.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(5.55f, 3.9f)
                curveToRelative(0.6f, -1.2f, 2.3f, -1.2f, 2.9f, 0.0f)
                lineToRelative(2.37f, 4.71f)
                arcTo(1.64f, 1.64f, 0.0f, false, true, 9.37f, 11.0f)
                lineTo(4.63f, 11.0f)
                curveToRelative(-1.22f, 0.0f, -2.0f, -1.3f, -1.45f, -2.39f)
                lineTo(5.55f, 3.9f)
                close()
                moveTo(10.93f, 17.76f)
                curveToRelative(-0.1f, 0.54f, -0.32f, 1.05f, -0.62f, 1.49f)
                lineToRelative(-5.56f, -5.56f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 7.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.93f, 4.75f)
                verticalLineToRelative(0.01f)
                close()
                moveTo(7.69f, 20.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.62f, -4.69f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.1f, -0.54f, 0.32f, -1.05f, 0.62f, -1.49f)
                lineToRelative(5.56f, 5.56f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, -1.56f, 0.63f)
                close()
                moveTo(16.52f, 13.12f)
                curveToRelative(0.3f, -0.16f, 0.66f, -0.16f, 0.96f, 0.0f)
                lineToRelative(2.97f, 1.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.55f, 0.89f)
                verticalLineToRelative(2.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.55f, 0.89f)
                lineToRelative(-2.97f, 1.53f)
                curveToRelative(-0.3f, 0.16f, -0.66f, 0.16f, -0.96f, 0.0f)
                lineToRelative(-2.97f, -1.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.55f, -0.89f)
                verticalLineToRelative(-2.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.55f, -0.89f)
                lineToRelative(2.97f, -1.53f)
                close()
            }
        }
        return _diversity!!
    }

private var _diversity: ImageVector? = null
