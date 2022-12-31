

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Options: ImageVector
    get() {
        if (_options != null) {
            return _options!!
        }
        _options = fluentIcon(name = "Filled.Options") {
            fluentPath {
                moveTo(8.75f, 13.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.16f, 2.5f)
                horizontalLineToRelative(9.34f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-9.44f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.32f, 0.0f)
                lineTo(2.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(2.94f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.16f, -2.5f)
                close()
                moveTo(15.25f, 4.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.16f, 2.5f)
                horizontalLineToRelative(2.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-2.94f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.32f, 0.0f)
                lineTo(2.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(9.44f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 15.25f, 4.0f)
                close()
            }
        }
        return _options!!
    }

private var _options: ImageVector? = null
