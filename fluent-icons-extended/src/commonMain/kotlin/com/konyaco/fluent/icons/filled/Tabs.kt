

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = fluentIcon(name = "Filled.Tabs") {
            fluentPath {
                moveTo(2.0f, 9.25f)
                curveTo(2.0f, 5.25f, 5.25f, 2.0f, 9.25f, 2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.35f, 0.0f, 2.51f, 0.83f, 3.0f, 2.0f)
                horizontalLineToRelative(-5.5f)
                arcTo(6.25f, 6.25f, 0.0f, false, false, 4.0f, 10.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -2.0f, -3.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(5.0f, 10.25f)
                curveTo(5.0f, 7.35f, 7.35f, 5.0f, 10.25f, 5.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.35f, 0.0f, 2.51f, 0.83f, 3.0f, 2.0f)
                horizontalLineToRelative(-7.5f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 7.0f, 11.25f)
                verticalLineToRelative(7.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -2.0f, -3.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(11.25f, 8.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 8.0f, 11.25f)
                verticalLineToRelative(7.5f)
                curveTo(8.0f, 20.55f, 9.46f, 22.0f, 11.25f, 22.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-7.5f)
                curveTo(22.0f, 9.45f, 20.54f, 8.0f, 18.75f, 8.0f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        return _tabs!!
    }

private var _tabs: ImageVector? = null
