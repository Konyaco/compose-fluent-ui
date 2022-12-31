

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TagSearch: ImageVector
    get() {
        if (_tagSearch != null) {
            return _tagSearch!!
        }
        _tagSearch = fluentIcon(name = "Filled.TagSearch") {
            fluentPath {
                moveTo(22.0f, 4.25f)
                curveTo(22.0f, 3.01f, 21.0f, 2.0f, 19.75f, 2.0f)
                horizontalLineToRelative(-5.47f)
                curveToRelative(-0.86f, 0.0f, -1.69f, 0.34f, -2.3f, 0.95f)
                lineToRelative(-8.5f, 8.51f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, 4.6f)
                lineToRelative(4.47f, 4.45f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 4.6f, 0.0f)
                lineToRelative(0.1f, -0.1f)
                arcTo(5.48f, 5.48f, 0.0f, false, true, 16.5f, 11.0f)
                curveToRelative(1.53f, 0.0f, 2.92f, 0.63f, 3.92f, 1.64f)
                lineToRelative(0.63f, -0.63f)
                curveToRelative(0.6f, -0.61f, 0.95f, -1.44f, 0.95f, -2.3f)
                lineTo(22.0f, 4.25f)
                close()
                moveTo(15.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(20.17f, 19.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.61f, 2.62f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.61f, -2.61f)
                close()
                moveTo(19.5f, 16.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
            }
        }
        return _tagSearch!!
    }

private var _tagSearch: ImageVector? = null
