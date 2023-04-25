

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RibbonStar: ImageVector
    get() {
        if (_ribbonStar != null) {
            return _ribbonStar!!
        }
        _ribbonStar = fluentIcon(name = "Regular.RibbonStar") {
            fluentPath {
                moveToRelative(12.23f, 5.64f)
                lineToRelative(0.91f, 1.86f)
                lineToRelative(2.05f, 0.29f)
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
                moveTo(19.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -12.0f, 4.9f)
                lineTo(7.0f, 21.35f)
                curveToRelative(0.08f, 0.55f, 0.71f, 0.84f, 1.18f, 0.51f)
                lineTo(12.0f, 19.18f)
                lineToRelative(3.82f, 2.68f)
                lineToRelative(0.09f, 0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.09f, -0.67f)
                lineTo(17.0f, 13.9f)
                curveToRelative(1.24f, -1.26f, 2.0f, -3.0f, 2.0f, -4.9f)
                close()
                moveTo(15.5f, 15.06f)
                verticalLineToRelative(4.75f)
                lineToRelative(-3.07f, -2.16f)
                lineToRelative(-0.1f, -0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.76f, 0.06f)
                lineTo(8.5f, 19.8f)
                verticalLineToRelative(-4.74f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 7.0f, 0.0f)
                close()
                moveTo(6.5f, 9.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -11.0f, 0.0f)
                close()
            }
        }
        return _ribbonStar!!
    }

private var _ribbonStar: ImageVector? = null
