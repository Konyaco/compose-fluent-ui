

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TabProhibited: ImageVector
    get() {
        if (_tabProhibited != null) {
            return _tabProhibited!!
        }
        _tabProhibited = fluentIcon(name = "Filled.TabProhibited") {
            fluentPath {
                moveTo(5.86f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(6.16f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, true, -0.85f, -2.0f)
                lineTo(5.86f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.86f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.14f)
                curveToRelative(0.71f, 0.15f, 1.39f, 0.43f, 2.0f, 0.8f)
                lineTo(20.86f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-12.0f)
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
