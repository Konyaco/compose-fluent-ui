

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailList: ImageVector
    get() {
        if (_mailList != null) {
            return _mailList!!
        }
        _mailList = fluentIcon(name = "Filled.MailList") {
            fluentPath {
                moveTo(20.3f, 9.5f)
                horizontalLineToRelative(0.95f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.06f, 0.75f, -0.17f)
                verticalLineToRelative(7.42f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 20.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                lineTo(2.0f, 8.61f)
                lineToRelative(9.65f, 5.05f)
                curveToRelative(0.22f, 0.12f, 0.48f, 0.12f, 0.7f, 0.0f)
                lineTo(20.3f, 9.5f)
                close()
                moveTo(12.53f, 4.0f)
                lineTo(5.06f, 4.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.04f, 2.92f)
                lineTo(12.0f, 12.15f)
                lineToRelative(5.07f, -2.65f)
                horizontalLineToRelative(-3.32f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.22f, -3.0f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(21.25f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(21.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-7.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, -1.5f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(13.0f, 7.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _mailList!!
    }

private var _mailList: ImageVector? = null
