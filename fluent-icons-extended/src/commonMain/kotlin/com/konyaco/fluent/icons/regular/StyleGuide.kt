

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.StyleGuide: ImageVector
    get() {
        if (_styleGuide != null) {
            return _styleGuide!!
        }
        _styleGuide = fluentIcon(name = "Regular.StyleGuide") {
            fluentPath {
                moveTo(14.03f, 2.78f)
                curveToRelative(1.47f, -0.4f, 2.98f, 0.48f, 3.37f, 1.94f)
                lineToRelative(2.72f, 10.14f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -1.94f, 3.37f)
                lineToRelative(-6.28f, 1.69f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -3.37f, -1.95f)
                lineTo(5.8f, 7.83f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 1.95f, -3.37f)
                lineToRelative(6.27f, -1.68f)
                close()
                moveTo(5.8f, 11.66f)
                lineToRelative(1.76f, 6.57f)
                curveToRelative(0.18f, 0.67f, 0.54f, 1.26f, 1.0f, 1.71f)
                lineToRelative(-0.44f, -0.02f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.6f, -2.9f)
                lineToRelative(0.28f, -5.36f)
                close()
                moveTo(14.42f, 4.23f)
                lineTo(8.14f, 5.9f)
                curveToRelative(-0.66f, 0.18f, -1.06f, 0.86f, -0.88f, 1.53f)
                lineToRelative(2.72f, 10.14f)
                curveToRelative(0.18f, 0.67f, 0.86f, 1.06f, 1.53f, 0.89f)
                lineToRelative(6.28f, -1.69f)
                curveToRelative(0.66f, -0.17f, 1.06f, -0.86f, 0.88f, -1.53f)
                lineTo(15.95f, 5.11f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.53f, -0.88f)
                close()
                moveTo(4.88f, 10.18f)
                lineTo(4.52f, 16.98f)
                curveToRelative(-0.04f, 0.7f, 0.12f, 1.36f, 0.43f, 1.94f)
                lineToRelative(-0.42f, -0.16f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -1.58f, -3.56f)
                lineToRelative(1.93f, -5.02f)
                close()
                moveTo(9.74f, 7.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.52f, 1.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.52f, -1.94f)
                close()
            }
        }
        return _styleGuide!!
    }

private var _styleGuide: ImageVector? = null
