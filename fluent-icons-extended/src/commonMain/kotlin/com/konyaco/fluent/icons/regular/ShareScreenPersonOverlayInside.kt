

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShareScreenPersonOverlayInside: ImageVector
    get() {
        if (_shareScreenPersonOverlayInside != null) {
            return _shareScreenPersonOverlayInside!!
        }
        _shareScreenPersonOverlayInside = fluentIcon(name =
                "Regular.ShareScreenPersonOverlayInside") {
            fluentPath {
                moveTo(16.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 16.25f, 17.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 13.0f, 14.25f)
                lineTo(13.0f, 14.0f)
                close()
                moveTo(6.25f, 7.0f)
                curveTo(5.56f, 7.0f, 5.0f, 7.56f, 5.0f, 8.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-3.5f)
                curveTo(12.0f, 7.56f, 11.44f, 7.0f, 10.75f, 7.0f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(3.5f, 7.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(5.25f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                close()
            }
        }
        return _shareScreenPersonOverlayInside!!
    }

private var _shareScreenPersonOverlayInside: ImageVector? = null
