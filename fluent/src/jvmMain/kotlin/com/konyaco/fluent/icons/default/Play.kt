

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = fluentIcon(name = "Default.Play") {
            fluentPath {
                moveTo(1792.0f, 1024.0f)
                lineTo(512.0f, 1920.0f)
                verticalLineTo(128.0f)
                lineToRelative(1280.0f, 896.0f)
                close()
                moveTo(640.0f, 1674.0f)
                lineToRelative(929.0f, -650.0f)
                lineToRelative(-929.0f, -650.0f)
                verticalLineToRelative(1300.0f)
                close()
            }
        }
        return _play!!
    }

private var _play: ImageVector? = null
