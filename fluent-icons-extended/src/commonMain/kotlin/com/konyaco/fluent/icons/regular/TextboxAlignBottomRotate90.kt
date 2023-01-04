

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextboxAlignBottomRotate90: ImageVector
    get() {
        if (_textboxAlignBottomRotate90 != null) {
            return _textboxAlignBottomRotate90!!
        }
        _textboxAlignBottomRotate90 = fluentIcon(name = "Regular.TextboxAlignBottomRotate90") {
            fluentPath {
                moveTo(10.5f, 6.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(9.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(0.1f)
                close()
                moveTo(7.5f, 17.25f)
                lineTo(7.5f, 6.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(10.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                close()
                moveTo(18.25f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 18.25f)
                lineTo(21.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                lineTo(5.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 5.75f, 21.0f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(19.5f, 5.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(5.75f, 19.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(4.5f, 5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                close()
            }
        }
        return _textboxAlignBottomRotate90!!
    }

private var _textboxAlignBottomRotate90: ImageVector? = null
