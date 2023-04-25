

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ProhibitedMultiple: ImageVector
    get() {
        if (_prohibitedMultiple != null) {
            return _prohibitedMultiple!!
        }
        _prohibitedMultiple = fluentIcon(name = "Filled.ProhibitedMultiple") {
            fluentPath {
                moveTo(10.75f, 19.5f)
                arcToRelative(8.75f, 8.75f, 0.0f, true, false, 0.0f, -17.5f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, 0.0f, 17.5f)
                close()
                moveTo(10.75f, 17.5f)
                curveToRelative(-1.5f, 0.0f, -2.9f, -0.5f, -4.01f, -1.32f)
                lineToRelative(9.44f, -9.44f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, true, -5.43f, 10.76f)
                close()
                moveTo(14.76f, 5.32f)
                lineTo(5.32f, 14.76f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, true, 9.44f, -9.44f)
                close()
                moveTo(20.5f, 10.75f)
                arcToRelative(9.75f, 9.75f, 0.0f, false, true, -12.8f, 9.26f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 20.02f, 7.7f)
                curveToRelative(0.3f, 0.97f, 0.48f, 2.0f, 0.48f, 3.06f)
                close()
            }
        }
        return _prohibitedMultiple!!
    }

private var _prohibitedMultiple: ImageVector? = null
