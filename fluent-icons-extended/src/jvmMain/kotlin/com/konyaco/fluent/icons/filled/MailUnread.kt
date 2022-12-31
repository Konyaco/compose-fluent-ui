

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
                moveTo(2.0f, 9.11f)
                lineToRelative(8.65f, 4.55f)
                curveToRelative(0.22f, 0.12f, 0.48f, 0.12f, 0.7f, 0.0f)
                lineToRelative(7.2f, -3.79f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.45f, 0.1f)
                verticalLineToRelative(6.78f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 20.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                lineTo(2.0f, 9.11f)
                close()
                moveTo(16.34f, 5.0f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, 0.69f, 3.98f)
                lineTo(11.0f, 12.15f)
                lineTo(2.1f, 7.47f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 5.06f, 5.0f)
                lineTo(5.25f, 5.0f)
                horizontalLineToRelative(11.09f)
                close()
                moveTo(19.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
            }
        }
        return _mailUnread!!
    }

private var _mailUnread: ImageVector? = null
