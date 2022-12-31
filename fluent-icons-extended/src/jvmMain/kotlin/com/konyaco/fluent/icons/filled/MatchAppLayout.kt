

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MatchAppLayout: ImageVector
    get() {
        if (_matchAppLayout != null) {
            return _matchAppLayout!!
        }
        _matchAppLayout = fluentIcon(name = "Filled.MatchAppLayout") {
            fluentPath {
                moveTo(9.5f, 8.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 16.0f)
                curveTo(2.78f, 16.0f, 2.0f, 15.22f, 2.0f, 14.25f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.74f)
                lineTo(3.76f, 8.0f)
                lineTo(9.5f, 8.0f)
                close()
                moveTo(20.25f, 8.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(14.5f, 16.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.75f)
                close()
            }
        }
        return _matchAppLayout!!
    }

private var _matchAppLayout: ImageVector? = null
