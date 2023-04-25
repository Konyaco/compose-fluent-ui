

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MailEdit: ImageVector
    get() {
        if (_mailEdit != null) {
            return _mailEdit!!
        }
        _mailEdit = fluentIcon(name = "Filled.MailEdit") {
            fluentPath {
                moveTo(22.0f, 11.26f)
                lineTo(22.0f, 7.61f)
                lineToRelative(-9.65f, 5.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.0f)
                lineTo(2.0f, 7.61f)
                verticalLineToRelative(8.32f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 19.0f)
                horizontalLineToRelative(6.47f)
                curveToRelative(0.18f, -0.42f, 0.44f, -0.8f, 0.77f, -1.14f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, true, 3.61f, -0.7f)
                close()
                moveTo(18.75f, 3.0f)
                lineTo(5.06f, 3.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.04f, 2.92f)
                lineTo(12.0f, 11.15f)
                lineToRelative(9.98f, -5.23f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 18.75f, 3.0f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.2f, 18.57f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _mailEdit!!
    }

private var _mailEdit: ImageVector? = null
