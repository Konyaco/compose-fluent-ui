

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShareScreenPerson: ImageVector
    get() {
        if (_shareScreenPerson != null) {
            return _shareScreenPerson!!
        }
        _shareScreenPerson = fluentIcon(name = "Filled.ShareScreenPerson") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                lineTo(13.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -0.13f)
                verticalLineToRelative(-0.1f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 15.77f, 17.0f)
                horizontalLineToRelative(0.28f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, 2.45f, -6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
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
