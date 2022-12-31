

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Cookies: ImageVector
    get() {
        if (_cookies != null) {
            return _cookies!!
        }
        _cookies = fluentIcon(name = "Filled.Cookies") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                curveToRelative(0.71f, 0.0f, 1.42f, 0.07f, 2.1f, 0.22f)
                curveToRelative(0.59f, 0.13f, 0.8f, 0.84f, 0.38f, 1.27f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.2f, 4.2f)
                curveToRelative(0.38f, 0.08f, 0.62f, 0.43f, 0.58f, 0.8f)
                lineToRelative(-0.01f, 0.26f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.37f, 1.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.31f, 0.4f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(8.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(7.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        return _cookies!!
    }

private var _cookies: ImageVector? = null
