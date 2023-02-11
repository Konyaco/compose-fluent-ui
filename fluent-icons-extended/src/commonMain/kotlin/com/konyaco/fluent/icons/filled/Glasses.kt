

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = fluentIcon(name = "Filled.Glasses") {
            fluentPath {
                moveTo(7.9f, 5.0f)
                horizontalLineToRelative(0.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.48f, 0.17f)
                lineToRelative(-0.07f, 0.07f)
                lineTo(5.28f, 9.0f)
                horizontalLineToRelative(3.47f)
                curveToRelative(1.16f, 0.0f, 2.11f, 0.88f, 2.24f, 2.0f)
                horizontalLineTo(13.0f)
                curveToRelative(0.13f, -1.12f, 1.08f, -2.0f, 2.24f, -2.0f)
                horizontalLineToRelative(3.48f)
                lineToRelative(-2.09f, -2.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.44f, -0.23f)
                lineToRelative(-0.1f, -0.01f)
                horizontalLineToRelative(-0.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(0.94f)
                curveToRelative(0.57f, 0.0f, 1.11f, 0.21f, 1.52f, 0.6f)
                lineToRelative(0.14f, 0.12f)
                lineToRelative(3.64f, 3.95f)
                lineToRelative(0.12f, 0.18f)
                curveToRelative(0.3f, 0.38f, 0.49f, 0.87f, 0.49f, 1.4f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-2.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 13.0f, 14.75f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.25f)
                curveTo(11.0f, 16.55f, 9.54f, 18.0f, 7.75f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.56f, 0.2f, -1.08f, 0.55f, -1.47f)
                lineToRelative(0.03f, -0.06f)
                lineToRelative(0.05f, -0.05f)
                lineToRelative(3.62f, -3.94f)
                curveToRelative(0.39f, -0.42f, 0.91f, -0.68f, 1.47f, -0.72f)
                lineTo(7.91f, 5.0f)
                horizontalLineToRelative(0.84f)
                horizontalLineToRelative(-0.84f)
                close()
            }
        }
        return _glasses!!
    }

private var _glasses: ImageVector? = null
