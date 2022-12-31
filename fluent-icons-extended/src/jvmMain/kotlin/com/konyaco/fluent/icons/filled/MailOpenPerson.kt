

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailOpenPerson: ImageVector
    get() {
        if (_mailOpenPerson != null) {
            return _mailOpenPerson!!
        }
        _mailOpenPerson = fluentIcon(name = "Filled.MailOpenPerson") {
            fluentPath {
                moveTo(11.65f, 14.16f)
                lineTo(2.0f, 9.13f)
                verticalLineToRelative(7.8f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 20.0f)
                lineTo(13.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -0.13f)
                verticalLineToRelative(-0.1f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 15.77f, 17.0f)
                horizontalLineToRelative(0.28f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, -0.37f, -4.57f)
                lineToRelative(-3.33f, 1.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.0f)
                close()
                moveTo(11.62f, 2.11f)
                lineTo(3.1f, 7.17f)
                lineToRelative(-0.17f, 0.11f)
                curveToRelative(-0.16f, 0.12f, -0.31f, 0.26f, -0.43f, 0.41f)
                lineToRelative(9.5f, 4.96f)
                lineToRelative(9.5f, -4.96f)
                curveToRelative(-0.16f, -0.2f, -0.36f, -0.38f, -0.6f, -0.52f)
                lineTo(12.38f, 2.1f)
                lineToRelative(-0.1f, -0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.66f, 0.06f)
                close()
                moveTo(21.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(23.0f, 19.88f)
                curveToRelative(0.0f, 1.55f, -1.29f, 3.12f, -4.5f, 3.12f)
                reflectiveCurveTo(14.0f, 21.44f, 14.0f, 19.87f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.98f, 0.8f, -1.77f, 1.77f, -1.77f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _mailOpenPerson!!
    }

private var _mailOpenPerson: ImageVector? = null
