

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = fluentIcon(name = "Regular.Badge") {
            fluentPath {
                moveTo(16.34f, 3.0f)
                curveToRelative(-0.22f, 0.45f, -0.34f, 0.96f, -0.34f, 1.5f)
                lineTo(5.75f, 4.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.7f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(19.5f, 8.0f)
                curveToRelative(0.54f, 0.0f, 1.05f, -0.12f, 1.5f, -0.34f)
                verticalLineToRelative(10.59f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(10.59f)
                close()
                moveTo(19.5f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
            }
        }
        return _badge!!
    }

private var _badge: ImageVector? = null
