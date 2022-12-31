

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = fluentIcon(name = "Filled.Wrench") {
            fluentPath {
                moveTo(16.75f, 2.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, -5.0f, 6.84f)
                lineToRelative(-9.07f, 9.38f)
                arcToRelative(2.34f, 2.34f, 0.0f, true, false, 3.37f, 3.26f)
                lineTo(15.0f, 12.2f)
                arcTo(5.24f, 5.24f, 0.0f, false, false, 21.8f, 5.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.25f, -0.32f)
                lineToRelative(-3.19f, 3.18f)
                lineTo(15.3f, 6.6f)
                lineToRelative(3.16f, -3.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.33f, -1.26f)
                curveToRelative(-0.44f, -0.12f, -0.9f, -0.18f, -1.38f, -0.18f)
                close()
            }
        }
        return _wrench!!
    }

private var _wrench: ImageVector? = null
