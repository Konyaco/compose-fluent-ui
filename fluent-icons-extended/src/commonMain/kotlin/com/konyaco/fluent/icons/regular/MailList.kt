

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailList: ImageVector
    get() {
        if (_mailList != null) {
            return _mailList!!
        }
        _mailList = fluentIcon(name = "Regular.MailList") {
            fluentPath {
                moveTo(12.53f, 4.0f)
                lineTo(5.07f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.26f)
                verticalLineToRelative(9.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 20.0f)
                horizontalLineToRelative(13.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 22.0f, 16.74f)
                lineTo(22.0f, 9.33f)
                curveToRelative(-0.23f, 0.11f, -0.48f, 0.17f, -0.75f, 0.17f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(7.39f)
                curveToRelative(-0.08f, 0.9f, -0.83f, 1.61f, -1.75f, 1.61f)
                lineTo(5.11f, 18.5f)
                curveToRelative(-0.9f, -0.08f, -1.61f, -0.83f, -1.61f, -1.75f)
                lineTo(3.5f, 9.37f)
                lineToRelative(8.15f, 4.3f)
                lineToRelative(0.1f, 0.04f)
                curveToRelative(0.2f, 0.07f, 0.41f, 0.05f, 0.6f, -0.05f)
                lineToRelative(7.9f, -4.16f)
                horizontalLineToRelative(-3.21f)
                lineTo(12.0f, 12.15f)
                lineTo(3.5f, 7.68f)
                lineTo(3.5f, 7.1f)
                curveToRelative(0.08f, -0.9f, 0.83f, -1.61f, 1.75f, -1.61f)
                horizontalLineToRelative(6.77f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 0.5f, -1.5f)
                close()
                moveTo(21.25f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(21.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-7.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, -1.5f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(13.0f, 7.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _mailList!!
    }

private var _mailList: ImageVector? = null
