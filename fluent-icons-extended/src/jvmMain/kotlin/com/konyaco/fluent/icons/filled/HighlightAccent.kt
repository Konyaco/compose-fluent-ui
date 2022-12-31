

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HighlightAccent: ImageVector
    get() {
        if (_highlightAccent != null) {
            return _highlightAccent!!
        }
        _highlightAccent = fluentIcon(name = "Filled.HighlightAccent") {
            fluentPath {
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(3.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.72f, 0.65f)
                lineTo(4.64f, 8.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 7.74f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(15.5f, 13.5f)
                horizontalLineToRelative(-7.0f)
                lineTo(8.5f, 21.0f)
                lineToRelative(6.58f, -3.1f)
                curveToRelative(0.23f, -0.11f, 0.38f, -0.33f, 0.42f, -0.58f)
                lineTo(15.5f, 13.5f)
                close()
            }
        }
        return _highlightAccent!!
    }

private var _highlightAccent: ImageVector? = null
