

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SkipForwardTab: ImageVector
    get() {
        if (_skipForwardTab != null) {
            return _skipForwardTab!!
        }
        _skipForwardTab = fluentIcon(name = "Regular.SkipForwardTab") {
            fluentPath {
                moveTo(21.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.4f)
                arcTo(9.61f, 9.61f, 0.0f, false, false, 15.47f, 4.0f)
                arcTo(11.18f, 11.18f, 0.0f, false, false, 2.6f, 8.89f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.32f, 0.72f)
                arcToRelative(9.69f, 9.69f, 0.0f, false, true, 11.12f, -4.17f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, true, 4.13f, 3.06f)
                horizontalLineToRelative(-3.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(6.0f, 14.5f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(8.0f, 20.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        return _skipForwardTab!!
    }

private var _skipForwardTab: ImageVector? = null
