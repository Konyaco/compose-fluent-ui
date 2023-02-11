

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FilterSync: ImageVector
    get() {
        if (_filterSync != null) {
            return _filterSync!!
        }
        _filterSync = fluentIcon(name = "Filled.FilterSync") {
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
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(6.03f)
                curveToRelative(-0.8f, -0.51f, -1.5f, -1.2f, -2.0f, -2.0f)
                lineTo(7.87f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 13.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineToRelative(6.17f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -0.15f, 2.0f)
                lineTo(5.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(9.88f, 16.0f)
                lineTo(14.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                close()
            }
        }
        return _filterSync!!
    }

private var _filterSync: ImageVector? = null
