

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ProhibitedMultiple: ImageVector
    get() {
        if (_prohibitedMultiple != null) {
            return _prohibitedMultiple!!
        }
        _prohibitedMultiple = fluentIcon(name = "Regular.ProhibitedMultiple") {
            fluentPath {
                moveTo(2.0f, 10.75f)
                arcToRelative(8.75f, 8.75f, 0.0f, true, true, 17.5f, 0.0f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, true, -17.5f, 0.0f)
                close()
                moveTo(10.75f, 3.5f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, -5.63f, 11.82f)
                lineToRelative(10.2f, -10.2f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, false, -4.57f, -1.62f)
                close()
                moveTo(10.75f, 18.0f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 5.63f, -11.82f)
                lineToRelative(-10.2f, 10.2f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 10.75f, 18.0f)
                close()
                moveTo(13.25f, 22.0f)
                curveToRelative(-2.1f, 0.0f, -4.04f, -0.75f, -5.55f, -1.99f)
                arcToRelative(9.74f, 9.74f, 0.0f, false, false, 4.4f, 0.4f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 8.32f, -8.31f)
                arcToRelative(9.84f, 9.84f, 0.0f, false, false, -0.4f, -4.4f)
                arcTo(8.75f, 8.75f, 0.0f, false, true, 13.25f, 22.0f)
                close()
            }
        }
        return _prohibitedMultiple!!
    }

private var _prohibitedMultiple: ImageVector? = null
