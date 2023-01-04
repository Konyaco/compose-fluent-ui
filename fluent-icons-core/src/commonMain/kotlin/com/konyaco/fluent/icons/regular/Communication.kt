

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Communication: ImageVector
    get() {
        if (_communication != null) {
            return _communication!!
        }
        _communication = fluentIcon(name = "Regular.Communication") {
            fluentPath {
                moveTo(12.0f, 4.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 5.98f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 14.15f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.05f, -1.05f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 12.0f, 4.5f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.53f, 8.54f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 9.19f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.07f, -1.06f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
                moveTo(11.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
            }
        }
        return _communication!!
    }

private var _communication: ImageVector? = null
