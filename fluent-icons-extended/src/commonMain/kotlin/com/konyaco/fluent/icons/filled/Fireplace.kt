

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = fluentIcon(name = "Filled.Fireplace") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(21.0f, 11.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                close()
                moveTo(4.5f, 11.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 15.0f, 0.0f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-4.3f)
                arcToRelative(4.16f, 4.16f, 0.0f, false, false, 1.3f, -3.01f)
                curveToRelative(0.0f, -1.73f, -0.87f, -2.78f, -1.6f, -3.66f)
                lineToRelative(-0.07f, -0.09f)
                curveToRelative(-0.74f, -0.9f, -1.33f, -1.65f, -1.33f, -2.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.95f, -0.72f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.74f, 1.55f)
                curveToRelative(-0.23f, 0.57f, -0.29f, 1.2f, -0.33f, 1.66f)
                verticalLineToRelative(0.13f)
                lineToRelative(-0.07f, 0.5f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -0.53f, -0.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.89f, 0.1f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.02f, 0.02f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, false, -0.23f, 0.25f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -1.23f, 3.5f)
                curveToRelative(0.0f, 1.19f, 0.49f, 2.25f, 1.3f, 3.02f)
                lineTo(4.5f, 16.5f)
                lineTo(4.5f, 11.0f)
                close()
                moveTo(2.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 19.5f)
                close()
            }
        }
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
