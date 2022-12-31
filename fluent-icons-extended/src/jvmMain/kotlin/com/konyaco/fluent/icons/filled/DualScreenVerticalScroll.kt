

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenVerticalScroll: ImageVector
    get() {
        if (_dualScreenVerticalScroll != null) {
            return _dualScreenVerticalScroll!!
        }
        _dualScreenVerticalScroll = fluentIcon(name = "Filled.DualScreenVerticalScroll") {
            fluentPath {
                moveTo(20.25f, 4.0f)
                curveTo(21.2f, 4.0f, 22.0f, 4.8f, 22.0f, 5.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.97f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(13.0f, 20.0f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.0f, -0.26f, -0.02f)
                lineTo(12.74f, 4.02f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(7.25f)
                close()
                moveTo(11.0f, 4.0f)
                curveToRelative(0.08f, 0.0f, 0.16f, 0.0f, 0.24f, 0.02f)
                verticalLineToRelative(15.96f)
                lineTo(11.0f, 20.0f)
                lineTo(3.75f, 20.0f)
                curveTo(2.78f, 20.0f, 2.0f, 19.2f, 2.0f, 18.25f)
                lineTo(2.0f, 5.75f)
                curveTo(2.0f, 4.8f, 2.78f, 4.0f, 3.75f, 4.0f)
                lineTo(11.0f, 4.0f)
                close()
                moveTo(15.7f, 13.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.04f)
                lineToRelative(0.07f, 0.09f)
                lineToRelative(2.26f, 2.3f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.27f, 0.2f, 0.64f, 0.2f, 0.9f, 0.0f)
                lineToRelative(0.09f, -0.08f)
                lineToRelative(2.25f, -2.3f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.04f)
                lineToRelative(-0.08f, 0.08f)
                lineToRelative(-1.72f, 1.75f)
                lineToRelative(-1.71f, -1.75f)
                lineToRelative(-0.09f, -0.08f)
                close()
                moveTo(18.04f, 7.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.99f, -0.08f)
                lineToRelative(-0.08f, 0.08f)
                lineToRelative(-2.26f, 2.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.0f, 1.12f)
                lineToRelative(0.08f, -0.08f)
                lineToRelative(1.71f, -1.75f)
                lineToRelative(1.72f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.14f, -0.96f)
                lineToRelative(-0.07f, -0.09f)
                lineToRelative(-2.25f, -2.3f)
                close()
            }
        }
        return _dualScreenVerticalScroll!!
    }

private var _dualScreenVerticalScroll: ImageVector? = null
