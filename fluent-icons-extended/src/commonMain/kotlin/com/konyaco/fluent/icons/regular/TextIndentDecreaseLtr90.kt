

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextIndentDecreaseLtr90: ImageVector
    get() {
        if (_textIndentDecreaseLtr90 != null) {
            return _textIndentDecreaseLtr90!!
        }
        _textIndentDecreaseLtr90 = fluentIcon(name = "Regular.TextIndentDecreaseLtr90") {
            fluentPath {
                moveTo(8.0f, 17.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(12.78f, 2.72f)
                lineTo(14.78f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-1.47f, -1.47f)
                lineToRelative(-1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                close()
                moveTo(13.0f, 20.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(18.0f, 17.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        return _textIndentDecreaseLtr90!!
    }

private var _textIndentDecreaseLtr90: ImageVector? = null
