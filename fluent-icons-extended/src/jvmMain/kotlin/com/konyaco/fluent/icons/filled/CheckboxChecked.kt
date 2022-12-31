

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CheckboxChecked: ImageVector
    get() {
        if (_checkboxChecked != null) {
            return _checkboxChecked!!
        }
        _checkboxChecked = fluentIcon(name = "Filled.CheckboxChecked") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(17.28f, 9.28f)
                lineToRelative(-6.75f, 6.75f)
                curveToRelative(-0.3f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f)
                lineToRelative(-2.75f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineTo(10.0f, 14.44f)
                lineToRelative(6.22f, -6.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                close()
            }
        }
        return _checkboxChecked!!
    }

private var _checkboxChecked: ImageVector? = null
