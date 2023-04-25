

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = fluentIcon(name = "Regular.Home") {
            fluentPath {
                moveTo(10.55f, 2.53f)
                curveToRelative(0.84f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(6.75f, 5.7f)
                curveToRelative(0.5f, 0.42f, 0.8f, 1.05f, 0.8f, 1.71f)
                verticalLineToRelative(9.31f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-3.5f)
                curveTo(3.78f, 21.0f, 3.0f, 20.22f, 3.0f, 19.25f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.67f, 0.3f, -1.3f, 0.8f, -1.73f)
                lineToRelative(6.75f, -5.69f)
                close()
                moveTo(12.48f, 3.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.96f, 0.0f)
                lineToRelative(-6.75f, 5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.27f, 0.56f)
                verticalLineToRelative(9.31f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.1f, 0.25f, -0.25f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.1f, 0.25f, -0.25f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.23f, -0.1f, -0.44f, -0.27f, -0.58f)
                lineToRelative(-6.75f, -5.7f)
                close()
            }
        }
        return _home!!
    }

private var _home: ImageVector? = null
