

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LeafTwo: ImageVector
    get() {
        if (_leafTwo != null) {
            return _leafTwo!!
        }
        _leafTwo = fluentIcon(name = "Filled.LeafTwo") {
            fluentPath {
                moveTo(3.7f, 2.0f)
                curveTo(2.78f, 2.0f, 2.0f, 2.76f, 2.0f, 3.7f)
                lineTo(2.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 5.92f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 1.4f, -4.45f)
                lineTo(6.23f, 7.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(2.1f, 2.1f)
                arcTo(7.98f, 7.98f, 0.0f, false, true, 13.7f, 6.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 2.0f)
                lineTo(3.7f, 2.0f)
                close()
                moveTo(9.55f, 18.39f)
                lineToRelative(-2.33f, 2.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.33f, -2.33f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 22.0f, 14.0f)
                lineTo(22.0f, 8.75f)
                curveTo(22.0f, 7.78f, 21.22f, 7.0f, 20.25f, 7.0f)
                lineTo(15.0f, 7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.45f, 11.39f)
                close()
                moveTo(15.78f, 14.29f)
                lineToRelative(-4.1f, 4.09f)
                curveToRelative(-0.4f, -0.3f, -0.75f, -0.66f, -1.06f, -1.06f)
                lineToRelative(4.1f, -4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 1.06f)
                close()
            }
        }
        return _leafTwo!!
    }

private var _leafTwo: ImageVector? = null
