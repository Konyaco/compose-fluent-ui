

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailLink: ImageVector
    get() {
        if (_mailLink != null) {
            return _mailLink!!
        }
        _mailLink = fluentIcon(name = "Filled.MailLink") {
            fluentPath {
                moveTo(23.0f, 6.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 19.25f, 3.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.15f, 4.5f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(0.2f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 23.0f, 6.74f)
                close()
                moveTo(16.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 0.2f, 7.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                horizontalLineToRelative(-0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.15f, -4.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(20.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(19.25f, 11.5f)
                horizontalLineToRelative(-2.77f)
                lineToRelative(-4.13f, 2.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.0f)
                lineTo(2.0f, 8.61f)
                verticalLineToRelative(8.32f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 20.0f)
                horizontalLineToRelative(13.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 22.0f, 16.74f)
                verticalLineToRelative(-6.13f)
                curveToRelative(-0.78f, 0.56f, -1.73f, 0.88f, -2.75f, 0.88f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(6.63f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, false, 2.05f, 7.14f)
                lineTo(12.0f, 12.15f)
                lineTo(2.02f, 6.92f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.04f, -2.91f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        return _mailLink!!
    }

private var _mailLink: ImageVector? = null
