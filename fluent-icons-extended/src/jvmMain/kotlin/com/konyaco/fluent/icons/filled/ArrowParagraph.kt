

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowParagraph: ImageVector
    get() {
        if (_arrowParagraph != null) {
            return _arrowParagraph!!
        }
        _arrowParagraph = fluentIcon(name = "Filled.ArrowParagraph") {
            fluentPath {
                moveTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(2.3f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 1.4f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, 1.4f)
                lineTo(14.4f, 8.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(7.3f, 11.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.4f)
                lineTo(9.58f, 15.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(6.59f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.42f, 1.4f)
                lineToRelative(4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.3f, -0.71f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                close()
            }
        }
        return _arrowParagraph!!
    }

private var _arrowParagraph: ImageVector? = null
