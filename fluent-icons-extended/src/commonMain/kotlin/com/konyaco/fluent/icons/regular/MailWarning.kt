

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailWarning: ImageVector
    get() {
        if (_mailWarning != null) {
            return _mailWarning!!
        }
        _mailWarning = fluentIcon(name = "Regular.MailWarning") {
            fluentPath {
                moveToRelative(16.16f, 1.83f)
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
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(8.7f)
                lineToRelative(-0.74f, 1.5f)
                lineTo(5.25f, 5.5f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                lineToRelative(-0.01f, 0.15f)
                verticalLineToRelative(0.43f)
                lineToRelative(7.9f, 4.15f)
                curveToRelative(0.43f, 0.69f, 1.19f, 1.17f, 2.1f, 1.17f)
                horizontalLineToRelative(0.11f)
                lineToRelative(-1.26f, 0.66f)
                curveToRelative(-0.19f, 0.1f, -0.4f, 0.12f, -0.6f, 0.05f)
                lineToRelative(-0.1f, -0.05f)
                lineTo(3.5f, 9.37f)
                verticalLineToRelative(7.38f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                lineTo(20.5f, 13.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.17f, 0.0f, 0.34f, -0.02f, 0.5f, -0.05f)
                verticalLineToRelative(3.8f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 20.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        return _mailWarning!!
    }

private var _mailWarning: ImageVector? = null
