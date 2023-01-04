

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextParagraph: ImageVector
    get() {
        if (_textParagraph != null) {
            return _textParagraph!!
        }
        _textParagraph = fluentIcon(name = "Regular.TextParagraph") {
            fluentPath {
                moveTo(21.25f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-5.69f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(13.56f, 8.0f)
                horizontalLineToRelative(5.69f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(7.72f, 11.22f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineTo(10.44f, 15.0f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.69f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(4.0f, -4.0f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        return _textParagraph!!
    }

private var _textParagraph: ImageVector? = null
