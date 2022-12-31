

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailCopy: ImageVector
    get() {
        if (_mailCopy != null) {
            return _mailCopy!!
        }
        _mailCopy = fluentIcon(name = "Regular.MailCopy") {
            fluentPath {
                moveTo(3.0f, 7.51f)
                curveToRelative(-0.9f, 0.58f, -1.5f, 1.59f, -1.5f, 2.74f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.9f, 2.35f, 5.25f, 5.25f, 5.25f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.15f, 0.0f, 2.16f, -0.6f, 2.74f, -1.5f)
                lineTo(6.75f, 20.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 3.0f, 16.25f)
                lineTo(3.0f, 7.51f)
                close()
                moveTo(18.75f, 4.0f)
                lineTo(7.25f, 4.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.24f, 3.07f)
                lineTo(4.0f, 7.25f)
                verticalLineToRelative(8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.07f, 3.24f)
                lineToRelative(0.18f, 0.01f)
                horizontalLineToRelative(11.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.24f, -3.07f)
                lineToRelative(0.01f, -0.18f)
                verticalLineToRelative(-8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.07f, -3.24f)
                lineTo(18.75f, 4.0f)
                close()
                moveTo(5.5f, 8.9f)
                lineToRelative(7.15f, 3.76f)
                curveToRelative(0.19f, 0.1f, 0.4f, 0.12f, 0.6f, 0.05f)
                lineToRelative(0.1f, -0.05f)
                lineTo(20.5f, 8.9f)
                verticalLineToRelative(6.85f)
                curveToRelative(0.0f, 0.92f, -0.7f, 1.67f, -1.6f, 1.74f)
                lineToRelative(-0.15f, 0.01f)
                lineTo(7.25f, 17.5f)
                curveToRelative(-0.92f, 0.0f, -1.67f, -0.7f, -1.74f, -1.6f)
                lineToRelative(-0.01f, -0.15f)
                lineTo(5.5f, 8.9f)
                close()
                moveTo(7.25f, 5.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, 0.7f, 1.74f, 1.6f)
                verticalLineToRelative(0.1f)
                lineTo(13.0f, 11.16f)
                lineTo(5.5f, 7.2f)
                curveToRelative(0.02f, -0.94f, 0.8f, -1.7f, 1.75f, -1.7f)
                close()
            }
        }
        return _mailCopy!!
    }

private var _mailCopy: ImageVector? = null
