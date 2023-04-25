

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CheckboxWarning: ImageVector
    get() {
        if (_checkboxWarning != null) {
            return _checkboxWarning!!
        }
        _checkboxWarning = fluentIcon(name = "Filled.CheckboxWarning") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(4.8f)
                curveToRelative(0.05f, -0.2f, 0.12f, -0.42f, 0.22f, -0.62f)
                lineToRelative(4.0f, -8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.47f, 0.0f)
                lineTo(21.0f, 14.9f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(17.28f, 9.28f)
                lineTo(10.53f, 16.03f)
                curveToRelative(-0.3f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f)
                lineToRelative(-2.75f, -2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineTo(10.0f, 14.44f)
                lineToRelative(6.22f, -6.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                close()
                moveTo(16.16f, 12.83f)
                lineTo(12.16f, 20.83f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.51f, 23.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.33f, -2.17f)
                lineToRelative(-4.0f, -8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.68f, 0.0f)
                close()
                moveTo(18.0f, 15.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(17.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                close()
            }
        }
        return _checkboxWarning!!
    }

private var _checkboxWarning: ImageVector? = null
