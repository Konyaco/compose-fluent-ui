

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FilterSync: ImageVector
    get() {
        if (_filterSync != null) {
            return _filterSync!!
        }
        _filterSync = fluentIcon(name = "Regular.FilterSync") {
            fluentPath {
                moveTo(12.0f, 7.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -11.0f, 0.0f)
                close()
                moveTo(20.5f, 4.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.03f, 0.04f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.8f, -0.59f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.33f, -0.4f)
                lineTo(20.0f, 4.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(15.0f, 9.95f)
                verticalLineToRelative(0.55f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.91f, 0.11f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.77f, 0.65f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -5.18f, 0.19f)
                close()
                moveTo(7.5f, 12.5f)
                horizontalLineToRelative(5.85f)
                arcToRelative(6.54f, 6.54f, 0.0f, false, true, -1.33f, -1.5f)
                lineTo(7.5f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(11.0f, 7.5f)
                curveToRelative(0.0f, -0.52f, 0.06f, -1.02f, 0.17f, -1.5f)
                lineTo(4.5f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(11.0f, 7.5f)
                close()
                moveTo(13.5f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        return _filterSync!!
    }

private var _filterSync: ImageVector? = null
