

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailRead: ImageVector
    get() {
        if (_mailRead != null) {
            return _mailRead!!
        }
        _mailRead = fluentIcon(name = "Regular.MailRead") {
            fluentPath {
                moveToRelative(3.1f, 8.17f)
                lineToRelative(8.52f, -5.06f)
                curveToRelative(0.2f, -0.13f, 0.44f, -0.14f, 0.66f, -0.06f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(8.52f, 5.06f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 22.0f, 9.93f)
                verticalLineToRelative(7.82f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 21.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 17.75f)
                lineTo(2.0f, 10.1f)
                curveToRelative(0.0f, -0.73f, 0.36f, -1.42f, 0.96f, -1.84f)
                lineToRelative(0.14f, -0.1f)
                lineToRelative(8.52f, -5.05f)
                lineTo(3.1f, 8.17f)
                close()
                moveTo(20.5f, 10.91f)
                lineTo(12.35f, 15.16f)
                curveToRelative(-0.18f, 0.1f, -0.4f, 0.12f, -0.59f, 0.05f)
                lineToRelative(-0.1f, -0.05f)
                lineToRelative(-8.16f, -4.25f)
                verticalLineToRelative(6.84f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                verticalLineToRelative(-6.84f)
                close()
                moveTo(12.0f, 4.62f)
                lineTo(3.9f, 9.43f)
                lineToRelative(8.1f, 4.22f)
                lineToRelative(8.09f, -4.22f)
                lineTo(12.0f, 4.63f)
                close()
            }
        }
        return _mailRead!!
    }

private var _mailRead: ImageVector? = null
