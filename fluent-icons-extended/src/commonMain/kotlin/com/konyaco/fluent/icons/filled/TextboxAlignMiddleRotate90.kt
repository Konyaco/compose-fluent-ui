

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextboxAlignMiddleRotate90: ImageVector
    get() {
        if (_textboxAlignMiddleRotate90 != null) {
            return _textboxAlignMiddleRotate90!!
        }
        _textboxAlignMiddleRotate90 = fluentIcon(name = "Filled.TextboxAlignMiddleRotate90") {
            fluentPath {
                moveTo(21.0f, 18.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineToRelative(-0.14f)
                curveToRelative(-0.06f, -0.48f, -0.37f, -0.86f, -0.75f, -0.86f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.45f, -0.75f, 1.0f)
                verticalLineToRelative(10.14f)
                curveToRelative(0.06f, 0.48f, 0.37f, 0.86f, 0.75f, 0.86f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.45f, 0.75f, -1.0f)
                lineTo(14.0f, 7.0f)
                close()
                moveTo(11.0f, 17.0f)
                lineTo(11.0f, 6.86f)
                curveToRelative(-0.06f, -0.48f, -0.37f, -0.86f, -0.75f, -0.86f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.45f, -0.75f, 1.0f)
                verticalLineToRelative(10.14f)
                curveToRelative(0.06f, 0.48f, 0.37f, 0.86f, 0.75f, 0.86f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.45f, 0.75f, -1.0f)
                close()
            }
        }
        return _textboxAlignMiddleRotate90!!
    }

private var _textboxAlignMiddleRotate90: ImageVector? = null
