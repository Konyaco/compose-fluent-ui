

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = fluentIcon(name = "Filled.Certificate") {
            fluentPath {
                moveTo(15.0f, 18.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.57f, -0.6f, 0.92f, -1.09f, 0.67f)
                lineToRelative(-0.09f, -0.06f)
                lineTo(18.0f, 20.6f)
                lineToRelative(-1.82f, 1.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.17f, -0.5f)
                verticalLineToRelative(-0.11f)
                lineTo(15.0f, 18.0f)
                close()
                moveTo(19.25f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 5.6f)
                lineTo(22.0f, 11.0f)
                curveToRelative(-0.4f, -0.54f, -0.91f, -1.0f, -1.5f, -1.33f)
                lineTo(20.5f, 5.75f)
                curveToRelative(0.0f, -0.64f, -0.5f, -1.18f, -1.12f, -1.24f)
                lineTo(4.75f, 4.51f)
                curveToRelative(-0.65f, 0.0f, -1.18f, 0.49f, -1.24f, 1.12f)
                lineToRelative(-0.01f, 0.12f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.65f, 0.5f, 1.18f, 1.12f, 1.25f)
                horizontalLineToRelative(9.05f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.33f, 0.5f)
                verticalLineToRelative(1.0f)
                lineTo(4.75f, 18.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.74f, -2.58f)
                lineTo(2.0f, 15.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.58f, -2.74f)
                horizontalLineToRelative(14.67f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
                moveTo(11.25f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(4.6f)
                close()
                moveTo(17.25f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(6.75f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(10.6f)
                close()
            }
        }
        return _certificate!!
    }

private var _certificate: ImageVector? = null
