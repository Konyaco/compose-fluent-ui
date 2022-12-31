

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = fluentIcon(name = "Filled.FolderOpen") {
            fluentPath {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.0f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineToRelative(3.96f)
                curveToRelative(0.52f, 0.0f, 1.03f, 0.18f, 1.43f, 0.52f)
                lineToRelative(2.39f, 1.98f)
                horizontalLineToRelative(5.72f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(0.75f)
                lineTo(6.42f, 9.5f)
                curveToRelative(-1.03f, 0.0f, -1.93f, 0.7f, -2.18f, 1.7f)
                lineToRelative(-1.92f, 7.7f)
                curveToRelative(0.04f, -0.16f, 0.0f, 0.01f, 0.0f, 0.0f)
                curveToRelative(-0.2f, -0.33f, -0.32f, -0.73f, -0.32f, -1.15f)
                lineTo(2.0f, 6.25f)
                close()
                moveTo(3.74f, 19.38f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.49f, 0.62f)
                horizontalLineToRelative(14.24f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.55f, 1.7f, -1.33f)
                lineToRelative(1.76f, -7.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.48f, -0.62f)
                lineTo(6.42f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.73f, 0.57f)
                lineToRelative(-1.95f, 7.8f)
                close()
            }
        }
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
