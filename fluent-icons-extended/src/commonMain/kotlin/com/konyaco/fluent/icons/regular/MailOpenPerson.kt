

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailOpenPerson: ImageVector
    get() {
        if (_mailOpenPerson != null) {
            return _mailOpenPerson!!
        }
        _mailOpenPerson = fluentIcon(name = "Regular.MailOpenPerson") {
            fluentPath {
                moveTo(12.0f, 3.62f)
                lineTo(3.9f, 8.43f)
                lineToRelative(8.1f, 4.22f)
                lineToRelative(8.23f, -4.22f)
                lineTo(12.0f, 3.62f)
                close()
                moveTo(11.83f, 14.23f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.19f, -0.07f)
                lineTo(3.5f, 9.91f)
                verticalLineToRelative(6.84f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(8.06f)
                curveToRelative(-0.2f, 0.38f, -0.31f, 0.81f, -0.31f, 1.27f)
                verticalLineToRelative(0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 0.13f)
                lineTo(5.25f, 20.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                lineTo(2.0f, 9.1f)
                curveToRelative(0.0f, -0.73f, 0.36f, -1.42f, 0.96f, -1.84f)
                lineToRelative(0.14f, -0.1f)
                lineToRelative(8.5f, -5.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.78f, 0.0f)
                lineToRelative(9.0f, 5.26f)
                curveToRelative(0.85f, 0.5f, 0.82f, 1.74f, -0.06f, 2.19f)
                lineTo(18.52f, 11.0f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.85f, 1.47f)
                lineToRelative(-3.3f, 1.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.52f, 0.06f)
                close()
                moveTo(21.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(23.0f, 19.88f)
                curveToRelative(0.0f, 1.55f, -1.29f, 3.12f, -4.5f, 3.12f)
                reflectiveCurveTo(14.0f, 21.44f, 14.0f, 19.88f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.99f, 0.8f, -1.78f, 1.77f, -1.78f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _mailOpenPerson!!
    }

private var _mailOpenPerson: ImageVector? = null
