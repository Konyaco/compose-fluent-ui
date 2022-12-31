

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LeafTwo: ImageVector
    get() {
        if (_leafTwo != null) {
            return _leafTwo!!
        }
        _leafTwo = fluentIcon(name = "Regular.LeafTwo") {
            fluentPath {
                moveTo(2.0f, 4.7f)
                lineTo(2.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.3f, 6.0f)
                curveToRelative(0.26f, 0.88f, 0.69f, 1.69f, 1.25f, 2.39f)
                lineToRelative(-2.33f, 2.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(2.33f, -2.33f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 22.0f, 13.0f)
                lineTo(22.0f, 7.75f)
                curveTo(22.0f, 6.78f, 21.22f, 6.0f, 20.25f, 6.0f)
                lineTo(15.0f, 6.0f)
                curveToRelative(-0.58f, 0.0f, -1.15f, 0.07f, -1.69f, 0.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.01f, 3.0f)
                lineTo(3.7f, 3.0f)
                curveTo(2.77f, 3.0f, 2.0f, 3.76f, 2.0f, 4.7f)
                close()
                moveTo(11.68f, 17.38f)
                lineToRelative(4.1f, -4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-4.1f, 4.1f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 15.0f, 7.5f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.1f, 0.25f, 0.25f)
                lineTo(20.5f, 13.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -8.82f, 4.38f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(1.66f, 0.0f, 3.1f, 0.9f, 3.89f, 2.23f)
                arcToRelative(7.03f, 7.03f, 0.0f, false, false, -2.71f, 2.39f)
                lineToRelative(-1.9f, -1.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.24f, 2.24f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, false, -0.44f, 2.98f)
                lineTo(8.0f, 13.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 3.5f, 9.0f)
                lineTo(3.5f, 4.7f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.2f, -0.2f)
                lineTo(8.0f, 4.5f)
                close()
            }
        }
        return _leafTwo!!
    }

private var _leafTwo: ImageVector? = null
