

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = fluentIcon(name = "Filled.Table") {
            fluentPath {
                moveTo(9.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 14.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 8.0f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(16.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(14.5f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 3.0f)
                close()
                moveTo(8.0f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(3.0f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 9.5f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineToRelative(1.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 16.0f)
                close()
                moveTo(14.5f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        return _table!!
    }

private var _table: ImageVector? = null
