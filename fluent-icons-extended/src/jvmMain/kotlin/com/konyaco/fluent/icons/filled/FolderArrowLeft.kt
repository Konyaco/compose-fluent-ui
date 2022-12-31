

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FolderArrowLeft: ImageVector
    get() {
        if (_folderArrowLeft != null) {
            return _folderArrowLeft!!
        }
        _folderArrowLeft = fluentIcon(name = "Filled.FolderArrowLeft") {
            fluentPath {
                moveTo(21.98f, 8.44f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.23f, -1.94f)
                horizontalLineToRelative(-5.93f)
                lineTo(9.65f, 9.98f)
                lineToRelative(-0.16f, 0.12f)
                curveToRelative(-0.32f, 0.22f, -0.7f, 0.36f, -1.09f, 0.4f)
                lineTo(2.0f, 10.5f)
                verticalLineToRelative(7.4f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 4.26f, 20.0f)
                horizontalLineToRelative(7.77f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 22.0f, 11.8f)
                lineTo(22.0f, 8.61f)
                lineToRelative(-0.02f, -0.16f)
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
                moveTo(17.5f, 22.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, 11.0f)
                close()
                moveTo(20.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-4.8f)
                lineToRelative(1.65f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.7f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineTo(15.71f, 17.0f)
                horizontalLineToRelative(4.79f)
                close()
            }
        }
        return _folderArrowLeft!!
    }

private var _folderArrowLeft: ImageVector? = null
