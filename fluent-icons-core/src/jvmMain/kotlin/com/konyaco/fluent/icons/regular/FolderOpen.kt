

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = fluentIcon(name = "Regular.FolderOpen") {
            fluentPath {
                moveTo(20.0f, 9.5f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-5.72f)
                lineTo(9.64f, 4.52f)
                curveToRelative(-0.4f, -0.34f, -0.9f, -0.52f, -1.43f, -0.52f)
                lineTo(4.25f, 4.0f)
                curveTo(3.01f, 4.0f, 2.0f, 5.0f, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                lineTo(18.47f, 20.0f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.55f, 1.7f, -1.33f)
                lineToRelative(1.75f, -7.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.7f, -2.17f)
                lineTo(20.0f, 9.5f)
                close()
                moveTo(4.25f, 5.5f)
                horizontalLineToRelative(3.96f)
                curveToRelative(0.17f, 0.0f, 0.34f, 0.06f, 0.48f, 0.17f)
                lineToRelative(2.58f, 2.16f)
                curveToRelative(0.14f, 0.1f, 0.3f, 0.17f, 0.48f, 0.17f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                lineTo(6.42f, 9.5f)
                curveToRelative(-1.03f, 0.0f, -1.93f, 0.7f, -2.18f, 1.7f)
                lineToRelative(-0.74f, 2.98f)
                lineTo(3.5f, 6.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(5.7f, 11.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.72f, -0.57f)
                horizontalLineToRelative(13.8f)
                curveToRelative(0.16f, 0.0f, 0.28f, 0.15f, 0.24f, 0.31f)
                lineToRelative(-1.75f, 7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.24f, 0.19f)
                lineTo(4.28f, 18.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.24f, -0.31f)
                lineToRelative(1.66f, -6.62f)
                close()
            }
        }
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
