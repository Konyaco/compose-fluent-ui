

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailInbox: ImageVector
    get() {
        if (_mailInbox != null) {
            return _mailInbox!!
        }
        _mailInbox = fluentIcon(name = "Regular.MailInbox") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.24f, 3.07f)
                lineToRelative(0.01f, 0.18f)
                verticalLineToRelative(11.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(6.25f, 21.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                horizontalLineToRelative(-11.5f)
                close()
                moveTo(4.5f, 14.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                lineTo(19.5f, 14.5f)
                horizontalLineToRelative(-3.82f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.48f, 3.0f)
                lineTo(12.0f, 17.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.63f, -2.81f)
                lineToRelative(-0.04f, -0.19f)
                lineTo(4.5f, 14.5f)
                verticalLineToRelative(3.25f)
                verticalLineToRelative(-3.25f)
                close()
                moveTo(17.75f, 4.5f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                lineToRelative(-0.01f, 0.15f)
                lineTo(4.5f, 13.0f)
                lineTo(9.0f, 13.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 4.5f, 0.15f)
                verticalLineToRelative(-0.15f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineTo(15.0f, 13.0f)
                horizontalLineToRelative(4.5f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.92f, -0.7f, -1.67f, -1.6f, -1.74f)
                lineToRelative(-0.15f, -0.01f)
                close()
            }
        }
        return _mailInbox!!
    }

private var _mailInbox: ImageVector? = null
