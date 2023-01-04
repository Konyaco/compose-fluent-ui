

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideSearch: ImageVector
    get() {
        if (_slideSearch != null) {
            return _slideSearch!!
        }
        _slideSearch = fluentIcon(name = "Regular.SlideSearch") {
            fluentPath {
                moveTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.5f, -0.88f)
                lineTo(3.5f, 6.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-8.28f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(6.78f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 17.25f)
                lineTo(22.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                lineTo(4.75f, 4.0f)
                close()
                moveTo(8.66f, 11.0f)
                curveToRelative(0.58f, 0.4f, 1.07f, 0.91f, 1.45f, 1.5f)
                horizontalLineToRelative(7.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.66f, 11.0f)
                close()
                moveTo(15.25f, 15.5f)
                lineTo(11.0f, 15.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.2f, -1.5f)
                horizontalLineToRelative(4.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(6.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(5.5f, 20.0f)
                curveToRelative(0.97f, 0.0f, 1.87f, -0.3f, 2.6f, -0.83f)
                lineToRelative(2.62f, 2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.61f, -2.61f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 5.5f, 20.0f)
                close()
                moveTo(5.5f, 18.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        return _slideSearch!!
    }

private var _slideSearch: ImageVector? = null
