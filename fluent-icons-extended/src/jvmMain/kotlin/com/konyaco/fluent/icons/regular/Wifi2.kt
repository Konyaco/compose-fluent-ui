

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Wifi2: ImageVector
    get() {
        if (_wifi2 != null) {
            return _wifi2!!
        }
        _wifi2 = fluentIcon(name = "Regular.Wifi2") {
            fluentPath {
                moveTo(17.74f, 10.75f)
                curveToRelative(0.6f, 0.6f, 1.1f, 1.3f, 1.5f, 2.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.34f, 0.68f)
                arcToRelative(6.56f, 6.56f, 0.0f, false, false, -11.71f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.34f, -0.67f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, 12.9f, -2.06f)
                close()
                moveTo(15.64f, 13.82f)
                curveToRelative(0.45f, 0.45f, 0.82f, 1.0f, 1.08f, 1.58f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.38f, 0.6f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 8.75f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.37f, -0.6f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 8.26f, -1.57f)
                close()
                moveTo(13.06f, 16.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.12f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, -2.12f)
                close()
            }
        }
        return _wifi2!!
    }

private var _wifi2: ImageVector? = null
