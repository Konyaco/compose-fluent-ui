

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonCall: ImageVector
    get() {
        if (_personCall != null) {
            return _personCall!!
        }
        _personCall = fluentIcon(name = "Filled.PersonCall") {
            fluentPath {
                moveTo(5.25f, 14.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.1f, 0.17f, 0.22f, 0.33f, 0.37f, 0.47f)
                lineToRelative(0.72f, 0.69f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, true, -1.1f, 1.9f)
                lineToRelative(-0.8f, -0.27f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, -2.5f, 0.86f)
                lineToRelative(-0.73f, 1.06f)
                curveToRelative(-0.63f, 0.93f, -0.52f, 2.19f, 0.27f, 2.98f)
                lineToRelative(0.23f, 0.23f)
                curveToRelative(-0.54f, 0.05f, -1.11f, 0.08f, -1.71f, 0.08f)
                curveToRelative(-2.89f, 0.0f, -5.13f, -0.66f, -6.7f, -2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 3.0f, 17.16f)
                verticalLineToRelative(-0.91f)
                curveTo(3.0f, 15.01f, 4.01f, 14.0f, 5.25f, 14.0f)
                close()
                moveTo(17.01f, 12.25f)
                lineToRelative(0.5f, -1.2f)
                curveToRelative(0.24f, -0.55f, 0.8f, -0.85f, 1.36f, -0.74f)
                lineToRelative(0.12f, 0.04f)
                lineToRelative(0.63f, 0.2f)
                curveToRelative(0.62f, 0.2f, 1.1f, 0.73f, 1.26f, 1.4f)
                curveToRelative(0.36f, 1.6f, -0.08f, 3.55f, -1.33f, 5.84f)
                curveToRelative(-1.24f, 2.29f, -2.6f, 3.67f, -4.1f, 4.13f)
                curveToRelative(-0.57f, 0.18f, -1.2f, 0.05f, -1.66f, -0.34f)
                lineToRelative(-0.12f, -0.12f)
                lineToRelative(-0.48f, -0.48f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, true, -0.22f, -1.59f)
                lineToRelative(0.07f, -0.11f)
                lineToRelative(0.72f, -1.06f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 15.0f, 17.7f)
                lineToRelative(0.12f, 0.04f)
                lineToRelative(1.34f, 0.44f)
                arcToRelative(5.08f, 5.08f, 0.0f, false, false, 1.92f, -3.1f)
                lineToRelative(0.04f, -0.28f)
                lineToRelative(-1.1f, -1.05f)
                curveToRelative(-0.37f, -0.35f, -0.5f, -0.89f, -0.36f, -1.37f)
                lineToRelative(0.05f, -0.13f)
                lineToRelative(0.5f, -1.2f)
                lineToRelative(-0.5f, 1.2f)
                close()
                moveTo(11.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
            }
        }
        return _personCall!!
    }

private var _personCall: ImageVector? = null
