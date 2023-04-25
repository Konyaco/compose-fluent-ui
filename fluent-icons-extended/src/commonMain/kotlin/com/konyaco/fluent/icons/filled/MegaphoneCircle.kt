

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MegaphoneCircle: ImageVector
    get() {
        if (_megaphoneCircle != null) {
            return _megaphoneCircle!!
        }
        _megaphoneCircle = fluentIcon(name = "Filled.MegaphoneCircle") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(8.0f, 14.43f)
                lineTo(7.14f, 14.12f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 6.0f, 12.46f)
                verticalLineToRelative(-0.95f)
                curveToRelative(0.0f, -0.73f, 0.45f, -1.38f, 1.14f, -1.64f)
                lineToRelative(7.5f, -2.77f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 17.0f, 8.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.36f, 1.64f)
                lineToRelative(-1.43f, -0.53f)
                arcTo(2.63f, 2.63f, 0.0f, false, true, 8.0f, 15.88f)
                verticalLineToRelative(-1.45f)
                close()
                moveTo(11.75f, 15.83f)
                verticalLineToRelative(0.04f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, -2.25f, 0.0f)
                lineTo(9.5f, 15.0f)
                lineToRelative(2.25f, 0.83f)
                close()
            }
        }
        return _megaphoneCircle!!
    }

private var _megaphoneCircle: ImageVector? = null
