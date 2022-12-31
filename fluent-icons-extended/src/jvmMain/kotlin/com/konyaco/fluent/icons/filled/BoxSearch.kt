

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
                lineToRelative(-2.2f, 0.9f)
                lineTo(18.0f, 7.12f)
                lineToRelative(3.37f, -1.3f)
                curveToRelative(-0.14f, -0.12f, -0.3f, -0.2f, -0.46f, -0.28f)
                lineToRelative(-7.5f, -3.04f)
                close()
                moveTo(22.0f, 7.2f)
                lineToRelative(-9.25f, 3.58f)
                verticalLineToRelative(1.7f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 22.0f, 16.45f)
                lineTo(22.0f, 7.2f)
                close()
                moveTo(11.25f, 14.87f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 3.28f)
                verticalLineToRelative(3.55f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.66f, -0.2f)
                lineToRelative(-7.5f, -3.04f)
                curveTo(2.43f, 18.18f, 2.0f, 17.54f, 2.0f, 16.83f)
                lineTo(2.0f, 7.19f)
                lineToRelative(9.25f, 3.58f)
                verticalLineToRelative(4.09f)
                close()
                moveTo(2.63f, 5.83f)
                lineTo(12.0f, 9.45f)
                lineToRelative(3.92f, -1.52f)
                lineToRelative(-9.55f, -3.7f)
                lineTo(3.1f, 5.54f)
                curveToRelative(-0.17f, 0.07f, -0.32f, 0.16f, -0.46f, 0.28f)
                close()
                moveTo(20.17f, 19.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.61f, 2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.61f, -2.61f)
                close()
                moveTo(19.5f, 16.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
            }
        }
        return _boxSearch!!
    }

private var _boxSearch: ImageVector? = null
