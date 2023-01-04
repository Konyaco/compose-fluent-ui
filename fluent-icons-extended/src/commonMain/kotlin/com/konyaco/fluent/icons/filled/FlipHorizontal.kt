

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = fluentIcon(name = "Filled.FlipHorizontal") {
            fluentPath {
                moveTo(21.84f, 19.55f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 20.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.92f, -0.4f)
                lineToRelative(7.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, 0.95f)
                close()
                moveTo(15.0f, 7.78f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(4.47f)
                lineTo(15.0f, 7.78f)
                close()
                moveTo(2.5f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.45f, -0.71f)
                lineToRelative(8.0f, -17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.95f, 0.21f)
                verticalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
