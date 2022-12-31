

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailWarning: ImageVector
    get() {
        if (_mailWarning != null) {
            return _mailWarning!!
        }
        _mailWarning = fluentIcon(name = "Filled.MailWarning") {
            fluentPath {
                moveTo(16.16f, 1.83f)
                lineToRelative(-4.0f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.51f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.33f, -2.17f)
                lineToRelative(-4.0f, -8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.68f, 0.0f)
                close()
                moveTo(18.0f, 4.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(17.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                close()
                moveTo(21.5f, 13.0f)
                horizontalLineToRelative(-7.88f)
                lineToRelative(-1.27f, 0.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.0f)
                lineTo(2.0f, 8.61f)
                verticalLineToRelative(8.32f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 20.0f)
                horizontalLineToRelative(13.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 22.0f, 16.74f)
                verticalLineToRelative(-3.8f)
                curveToRelative(-0.16f, 0.03f, -0.33f, 0.05f, -0.5f, 0.05f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(8.7f)
                lineToRelative(-2.68f, 5.38f)
                curveToRelative(-0.42f, 0.84f, -0.32f, 1.76f, 0.12f, 2.46f)
                lineTo(2.02f, 6.92f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.04f, -2.91f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        return _mailWarning!!
    }

private var _mailWarning: ImageVector? = null
