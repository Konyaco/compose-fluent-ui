

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FolderMail: ImageVector
    get() {
        if (_folderMail != null) {
            return _folderMail!!
        }
        _folderMail = fluentIcon(name = "Filled.FolderMail") {
            fluentPath {
                moveTo(19.75f, 6.5f)
                horizontalLineToRelative(-5.93f)
                lineTo(9.65f, 9.98f)
                lineToRelative(-0.16f, 0.12f)
                curveToRelative(-0.32f, 0.22f, -0.7f, 0.36f, -1.09f, 0.4f)
                lineTo(2.0f, 10.5f)
                verticalLineToRelative(7.4f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 4.26f, 20.0f)
                lineTo(11.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.0f, 0.17f)
                lineTo(22.0f, 8.6f)
                lineToRelative(-0.02f, -0.16f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.23f, -1.94f)
                close()
                moveTo(9.49f, 4.4f)
                curveToRelative(-0.37f, -0.26f, -0.82f, -0.4f, -1.28f, -0.4f)
                lineTo(4.1f, 4.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 2.0f, 6.26f)
                lineTo(2.0f, 9.0f)
                lineTo(8.31f, 9.0f)
                curveToRelative(0.1f, -0.02f, 0.2f, -0.06f, 0.3f, -0.11f)
                lineToRelative(0.08f, -0.06f)
                lineToRelative(3.06f, -2.56f)
                lineToRelative(-2.1f, -1.75f)
                lineToRelative(-0.16f, -0.12f)
                close()
                moveTo(17.51f, 18.93f)
                lineToRelative(-5.5f, -3.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.97f)
                lineToRelative(-5.49f, 2.96f)
                close()
                moveTo(17.74f, 19.94f)
                lineTo(23.0f, 17.11f)
                lineTo(23.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.13f)
                lineToRelative(5.25f, 3.06f)
                curveToRelative(0.15f, 0.09f, 0.33f, 0.1f, 0.49f, 0.01f)
                close()
            }
        }
        return _folderMail!!
    }

private var _folderMail: ImageVector? = null
