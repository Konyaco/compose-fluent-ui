

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AccessTime: ImageVector
    get() {
        if (_accessTime != null) {
            return _accessTime!!
        }
        _accessTime = fluentIcon(name = "Filled.AccessTime") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(7.5f, 8.74f)
                arcTo(2.3f, 2.3f, 0.0f, false, true, 9.25f, 8.0f)
                curveToRelative(1.15f, 0.0f, 1.9f, 0.8f, 2.15f, 1.66f)
                curveToRelative(0.26f, 0.85f, 0.1f, 1.9f, -0.62f, 2.62f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -0.79f, 0.67f)
                lineToRelative(-0.04f, 0.03f)
                curveToRelative(-0.28f, 0.22f, -0.53f, 0.41f, -0.75f, 0.63f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.58f, 0.89f)
                horizontalLineToRelative(2.13f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                curveToRelative(0.0f, -1.25f, 0.52f, -2.08f, 1.14f, -2.7f)
                curveToRelative(0.3f, -0.3f, 0.62f, -0.55f, 0.9f, -0.76f)
                curveToRelative(0.28f, -0.22f, 0.5f, -0.4f, 0.68f, -0.57f)
                curveToRelative(0.27f, -0.27f, 0.37f, -0.72f, 0.25f, -1.13f)
                curveToRelative(-0.12f, -0.38f, -0.37f, -0.59f, -0.72f, -0.59f)
                reflectiveCurveToRelative(-0.53f, 0.14f, -0.64f, 0.25f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.15f, 0.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.43f, -0.46f)
                lineToRelative(0.04f, -0.1f)
                lineToRelative(0.08f, -0.17f)
                curveToRelative(0.07f, -0.14f, 0.18f, -0.32f, 0.35f, -0.5f)
                close()
                moveTo(13.25f, 8.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(6.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _accessTime!!
    }

private var _accessTime: ImageVector? = null
