

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PuzzleCube: ImageVector
    get() {
        if (_puzzleCube != null) {
            return _puzzleCube!!
        }
        _puzzleCube = fluentIcon(name = "Regular.PuzzleCube") {
            fluentPath {
                moveTo(3.0f, 8.5f)
                verticalLineToRelative(9.25f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(8.5f, 3.0f)
                verticalLineToRelative(5.5f)
                lineTo(3.0f, 8.5f)
                close()
                moveTo(8.5f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15.5f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 15.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(15.5f, 15.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(15.5f, 19.5f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(15.5f, 4.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(19.5f, 8.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 8.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.5f, 15.5f)
                verticalLineToRelative(4.0f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.5f, 15.5f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        return _puzzleCube!!
    }

private var _puzzleCube: ImageVector? = null
