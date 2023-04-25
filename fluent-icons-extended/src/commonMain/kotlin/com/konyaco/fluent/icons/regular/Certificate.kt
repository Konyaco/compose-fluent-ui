

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = fluentIcon(name = "Regular.Certificate") {
            fluentPath {
                moveTo(2.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 3.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 5.75f)
                verticalLineToRelative(9.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.33f, -0.5f)
                horizontalLineToRelative(8.92f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(4.75f, 4.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(3.92f)
                curveToRelative(-0.59f, 0.34f, -1.1f, 0.8f, -1.5f, 1.33f)
                lineTo(2.0f, 5.75f)
                close()
                moveTo(6.75f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(6.75f, 7.0f)
                close()
                moveTo(12.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(6.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(9.0f, 18.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -6.0f, 0.0f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.57f, 0.6f, 0.92f, 1.09f, 0.67f)
                lineToRelative(0.09f, -0.06f)
                lineTo(6.0f, 20.6f)
                lineToRelative(1.82f, 1.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.17f, -0.5f)
                verticalLineToRelative(-0.11f)
                lineTo(9.0f, 18.0f)
                close()
            }
        }
        return _certificate!!
    }

private var _certificate: ImageVector? = null
