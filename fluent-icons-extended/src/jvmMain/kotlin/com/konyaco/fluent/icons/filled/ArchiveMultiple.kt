

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArchiveMultiple: ImageVector
    get() {
        if (_archiveMultiple != null) {
            return _archiveMultiple!!
        }
        _archiveMultiple = fluentIcon(name = "Filled.ArchiveMultiple") {
            fluentPath {
                moveTo(4.75f, 2.0f)
                curveTo(3.78f, 2.0f, 3.0f, 2.78f, 3.0f, 3.75f)
                verticalLineToRelative(1.5f)
                curveTo(3.0f, 6.22f, 3.78f, 7.0f, 4.75f, 7.0f)
                horizontalLineToRelative(13.5f)
                curveTo(19.22f, 7.0f, 20.0f, 6.22f, 20.0f, 5.25f)
                verticalLineToRelative(-1.5f)
                curveTo(20.0f, 2.78f, 19.22f, 2.0f, 18.25f, 2.0f)
                lineTo(4.75f, 2.0f)
                close()
                moveTo(19.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(7.75f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 3.75f, 3.75f)
                horizontalLineToRelative(7.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 19.0f, 15.75f)
                lineTo(19.0f, 8.0f)
                close()
                moveTo(9.0f, 11.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(3.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(9.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(21.5f, 11.75f)
                curveToRelative(0.0f, -1.23f, -0.59f, -2.32f, -1.5f, -3.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 2.35f, -1.9f, 4.25f, -4.25f, 4.25f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(0.68f, 0.91f, 1.77f, 1.5f, 3.0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 5.75f, -5.75f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }
        return _archiveMultiple!!
    }

private var _archiveMultiple: ImageVector? = null
