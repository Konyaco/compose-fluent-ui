

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleLock: ImageVector
    get() {
        if (_peopleLock != null) {
            return _peopleLock!!
        }
        _peopleLock = fluentIcon(name = "Filled.PeopleLock") {
            fluentPath {
                moveTo(12.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(16.0f, 10.83f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, 2.45f, -0.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -2.44f, 0.2f)
                close()
                moveTo(13.7f, 14.13f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 16.5f)
                verticalLineToRelative(2.49f)
                arcTo(7.08f, 7.08f, 0.0f, false, true, 8.0f, 20.0f)
                curveToRelative(-6.0f, 0.0f, -6.0f, -4.5f, -6.0f, -4.5f)
                verticalLineToRelative(-0.25f)
                curveTo(2.0f, 14.01f, 3.0f, 13.0f, 4.25f, 13.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.83f, 0.0f, 1.56f, 0.45f, 1.95f, 1.13f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(16.5f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                close()
                moveTo(18.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        return _peopleLock!!
    }

private var _peopleLock: ImageVector? = null
