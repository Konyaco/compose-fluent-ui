

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MegaphoneCircle: ImageVector
    get() {
        if (_megaphoneCircle != null) {
            return _megaphoneCircle!!
        }
        _megaphoneCircle = fluentIcon(name = "Regular.MegaphoneCircle") {
            fluentPath {
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(14.64f, 7.1f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 17.0f, 8.76f)
                verticalLineToRelative(6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.36f, 1.64f)
                lineToRelative(-1.56f, -0.58f)
                arcTo(2.63f, 2.63f, 0.0f, false, true, 8.0f, 15.38f)
                verticalLineToRelative(-0.95f)
                lineToRelative(-0.86f, -0.31f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 6.0f, 12.46f)
                verticalLineToRelative(-0.95f)
                curveToRelative(0.0f, -0.73f, 0.45f, -1.38f, 1.14f, -1.64f)
                lineToRelative(7.5f, -2.77f)
                close()
                moveTo(9.5f, 15.0f)
                verticalLineToRelative(0.38f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, 2.17f, 0.42f)
                lineTo(9.5f, 15.0f)
                close()
                moveTo(15.5f, 8.76f)
                curveToRelative(0.0f, -0.18f, -0.18f, -0.3f, -0.34f, -0.24f)
                lineToRelative(-7.5f, 2.78f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.16f, 0.23f)
                verticalLineToRelative(0.95f)
                curveToRelative(0.0f, 0.1f, 0.06f, 0.2f, 0.16f, 0.24f)
                lineToRelative(7.5f, 2.77f)
                curveToRelative(0.16f, 0.06f, 0.34f, -0.06f, 0.34f, -0.23f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        return _megaphoneCircle!!
    }

private var _megaphoneCircle: ImageVector? = null
