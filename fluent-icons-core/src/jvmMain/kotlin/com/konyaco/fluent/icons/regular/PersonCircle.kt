

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonCircle: ImageVector
    get() {
        if (_personCircle != null) {
            return _personCircle!!
        }
        _personCircle = fluentIcon(name = "Regular.PersonCircle") {
            fluentPath {
                moveTo(17.0f, 13.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.97f, 1.86f, 4.0f, 5.0f, 4.0f)
                curveToRelative(3.14f, 0.0f, 5.0f, -2.03f, 5.0f, -4.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(14.75f, 8.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 5.5f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 17.0f, 0.0f)
                close()
            }
        }
        return _personCircle!!
    }

private var _personCircle: ImageVector? = null
