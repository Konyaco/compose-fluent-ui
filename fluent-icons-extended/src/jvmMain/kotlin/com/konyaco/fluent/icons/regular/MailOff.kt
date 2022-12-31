

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailOff: ImageVector
    get() {
        if (_mailOff != null) {
            return _mailOff!!
        }
        _mailOff = fluentIcon(name = "Regular.MailOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.25f, 1.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 20.0f)
                horizontalLineToRelative(13.68f)
                lineToRelative(1.79f, 1.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(17.44f, 18.5f)
                lineTo(5.1f, 18.5f)
                curveToRelative(-0.9f, -0.08f, -1.61f, -0.83f, -1.61f, -1.75f)
                lineTo(3.49f, 9.37f)
                lineToRelative(8.15f, 4.3f)
                lineToRelative(0.1f, 0.04f)
                curveToRelative(0.2f, 0.07f, 0.41f, 0.05f, 0.6f, -0.05f)
                lineToRelative(0.17f, -0.08f)
                lineToRelative(4.92f, 4.92f)
                close()
                moveTo(10.08f, 11.14f)
                lineTo(3.5f, 7.68f)
                lineTo(3.5f, 7.1f)
                curveToRelative(0.06f, -0.67f, 0.49f, -1.23f, 1.07f, -1.47f)
                lineToRelative(5.51f, 5.5f)
                close()
                moveTo(20.5f, 7.68f)
                lineTo(14.18f, 11.0f)
                lineToRelative(1.11f, 1.11f)
                lineToRelative(5.21f, -2.74f)
                verticalLineToRelative(7.52f)
                lineToRelative(-0.07f, 0.36f)
                lineToRelative(1.13f, 1.13f)
                curveToRelative(0.28f, -0.48f, 0.44f, -1.04f, 0.44f, -1.63f)
                lineTo(22.0f, 7.07f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 18.74f, 4.0f)
                lineTo(7.18f, 4.0f)
                lineToRelative(1.5f, 1.5f)
                lineTo(18.9f, 5.5f)
                curveToRelative(0.9f, 0.08f, 1.61f, 0.83f, 1.61f, 1.75f)
                verticalLineToRelative(0.43f)
                close()
            }
        }
        return _mailOff!!
    }

private var _mailOff: ImageVector? = null
