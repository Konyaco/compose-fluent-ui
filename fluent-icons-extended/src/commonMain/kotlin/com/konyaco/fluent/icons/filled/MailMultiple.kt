

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailMultiple: ImageVector
    get() {
        if (_mailMultiple != null) {
            return _mailMultiple!!
        }
        _mailMultiple = fluentIcon(name = "Filled.MailMultiple") {
            fluentPath {
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
                moveTo(20.0f, 8.11f)
                verticalLineToRelative(7.64f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 19.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 15.75f)
                lineTo(2.0f, 8.11f)
                lineToRelative(8.65f, 4.55f)
                curveToRelative(0.22f, 0.12f, 0.48f, 0.12f, 0.7f, 0.0f)
                lineTo(20.0f, 8.11f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.52f, 0.0f, 2.8f, 1.05f, 3.15f, 2.47f)
                lineTo(11.0f, 11.15f)
                lineTo(2.1f, 6.47f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 5.06f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        return _mailMultiple!!
    }

private var _mailMultiple: ImageVector? = null
