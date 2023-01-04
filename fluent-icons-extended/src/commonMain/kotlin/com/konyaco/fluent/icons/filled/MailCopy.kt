

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailCopy: ImageVector
    get() {
        if (_mailCopy != null) {
            return _mailCopy!!
        }
        _mailCopy = fluentIcon(name = "Filled.MailCopy") {
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
                moveTo(4.0f, 8.11f)
                verticalLineToRelative(7.64f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.07f, 3.24f)
                lineToRelative(0.18f, 0.01f)
                horizontalLineToRelative(11.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.24f, -3.07f)
                lineToRelative(0.01f, -0.18f)
                lineTo(22.0f, 8.11f)
                lineToRelative(-8.65f, 4.55f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.0f)
                lineTo(4.0f, 8.11f)
                close()
                moveTo(18.75f, 4.0f)
                lineTo(7.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 4.1f, 6.47f)
                lineToRelative(8.9f, 4.68f)
                lineToRelative(8.9f, -4.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 18.94f, 4.0f)
                lineTo(18.75f, 4.0f)
                close()
            }
        }
        return _mailCopy!!
    }

private var _mailCopy: ImageVector? = null
