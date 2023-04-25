

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CaretDownRight: ImageVector
    get() {
        if (_caretDownRight != null) {
            return _caretDownRight!!
        }
        _caretDownRight = fluentIcon(name = "Regular.CaretDownRight") {
            fluentPath {
                moveToRelative(16.5f, 7.81f)
                lineToRelative(-8.69f, 8.7f)
                horizontalLineToRelative(8.44f)
                curveToRelative(0.14f, -0.01f, 0.25f, -0.12f, 0.25f, -0.26f)
                lineTo(16.5f, 7.81f)
                close()
                moveTo(15.87f, 6.32f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.13f, 0.89f)
                verticalLineToRelative(9.04f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(7.21f, 18.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -0.89f, -2.13f)
                lineToRelative(9.55f, -9.55f)
                close()
            }
        }
        return _caretDownRight!!
    }

private var _caretDownRight: ImageVector? = null
