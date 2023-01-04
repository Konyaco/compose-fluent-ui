

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextIndentDecreaseRotate270: ImageVector
    get() {
        if (_textIndentDecreaseRotate270 != null) {
            return _textIndentDecreaseRotate270!!
        }
        _textIndentDecreaseRotate270 = fluentIcon(name = "Regular.TextIndentDecreaseRotate270") {
            fluentPath {
                moveTo(16.0f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(11.22f, 21.28f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -1.13f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                close()
                moveTo(11.0f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(6.0f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-9.0f)
                close()
            }
        }
        return _textIndentDecreaseRotate270!!
    }

private var _textIndentDecreaseRotate270: ImageVector? = null
