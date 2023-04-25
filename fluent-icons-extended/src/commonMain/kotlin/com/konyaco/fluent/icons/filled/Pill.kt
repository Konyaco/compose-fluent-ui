

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = fluentIcon(name = "Filled.Pill") {
            fluentPath {
                moveTo(13.3f, 3.53f)
                arcToRelative(5.07f, 5.07f, 0.0f, true, true, 7.17f, 7.17f)
                lineToRelative(-9.77f, 9.77f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, true, -7.18f, -7.17f)
                lineToRelative(9.78f, -9.77f)
                close()
                moveTo(19.41f, 4.59f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -5.05f, 0.0f)
                lineTo(10.0f, 8.94f)
                lineTo(15.05f, 14.0f)
                lineToRelative(4.36f, -4.35f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 0.0f, -5.05f)
                close()
                moveTo(10.81f, 18.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(8.3f, 18.66f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.1f, 0.02f)
                lineToRelative(-0.02f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.04f, 1.08f)
                lineToRelative(0.02f, 0.02f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.2f, -0.04f)
                lineToRelative(1.44f, -1.44f)
                close()
            }
        }
        return _pill!!
    }

private var _pill: ImageVector? = null
