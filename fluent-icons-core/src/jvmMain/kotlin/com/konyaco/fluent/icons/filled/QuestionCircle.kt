

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.QuestionCircle: ImageVector
    get() {
        if (_questionCircle != null) {
            return _questionCircle!!
        }
        _questionCircle = fluentIcon(name = "Filled.QuestionCircle") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 9.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.1f)
                verticalLineToRelative(-0.1f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                curveToRelative(0.0f, 0.54f, -0.13f, 0.8f, -0.64f, 1.33f)
                lineToRelative(-0.14f, 0.14f)
                curveToRelative(-0.88f, 0.88f, -1.22f, 1.45f, -1.22f, 2.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                curveToRelative(0.0f, -0.54f, 0.13f, -0.8f, 0.64f, -1.33f)
                lineToRelative(0.14f, -0.14f)
                curveToRelative(0.88f, -0.88f, 1.22f, -1.45f, 1.22f, -2.53f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 12.0f, 6.75f)
                close()
            }
        }
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
