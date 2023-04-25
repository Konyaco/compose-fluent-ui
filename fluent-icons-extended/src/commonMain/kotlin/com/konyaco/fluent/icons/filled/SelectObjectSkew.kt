

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SelectObjectSkew: ImageVector
    get() {
        if (_selectObjectSkew != null) {
            return _selectObjectSkew!!
        }
        _selectObjectSkew = fluentIcon(name = "Filled.SelectObjectSkew") {
            fluentPath {
                moveTo(18.59f, 6.41f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.41f, 1.41f)
                close()
                moveTo(14.27f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.46f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.46f, 2.0f)
                close()
                moveTo(4.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(6.59f, 6.41f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.41f, 3.41f)
                close()
                moveTo(3.82f, 16.01f)
                lineTo(6.26f, 7.45f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 1.92f, 0.54f)
                lineToRelative(-2.44f, 8.56f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.92f, -0.54f)
                close()
                moveTo(17.17f, 6.0f)
                horizontalLineToRelative(-6.34f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(6.34f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(13.17f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(6.83f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(6.34f)
                close()
                moveTo(15.82f, 16.0f)
                lineTo(18.26f, 7.45f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 1.92f, 0.54f)
                lineToRelative(-2.44f, 8.56f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.92f, -0.54f)
                close()
            }
        }
        return _selectObjectSkew!!
    }

private var _selectObjectSkew: ImageVector? = null
