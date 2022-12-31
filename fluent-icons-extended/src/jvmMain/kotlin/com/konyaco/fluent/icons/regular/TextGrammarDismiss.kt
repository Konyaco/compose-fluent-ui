

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextGrammarDismiss: ImageVector
    get() {
        if (_textGrammarDismiss != null) {
            return _textGrammarDismiss!!
        }
        _textGrammarDismiss = fluentIcon(name = "Regular.TextGrammarDismiss") {
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
                lineTo(2.65f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(8.33f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, -0.06f, -1.5f)
                close()
                moveTo(11.73f, 14.5f)
                lineTo(2.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(12.8f, 13.0f)
                curveToRelative(-0.43f, 0.44f, -0.8f, 0.95f, -1.08f, 1.5f)
                close()
                moveTo(21.25f, 9.0f)
                lineTo(2.65f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(18.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(21.25f, 5.0f)
                lineTo(2.65f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(18.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
            }
        }
        return _textGrammarDismiss!!
    }

private var _textGrammarDismiss: ImageVector? = null
