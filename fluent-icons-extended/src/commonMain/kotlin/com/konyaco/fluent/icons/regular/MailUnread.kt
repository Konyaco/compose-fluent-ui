

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailUnread: ImageVector
    get() {
        if (_mailUnread != null) {
            return _mailUnread!!
        }
        _mailUnread = fluentIcon(name = "Regular.MailUnread") {
            fluentPath {
                moveTo(16.0f, 6.5f)
                lineTo(5.25f, 6.5f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                verticalLineToRelative(0.1f)
                lineTo(11.0f, 12.16f)
                lineToRelative(6.03f, -3.17f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, 2.97f, 0.98f)
                verticalLineToRelative(6.79f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 20.01f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                verticalLineToRelative(-8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(5.25f, 5.0f)
                horizontalLineToRelative(11.09f)
                curveToRelative(-0.22f, 0.45f, -0.34f, 0.96f, -0.34f, 1.5f)
                close()
                moveTo(18.5f, 9.9f)
                lineToRelative(-7.15f, 3.76f)
                curveToRelative(-0.19f, 0.1f, -0.4f, 0.12f, -0.6f, 0.05f)
                lineToRelative(-0.1f, -0.05f)
                lineTo(3.5f, 9.9f)
                verticalLineToRelative(6.85f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                lineTo(18.5f, 9.9f)
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
