

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatOff: ImageVector
    get() {
        if (_chatOff != null) {
            return _chatOff!!
        }
        _chatOff = fluentIcon(name = "Filled.ChatOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.2f, 2.2f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, false, -1.28f, 11.17f)
                lineToRelative(-1.11f, 4.29f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 1.04f, 1.04f)
                lineToRelative(4.29f, -1.12f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, false, 11.16f, -1.28f)
                lineToRelative(2.2f, 2.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(13.42f, 14.48f)
                lineToRelative(-0.07f, 0.01f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.29f)
                lineToRelative(1.48f, 1.48f)
                close()
                moveTo(9.94f, 11.0f)
                lineTo(8.65f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.16f, -1.45f)
                lineTo(9.94f, 11.0f)
                close()
            }
            fluentPath {
                moveTo(15.25f, 11.0f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(6.3f, 6.3f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 6.7f, 3.52f)
                lineToRelative(5.98f, 5.98f)
                horizontalLineToRelative(2.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _chatOff!!
    }

private var _chatOff: ImageVector? = null
