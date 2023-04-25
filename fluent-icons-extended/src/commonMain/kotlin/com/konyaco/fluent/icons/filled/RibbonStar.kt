

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RibbonStar: ImageVector
    get() {
        if (_ribbonStar != null) {
            return _ribbonStar!!
        }
        _ribbonStar = fluentIcon(name = "Filled.RibbonStar") {
            fluentPath {
                moveTo(17.0f, 21.25f)
                verticalLineToRelative(-6.0f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, true, -10.0f, 0.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.6f, 0.69f, 0.96f, 1.18f, 0.6f)
                lineTo(12.0f, 19.18f)
                lineToRelative(3.82f, 2.69f)
                curveToRelative(0.5f, 0.35f, 1.18f, 0.0f, 1.18f, -0.61f)
                close()
                moveTo(19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 5.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 14.0f, 0.0f)
                close()
                moveTo(12.23f, 5.64f)
                lineTo(13.14f, 7.5f)
                lineTo(15.19f, 7.79f)
                curveToRelative(0.2f, 0.03f, 0.29f, 0.29f, 0.14f, 0.44f)
                lineToRelative(-1.48f, 1.44f)
                lineToRelative(0.35f, 2.03f)
                curveToRelative(0.03f, 0.21f, -0.19f, 0.37f, -0.37f, 0.27f)
                lineTo(12.0f, 11.01f)
                lineToRelative(-1.83f, 0.96f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.37f, -0.27f)
                lineToRelative(0.35f, -2.03f)
                lineToRelative(-1.48f, -1.44f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, true, 0.14f, -0.44f)
                lineToRelative(2.05f, -0.3f)
                lineToRelative(0.91f, -1.85f)
                curveToRelative(0.1f, -0.19f, 0.37f, -0.19f, 0.46f, 0.0f)
                close()
            }
        }
        return _ribbonStar!!
    }

private var _ribbonStar: ImageVector? = null
