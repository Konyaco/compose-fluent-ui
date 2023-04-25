

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EditOff: ImageVector
    get() {
        if (_editOff != null) {
            return _editOff!!
        }
        _editOff = fluentIcon(name = "Regular.EditOff") {
            fluentPath {
                moveTo(8.94f, 10.0f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineTo(14.0f, 15.06f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.4f, 0.4f, -0.92f, 0.7f, -1.48f, 0.83f)
                lineToRelative(-4.6f, 1.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.9f, -0.91f)
                lineToRelative(1.1f, -4.6f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 3.94f, 15.0f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(12.94f, 14.0f)
                lineTo(10.0f, 11.06f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.42f, 0.76f)
                lineToRelative(-0.82f, 3.42f)
                lineToRelative(3.42f, -0.81f)
                curveToRelative(0.29f, -0.07f, 0.55f, -0.22f, 0.76f, -0.43f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(17.94f, 9.0f)
                lineTo(15.06f, 11.88f)
                lineTo(16.12f, 12.94f)
                lineTo(20.95f, 8.11f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -5.06f, -5.06f)
                lineToRelative(-4.83f, 4.83f)
                lineToRelative(1.06f, 1.06f)
                lineTo(15.0f, 6.06f)
                lineTo(17.94f, 9.0f)
                close()
                moveTo(16.95f, 4.1f)
                arcToRelative(2.08f, 2.08f, 0.0f, true, true, 2.94f, 2.95f)
                lineToRelative(-0.89f, 0.89f)
                lineTo(16.06f, 5.0f)
                lineToRelative(0.9f, -0.9f)
                close()
            }
        }
        return _editOff!!
    }

private var _editOff: ImageVector? = null
