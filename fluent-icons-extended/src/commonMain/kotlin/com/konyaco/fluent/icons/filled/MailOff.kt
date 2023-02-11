

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailOff: ImageVector
    get() {
        if (_mailOff != null) {
            return _mailOff!!
        }
        _mailOff = fluentIcon(name = "Filled.MailOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(-0.8f, 0.52f, -1.35f, 1.4f, -1.45f, 2.4f)
                lineToRelative(8.07f, 4.23f)
                lineToRelative(2.43f, 2.42f)
                lineToRelative(-0.17f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.0f)
                lineTo(2.0f, 8.61f)
                verticalLineToRelative(8.32f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 20.0f)
                horizontalLineToRelative(13.68f)
                lineToRelative(1.79f, 1.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.3f, 12.12f)
                lineToRelative(6.26f, 6.26f)
                curveToRelative(0.28f, -0.48f, 0.44f, -1.04f, 0.44f, -1.63f)
                lineTo(22.0f, 8.61f)
                lineToRelative(-6.7f, 3.5f)
                close()
                moveTo(7.18f, 4.0f)
                lineToRelative(7.0f, 7.0f)
                lineToRelative(7.8f, -4.08f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 18.75f, 4.0f)
                lineTo(7.18f, 4.0f)
                close()
            }
        }
        return _mailOff!!
    }

private var _mailOff: ImageVector? = null
