

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextboxAlignBottomRotate90: ImageVector
    get() {
        if (_textboxAlignBottomRotate90 != null) {
            return _textboxAlignBottomRotate90!!
        }
        _textboxAlignBottomRotate90 = fluentIcon(name = "Filled.TextboxAlignBottomRotate90") {
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
                moveTo(10.5f, 6.75f)
                verticalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(10.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                lineTo(10.5f, 6.75f)
                close()
                moveTo(7.5f, 17.25f)
                lineTo(7.5f, 6.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(10.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                close()
            }
        }
        return _textboxAlignBottomRotate90!!
    }

private var _textboxAlignBottomRotate90: ImageVector? = null
