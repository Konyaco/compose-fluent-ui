

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Iot: ImageVector
    get() {
        if (_iot != null) {
            return _iot!!
        }
        _iot = fluentIcon(name = "Filled.Iot") {
            fluentPath {
                moveTo(19.0f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.01f, 2.44f)
                lineTo(14.7f, 9.06f)
                curveTo(15.5f, 9.79f, 16.0f, 10.84f, 16.0f, 12.0f)
                verticalLineToRelative(0.05f)
                lineToRelative(1.3f, 0.27f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.28f, 1.47f)
                lineToRelative(-1.32f, -0.26f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, -1.75f, 1.96f)
                lineToRelative(0.5f, 1.51f)
                horizontalLineToRelative(0.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.47f, 0.48f)
                lineToRelative(-0.5f, -1.51f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, true, -3.75f, -1.6f)
                lineToRelative(-1.8f, 0.85f)
                lineToRelative(0.02f, 0.28f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.62f, -1.65f)
                lineToRelative(1.75f, -0.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.79f, -3.57f)
                lineToRelative(-1.0f, -1.13f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 4.59f, 1.38f)
                lineToRelative(0.98f, 1.12f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, 3.36f, -0.23f)
                lineToRelative(1.25f, -2.06f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.82f, -4.22f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 4.5f)
                close()
            }
        }
        return _iot!!
    }

private var _iot: ImageVector? = null
