

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TagSearch: ImageVector
    get() {
        if (_tagSearch != null) {
            return _tagSearch!!
        }
        _tagSearch = fluentIcon(name = "Regular.TagSearch") {
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
                arcToRelative(5.52f, 5.52f, 0.0f, false, true, -0.93f, -1.19f)
                lineToRelative(-0.23f, 0.23f)
                curveToRelative(-0.69f, 0.68f, -1.8f, 0.68f, -2.48f, 0.0f)
                lineTo(4.55f, 15.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.02f, -2.46f)
                lineTo(13.05f, 4.0f)
                curveToRelative(0.32f, -0.33f, 0.77f, -0.51f, 1.23f, -0.51f)
                horizontalLineToRelative(5.47f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(5.46f)
                curveToRelative(0.0f, 0.47f, -0.18f, 0.91f, -0.51f, 1.24f)
                lineToRelative(-0.77f, 0.77f)
                curveToRelative(0.44f, 0.25f, 0.84f, 0.56f, 1.2f, 0.92f)
                lineToRelative(0.63f, -0.63f)
                curveToRelative(0.6f, -0.61f, 0.95f, -1.44f, 0.95f, -2.3f)
                lineTo(22.0f, 4.25f)
                close()
                moveTo(18.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
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
