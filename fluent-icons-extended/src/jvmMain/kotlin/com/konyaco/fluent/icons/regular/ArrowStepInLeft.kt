

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowStepInLeft: ImageVector
    get() {
        if (_arrowStepInLeft != null) {
            return _arrowStepInLeft!!
        }
        _arrowStepInLeft = fluentIcon(name = "Regular.ArrowStepInLeft") {
            fluentPath {
                moveTo(15.3f, 16.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.1f, 1.04f)
                lineToRelative(-4.5f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.04f)
                lineToRelative(4.5f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.1f, 1.04f)
                lineTo(12.0f, 11.25f)
                horizontalLineToRelative(9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-9.26f)
                lineToRelative(3.3f, 3.48f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
            }
        }
        return _arrowStepInLeft!!
    }

private var _arrowStepInLeft: ImageVector? = null
