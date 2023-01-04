

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextIndentIncreaseRtl: ImageVector
    get() {
        if (_textIndentIncreaseRtl != null) {
            return _textIndentIncreaseRtl!!
        }
        _textIndentIncreaseRtl = fluentIcon(name = "Regular.TextIndentIncreaseRtl") {
            fluentPath {
                moveTo(6.25f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(21.28f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(-1.47f, -1.47f)
                lineToRelative(1.47f, -1.47f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                close()
                moveTo(3.25f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(6.25f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        return _textIndentIncreaseRtl!!
    }

private var _textIndentIncreaseRtl: ImageVector? = null
