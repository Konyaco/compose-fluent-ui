

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CopyAdd: ImageVector
    get() {
        if (_copyAdd != null) {
            return _copyAdd!!
        }
        _copyAdd = fluentIcon(name = "Filled.CopyAdd") {
            fluentPath {
                moveTo(5.5f, 4.63f)
                lineTo(5.5f, 17.25f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.3f, 0.56f, 0.66f, 1.06f, 1.08f, 1.5f)
                lineTo(8.75f, 22.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 4.0f, 17.25f)
                lineTo(4.0f, 6.75f)
                curveToRelative(0.0f, -0.98f, 0.63f, -1.81f, 1.5f, -2.12f)
                close()
                moveTo(16.5f, 11.0f)
                curveToRelative(1.29f, 0.0f, 2.49f, 0.38f, 3.5f, 1.02f)
                lineTo(20.0f, 4.25f)
                curveTo(20.0f, 3.01f, 19.0f, 2.0f, 17.75f, 2.0f)
                horizontalLineToRelative(-9.0f)
                curveTo(7.51f, 2.0f, 6.5f, 3.0f, 6.5f, 4.25f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(1.56f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 16.5f, 11.0f)
                close()
                moveTo(22.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(17.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(16.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(16.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(17.0f, 18.0f)
                close()
            }
        }
        return _copyAdd!!
    }

private var _copyAdd: ImageVector? = null
