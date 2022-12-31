

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FolderArrowUp: ImageVector
    get() {
        if (_folderArrowUp != null) {
            return _folderArrowUp!!
        }
        _folderArrowUp = fluentIcon(name = "Filled.FolderArrowUp") {
            fluentPath {
                moveTo(19.75f, 6.5f)
                curveToRelative(1.14f, 0.0f, 2.08f, 0.84f, 2.23f, 1.94f)
                lineToRelative(0.01f, 0.16f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(3.06f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.98f, 8.2f)
                lineTo(4.25f, 20.0f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.93f, -2.24f, -2.1f)
                lineTo(2.0f, 17.75f)
                lineTo(2.0f, 10.5f)
                horizontalLineToRelative(6.4f)
                curveToRelative(0.4f, -0.04f, 0.77f, -0.18f, 1.1f, -0.4f)
                lineToRelative(0.15f, -0.12f)
                lineToRelative(4.17f, -3.48f)
                horizontalLineToRelative(5.93f)
                close()
                moveTo(8.21f, 4.0f)
                curveToRelative(0.46f, 0.0f, 0.9f, 0.14f, 1.28f, 0.4f)
                lineToRelative(0.16f, 0.12f)
                lineToRelative(2.1f, 1.75f)
                lineToRelative(-3.06f, 2.56f)
                lineToRelative(-0.09f, 0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.29f, 0.1f)
                lineToRelative(-0.1f, 0.01f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 6.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(4.25f, 4.0f)
                horizontalLineToRelative(3.96f)
                close()
                moveTo(23.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(17.0f, 14.7f)
                verticalLineToRelative(4.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-4.8f)
                lineToRelative(1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineTo(17.0f, 14.71f)
                close()
            }
        }
        return _folderArrowUp!!
    }

private var _folderArrowUp: ImageVector? = null
