

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiLaugh: ImageVector
    get() {
        if (_emojiLaugh != null) {
            return _emojiLaugh!!
        }
        _emojiLaugh = fluentIcon(name = "Filled.EmojiLaugh") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(14.5f, 9.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, -0.22f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.25f, -1.89f)
                curveToRelative(1.12f, 0.0f, 2.08f, 0.8f, 2.24f, 1.89f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.48f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.76f, -0.61f)
                curveToRelative(-0.4f, 0.0f, -0.71f, 0.29f, -0.76f, 0.61f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.14f, 0.0f, -5.24f, -2.36f, -5.5f, -5.25f)
                horizontalLineToRelative(11.0f)
                curveTo(17.24f, 15.64f, 15.14f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(8.75f, 8.75f)
                curveToRelative(-0.4f, 0.0f, -0.71f, 0.29f, -0.76f, 0.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.48f, -0.22f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.24f, -1.89f)
                curveToRelative(1.12f, 0.0f, 2.08f, 0.8f, 2.24f, 1.89f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.48f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.76f, -0.61f)
                close()
            }
        }
        return _emojiLaugh!!
    }

private var _emojiLaugh: ImageVector? = null
