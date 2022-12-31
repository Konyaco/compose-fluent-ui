

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AddSubtractCircle: ImageVector
    get() {
        if (_addSubtractCircle != null) {
            return _addSubtractCircle!!
        }
        _addSubtractCircle = fluentIcon(name = "Filled.AddSubtractCircle") {
            fluentPath {
                moveTo(13.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(18.52f, 6.54f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 6.55f, 18.51f)
                lineTo(18.51f, 6.55f)
                close()
                moveTo(6.0f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(9.5f, 8.0f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(9.5f, 9.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(8.0f, 9.5f)
                lineTo(6.75f, 9.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 8.75f)
                close()
            }
        }
        return _addSubtractCircle!!
    }

private var _addSubtractCircle: ImageVector? = null
