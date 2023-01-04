

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CaretDownRight: ImageVector
    get() {
        if (_caretDownRight != null) {
            return _caretDownRight!!
        }
        _caretDownRight = fluentIcon(name = "Filled.CaretDownRight") {
            fluentPath {
                moveTo(18.0f, 7.2f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.13f, -0.88f)
                lineToRelative(-9.55f, 9.55f)
                curveToRelative(-0.78f, 0.78f, -0.23f, 2.13f, 0.89f, 2.13f)
                horizontalLineToRelative(9.04f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(7.21f)
                close()
            }
        }
        return _caretDownRight!!
    }

private var _caretDownRight: ImageVector? = null
