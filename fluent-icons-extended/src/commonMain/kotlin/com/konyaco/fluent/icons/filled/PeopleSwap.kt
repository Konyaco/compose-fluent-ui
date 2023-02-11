

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleSwap: ImageVector
    get() {
        if (_peopleSwap != null) {
            return _peopleSwap!!
        }
        _peopleSwap = fluentIcon(name = "Filled.PeopleSwap") {
            fluentPath {
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(20.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(2.0f, 16.25f)
                curveTo(2.0f, 15.01f, 3.0f, 14.0f, 4.25f, 14.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.37f, 0.0f, 0.72f, 0.09f, 1.03f, 0.25f)
                lineTo(10.5f, 16.5f)
                curveToRelative(-0.68f, 0.69f, -0.68f, 1.8f, 0.0f, 2.48f)
                lineToRelative(1.19f, 1.18f)
                curveToRelative(-0.87f, 0.5f, -2.06f, 0.83f, -3.7f, 0.83f)
                curveToRelative(-6.0f, 0.0f, -6.0f, -4.5f, -6.0f, -4.5f)
                verticalLineToRelative(-0.25f)
                close()
                moveTo(20.28f, 14.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineTo(20.44f, 17.0f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.22f, -1.22f)
                horizontalLineToRelative(6.88f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(2.5f, -2.5f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                close()
            }
        }
        return _peopleSwap!!
    }

private var _peopleSwap: ImageVector? = null
