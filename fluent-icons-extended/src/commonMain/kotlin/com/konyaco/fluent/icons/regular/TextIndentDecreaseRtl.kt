

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextIndentDecreaseRtl: ImageVector
    get() {
        if (_textIndentDecreaseRtl != null) {
            return _textIndentDecreaseRtl!!
        }
        _textIndentDecreaseRtl = fluentIcon(name = "Regular.TextIndentDecreaseRtl") {
            fluentPath {
                moveTo(5.5f, 16.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(2.5f, 11.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(5.5f, 6.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(19.2f, 9.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 1.13f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(-1.47f, 1.47f)
                lineToRelative(-0.07f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, 0.98f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.71f, -0.07f, -0.98f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.08f, -0.07f)
                close()
            }
        }
        return _textIndentDecreaseRtl!!
    }

private var _textIndentDecreaseRtl: ImageVector? = null
