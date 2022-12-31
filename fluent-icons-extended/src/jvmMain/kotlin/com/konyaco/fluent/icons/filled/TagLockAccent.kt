

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TagLockAccent: ImageVector
    get() {
        if (_tagLockAccent != null) {
            return _tagLockAccent!!
        }
        _tagLockAccent = fluentIcon(name = "Filled.TagLockAccent") {
            fluentPath {
                moveTo(19.75f, 2.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.75f, 1.75f)
                verticalLineToRelative(5.46f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, -0.8f, 1.95f)
                lineToRelative(-0.33f, 0.33f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.0f, 14.0f)
                verticalLineToRelative(0.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, 2.45f)
                verticalLineToRelative(3.84f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -3.69f, -0.18f)
                lineTo(3.84f, 15.7f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -3.88f)
                lineToRelative(8.5f, -8.51f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, 1.95f, -0.81f)
                horizontalLineToRelative(5.46f)
                close()
            }
        }
        return _tagLockAccent!!
    }

private var _tagLockAccent: ImageVector? = null
