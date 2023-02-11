

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AutoFitWidth: ImageVector
    get() {
        if (_autoFitWidth != null) {
            return _autoFitWidth!!
        }
        _autoFitWidth = fluentIcon(name = "Filled.AutoFitWidth") {
            fluentPath {
                moveTo(3.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(19.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(21.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(13.79f, 13.8f)
                lineToRelative(-0.09f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.5f, 1.3f)
                lineToRelative(2.36f, -2.34f)
                curveToRelative(0.27f, -0.18f, 0.44f, -0.5f, 0.44f, -0.86f)
                reflectiveCurveToRelative(-0.17f, -0.68f, -0.44f, -0.86f)
                lineTo(15.2f, 8.78f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.3f, 0.1f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.09f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.1f, 1.3f)
                lineToRelative(0.79f, 0.8f)
                lineTo(9.4f, 11.0f)
                lineToRelative(0.8f, -0.8f)
                lineToRelative(0.1f, -0.11f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.19f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(-0.02f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.17f, 0.0f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.1f, 0.09f)
                lineToRelative(-2.36f, 2.35f)
                lineToRelative(-0.07f, 0.05f)
                curveToRelative(-0.23f, 0.2f, -0.37f, 0.49f, -0.37f, 0.81f)
                curveToRelative(0.0f, 0.36f, 0.17f, 0.68f, 0.44f, 0.86f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.4f)
                lineToRelative(-0.09f, -0.1f)
                lineToRelative(-0.8f, -0.8f)
                horizontalLineToRelative(5.18f)
                lineToRelative(-0.8f, 0.8f)
                close()
            }
        }
        return _autoFitWidth!!
    }

private var _autoFitWidth: ImageVector? = null
