

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = fluentIcon(name = "Filled.Couch") {
            fluentPath {
                moveTo(16.75f, 4.0f)
                horizontalLineToRelative(-9.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.5f, 6.75f)
                lineTo(4.5f, 8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.46f, 3.0f)
                horizontalLineToRelative(8.08f)
                curveToRelative(0.24f, -1.7f, 1.7f, -3.0f, 3.46f, -3.0f)
                lineTo(19.5f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 16.75f, 4.0f)
                close()
                moveTo(17.0f, 11.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 1.43f, -1.1f, 2.61f, -2.5f, 2.74f)
                verticalLineToRelative(1.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.26f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 14.25f)
                lineTo(2.0f, 11.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
            }
        }
        return _couch!!
    }

private var _couch: ImageVector? = null
