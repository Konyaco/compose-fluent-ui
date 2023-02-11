

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailRead: ImageVector
    get() {
        if (_mailRead != null) {
            return _mailRead!!
        }
        _mailRead = fluentIcon(name = "Filled.MailRead") {
            fluentPath {
                moveTo(2.0f, 10.13f)
                lineToRelative(9.65f, 5.03f)
                curveToRelative(0.22f, 0.12f, 0.48f, 0.12f, 0.7f, 0.0f)
                lineTo(22.0f, 10.13f)
                verticalLineToRelative(7.62f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 21.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 17.75f)
                verticalLineToRelative(-7.62f)
                close()
                moveTo(3.1f, 8.17f)
                lineToRelative(8.52f, -5.06f)
                curveToRelative(0.2f, -0.13f, 0.44f, -0.14f, 0.66f, -0.06f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(8.52f, 5.06f)
                curveToRelative(0.23f, 0.14f, 0.44f, 0.32f, 0.6f, 0.52f)
                lineTo(12.0f, 13.65f)
                lineTo(2.5f, 8.7f)
                curveToRelative(0.12f, -0.15f, 0.27f, -0.29f, 0.43f, -0.4f)
                lineToRelative(0.17f, -0.12f)
                lineToRelative(8.52f, -5.06f)
                lineTo(3.1f, 8.17f)
                close()
            }
        }
        return _mailRead!!
    }

private var _mailRead: ImageVector? = null
