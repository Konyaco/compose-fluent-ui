

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextboxAlignMiddle: ImageVector
    get() {
        if (_textboxAlignMiddle != null) {
            return _textboxAlignMiddle!!
        }
        _textboxAlignMiddle = fluentIcon(name = "Regular.TextboxAlignMiddle") {
            fluentPath {
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.34f, 1.0f, 0.75f)
                curveToRelative(0.0f, 0.38f, -0.38f, 0.7f, -0.86f, 0.74f)
                lineToRelative(-0.14f, 0.01f)
                lineTo(7.0f, 11.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.34f, -1.0f, -0.75f)
                curveToRelative(0.0f, -0.38f, 0.38f, -0.7f, 0.86f, -0.74f)
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
                moveTo(21.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                lineTo(5.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 5.75f, 21.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 18.25f)
                lineTo(21.0f, 5.75f)
                close()
                moveTo(5.75f, 4.5f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(5.75f, 19.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(4.5f, 5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                close()
            }
        }
        return _textboxAlignMiddle!!
    }

private var _textboxAlignMiddle: ImageVector? = null
