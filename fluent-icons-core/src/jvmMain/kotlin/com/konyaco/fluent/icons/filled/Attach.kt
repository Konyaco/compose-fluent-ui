

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Attach: ImageVector
    get() {
        if (_attach != null) {
            return _attach!!
        }
        _attach = fluentIcon(name = "Filled.Attach") {
            fluentPath {
                moveTo(16.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.4f, 10.08f)
                lineToRelative(-0.2f, 0.2f)
                lineTo(11.49f, 21.0f)
                lineToRelative(-0.05f, 0.04f)
                lineToRelative(-0.06f, 0.05f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, true, -6.15f, -2.82f)
                curveToRelative(0.0f, -0.9f, 0.33f, -1.76f, 0.9f, -2.42f)
                lineToRelative(0.15f, -0.17f)
                horizontalLineToRelative(0.01f)
                lineToRelative(7.3f, -7.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.41f)
                lineTo(7.7f, 17.1f)
                lineToRelative(-0.01f, 0.01f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 2.29f, 2.55f)
                lineToRelative(0.12f, -0.1f)
                lineToRelative(8.7f, -8.7f)
                lineToRelative(0.16f, -0.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.75f, -5.55f)
                lineToRelative(-0.16f, 0.16f)
                lineToRelative(-0.02f, 0.01f)
                lineToRelative(-9.32f, 9.33f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.41f)
                lineTo(11.6f, 3.9f)
                lineToRelative(0.05f, -0.04f)
                arcTo(5.98f, 5.98f, 0.0f, false, true, 16.0f, 2.0f)
                close()
            }
        }
        return _attach!!
    }

private var _attach: ImageVector? = null
