

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShareScreenPersonOverlay: ImageVector
    get() {
        if (_shareScreenPersonOverlay != null) {
            return _shareScreenPersonOverlay!!
        }
        _shareScreenPersonOverlay = fluentIcon(name = "Regular.ShareScreenPersonOverlay") {
            fluentPath {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.45f, 3.46f, 4.0f, 5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 4.0f, 22.0f, 5.46f, 22.0f, 7.25f)
                verticalLineToRelative(7.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.5f, -2.87f)
                lineTo(20.5f, 7.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(5.25f, 5.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.06f)
                curveToRelative(-0.2f, 0.38f, -0.31f, 0.81f, -0.31f, 1.27f)
                verticalLineToRelative(0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 0.13f)
                lineTo(5.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(18.5f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(18.5f, 23.0f)
                curveToRelative(3.21f, 0.0f, 4.5f, -1.57f, 4.5f, -3.13f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.98f, -0.8f, -1.77f, -1.77f, -1.77f)
                horizontalLineToRelative(-5.46f)
                curveToRelative(-0.98f, 0.0f, -1.77f, 0.8f, -1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 1.57f, 1.29f, 3.13f, 4.5f, 3.13f)
                close()
                moveTo(6.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(6.0f, 7.0f)
                close()
            }
        }
        return _shareScreenPersonOverlay!!
    }

private var _shareScreenPersonOverlay: ImageVector? = null
