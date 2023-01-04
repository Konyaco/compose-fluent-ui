

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailInboxDismiss: ImageVector
    get() {
        if (_mailInboxDismiss != null) {
            return _mailInboxDismiss!!
        }
        _mailInboxDismiss = fluentIcon(name = "Regular.MailInboxDismiss") {
            fluentPath {
                moveTo(22.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.85f, 4.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineTo(17.21f, 6.5f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(16.5f, 5.79f)
                lineToRelative(-1.65f, -1.64f)
                close()
                moveTo(19.5f, 14.0f)
                verticalLineToRelative(-1.73f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, 1.5f, -1.08f)
                verticalLineToRelative(7.56f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(6.25f, 22.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(3.0f, 18.75f)
                lineTo(3.0f, 7.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(6.25f, 4.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(-0.2f, 0.47f, -0.34f, 0.98f, -0.42f, 1.5f)
                lineTo(6.25f, 5.5f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                lineToRelative(-0.01f, 0.15f)
                lineTo(4.5f, 14.0f)
                lineTo(9.0f, 14.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 4.5f, 0.15f)
                verticalLineToRelative(-0.15f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineTo(15.0f, 14.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(4.5f, 15.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                lineTo(19.5f, 15.5f)
                horizontalLineToRelative(-3.82f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.48f, 3.0f)
                lineTo(12.0f, 18.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.63f, -2.81f)
                lineToRelative(-0.04f, -0.19f)
                lineTo(4.5f, 15.5f)
                close()
            }
        }
        return _mailInboxDismiss!!
    }

private var _mailInboxDismiss: ImageVector? = null
