

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MusicNoteOff2: ImageVector
    get() {
        if (_musicNoteOff2 != null) {
            return _musicNoteOff2!!
        }
        _musicNoteOff2 = fluentIcon(name = "Regular.MusicNoteOff2") {
            fluentPath {
                moveTo(8.5f, 9.56f)
                verticalLineToRelative(6.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 1.5f, 2.62f)
                verticalLineToRelative(-7.19f)
                lineToRelative(3.55f, 3.55f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.84f, 4.84f)
                lineToRelative(2.33f, 2.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(8.5f, 9.56f)
                close()
                moveTo(17.28f, 18.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.62f, -2.62f)
                lineToRelative(2.62f, 2.62f)
                close()
                moveTo(6.5f, 16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                close()
                moveTo(16.5f, 13.0f)
                lineToRelative(-0.3f, 0.01f)
                lineToRelative(3.79f, 3.8f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 0.01f, -0.56f)
                lineTo(20.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, -0.72f)
                lineToRelative(-10.0f, 3.0f)
                curveToRelative(-0.2f, 0.06f, -0.35f, 0.2f, -0.44f, 0.37f)
                lineTo(10.0f, 6.82f)
                lineTo(10.0f, 6.3f)
                lineToRelative(8.5f, -2.55f)
                verticalLineToRelative(2.43f)
                lineToRelative(-7.02f, 2.1f)
                lineToRelative(1.2f, 1.21f)
                lineToRelative(5.82f, -1.74f)
                verticalLineToRelative(5.87f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -2.0f, -0.63f)
                close()
            }
        }
        return _musicNoteOff2!!
    }

private var _musicNoteOff2: ImageVector? = null
