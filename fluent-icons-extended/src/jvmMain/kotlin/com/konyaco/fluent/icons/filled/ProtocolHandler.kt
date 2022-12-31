

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ProtocolHandler: ImageVector
    get() {
        if (_protocolHandler != null) {
            return _protocolHandler!!
        }
        _protocolHandler = fluentIcon(name = "Filled.ProtocolHandler") {
            fluentPath {
                moveTo(13.48f, 17.73f)
                lineToRelative(-0.77f, -0.77f)
                lineToRelative(2.48f, -2.49f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -4.95f)
                lineTo(12.7f, 7.04f)
                lineToRelative(0.77f, -0.77f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.54f, 0.0f)
                lineToRelative(3.96f, 3.96f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 3.54f)
                lineToRelative(-3.96f, 3.96f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.54f, 0.0f)
                close()
                moveTo(14.48f, 13.77f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -3.54f)
                lineToRelative(-3.96f, -3.96f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.54f, 0.0f)
                lineToRelative(-3.96f, 3.96f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.54f)
                lineToRelative(3.96f, 3.96f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.54f, 0.0f)
                lineToRelative(3.96f, -3.96f)
                close()
            }
        }
        return _protocolHandler!!
    }

private var _protocolHandler: ImageVector? = null
