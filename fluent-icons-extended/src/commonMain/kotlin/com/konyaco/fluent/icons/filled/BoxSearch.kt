

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BoxSearch: ImageVector
    get() {
        if (_boxSearch != null) {
            return _boxSearch!!
        }
        _boxSearch = fluentIcon(name = "Filled.BoxSearch") {
            fluentPath {
                moveTo(13.4f, 2.51f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -2.8f, 0.0f)
                lineToRelative(-2.2f, 0.89f)
                lineTo(18.0f, 7.13f)
                lineToRelative(3.37f, -1.3f)
                curveToRelative(-0.14f, -0.12f, -0.3f, -0.2f, -0.46f, -0.28f)
                lineToRelative(-7.5f, -3.04f)
                close()
                moveTo(22.0f, 7.2f)
                lineToRelative(-9.25f, 3.57f)
                lineTo(12.75f, 21.7f)
                curveToRelative(0.22f, -0.05f, 0.44f, -0.11f, 0.66f, -0.2f)
                lineToRelative(7.5f, -3.04f)
                curveToRelative(0.66f, -0.27f, 1.09f, -0.91f, 1.09f, -1.62f)
                lineTo(22.0f, 7.19f)
                close()
                moveTo(11.25f, 10.77f)
                verticalLineToRelative(10.01f)
                lineToRelative(-1.82f, -1.82f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 2.0f, 11.6f)
                lineTo(2.0f, 7.19f)
                lineToRelative(9.25f, 3.57f)
                close()
                moveTo(2.63f, 5.83f)
                lineTo(12.0f, 9.45f)
                lineToRelative(3.92f, -1.52f)
                lineToRelative(-9.55f, -3.7f)
                lineTo(3.1f, 5.54f)
                curveToRelative(-0.17f, 0.07f, -0.32f, 0.16f, -0.46f, 0.28f)
                close()
                moveTo(4.5f, 21.0f)
                curveToRelative(0.97f, 0.0f, 1.87f, -0.3f, 2.6f, -0.83f)
                lineToRelative(2.62f, 2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.61f, -2.61f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 4.5f, 21.0f)
                close()
                moveTo(4.5f, 19.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        return _boxSearch!!
    }

private var _boxSearch: ImageVector? = null
