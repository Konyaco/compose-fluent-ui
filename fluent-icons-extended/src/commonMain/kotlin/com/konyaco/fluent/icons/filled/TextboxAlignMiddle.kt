

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextboxAlignMiddle: ImageVector
    get() {
        if (_textboxAlignMiddle != null) {
            return _textboxAlignMiddle!!
        }
        _textboxAlignMiddle = fluentIcon(name = "Filled.TextboxAlignMiddle") {
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
                moveTo(17.0f, 13.0f)
                lineTo(6.86f, 13.0f)
                curveToRelative(-0.48f, 0.06f, -0.86f, 0.37f, -0.86f, 0.75f)
                curveToRelative(0.0f, 0.41f, 0.45f, 0.75f, 1.0f, 0.75f)
                horizontalLineToRelative(10.14f)
                curveToRelative(0.48f, -0.06f, 0.86f, -0.37f, 0.86f, -0.75f)
                curveToRelative(0.0f, -0.41f, -0.45f, -0.75f, -1.0f, -0.75f)
                close()
            }
        }
        return _textboxAlignMiddle!!
    }

private var _textboxAlignMiddle: ImageVector? = null
