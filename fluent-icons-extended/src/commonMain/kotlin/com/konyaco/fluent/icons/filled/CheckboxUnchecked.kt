

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CheckboxUnchecked: ImageVector
    get() {
        if (_checkboxUnchecked != null) {
            return _checkboxUnchecked!!
        }
        _checkboxUnchecked = fluentIcon(name = "Filled.CheckboxUnchecked") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 5.0f)
                curveTo(5.56f, 5.0f, 5.0f, 5.56f, 5.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineTo(6.25f)
                curveTo(19.0f, 5.56f, 18.44f, 5.0f, 17.75f, 5.0f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        return _checkboxUnchecked!!
    }

private var _checkboxUnchecked: ImageVector? = null
