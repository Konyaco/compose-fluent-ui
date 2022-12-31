

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MicProhibited: ImageVector
    get() {
        if (_micProhibited != null) {
            return _micProhibited!!
        }
        _micProhibited = fluentIcon(name = "Regular.MicProhibited") {
            fluentPath {
                moveTo(15.0f, 6.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -1.53f, 0.9f)
                curveToRelative(0.02f, -0.13f, 0.03f, -0.26f, 0.03f, -0.4f)
                lineTo(13.5f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.3f, 2.37f)
                curveToRelative(-0.28f, 0.5f, -0.49f, 1.05f, -0.63f, 1.63f)
                lineTo(11.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(7.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                close()
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, 1.1f, 0.27f, 2.13f, 0.75f, 3.03f)
                verticalLineToRelative(0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-2.37f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 4.0f, 12.48f)
                verticalLineToRelative(-0.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(0.6f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 5.03f, 5.25f)
                lineTo(11.0f, 17.5f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0.0f, 0.83f, 0.26f, 1.6f, 0.7f, 2.25f)
                lineToRelative(5.55f, -5.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.25f, 3.3f)
                close()
                moveTo(17.5f, 21.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -6.25f)
                lineToRelative(-5.55f, 5.56f)
                curveToRelative(0.64f, 0.44f, 1.42f, 0.69f, 2.25f, 0.69f)
                close()
            }
        }
        return _micProhibited!!
    }

private var _micProhibited: ImageVector? = null
