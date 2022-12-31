

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SelectObjectSkew: ImageVector
    get() {
        if (_selectObjectSkew != null) {
            return _selectObjectSkew!!
        }
        _selectObjectSkew = fluentIcon(name = "Regular.SelectObjectSkew") {
            fluentPath {
                moveTo(18.88f, 6.66f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.33f, 0.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -1.33f, -0.33f)
                close()
                moveTo(14.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(4.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(6.88f, 6.66f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.0f, -0.97f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.0f, 0.97f)
                close()
                moveTo(6.48f, 7.59f)
                lineTo(4.08f, 16.0f)
                curveToRelative(0.52f, 0.01f, 1.01f, 0.16f, 1.44f, 0.41f)
                lineTo(7.92f, 8.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, -1.44f, -0.41f)
                close()
                moveTo(17.1f, 5.75f)
                horizontalLineToRelative(-6.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(6.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(13.1f, 19.75f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(6.91f, 18.25f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(6.18f)
                close()
                moveTo(16.08f, 16.0f)
                lineToRelative(2.4f, -8.41f)
                curveToRelative(0.43f, 0.25f, 0.92f, 0.4f, 1.44f, 0.4f)
                lineToRelative(-2.4f, 8.42f)
                curveToRelative(-0.43f, -0.25f, -0.92f, -0.4f, -1.44f, -0.4f)
                close()
            }
        }
        return _selectObjectSkew!!
    }

private var _selectObjectSkew: ImageVector? = null
