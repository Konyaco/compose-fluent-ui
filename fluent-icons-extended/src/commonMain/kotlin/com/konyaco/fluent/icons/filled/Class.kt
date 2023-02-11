

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Class: ImageVector
    get() {
        if (_class != null) {
            return _class!!
        }
        _class = fluentIcon(name = "Filled.Class") {
            fluentPath {
                moveTo(17.25f, 2.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.0f, 4.75f)
                verticalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 17.25f, 22.0f)
                lineTo(6.75f, 22.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.0f, 19.25f)
                lineTo(4.0f, 4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 6.75f, 2.0f)
                horizontalLineToRelative(0.3f)
                verticalLineToRelative(8.17f)
                curveToRelative(0.0f, 0.75f, 0.78f, 1.01f, 1.31f, 0.74f)
                lineToRelative(0.09f, -0.06f)
                lineToRelative(2.1f, -1.2f)
                lineToRelative(2.13f, 1.23f)
                curveToRelative(0.45f, 0.31f, 1.26f, 0.1f, 1.35f, -0.59f)
                lineToRelative(0.01f, -0.12f)
                lineTo(14.04f, 2.0f)
                horizontalLineToRelative(3.21f)
                close()
                moveTo(12.55f, 2.0f)
                verticalLineToRelative(7.08f)
                lineToRelative(-1.63f, -0.94f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -0.8f, 0.03f)
                lineToRelative(-0.1f, 0.06f)
                lineToRelative(-1.48f, 0.85f)
                lineTo(8.54f, 2.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        return _class!!
    }

private var _class: ImageVector? = null
