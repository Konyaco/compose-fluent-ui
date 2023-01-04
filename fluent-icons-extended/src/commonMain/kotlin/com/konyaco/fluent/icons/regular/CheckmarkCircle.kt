

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CheckmarkCircle: ImageVector
    get() {
        if (_checkmarkCircle != null) {
            return _checkmarkCircle!!
        }
        _checkmarkCircle = fluentIcon(name = "Regular.CheckmarkCircle") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(10.75f, 13.44f)
                lineToRelative(4.47f, -4.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -1.13f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(1.97f, 1.97f)
                lineToRelative(4.47f, -4.47f)
                lineToRelative(-4.47f, 4.47f)
                close()
            }
        }
        return _checkmarkCircle!!
    }

private var _checkmarkCircle: ImageVector? = null
