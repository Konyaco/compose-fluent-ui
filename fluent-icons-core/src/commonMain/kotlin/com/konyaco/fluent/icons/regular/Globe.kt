

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = fluentIcon(name = "Regular.Globe") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(14.94f, 16.5f)
                lineTo(9.06f, 16.5f)
                curveToRelative(0.65f, 2.41f, 1.79f, 4.0f, 2.94f, 4.0f)
                reflectiveCurveToRelative(2.29f, -1.59f, 2.94f, -4.0f)
                close()
                moveTo(7.51f, 16.5f)
                lineTo(4.79f, 16.5f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, false, 4.09f, 3.41f)
                curveToRelative(-0.52f, -0.82f, -0.95f, -1.85f, -1.27f, -3.02f)
                lineToRelative(-0.1f, -0.39f)
                close()
                moveTo(19.21f, 16.5f)
                lineTo(16.5f, 16.5f)
                curveToRelative(-0.32f, 1.33f, -0.79f, 2.5f, -1.37f, 3.41f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, false, 3.9f, -3.13f)
                lineToRelative(0.2f, -0.28f)
                close()
                moveTo(7.1f, 10.0f)
                lineTo(3.74f, 10.0f)
                verticalLineToRelative(0.02f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, false, 0.3f, 4.98f)
                horizontalLineToRelative(3.18f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, -0.13f, -5.0f)
                close()
                moveTo(15.4f, 10.0f)
                lineTo(8.6f, 10.0f)
                arcToRelative(18.97f, 18.97f, 0.0f, false, false, 0.14f, 5.0f)
                horizontalLineToRelative(6.52f)
                arcToRelative(18.5f, 18.5f, 0.0f, false, false, 0.14f, -5.0f)
                close()
                moveTo(20.27f, 10.0f)
                horizontalLineToRelative(-3.35f)
                arcToRelative(20.85f, 20.85f, 0.0f, false, true, -0.13f, 5.0f)
                horizontalLineToRelative(3.18f)
                arcToRelative(8.48f, 8.48f, 0.0f, false, false, 0.3f, -5.0f)
                close()
                moveTo(8.88f, 4.09f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, false, -4.61f, 4.4f)
                lineToRelative(3.05f, 0.01f)
                curveToRelative(0.31f, -1.75f, 0.86f, -3.28f, 1.58f, -4.41f)
                close()
                moveTo(12.0f, 3.49f)
                lineToRelative(-0.12f, 0.01f)
                curveToRelative(-1.26f, 0.12f, -2.48f, 2.12f, -3.05f, 5.0f)
                horizontalLineToRelative(6.34f)
                curveToRelative(-0.56f, -2.87f, -1.78f, -4.87f, -3.04f, -5.0f)
                lineTo(12.0f, 3.5f)
                close()
                moveTo(15.12f, 4.09f)
                lineToRelative(0.1f, 0.17f)
                arcTo(12.64f, 12.64f, 0.0f, false, true, 16.7f, 8.5f)
                horizontalLineToRelative(3.05f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, false, -4.34f, -4.29f)
                lineToRelative(-0.29f, -0.12f)
                close()
            }
        }
        return _globe!!
    }

private var _globe: ImageVector? = null
