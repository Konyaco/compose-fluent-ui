

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = fluentIcon(name = "Regular.Map") {
            fluentPath {
                moveTo(9.2f, 4.0f)
                horizontalLineToRelative(0.16f)
                lineToRelative(0.02f, 0.01f)
                curveToRelative(0.09f, 0.01f, 0.17f, 0.04f, 0.25f, 0.1f)
                lineToRelative(0.05f, 0.03f)
                lineToRelative(5.07f, 3.56f)
                lineToRelative(5.07f, -3.56f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.17f, 0.5f)
                lineToRelative(0.01f, 0.11f)
                lineTo(21.0f, 15.4f)
                curveToRelative(0.0f, 0.2f, -0.09f, 0.4f, -0.24f, 0.54f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-5.5f, 3.87f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.83f, 0.02f)
                lineToRelative(-5.1f, -3.6f)
                lineToRelative(-5.07f, 3.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.17f, -0.5f)
                lineTo(3.0f, 19.24f)
                lineTo(3.0f, 8.62f)
                curveToRelative(0.0f, -0.21f, 0.09f, -0.41f, 0.24f, -0.55f)
                lineTo(3.32f, 8.0f)
                lineToRelative(5.5f, -3.86f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.2f, -0.1f)
                lineTo(9.14f, 4.0f)
                lineTo(9.2f, 4.0f)
                close()
                moveTo(19.5f, 6.2f)
                lineTo(15.5f, 9.0f)
                verticalLineToRelative(8.8f)
                lineToRelative(4.0f, -2.8f)
                lineTo(19.5f, 6.2f)
                close()
                moveTo(8.5f, 6.2f)
                lineTo(4.5f, 9.0f)
                verticalLineToRelative(8.8f)
                lineToRelative(4.0f, -2.8f)
                lineTo(8.5f, 6.2f)
                close()
                moveTo(10.0f, 6.2f)
                lineTo(10.0f, 15.0f)
                lineToRelative(4.0f, 2.8f)
                lineTo(14.0f, 9.0f)
                lineToRelative(-4.0f, -2.8f)
                close()
            }
        }
        return _map!!
    }

private var _map: ImageVector? = null
