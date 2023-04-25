

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudFlow: ImageVector
    get() {
        if (_cloudFlow != null) {
            return _cloudFlow!!
        }
        _cloudFlow = fluentIcon(name = "Filled.CloudFlow") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.92f, 5.02f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 6.5f, 16.0f)
                horizontalLineToRelative(6.68f)
                lineToRelative(0.13f, -0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.49f, -2.22f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 6.15f, -1.13f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.03f, -5.13f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(19.25f, 13.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(16.22f, 15.75f)
                horizontalLineToRelative(0.47f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -0.14f, -1.5f)
                horizontalLineToRelative(-0.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.94f, 1.5f)
                lineToRelative(-1.01f, 3.88f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.49f, 0.37f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -0.28f, 1.5f)
                horizontalLineToRelative(1.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.94f, -1.5f)
                lineToRelative(1.01f, -3.88f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.49f, -0.37f)
                close()
                moveTo(8.0f, 20.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
            }
        }
        return _cloudFlow!!
    }

private var _cloudFlow: ImageVector? = null
