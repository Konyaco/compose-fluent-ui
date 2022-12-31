

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArchiveArrowBack: ImageVector
    get() {
        if (_archiveArrowBack != null) {
            return _archiveArrowBack!!
        }
        _archiveArrowBack = fluentIcon(name = "Filled.ArchiveArrowBack") {
            fluentPath {
                moveTo(3.0f, 4.5f)
                curveTo(3.0f, 3.67f, 3.67f, 3.0f, 4.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(21.0f, 6.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 6.0f)
                lineTo(3.0f, 4.5f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -5.5f, 0.23f)
                curveToRelative(-0.01f, -0.4f, -0.34f, -0.73f, -0.75f, -0.73f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.1f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, -1.33f, 8.5f)
                lineTo(7.75f, 21.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 4.0f, 17.25f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(16.35f, 15.35f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.7f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineToRelative(-0.64f, -0.65f)
                horizontalLineToRelative(2.04f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(0.64f, -0.65f)
                close()
            }
        }
        return _archiveArrowBack!!
    }

private var _archiveArrowBack: ImageVector? = null
