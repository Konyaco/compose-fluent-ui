

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextGrammarCheckmark: ImageVector
    get() {
        if (_textGrammarCheckmark != null) {
            return _textGrammarCheckmark!!
        }
        _textGrammarCheckmark = fluentIcon(name = "Regular.TextGrammarCheckmark") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(20.15f, 15.15f)
                lineToRelative(-4.1f, 4.09f)
                lineToRelative(-1.15f, -1.54f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.8f, 0.6f)
                lineToRelative(1.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.75f, 0.05f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
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
        return _textGrammarCheckmark!!
    }

private var _textGrammarCheckmark: ImageVector? = null
