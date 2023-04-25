

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EditProhibited: ImageVector
    get() {
        if (_editProhibited != null) {
            return _editProhibited!!
        }
        _editProhibited = fluentIcon(name = "Filled.EditProhibited") {
            fluentPath {
                moveTo(15.9f, 3.05f)
                arcToRelative(3.58f, 3.58f, 0.0f, true, true, 5.05f, 5.06f)
                lineToRelative(-0.89f, 0.9f)
                lineTo(15.0f, 3.93f)
                lineToRelative(0.9f, -0.9f)
                close()
                moveTo(13.93f, 5.0f)
                lineToRelative(-10.0f, 10.0f)
                curveToRelative(-0.4f, 0.4f, -0.7f, 0.92f, -0.82f, 1.48f)
                lineToRelative(-1.1f, 4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.9f, 0.9f)
                lineToRelative(4.6f, -1.1f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 9.0f, 20.07f)
                lineToRelative(1.15f, -1.15f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, 7.76f, -7.76f)
                lineTo(19.0f, 10.06f)
                lineTo(13.94f, 5.0f)
                close()
                moveTo(22.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(12.5f, 17.5f)
                curveToRelative(0.0f, 0.83f, 0.26f, 1.6f, 0.7f, 2.25f)
                lineToRelative(5.55f, -5.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.25f, 3.3f)
                close()
                moveTo(16.5f, 21.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -6.25f)
                lineToRelative(-5.55f, 5.56f)
                curveToRelative(0.64f, 0.44f, 1.42f, 0.7f, 2.25f, 0.7f)
                close()
                moveTo(9.0f, 20.06f)
                lineToRelative(-0.53f, -0.53f)
                close()
            }
        }
        return _editProhibited!!
    }

private var _editProhibited: ImageVector? = null
