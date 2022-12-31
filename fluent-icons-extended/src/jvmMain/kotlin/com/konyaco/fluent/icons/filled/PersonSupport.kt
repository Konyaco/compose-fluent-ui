

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonSupport: ImageVector
    get() {
        if (_personSupport != null) {
            return _personSupport!!
        }
        _personSupport = fluentIcon(name = "Filled.PersonSupport") {
            fluentPath {
                moveTo(20.0f, 16.25f)
                curveTo(20.0f, 15.0f, 19.0f, 14.0f, 17.75f, 14.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(6.05f, 20.92f, 8.58f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.94f, -1.07f, 7.49f, -3.24f)
                curveToRelative(0.33f, -0.46f, 0.51f, -1.02f, 0.51f, -1.6f)
                verticalLineToRelative(-0.91f)
                close()
                moveTo(17.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -9.03f, -2.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.22f, -0.03f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 7.25f, 13.0f)
                horizontalLineToRelative(0.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.79f, -1.62f)
                curveToRelative(-0.42f, -0.2f, -0.72f, -0.63f, -0.72f, -1.13f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.38f, 0.0f, 0.73f, -0.12f, 1.02f, -0.33f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 7.0f)
                close()
                moveTo(7.0f, 6.9f)
                arcToRelative(5.11f, 5.11f, 0.0f, false, false, 0.0f, 0.2f)
                verticalLineToRelative(1.15f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.4f)
                close()
            }
        }
        return _personSupport!!
    }

private var _personSupport: ImageVector? = null
