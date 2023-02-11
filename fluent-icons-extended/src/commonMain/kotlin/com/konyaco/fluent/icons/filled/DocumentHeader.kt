

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentHeader: ImageVector
    get() {
        if (_documentHeader != null) {
            return _documentHeader!!
        }
        _documentHeader = fluentIcon(name = "Filled.DocumentHeader") {
            fluentPath {
                moveTo(17.75f, 2.0f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.93f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineTo(6.25f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.93f, -2.24f, -2.1f)
                lineTo(4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(6.25f, 2.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(8.51f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        return _documentHeader!!
    }

private var _documentHeader: ImageVector? = null
