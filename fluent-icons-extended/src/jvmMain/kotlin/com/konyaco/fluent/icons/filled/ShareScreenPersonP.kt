

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShareScreenPersonP: ImageVector
    get() {
        if (_shareScreenPersonP != null) {
            return _shareScreenPersonP!!
        }
        _shareScreenPersonP = fluentIcon(name = "Filled.ShareScreenPersonP") {
            fluentPath {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.45f, 3.46f, 4.0f, 5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 4.0f, 22.0f, 5.46f, 22.0f, 7.25f)
                verticalLineToRelative(7.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -5.95f, 2.5f)
                horizontalLineToRelative(-0.28f)
                arcTo(2.77f, 2.77f, 0.0f, false, false, 13.0f, 19.77f)
                verticalLineToRelative(0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 0.13f)
                lineTo(5.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(7.0f, 8.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(8.5f, 13.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
                moveTo(8.5f, 12.0f)
                horizontalLineToRelative(1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                lineTo(8.5f, 9.5f)
                lineTo(8.5f, 12.0f)
                close()
                moveTo(21.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(23.0f, 19.88f)
                curveToRelative(0.0f, 1.55f, -1.29f, 3.12f, -4.5f, 3.12f)
                reflectiveCurveTo(14.0f, 21.44f, 14.0f, 19.87f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.98f, 0.8f, -1.77f, 1.77f, -1.77f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _shareScreenPersonP!!
    }

private var _shareScreenPersonP: ImageVector? = null
