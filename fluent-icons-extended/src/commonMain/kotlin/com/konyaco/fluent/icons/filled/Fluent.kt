

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Fluent: ImageVector
    get() {
        if (_fluent != null) {
            return _fluent!!
        }
        _fluent = fluentIcon(name = "Filled.Fluent") {
            fluentPath {
                moveTo(12.41f, 2.5f)
                horizontalLineToRelative(0.13f)
                lineToRelative(0.11f, 0.02f)
                lineToRelative(0.07f, 0.03f)
                lineToRelative(6.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.9f)
                lineTo(13.62f, 9.0f)
                lineToRelative(5.1f, 2.55f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.9f)
                lineToRelative(-5.76f, 2.84f)
                lineToRelative(0.04f, 5.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.75f, 0.44f)
                lineToRelative(-6.0f, -3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 17.5f)
                verticalLineTo(5.96f)
                lineToRelative(0.02f, -0.1f)
                lineToRelative(0.02f, -0.06f)
                lineToRelative(0.01f, -0.03f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.06f, -0.09f)
                lineToRelative(0.07f, -0.06f)
                lineToRelative(0.07f, -0.05f)
                lineToRelative(6.08f, -3.04f)
                lineToRelative(0.08f, -0.02f)
                close()
            }
        }
        return _fluent!!
    }

private var _fluent: ImageVector? = null
