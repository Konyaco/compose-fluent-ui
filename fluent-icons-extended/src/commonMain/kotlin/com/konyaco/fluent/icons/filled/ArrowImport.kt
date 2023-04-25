

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowImport: ImageVector
    get() {
        if (_arrowImport != null) {
            return _arrowImport!!
        }
        _arrowImport = fluentIcon(name = "Filled.ArrowImport") {
            fluentPath {
                moveTo(21.25f, 4.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(20.5f, 5.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.21f, 6.39f)
                lineTo(12.29f, 6.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.32f)
                lineToRelative(-0.09f, 0.1f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.5f, -1.32f)
                lineToRelative(0.1f, -0.1f)
                lineTo(15.57f, 13.0f)
                lineTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                lineTo(2.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -1.0f)
                horizontalLineToRelative(12.7f)
                lineTo(12.3f, 7.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, -1.31f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(-0.08f, 0.1f)
                close()
            }
        }
        return _arrowImport!!
    }

private var _arrowImport: ImageVector? = null
