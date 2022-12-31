

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SignOut: ImageVector
    get() {
        if (_signOut != null) {
            return _signOut!!
        }
        _signOut = fluentIcon(name = "Filled.SignOut") {
            fluentPath {
                moveTo(12.0f, 4.35f)
                lineTo(12.0f, 11.0f)
                horizontalLineToRelative(7.44f)
                lineToRelative(-1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(3.0f, 3.0f)
                curveToRelative(0.26f, 0.26f, 0.29f, 0.68f, 0.07f, 0.97f)
                lineToRelative(-0.07f, 0.09f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.97f)
                lineToRelative(0.07f, -0.09f)
                lineToRelative(1.71f, -1.72f)
                lineTo(12.0f, 12.5f)
                verticalLineToRelative(6.75f)
                curveToRelative(0.0f, 0.47f, -0.42f, 0.82f, -0.88f, 0.74f)
                lineToRelative(-8.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.62f, -0.74f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -0.37f, 0.27f, -0.68f, 0.63f, -0.74f)
                lineToRelative(8.5f, -1.4f)
                curveToRelative(0.46f, -0.07f, 0.87f, 0.28f, 0.87f, 0.74f)
                close()
                moveTo(8.5f, 11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(13.0f, 18.5f)
                horizontalLineToRelative(0.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                lineToRelative(-0.01f, -4.25f)
                lineTo(13.0f, 13.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(13.0f, 10.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.37f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                lineTo(14.5f, 10.0f)
                lineTo(13.0f, 10.0f)
                close()
            }
        }
        return _signOut!!
    }

private var _signOut: ImageVector? = null
