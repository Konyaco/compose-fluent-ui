

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonSwap: ImageVector
    get() {
        if (_personSwap != null) {
            return _personSwap!!
        }
        _personSwap = fluentIcon(name = "Filled.PersonSwap") {
            fluentPath {
                moveTo(15.75f, 14.0f)
                curveTo(17.0f, 14.0f, 18.0f, 15.0f, 18.0f, 16.25f)
                verticalLineToRelative(0.91f)
                curveToRelative(0.0f, 0.29f, -0.04f, 0.57f, -0.13f, 0.84f)
                horizontalLineToRelative(-2.03f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 13.0f, 16.02f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.48f)
                lineToRelative(0.94f, 0.93f)
                curveToRelative(-0.47f, 0.05f, -0.95f, 0.07f, -1.45f, 0.07f)
                curveToRelative(-3.42f, 0.0f, -5.95f, -1.07f, -7.49f, -3.24f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.51f, -1.6f)
                verticalLineToRelative(-0.91f)
                curveTo(2.0f, 15.0f, 3.0f, 14.0f, 4.25f, 14.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(14.78f, 17.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.22f, -1.22f)
                horizontalLineToRelative(6.88f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(20.44f, 19.0f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(1.22f, -1.22f)
                close()
            }
        }
        return _personSwap!!
    }

private var _personSwap: ImageVector? = null
