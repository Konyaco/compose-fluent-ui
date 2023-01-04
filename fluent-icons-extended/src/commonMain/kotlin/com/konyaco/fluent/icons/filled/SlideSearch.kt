

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlideSearch: ImageVector
    get() {
        if (_slideSearch != null) {
            return _slideSearch!!
        }
        _slideSearch = fluentIcon(name = "Filled.SlideSearch") {
            fluentPath {
                moveTo(2.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 20.0f)
                horizontalLineToRelative(-6.78f)
                lineToRelative(-2.04f, -2.05f)
                curveToRelative(0.36f, -0.74f, 0.57f, -1.57f, 0.57f, -2.45f)
                horizontalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.46f)
                arcToRelative(5.47f, 5.47f, 0.0f, false, false, -0.68f, -1.5f)
                horizontalLineToRelative(7.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.66f, 11.0f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -6.66f, 0.26f)
                lineTo(2.0f, 6.75f)
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
