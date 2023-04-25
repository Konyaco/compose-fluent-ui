

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DualScreenVerticalScroll: ImageVector
    get() {
        if (_dualScreenVerticalScroll != null) {
            return _dualScreenVerticalScroll!!
        }
        _dualScreenVerticalScroll = fluentIcon(name = "Regular.DualScreenVerticalScroll") {
            fluentPath {
                moveTo(12.75f, 4.0f)
                horizontalLineToRelative(7.5f)
                curveTo(21.2f, 4.0f, 22.0f, 4.8f, 22.0f, 5.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.97f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 20.0f)
                curveTo(2.78f, 20.0f, 2.0f, 19.2f, 2.0f, 18.25f)
                lineTo(2.0f, 5.75f)
                curveTo(2.0f, 4.8f, 2.78f, 4.0f, 3.75f, 4.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(20.25f, 5.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.13f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                lineTo(20.5f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(11.25f, 5.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(14.7f, 13.4f)
                lineTo(14.79f, 13.48f)
                lineTo(16.5f, 15.23f)
                lineTo(18.22f, 13.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.14f, 0.96f)
                lineToRelative(-0.07f, 0.09f)
                lineToRelative(-2.25f, 2.3f)
                curveToRelative(-0.27f, 0.26f, -0.7f, 0.29f, -0.99f, 0.07f)
                lineToRelative(-0.08f, -0.08f)
                lineToRelative(-2.26f, -2.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.0f, -1.12f)
                close()
                moveTo(17.04f, 7.23f)
                lineTo(19.29f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.07f, 1.04f)
                lineTo(16.5f, 8.82f)
                lineToRelative(-1.71f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.08f, -1.05f)
                lineToRelative(2.26f, -2.3f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.07f, 0.0f)
                close()
            }
        }
        return _dualScreenVerticalScroll!!
    }

private var _dualScreenVerticalScroll: ImageVector? = null
