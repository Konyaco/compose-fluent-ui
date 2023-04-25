

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = fluentIcon(name = "Regular.CloudArrowUp") {
            fluentPath {
                moveTo(12.0f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 0.71f)
                lineTo(6.5f, 9.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                horizontalLineToRelative(3.58f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, false, -0.06f, 1.5f)
                lineTo(6.5f, 17.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.42f, -8.98f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.84f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.05f, 4.97f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, false, -1.8f, -1.85f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.5f, 9.5f)
                horizontalLineToRelative(-0.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.71f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.0f, 4.5f)
                close()
                moveTo(22.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(16.0f, 19.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-4.8f)
                lineToRelative(1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineTo(16.0f, 14.71f)
                verticalLineToRelative(4.79f)
                close()
            }
        }
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
