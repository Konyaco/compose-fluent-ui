

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = fluentIcon(name = "Regular.Question") {
            fluentPath {
                moveTo(12.0f, 4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                curveToRelative(0.0f, 0.85f, -0.22f, 1.42f, -0.53f, 1.86f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, true, -1.44f, 1.34f)
                curveToRelative(-1.0f, 0.77f, -2.28f, 1.73f, -2.28f, 3.8f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.75f, 16.0f)
                curveToRelative(0.0f, -1.32f, 0.71f, -1.86f, 1.79f, -2.68f)
                lineToRelative(0.04f, -0.04f)
                curveToRelative(0.53f, -0.4f, 1.15f, -0.88f, 1.62f, -1.56f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _question!!
    }

private var _question: ImageVector? = null
