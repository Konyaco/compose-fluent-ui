

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Food: ImageVector
    get() {
        if (_food != null) {
            return _food!!
        }
        _food = fluentIcon(name = "Regular.Food") {
            fluentPath {
                moveTo(18.25f, 3.25f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineTo(19.0f, 4.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(17.5f, 15.0f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(14.5f, 7.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 3.75f, -3.75f)
                close()
                moveTo(12.25f, 3.25f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineTo(13.0f, 4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.25f, 3.93f)
                lineTo(9.75f, 20.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-8.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.24f, -3.72f)
                lineTo(5.0f, 8.0f)
                lineTo(5.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                lineTo(6.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.75f, 2.39f)
                lineTo(8.25f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                lineTo(9.75f, 10.39f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.74f, -2.2f)
                lineTo(11.5f, 8.0f)
                lineTo(11.5f, 4.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(17.5f, 13.5f)
                lineTo(17.5f, 4.88f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 16.0f, 6.83f)
                verticalLineToRelative(6.67f)
                horizontalLineToRelative(1.5f)
                lineTo(17.5f, 4.88f)
                verticalLineToRelative(8.62f)
                close()
            }
        }
        return _food!!
    }

private var _food: ImageVector? = null
