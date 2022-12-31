

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailInboxCheckmark: ImageVector
    get() {
        if (_mailInboxCheckmark != null) {
            return _mailInboxCheckmark!!
        }
        _mailInboxCheckmark = fluentIcon(name = "Regular.MailInboxCheckmark") {
            fluentPath {
                moveTo(22.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(19.85f, 4.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineTo(15.5f, 7.79f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
                moveTo(19.5f, 12.27f)
                lineTo(19.5f, 14.0f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                verticalLineToRelative(0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -4.5f, -0.15f)
                verticalLineToRelative(-0.1f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 9.0f, 14.0f)
                lineTo(4.5f, 14.0f)
                lineTo(4.5f, 7.11f)
                curveToRelative(0.08f, -0.9f, 0.83f, -1.61f, 1.75f, -1.61f)
                horizontalLineToRelative(3.83f)
                curveToRelative(0.08f, -0.52f, 0.22f, -1.03f, 0.42f, -1.5f)
                lineTo(6.07f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 7.26f)
                verticalLineToRelative(11.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 6.26f, 22.0f)
                horizontalLineToRelative(11.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 21.0f, 18.74f)
                verticalLineToRelative(-7.56f)
                curveToRelative(-0.44f, 0.43f, -0.95f, 0.8f, -1.5f, 1.08f)
                close()
                moveTo(4.5f, 18.75f)
                lineTo(4.5f, 15.5f)
                horizontalLineToRelative(3.83f)
                lineToRelative(0.04f, 0.19f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 12.0f, 18.5f)
                horizontalLineToRelative(0.2f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 3.48f, -3.0f)
                horizontalLineToRelative(3.82f)
                verticalLineToRelative(3.39f)
                curveToRelative(-0.08f, 0.9f, -0.83f, 1.61f, -1.75f, 1.61f)
                lineTo(6.11f, 20.5f)
                curveToRelative(-0.9f, -0.08f, -1.61f, -0.83f, -1.61f, -1.75f)
                close()
            }
        }
        return _mailInboxCheckmark!!
    }

private var _mailInboxCheckmark: ImageVector? = null
