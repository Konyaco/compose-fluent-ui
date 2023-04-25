

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
                moveTo(22.0f, 7.83f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -2.0f, -5.66f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 5.66f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(11.36f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, -0.08f, 1.5f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                lineToRelative(-0.01f, 0.15f)
                verticalLineToRelative(0.43f)
                lineToRelative(8.5f, 4.47f)
                lineToRelative(6.5f, -3.41f)
                curveToRelative(0.54f, 0.36f, 1.17f, 0.61f, 1.85f, 0.71f)
                lineToRelative(-8.0f, 4.21f)
                curveToRelative(-0.19f, 0.1f, -0.4f, 0.12f, -0.6f, 0.05f)
                lineToRelative(-0.1f, -0.05f)
                lineTo(3.5f, 9.37f)
                verticalLineToRelative(7.38f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                verticalLineTo(9.47f)
                arcTo(4.55f, 4.55f, 0.0f, false, false, 22.0f, 9.4f)
                verticalLineToRelative(7.36f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                horizontalLineTo(5.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        return _mailUnread!!
    }

private var _mailUnread: ImageVector? = null
