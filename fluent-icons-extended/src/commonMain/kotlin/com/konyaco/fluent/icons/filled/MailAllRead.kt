

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailAllRead: ImageVector
    get() {
        if (_mailAllRead != null) {
            return _mailAllRead!!
        }
        _mailAllRead = fluentIcon(name = "Filled.MailAllRead") {
            fluentPath {
                moveTo(11.36f, 1.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.72f, 0.0f)
                lineTo(2.83f, 6.1f)
                curveToRelative(-0.17f, 0.1f, -0.31f, 0.21f, -0.44f, 0.35f)
                lineToRelative(8.61f, 4.7f)
                lineToRelative(8.6f, -4.7f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.43f, -0.35f)
                lineToRelative(-7.81f, -4.26f)
                close()
                moveTo(2.0f, 15.75f)
                verticalLineToRelative(-7.8f)
                lineToRelative(8.64f, 4.7f)
                curveToRelative(0.22f, 0.13f, 0.5f, 0.13f, 0.72f, 0.0f)
                lineTo(20.0f, 7.96f)
                verticalLineToRelative(7.8f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(5.25f, 19.01f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 15.75f)
                close()
                moveTo(21.0f, 7.51f)
                curveToRelative(0.9f, 0.58f, 1.5f, 1.59f, 1.5f, 2.74f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.15f, 0.0f, -2.16f, -0.6f, -2.74f, -1.5f)
                horizontalLineToRelative(11.74f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 21.0f, 16.25f)
                lineTo(21.0f, 7.51f)
                close()
            }
        }
        return _mailAllRead!!
    }

private var _mailAllRead: ImageVector? = null
