

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonProhibited: ImageVector
    get() {
        if (_personProhibited != null) {
            return _personProhibited!!
        }
        _personProhibited = fluentIcon(name = "Filled.PersonProhibited") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(12.02f, 14.0f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 0.6f, 7.79f)
                curveToRelative(-0.8f, 0.14f, -1.68f, 0.21f, -2.62f, 0.21f)
                curveToRelative(-2.89f, 0.0f, -5.13f, -0.66f, -6.7f, -2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 2.0f, 17.16f)
                verticalLineToRelative(-0.91f)
                curveTo(2.0f, 15.01f, 3.01f, 14.0f, 4.25f, 14.0f)
                horizontalLineToRelative(7.77f)
                close()
                moveTo(20.81f, 15.25f)
                lineToRelative(-5.56f, 5.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.56f, -5.56f)
                close()
                moveTo(17.5f, 13.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.3f, 6.25f)
                lineToRelative(5.55f, -5.56f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -2.25f, -0.69f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
            }
        }
        return _personProhibited!!
    }

private var _personProhibited: ImageVector? = null
