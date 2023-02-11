

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextboxAlignCenter: ImageVector
    get() {
        if (_textboxAlignCenter != null) {
            return _textboxAlignCenter!!
        }
        _textboxAlignCenter = fluentIcon(name = "Filled.TextboxAlignCenter") {
            fluentPath {
                moveTo(18.25f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(-0.14f)
                curveToRelative(-0.48f, 0.06f, -0.86f, 0.37f, -0.86f, 0.75f)
                curveToRelative(0.0f, 0.41f, 0.45f, 0.75f, 1.0f, 0.75f)
                horizontalLineToRelative(10.14f)
                curveToRelative(0.48f, -0.06f, 0.86f, -0.37f, 0.86f, -0.75f)
                curveToRelative(0.0f, -0.41f, -0.45f, -0.75f, -1.0f, -0.75f)
                lineTo(7.0f, 10.0f)
                close()
                moveTo(15.33f, 13.0f)
                lineTo(8.57f, 13.0f)
                curveToRelative(-0.32f, 0.06f, -0.57f, 0.37f, -0.57f, 0.75f)
                curveToRelative(0.0f, 0.41f, 0.3f, 0.75f, 0.67f, 0.75f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.32f, -0.06f, 0.57f, -0.37f, 0.57f, -0.75f)
                curveToRelative(0.0f, -0.41f, -0.3f, -0.75f, -0.67f, -0.75f)
                close()
            }
        }
        return _textboxAlignCenter!!
    }

private var _textboxAlignCenter: ImageVector? = null
