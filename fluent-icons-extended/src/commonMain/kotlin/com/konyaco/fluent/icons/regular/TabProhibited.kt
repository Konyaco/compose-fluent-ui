

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TabProhibited: ImageVector
    get() {
        if (_tabProhibited != null) {
            return _tabProhibited!!
        }
        _tabProhibited = fluentIcon(name = "Regular.TabProhibited") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 5.75f, 21.0f)
                horizontalLineToRelative(6.27f)
                curveToRelative(-0.3f, -0.46f, -0.53f, -0.97f, -0.7f, -1.5f)
                lineTo(5.74f, 19.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(4.49f, 5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(5.56f)
                curveToRelative(0.53f, 0.18f, 1.04f, 0.42f, 1.5f, 0.71f)
                lineTo(20.99f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                lineTo(5.75f, 3.0f)
                close()
                moveTo(17.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(14.2f, 19.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.56f, -5.56f)
                lineToRelative(-5.57f, 5.56f)
                close()
                moveTo(15.25f, 20.81f)
                lineTo(20.81f, 15.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.56f, 5.56f)
                close()
            }
        }
        return _tabProhibited!!
    }

private var _tabProhibited: ImageVector? = null
