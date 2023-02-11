

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookCompass: ImageVector
    get() {
        if (_bookCompass != null) {
            return _bookCompass!!
        }
        _bookCompass = fluentIcon(name = "Filled.BookCompass") {
            fluentPath {
                moveTo(11.0f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
                moveTo(4.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 2.0f)
                lineTo(18.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(5.5f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(13.0f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(1.6f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 10.35f, 12.0f)
                lineToRelative(-1.3f, 3.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.4f, 0.56f)
                lineToRelative(1.23f, -3.09f)
                arcToRelative(2.76f, 2.76f, 0.0f, false, false, 1.14f, 0.0f)
                lineToRelative(1.23f, 3.09f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.4f, -0.56f)
                lineTo(14.15f, 12.0f)
                arcTo(2.74f, 2.74f, 0.0f, false, false, 13.0f, 7.35f)
                verticalLineToRelative(-1.6f)
                close()
            }
        }
        return _bookCompass!!
    }

private var _bookCompass: ImageVector? = null
