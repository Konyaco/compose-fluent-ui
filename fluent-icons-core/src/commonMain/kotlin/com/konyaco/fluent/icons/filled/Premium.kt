

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Premium: ImageVector
    get() {
        if (_premium != null) {
            return _premium!!
        }
        _premium = fluentIcon(name = "Filled.Premium") {
            fluentPath {
                moveTo(18.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.83f, 0.44f)
                lineToRelative(0.06f, 0.11f)
                lineToRelative(3.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.06f, 1.01f)
                lineToRelative(-0.09f, 0.1f)
                lineToRelative(-8.97f, 9.98f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.89f, 0.35f)
                lineToRelative(-0.1f, -0.02f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, -0.54f, -0.32f)
                lineToRelative(-8.98f, -9.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.2f, -1.0f)
                lineToRelative(0.05f, -0.12f)
                lineToRelative(3.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.77f, -0.54f)
                lineTo(6.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(14.58f, 11.0f)
                lineTo(9.42f, 11.0f)
                lineTo(12.0f, 17.34f)
                lineTo(14.58f, 11.0f)
                close()
                moveTo(18.75f, 11.0f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(-1.66f, 4.09f)
                lineTo(18.75f, 11.0f)
                close()
                moveTo(7.26f, 11.0f)
                lineTo(5.25f, 11.0f)
                lineToRelative(3.67f, 4.09f)
                lineTo(7.26f, 11.0f)
                close()
                moveTo(8.62f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-2.0f, 4.0f)
                horizontalLineToRelative(2.7f)
                lineToRelative(1.3f, -4.0f)
                close()
                moveTo(13.27f, 5.0f)
                horizontalLineToRelative(-2.54f)
                lineToRelative(-1.3f, 4.0f)
                horizontalLineToRelative(5.14f)
                lineToRelative(-1.3f, -4.0f)
                close()
                moveTo(17.38f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(1.3f, 4.0f)
                horizontalLineToRelative(2.7f)
                lineToRelative(-2.0f, -4.0f)
                close()
            }
        }
        return _premium!!
    }

private var _premium: ImageVector? = null
