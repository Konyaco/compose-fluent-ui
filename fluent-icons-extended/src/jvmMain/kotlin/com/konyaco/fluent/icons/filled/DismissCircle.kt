

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DismissCircle: ImageVector
    get() {
        if (_dismissCircle != null) {
            return _dismissCircle!!
        }
        _dismissCircle = fluentIcon(name = "Filled.DismissCircle") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(15.53f, 8.47f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.89f, -0.01f)
                lineToRelative(-0.09f, 0.08f)
                lineTo(12.0f, 10.94f)
                lineTo(9.53f, 8.47f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.89f, -0.01f)
                lineToRelative(-0.09f, 0.08f)
                lineToRelative(-0.07f, 0.08f)
                curveToRelative(-0.2f, 0.26f, -0.2f, 0.62f, -0.01f, 0.89f)
                lineToRelative(0.08f, 0.09f)
                lineTo(10.94f, 12.0f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(-0.07f, 0.08f)
                curveToRelative(-0.2f, 0.26f, -0.2f, 0.62f, -0.01f, 0.89f)
                lineToRelative(0.08f, 0.09f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.26f, 0.2f, 0.62f, 0.2f, 0.89f, 0.01f)
                lineToRelative(0.09f, -0.08f)
                lineTo(12.0f, 13.06f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.26f, 0.2f, 0.62f, 0.2f, 0.89f, 0.01f)
                lineToRelative(0.09f, -0.08f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.2f, -0.26f, 0.2f, -0.62f, 0.01f, -0.89f)
                lineToRelative(-0.08f, -0.09f)
                lineTo(13.06f, 12.0f)
                lineToRelative(2.47f, -2.47f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.2f, -0.26f, 0.2f, -0.62f, 0.01f, -0.89f)
                lineToRelative(-0.08f, -0.09f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                close()
            }
        }
        return _dismissCircle!!
    }

private var _dismissCircle: ImageVector? = null
