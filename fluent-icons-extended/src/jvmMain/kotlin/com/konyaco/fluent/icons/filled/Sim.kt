

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Sim: ImageVector
    get() {
        if (_sim != null) {
            return _sim!!
        }
        _sim = fluentIcon(name = "Filled.Sim") {
            fluentPath {
                moveTo(4.0f, 5.25f)
                curveTo(4.0f, 3.45f, 5.46f, 2.0f, 7.25f, 2.0f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.87f, 0.0f, 1.7f, 0.34f, 2.3f, 0.95f)
                lineTo(19.05f, 7.0f)
                curveToRelative(0.6f, 0.6f, 0.95f, 1.43f, 0.95f, 2.3f)
                verticalLineToRelative(9.46f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-9.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.0f, 18.75f)
                lineTo(4.0f, 5.25f)
                close()
                moveTo(7.75f, 14.0f)
                lineTo(12.0f, 14.0f)
                verticalLineToRelative(-3.25f)
                lineTo(9.25f, 10.75f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(7.75f, 14.0f)
                close()
                moveTo(7.75f, 15.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(12.0f, 18.25f)
                lineTo(12.0f, 15.5f)
                lineTo(7.75f, 15.5f)
                close()
                moveTo(13.5f, 18.25f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(13.5f, 10.75f)
                verticalLineToRelative(7.5f)
                close()
            }
        }
        return _sim!!
    }

private var _sim: ImageVector? = null
