

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailAlert: ImageVector
    get() {
        if (_mailAlert != null) {
            return _mailAlert!!
        }
        _mailAlert = fluentIcon(name = "Regular.MailAlert") {
            fluentPath {
                moveTo(17.5f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-0.95f, 0.8f)
                curveToRelative(-0.3f, 0.26f, -0.46f, 0.39f, -0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.24f, 0.65f)
                curveToRelative(0.1f, 0.05f, 0.3f, 0.05f, 0.7f, 0.05f)
                horizontalLineToRelative(9.02f)
                curveToRelative(0.4f, 0.0f, 0.6f, 0.0f, 0.7f, -0.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.25f, -0.66f)
                curveToRelative(-0.05f, -0.1f, -0.2f, -0.23f, -0.5f, -0.49f)
                lineTo(21.5f, 8.0f)
                lineTo(21.5f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(-0.22f, 0.58f, -0.8f, 1.0f, -1.5f, 1.0f)
                curveToRelative(-0.69f, 0.0f, -1.28f, -0.42f, -1.5f, -1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.0f, 16.75f)
                lineTo(22.0f, 11.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.89f)
                curveToRelative(-0.08f, 0.9f, -0.83f, 1.61f, -1.75f, 1.61f)
                lineTo(5.11f, 18.5f)
                curveToRelative(-0.9f, -0.08f, -1.61f, -0.83f, -1.61f, -1.75f)
                lineTo(3.5f, 9.37f)
                lineToRelative(8.15f, 4.3f)
                lineToRelative(0.1f, 0.04f)
                curveToRelative(0.2f, 0.07f, 0.41f, 0.05f, 0.6f, -0.05f)
                lineToRelative(3.1f, -1.63f)
                curveToRelative(-0.16f, -0.2f, -0.3f, -0.43f, -0.39f, -0.68f)
                lineToRelative(-0.13f, -0.35f)
                horizontalLineToRelative(-0.74f)
                lineTo(12.0f, 12.15f)
                lineTo(3.5f, 7.68f)
                lineTo(3.5f, 7.1f)
                curveToRelative(0.08f, -0.9f, 0.83f, -1.61f, 1.75f, -1.61f)
                horizontalLineToRelative(7.25f)
                lineTo(12.5f, 5.0f)
                curveToRelative(0.0f, -0.34f, 0.03f, -0.68f, 0.1f, -1.0f)
                lineTo(5.07f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.26f)
                verticalLineToRelative(9.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 20.0f)
                horizontalLineToRelative(13.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 22.0f, 16.74f)
                close()
            }
        }
        return _mailAlert!!
    }

private var _mailAlert: ImageVector? = null
