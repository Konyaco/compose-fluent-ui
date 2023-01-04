

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StyleGuide: ImageVector
    get() {
        if (_styleGuide != null) {
            return _styleGuide!!
        }
        _styleGuide = fluentIcon(name = "Filled.StyleGuide") {
            fluentPath {
                moveTo(17.4f, 4.72f)
                lineToRelative(2.72f, 10.14f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -1.94f, 3.37f)
                lineToRelative(-6.28f, 1.69f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -3.37f, -1.95f)
                lineTo(5.81f, 7.83f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 1.95f, -3.37f)
                lineToRelative(6.28f, -1.68f)
                curveToRelative(1.46f, -0.4f, 2.97f, 0.48f, 3.36f, 1.94f)
                close()
                moveTo(10.97f, 7.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.94f, 0.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.94f, -0.52f)
                close()
                moveTo(5.8f, 11.66f)
                lineToRelative(1.76f, 6.57f)
                curveToRelative(0.19f, 0.67f, 0.54f, 1.26f, 1.0f, 1.71f)
                lineToRelative(-0.44f, -0.02f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.6f, -2.9f)
                lineToRelative(0.28f, -5.36f)
                close()
                moveTo(4.88f, 10.18f)
                lineToRelative(-0.36f, 6.8f)
                curveToRelative(-0.03f, 0.7f, 0.12f, 1.36f, 0.43f, 1.94f)
                lineToRelative(-0.42f, -0.16f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -1.58f, -3.56f)
                lineToRelative(1.93f, -5.02f)
                close()
            }
        }
        return _styleGuide!!
    }

private var _styleGuide: ImageVector? = null
