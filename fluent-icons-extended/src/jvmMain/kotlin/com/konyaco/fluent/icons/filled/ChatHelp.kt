

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatHelp: ImageVector
    get() {
        if (_chatHelp != null) {
            return _chatHelp!!
        }
        _chatHelp = fluentIcon(name = "Filled.ChatHelp") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -4.64f, 18.86f)
                lineToRelative(-4.3f, 1.12f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -1.03f, -1.04f)
                lineToRelative(1.11f, -4.29f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 9.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.1f)
                verticalLineToRelative(-0.23f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.13f)
                curveToRelative(0.0f, 0.54f, -0.13f, 0.8f, -0.64f, 1.33f)
                lineToRelative(-0.3f, 0.31f)
                curveToRelative(-0.76f, 0.79f, -1.06f, 1.35f, -1.06f, 2.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                curveToRelative(0.0f, -0.54f, 0.13f, -0.8f, 0.64f, -1.33f)
                lineToRelative(0.3f, -0.31f)
                curveToRelative(0.76f, -0.79f, 1.06f, -1.35f, 1.06f, -2.36f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 12.0f, 6.75f)
                close()
            }
        }
        return _chatHelp!!
    }

private var _chatHelp: ImageVector? = null
