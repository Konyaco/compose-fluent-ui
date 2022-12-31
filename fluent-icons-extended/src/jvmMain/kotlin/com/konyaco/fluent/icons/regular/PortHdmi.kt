

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PortHdmi: ImageVector
    get() {
        if (_portHdmi != null) {
            return _portHdmi!!
        }
        _portHdmi = fluentIcon(name = "Regular.PortHdmi") {
            fluentPath {
                moveTo(21.41f, 11.41f)
                lineTo(18.6f, 8.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.17f, 8.0f)
                lineTo(6.83f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.42f, 0.59f)
                lineTo(2.6f, 11.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 12.83f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.42f)
                close()
                moveTo(20.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(4.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.17f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.15f, -0.36f)
                lineToRelative(2.82f, -2.82f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.36f, -0.15f)
                horizontalLineToRelative(10.34f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.36f, 0.15f)
                lineToRelative(2.82f, 2.82f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.15f, 0.36f)
                lineTo(20.5f, 14.0f)
                close()
                moveTo(16.25f, 11.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                close()
            }
        }
        return _portHdmi!!
    }

private var _portHdmi: ImageVector? = null
