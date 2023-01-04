

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = fluentIcon(name = "Regular.FlipHorizontal") {
            fluentPath {
                moveTo(21.88f, 19.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.63f, 0.34f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.43f, -0.31f)
                lineToRelative(7.5f, 16.5f)
                curveToRelative(0.1f, 0.23f, 0.09f, 0.5f, -0.05f, 0.72f)
                close()
                moveTo(14.5f, 6.2f)
                verticalLineTo(18.5f)
                horizontalLineToRelative(5.59f)
                lineTo(14.5f, 6.21f)
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
