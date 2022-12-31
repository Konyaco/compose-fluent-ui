

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonTag: ImageVector
    get() {
        if (_personTag != null) {
            return _personTag!!
        }
        _personTag = fluentIcon(name = "Filled.PersonTag") {
            fluentPath {
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(2.94f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.86f, 2.1f)
                lineToRelative(2.26f, 2.29f)
                curveToRelative(-1.18f, 0.45f, -2.56f, 0.67f, -4.12f, 0.67f)
                curveToRelative(-3.42f, 0.0f, -5.94f, -1.07f, -7.49f, -3.24f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.5f, -1.6f)
                verticalLineToRelative(-0.91f)
                curveTo(2.0f, 15.0f, 3.0f, 14.0f, 4.24f, 14.0f)
                lineTo(11.0f, 14.0f)
                close()
                moveTo(15.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 5.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(16.57f, 22.4f)
                lineToRelative(-4.0f, -4.07f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.57f, -1.4f)
                lineTo(12.0f, 14.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.92f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, 0.58f)
                lineToRelative(4.08f, 4.01f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.02f, 2.83f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.85f, -0.02f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _personTag!!
    }

private var _personTag: ImageVector? = null
