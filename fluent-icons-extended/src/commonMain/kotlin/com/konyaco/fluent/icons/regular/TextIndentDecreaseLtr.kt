

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextIndentDecreaseLtr: ImageVector
    get() {
        if (_textIndentDecreaseLtr != null) {
            return _textIndentDecreaseLtr!!
        }
        _textIndentDecreaseLtr = fluentIcon(name = "Regular.TextIndentDecreaseLtr") {
            fluentPath {
                moveTo(17.75f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(2.72f, 11.22f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-1.47f, 1.47f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(-2.0f, 2.0f)
                close()
                moveTo(20.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(17.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        return _textIndentDecreaseLtr!!
    }

private var _textIndentDecreaseLtr: ImageVector? = null
