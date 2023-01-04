

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TagLock: ImageVector
    get() {
        if (_tagLock != null) {
            return _tagLock!!
        }
        _tagLock = fluentIcon(name = "Filled.TagLock") {
            fluentPath {
                moveTo(19.75f, 2.0f)
                curveTo(20.99f, 2.0f, 22.0f, 3.0f, 22.0f, 4.25f)
                verticalLineToRelative(5.46f)
                curveToRelative(0.0f, 0.86f, -0.34f, 1.69f, -0.95f, 2.3f)
                lineToRelative(-0.42f, 0.42f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.0f, 14.0f)
                verticalLineToRelative(0.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, 2.45f)
                verticalLineToRelative(4.45f)
                curveToRelative(-1.26f, 0.8f, -2.95f, 0.66f, -4.05f, -0.44f)
                lineTo(3.5f, 16.06f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -4.6f)
                lineToRelative(8.5f, -8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.3f, -0.96f)
                horizontalLineToRelative(5.46f)
                close()
                moveTo(17.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(20.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.5f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        return _tagLock!!
    }

private var _tagLock: ImageVector? = null
