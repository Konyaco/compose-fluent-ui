

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EmojiLaugh: ImageVector
    get() {
        if (_emojiLaugh != null) {
            return _emojiLaugh!!
        }
        _emojiLaugh = fluentIcon(name = "Regular.EmojiLaugh") {
            fluentPath {
                moveTo(6.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.82f)
                curveToRelative(0.28f, 3.07f, 2.55f, 5.68f, 6.0f, 5.68f)
                reflectiveCurveToRelative(5.72f, -2.6f, 6.0f, -5.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.82f)
                lineTo(6.75f, 12.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -4.37f, -3.5f)
                horizontalLineToRelative(8.74f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 12.0f, 17.0f)
                close()
                moveTo(15.25f, 8.75f)
                curveToRelative(-0.4f, 0.0f, -0.71f, 0.29f, -0.76f, 0.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.48f, -0.22f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.24f, -1.89f)
                curveToRelative(1.12f, 0.0f, 2.08f, 0.8f, 2.24f, 1.89f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.48f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.76f, -0.61f)
                close()
                moveTo(7.99f, 9.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.76f, -0.61f)
                curveToRelative(0.4f, 0.0f, 0.71f, 0.29f, 0.76f, 0.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.48f, -0.22f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.24f, -1.89f)
                curveToRelative(-1.12f, 0.0f, -2.08f, 0.8f, -2.24f, 1.89f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.48f, 0.22f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
            }
        }
        return _emojiLaugh!!
    }

private var _emojiLaugh: ImageVector? = null
