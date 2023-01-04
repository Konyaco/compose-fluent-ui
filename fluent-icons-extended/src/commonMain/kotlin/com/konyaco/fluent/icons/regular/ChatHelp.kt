

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChatHelp: ImageVector
    get() {
        if (_chatHelp != null) {
            return _chatHelp!!
        }
        _chatHelp = fluentIcon(name = "Regular.ChatHelp") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -4.59f, 18.89f)
                lineTo(3.6f, 21.96f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.54f, -1.54f)
                lineToRelative(1.06f, -3.83f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -7.43f, 12.64f)
                lineToRelative(0.15f, 0.27f)
                lineToRelative(-1.1f, 3.98f)
                lineToRelative(3.98f, -1.11f)
                lineToRelative(0.27f, 0.15f)
                arcTo(8.5f, 8.5f, 0.0f, true, false, 12.0f, 3.5f)
                close()
                moveTo(12.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 6.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                curveToRelative(0.0f, 1.01f, -0.3f, 1.57f, -1.05f, 2.36f)
                lineToRelative(-0.17f, 0.17f)
                curveToRelative(-0.62f, 0.62f, -0.78f, 0.89f, -0.78f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                curveToRelative(0.0f, -1.01f, 0.3f, -1.57f, 1.05f, -2.36f)
                lineToRelative(0.17f, -0.17f)
                curveToRelative(0.62f, -0.62f, 0.78f, -0.89f, 0.78f, -1.47f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.5f, -0.13f)
                verticalLineToRelative(0.13f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 12.0f, 6.75f)
                close()
            }
        }
        return _chatHelp!!
    }

private var _chatHelp: ImageVector? = null
