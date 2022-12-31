

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WindowShield: ImageVector
    get() {
        if (_windowShield != null) {
            return _windowShield!!
        }
        _windowShield = fluentIcon(name = "Filled.WindowShield") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                horizontalLineToRelative(0.18f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 21.0f, 6.08f)
                verticalLineToRelative(6.54f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, true, -2.0f, -1.18f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(9.75f)
                curveToRelative(0.0f, 0.65f, 0.5f, 1.18f, 1.12f, 1.24f)
                lineToRelative(0.13f, 0.01f)
                horizontalLineToRelative(7.13f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, false, 1.15f, 2.0f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.93f)
                verticalLineTo(6.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(19.0f, 12.76f)
                arcToRelative(4.29f, 4.29f, 0.0f, false, false, 2.6f, 0.9f)
                curveToRelative(0.2f, 0.0f, 0.35f, 0.15f, 0.4f, 0.34f)
                verticalLineToRelative(2.58f)
                curveToRelative(0.0f, 2.69f, -1.31f, 4.51f, -3.87f, 5.4f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, -0.26f, 0.0f)
                arcTo(6.66f, 6.66f, 0.0f, false, true, 16.0f, 21.0f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, true, -1.56f, -2.0f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, -0.44f, -2.15f)
                verticalLineToRelative(-2.77f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.4f, -0.41f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.32f, -1.55f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.56f, 0.0f)
                curveToRelative(0.24f, 0.25f, 0.48f, 0.46f, 0.72f, 0.64f)
                close()
            }
        }
        return _windowShield!!
    }

private var _windowShield: ImageVector? = null
