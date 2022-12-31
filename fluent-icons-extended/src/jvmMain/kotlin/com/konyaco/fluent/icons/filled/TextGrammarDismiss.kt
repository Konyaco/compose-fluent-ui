

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextGrammarDismiss: ImageVector
    get() {
        if (_textGrammarDismiss != null) {
            return _textGrammarDismiss!!
        }
        _textGrammarDismiss = fluentIcon(name = "Filled.TextGrammarDismiss") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(15.02f, 15.02f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.71f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(-1.76f, 1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.7f, 0.7f)
                lineToRelative(1.77f, -1.76f)
                lineToRelative(1.77f, 1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.7f, -0.71f)
                lineToRelative(-1.76f, -1.77f)
                lineToRelative(1.77f, -1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineToRelative(-1.78f, 1.76f)
                lineToRelative(-1.77f, -1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                close()
                moveTo(11.02f, 17.0f)
                lineTo(2.88f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 19.0f)
                horizontalLineToRelative(8.17f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -0.15f, -2.0f)
                close()
                moveTo(11.5f, 15.0f)
                lineTo(3.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(9.93f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -1.31f, 2.0f)
                close()
                moveTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(21.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(2.88f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 7.0f)
                horizontalLineToRelative(18.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 5.0f)
                close()
            }
        }
        return _textGrammarDismiss!!
    }

private var _textGrammarDismiss: ImageVector? = null
