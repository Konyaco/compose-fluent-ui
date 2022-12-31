

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Autocorrect: ImageVector
    get() {
        if (_autocorrect != null) {
            return _autocorrect!!
        }
        _autocorrect = fluentIcon(name = "Regular.Autocorrect") {
            fluentPath {
                moveTo(13.46f, 4.93f)
                curveToRelative(0.3f, 0.19f, 0.55f, 0.42f, 0.75f, 0.7f)
                lineToRelative(0.12f, 0.17f)
                lineToRelative(2.94f, 4.7f)
                horizontalLineToRelative(4.23f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-3.28f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, -3.46f, -1.5f)
                horizontalLineToRelative(0.75f)
                lineToRelative(-2.45f, -3.9f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.04f, -0.11f)
                lineToRelative(-0.08f, 0.11f)
                lineTo(3.4f, 18.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.33f, -0.7f)
                lineToRelative(0.05f, -0.1f)
                lineTo(9.67f, 5.8f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 3.8f, -0.87f)
                close()
                moveTo(14.75f, 12.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 0.0f, 6.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, -6.5f)
                close()
            }
        }
        return _autocorrect!!
    }

private var _autocorrect: ImageVector? = null
