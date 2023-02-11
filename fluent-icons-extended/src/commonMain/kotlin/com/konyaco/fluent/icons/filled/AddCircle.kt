

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AddCircle: ImageVector
    get() {
        if (_addCircle != null) {
            return _addCircle!!
        }
        _addCircle = fluentIcon(name = "Filled.AddCircle") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.1f)
                verticalLineToRelative(-3.6f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                horizontalLineToRelative(-3.6f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 12.0f, 7.0f)
                close()
            }
        }
        return _addCircle!!
    }

private var _addCircle: ImageVector? = null
