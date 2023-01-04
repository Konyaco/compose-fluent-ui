

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailTemplate: ImageVector
    get() {
        if (_mailTemplate != null) {
            return _mailTemplate!!
        }
        _mailTemplate = fluentIcon(name = "Filled.MailTemplate") {
            fluentPath {
                moveTo(2.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.13f, 1.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(5.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(7.75f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(7.55f, 12.27f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.45f, 1.27f)
                lineToRelative(-6.95f, 4.35f)
                lineToRelative(-6.95f, -4.35f)
                close()
                moveTo(7.0f, 13.71f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-0.01f, -0.3f)
                lineToRelative(-7.1f, 4.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.79f, 0.0f)
                lineTo(7.01f, 13.7f)
                close()
            }
        }
        return _mailTemplate!!
    }

private var _mailTemplate: ImageVector? = null
