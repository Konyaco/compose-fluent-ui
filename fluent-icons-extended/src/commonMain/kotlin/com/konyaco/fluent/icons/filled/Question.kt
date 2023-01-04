

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = fluentIcon(name = "Filled.Question") {
            fluentPath {
                moveTo(12.0f, 4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                curveToRelative(0.0f, 0.82f, -0.2f, 1.3f, -0.44f, 1.63f)
                curveToRelative(-0.26f, 0.36f, -0.62f, 0.64f, -1.13f, 0.98f)
                lineToRelative(-0.11f, 0.08f)
                curveToRelative(-0.45f, 0.3f, -1.02f, 0.7f, -1.47f, 1.25f)
                arcTo(3.89f, 3.89f, 0.0f, false, false, 11.0f, 15.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.66f, 0.18f, -1.02f, 0.4f, -1.3f)
                curveToRelative(0.26f, -0.31f, 0.6f, -0.55f, 1.11f, -0.9f)
                lineToRelative(0.06f, -0.04f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 1.62f, -1.47f)
                curveToRelative(0.5f, -0.7f, 0.81f, -1.6f, 0.81f, -2.79f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 21.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
            }
        }
        return _question!!
    }

private var _question: ImageVector? = null
