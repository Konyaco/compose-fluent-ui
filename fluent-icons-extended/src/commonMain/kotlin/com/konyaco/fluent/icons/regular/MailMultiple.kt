

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailMultiple: ImageVector
    get() {
        if (_mailMultiple != null) {
            return _mailMultiple!!
        }
        _mailMultiple = fluentIcon(name = "Regular.MailMultiple") {
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
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.24f, 3.07f)
                lineToRelative(0.01f, 0.18f)
                verticalLineToRelative(8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(5.25f, 19.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 15.75f)
                verticalLineToRelative(-8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(18.5f, 8.9f)
                lineToRelative(-7.15f, 3.76f)
                curveToRelative(-0.19f, 0.1f, -0.4f, 0.12f, -0.6f, 0.05f)
                lineToRelative(-0.1f, -0.05f)
                lineTo(3.5f, 8.9f)
                verticalLineToRelative(6.85f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                lineTo(18.5f, 8.9f)
                close()
                moveTo(16.75f, 5.5f)
                lineTo(5.25f, 5.5f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                verticalLineToRelative(0.1f)
                lineTo(11.0f, 11.16f)
                lineToRelative(7.5f, -3.95f)
                curveToRelative(-0.02f, -0.94f, -0.8f, -1.7f, -1.75f, -1.7f)
                close()
            }
        }
        return _mailMultiple!!
    }

private var _mailMultiple: ImageVector? = null
