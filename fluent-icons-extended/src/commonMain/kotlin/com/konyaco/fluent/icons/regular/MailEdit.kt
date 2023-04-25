

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MailEdit: ImageVector
    get() {
        if (_mailEdit != null) {
            return _mailEdit!!
        }
        _mailEdit = fluentIcon(name = "Regular.MailEdit") {
            fluentPath {
                moveTo(18.75f, 3.0f)
                lineTo(5.07f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 6.26f)
                verticalLineToRelative(9.68f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.26f, 19.0f)
                horizontalLineToRelative(6.47f)
                curveToRelative(0.18f, -0.42f, 0.44f, -0.8f, 0.77f, -1.14f)
                lineToRelative(0.37f, -0.36f)
                lineTo(5.1f, 17.5f)
                curveToRelative(-0.9f, -0.08f, -1.61f, -0.83f, -1.61f, -1.75f)
                lineTo(3.49f, 8.37f)
                lineToRelative(8.15f, 4.3f)
                lineToRelative(0.1f, 0.04f)
                curveToRelative(0.2f, 0.07f, 0.41f, 0.05f, 0.6f, -0.05f)
                lineToRelative(8.15f, -4.29f)
                verticalLineToRelative(2.64f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.5f, 0.25f)
                lineTo(21.99f, 6.07f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 18.74f, 3.0f)
                close()
                moveTo(5.25f, 4.5f)
                horizontalLineToRelative(13.64f)
                curveToRelative(0.9f, 0.08f, 1.61f, 0.83f, 1.61f, 1.75f)
                verticalLineToRelative(0.43f)
                lineTo(12.0f, 11.15f)
                lineTo(3.5f, 6.68f)
                lineTo(3.5f, 6.1f)
                curveToRelative(0.08f, -0.9f, 0.83f, -1.61f, 1.75f, -1.61f)
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
