

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BoardSplit: ImageVector
    get() {
        if (_boardSplit != null) {
            return _boardSplit!!
        }
        _boardSplit = fluentIcon(name = "Regular.BoardSplit") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(4.5f, 12.5f)
                verticalLineToRelative(5.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(14.0f, 19.5f)
                verticalLineToRelative(-7.0f)
                lineTo(4.5f, 12.5f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(14.0f, 4.5f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 11.0f)
                lineTo(14.0f, 11.0f)
                close()
                moveTo(19.5f, 9.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(19.5f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.5f, 16.0f)
                close()
                moveTo(19.5f, 8.0f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(15.5f, 4.5f)
                lineTo(15.5f, 8.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        return _boardSplit!!
    }

private var _boardSplit: ImageVector? = null
