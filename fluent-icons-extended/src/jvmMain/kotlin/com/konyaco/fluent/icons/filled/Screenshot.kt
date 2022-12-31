

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Screenshot: ImageVector
    get() {
        if (_screenshot != null) {
            return _screenshot!!
        }
        _screenshot = fluentIcon(name = "Filled.Screenshot") {
            fluentPath {
                moveTo(17.25f, 3.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 21.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 17.25f, 21.0f)
                lineTo(6.75f, 21.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 3.0f, 17.25f)
                lineTo(3.0f, 6.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 6.75f, 3.0f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(17.25f, 13.0f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                lineTo(16.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.41f, 0.5f)
                horizontalLineToRelative(-2.34f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                lineTo(16.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.85f)
                verticalLineToRelative(-2.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(6.75f, 13.0f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                lineTo(6.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, 2.0f)
                horizontalLineToRelative(2.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                lineTo(8.0f, 16.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.41f)
                verticalLineToRelative(-2.34f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(10.25f, 6.0f)
                horizontalLineToRelative(-2.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.84f, 1.84f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(2.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(7.5f, 7.91f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.41f, -0.4f)
                lineTo(8.0f, 7.5f)
                horizontalLineToRelative(2.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(16.0f, 6.0f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                lineTo(16.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.41f)
                verticalLineToRelative(2.34f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.1f)
                lineTo(18.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, -2.0f)
                lineTo(16.0f, 6.0f)
                close()
            }
        }
        return _screenshot!!
    }

private var _screenshot: ImageVector? = null
