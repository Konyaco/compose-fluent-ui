

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LeafOne: ImageVector
    get() {
        if (_leafOne != null) {
            return _leafOne!!
        }
        _leafOne = fluentIcon(name = "Filled.LeafOne") {
            fluentPath {
                moveTo(11.04f, 3.05f)
                curveToRelative(0.68f, -0.45f, 1.6f, -0.38f, 2.2f, 0.22f)
                lineToRelative(3.7f, 3.71f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -4.19f, 11.91f)
                verticalLineToRelative(2.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.36f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 7.05f, 7.0f)
                lineToRelative(3.71f, -3.72f)
                curveToRelative(0.09f, -0.08f, 0.18f, -0.16f, 0.28f, -0.22f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(5.63f)
                curveToRelative(0.5f, 0.07f, 1.0f, 0.07f, 1.5f, 0.0f)
                verticalLineToRelative(-5.63f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 12.0f, 11.0f)
                close()
            }
        }
        return _leafOne!!
    }

private var _leafOne: ImageVector? = null
