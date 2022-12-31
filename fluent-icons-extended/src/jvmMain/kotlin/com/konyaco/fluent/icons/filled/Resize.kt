

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = fluentIcon(name = "Filled.Resize") {
            fluentPath {
                moveTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                lineTo(2.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(4.0f, 5.25f)
                curveTo(4.0f, 4.56f, 4.56f, 4.0f, 5.25f, 4.0f)
                lineTo(10.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(14.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                lineTo(20.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(22.0f, 5.25f)
                curveTo(22.0f, 3.45f, 20.54f, 2.0f, 18.75f, 2.0f)
                lineTo(14.0f, 2.0f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(20.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(14.0f, 22.0f)
                close()
                moveTo(10.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(5.25f, 20.0f)
                curveTo(4.56f, 20.0f, 4.0f, 19.44f, 4.0f, 18.75f)
                lineTo(4.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(4.75f)
                curveTo(2.0f, 20.55f, 3.46f, 22.0f, 5.25f, 22.0f)
                lineTo(10.0f, 22.0f)
                close()
            }
        }
        return _resize!!
    }

private var _resize: ImageVector? = null
