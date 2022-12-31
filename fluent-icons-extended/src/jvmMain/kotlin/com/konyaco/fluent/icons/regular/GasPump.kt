

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = fluentIcon(name = "Regular.GasPump") {
            fluentPath {
                moveTo(7.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(8.5f, 10.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(6.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.0f, 5.75f)
                lineTo(4.0f, 20.5f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(17.0f, 20.5f)
                verticalLineToRelative(-1.8f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 4.0f, -2.44f)
                verticalLineToRelative(-5.84f)
                curveToRelative(0.0f, -0.6f, -0.2f, -1.18f, -0.55f, -1.65f)
                lineToRelative(-1.1f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.2f, 0.9f)
                lineToRelative(1.1f, 1.47f)
                curveToRelative(0.16f, 0.21f, 0.25f, 0.48f, 0.25f, 0.75f)
                verticalLineToRelative(5.83f)
                arcToRelative(1.24f, 1.24f, 0.0f, true, true, -2.49f, 0.0f)
                lineTo(17.01f, 14.5f)
                lineToRelative(-0.01f, -0.12f)
                lineTo(17.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 14.25f, 3.0f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(15.5f, 20.5f)
                horizontalLineToRelative(-10.0f)
                lineTo(5.5f, 5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.7f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                lineTo(15.5f, 20.5f)
                close()
            }
        }
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
