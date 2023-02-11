

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AddSubtractCircle: ImageVector
    get() {
        if (_addSubtractCircle != null) {
            return _addSubtractCircle!!
        }
        _addSubtractCircle = fluentIcon(name = "Regular.AddSubtractCircle") {
            fluentPath {
                moveTo(13.0f, 15.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(9.5f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(8.0f, 8.0f)
                lineTo(6.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(8.0f, 9.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(9.5f, 9.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(9.5f, 8.0f)
                lineTo(9.5f, 6.75f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 6.52f, -13.96f)
                lineTo(6.54f, 18.52f)
                arcTo(8.47f, 8.47f, 0.0f, false, false, 12.0f, 20.5f)
                close()
                moveTo(5.48f, 17.46f)
                lineTo(17.46f, 5.48f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 5.49f, 17.45f)
                close()
            }
        }
        return _addSubtractCircle!!
    }

private var _addSubtractCircle: ImageVector? = null
