

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NotebookSectionArrowRight: ImageVector
    get() {
        if (_notebookSectionArrowRight != null) {
            return _notebookSectionArrowRight!!
        }
        _notebookSectionArrowRight = fluentIcon(name = "Filled.NotebookSectionArrowRight") {
            fluentPath {
                moveTo(15.65f, 2.0f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(8.33f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -5.0f, 8.92f)
                horizontalLineTo(9.25f)
                curveTo(8.01f, 20.0f, 7.0f, 18.99f, 7.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(7.0f, 5.01f, 8.0f, 4.0f, 9.25f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                close()
            }
            fluentPath {
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(14.5f, 17.0f)
                close()
            }
        }
        return _notebookSectionArrowRight!!
    }

private var _notebookSectionArrowRight: ImageVector? = null
