

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailError: ImageVector
    get() {
        if (_mailError != null) {
            return _mailError!!
        }
        _mailError = fluentIcon(name = "Filled.MailError") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(17.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(17.5f, 10.13f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, false, 0.0f, -1.25f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.0f, 1.24f)
                close()
                moveTo(17.5f, 13.0f)
                curveToRelative(1.75f, 0.0f, 3.33f, -0.69f, 4.5f, -1.81f)
                verticalLineToRelative(5.56f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 20.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                lineTo(2.0f, 8.61f)
                lineToRelative(9.65f, 5.05f)
                curveToRelative(0.22f, 0.12f, 0.48f, 0.12f, 0.7f, 0.0f)
                lineToRelative(2.41f, -1.26f)
                curveToRelative(0.84f, 0.38f, 1.76f, 0.6f, 2.74f, 0.6f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(6.25f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, 1.8f, 7.47f)
                lineToRelative(-1.3f, 0.68f)
                lineToRelative(-9.98f, -5.23f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.04f, -2.91f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        return _mailError!!
    }

private var _mailError: ImageVector? = null
