

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailUnread: ImageVector
    get() {
        if (_mailUnread != null) {
            return _mailUnread!!
        }
        _mailUnread = fluentIcon(name = "Filled.MailUnread") {
            fluentPath {
                moveTo(21.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(11.36f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, 1.9f, 4.75f)
                lineTo(12.0f, 12.15f)
                lineTo(2.02f, 6.92f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.04f, -2.91f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(12.35f, 13.66f)
                lineTo(20.38f, 9.46f)
                arcTo(4.54f, 4.54f, 0.0f, false, false, 22.0f, 9.39f)
                verticalLineToRelative(7.36f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 20.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                lineTo(2.0f, 8.61f)
                lineToRelative(9.65f, 5.05f)
                curveToRelative(0.22f, 0.12f, 0.48f, 0.12f, 0.7f, 0.0f)
                close()
            }
        }
        return _mailUnread!!
    }

private var _mailUnread: ImageVector? = null
