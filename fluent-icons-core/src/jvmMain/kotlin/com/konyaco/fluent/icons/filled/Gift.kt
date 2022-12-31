

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = fluentIcon(name = "Filled.Gift") {
            fluentPath {
                moveTo(11.25f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.0f, 18.75f)
                lineTo(4.0f, 13.0f)
                horizontalLineToRelative(7.25f)
                close()
                moveTo(20.0f, 13.0f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-9.0f)
                lineTo(20.0f, 13.0f)
                close()
                moveTo(14.5f, 2.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.74f, 5.0f)
                horizontalLineToRelative(2.51f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.47f, 1.25f, 1.04f)
                verticalLineToRelative(2.92f)
                curveToRelative(0.0f, 0.57f, -0.56f, 1.04f, -1.25f, 1.04f)
                horizontalLineToRelative(-7.0f)
                lineTo(12.75f, 7.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(3.56f, 12.0f, 3.0f, 11.53f, 3.0f, 10.96f)
                lineTo(3.0f, 8.04f)
                curveTo(3.0f, 7.47f, 3.56f, 7.0f, 4.25f, 7.0f)
                horizontalLineToRelative(2.51f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 12.0f, 3.17f)
                curveTo(12.6f, 2.46f, 13.5f, 2.0f, 14.5f, 2.0f)
                close()
                moveTo(9.5f, 3.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 9.36f, 7.0f)
                lineTo(11.25f, 7.0f)
                lineTo(11.25f, 5.11f)
                curveToRelative(-0.08f, -0.9f, -0.83f, -1.61f, -1.75f, -1.61f)
                close()
                moveTo(14.5f, 3.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(12.75f, 7.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, -3.5f)
                close()
            }
        }
        return _gift!!
    }

private var _gift: ImageVector? = null
