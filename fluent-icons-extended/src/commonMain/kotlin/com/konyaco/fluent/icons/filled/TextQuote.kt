

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextQuote: ImageVector
    get() {
        if (_textQuote != null) {
            return _textQuote!!
        }
        _textQuote = fluentIcon(name = "Filled.TextQuote") {
            fluentPath {
                moveTo(7.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.0f, 8.34f)
                verticalLineToRelative(0.2f)
                arcToRelative(13.01f, 13.01f, 0.0f, false, true, -3.7f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.1f, -1.02f)
                arcToRelative(11.55f, 11.55f, 0.0f, false, false, 3.08f, -5.86f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 7.5f, 6.0f)
                close()
                moveTo(16.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 8.34f)
                verticalLineToRelative(0.2f)
                arcToRelative(12.99f, 12.99f, 0.0f, false, true, -3.7f, 9.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.1f, -1.04f)
                arcToRelative(11.51f, 11.51f, 0.0f, false, false, 3.08f, -5.85f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 16.5f, 6.0f)
                close()
            }
        }
        return _textQuote!!
    }

private var _textQuote: ImageVector? = null
