

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShareScreenPerson: ImageVector
    get() {
        if (_shareScreenPerson != null) {
            return _shareScreenPerson!!
        }
        _shareScreenPerson = fluentIcon(name = "Regular.ShareScreenPerson") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                lineTo(13.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -0.13f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.46f, 0.11f, -0.89f, 0.3f, -1.27f)
                lineTo(5.26f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.38f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.0f, 14.5f)
                lineTo(22.0f, 7.25f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
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
        return _shareScreenPerson!!
    }

private var _shareScreenPerson: ImageVector? = null
