

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MusicNoteOff1: ImageVector
    get() {
        if (_musicNoteOff1 != null) {
            return _musicNoteOff1!!
        }
        _musicNoteOff1 = fluentIcon(name = "Regular.MusicNoteOff1") {
            fluentPath {
                moveToRelative(12.0f, 13.06f)
                lineToRelative(8.72f, 8.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(8.28f, 8.28f)
                verticalLineToRelative(3.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 1.5f, 3.37f)
                verticalLineToRelative(-5.19f)
                close()
                moveTo(10.5f, 18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(18.99f, 11.45f)
                lineTo(12.02f, 8.85f)
                lineTo(10.5f, 7.32f)
                lineTo(10.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.01f, -0.7f)
                lineToRelative(6.38f, 2.39f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 20.0f, 7.48f)
                verticalLineToRelative(3.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.01f, 0.7f)
                close()
                moveTo(18.5f, 9.67f)
                lineTo(18.5f, 7.48f)
                curveToRelative(0.0f, -0.73f, -0.45f, -1.38f, -1.14f, -1.64f)
                lineToRelative(-5.36f, -2.0f)
                verticalLineToRelative(3.39f)
                lineToRelative(6.5f, 2.44f)
                close()
            }
        }
        return _musicNoteOff1!!
    }

private var _musicNoteOff1: ImageVector? = null
