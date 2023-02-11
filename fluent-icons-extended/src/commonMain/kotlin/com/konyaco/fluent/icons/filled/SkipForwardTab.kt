

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SkipForwardTab: ImageVector
    get() {
        if (_skipForwardTab != null) {
            return _skipForwardTab!!
        }
        _skipForwardTab = fluentIcon(name = "Filled.SkipForwardTab") {
            fluentPath {
                moveTo(22.0f, 3.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(2.73f)
                arcToRelative(9.52f, 9.52f, 0.0f, false, false, -3.95f, -2.46f)
                arcToRelative(11.44f, 11.44f, 0.0f, false, false, -13.18f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.76f, 0.96f)
                arcToRelative(9.44f, 9.44f, 0.0f, false, true, 10.83f, -4.05f)
                curveToRelative(1.47f, 0.46f, 2.7f, 1.4f, 3.68f, 2.57f)
                horizontalLineToRelative(-3.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                lineTo(21.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 3.25f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(8.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 15.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
            }
        }
        return _skipForwardTab!!
    }

private var _skipForwardTab: ImageVector? = null
