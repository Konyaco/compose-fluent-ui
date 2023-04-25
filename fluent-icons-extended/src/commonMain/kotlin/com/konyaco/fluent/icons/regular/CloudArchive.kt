

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudArchive: ImageVector
    get() {
        if (_cloudArchive != null) {
            return _cloudArchive!!
        }
        _cloudArchive = fluentIcon(name = "Regular.CloudArchive") {
            fluentPath {
                moveTo(12.0f, 5.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 0.71f)
                lineTo(6.5f, 10.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                horizontalLineToRelative(5.18f)
                curveToRelative(0.1f, 0.09f, 0.2f, 0.17f, 0.32f, 0.23f)
                lineTo(12.0f, 18.0f)
                lineTo(6.5f, 18.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.42f, -8.98f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.84f, 0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 21.74f, 12.0f)
                lineTo(20.1f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.6f, -1.5f)
                horizontalLineToRelative(-0.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.71f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.0f, 5.5f)
                close()
                moveTo(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(20.0f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(15.5f, 18.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        return _cloudArchive!!
    }

private var _cloudArchive: ImageVector? = null
