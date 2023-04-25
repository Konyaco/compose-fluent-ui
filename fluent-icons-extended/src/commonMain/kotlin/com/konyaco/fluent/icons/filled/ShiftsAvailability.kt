

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShiftsAvailability: ImageVector
    get() {
        if (_shiftsAvailability != null) {
            return _shiftsAvailability!!
        }
        _shiftsAvailability = fluentIcon(name = "Filled.ShiftsAvailability") {
            fluentPath {
                moveTo(8.5f, 2.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.48f, 12.98f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 6.96f, -6.96f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 8.5f, 2.0f)
                close()
                moveTo(11.28f, 7.78f)
                lineTo(8.28f, 10.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(0.97f, 0.97f)
                lineToRelative(2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 1.06f)
                close()
                moveTo(9.0f, 15.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -13.0f, 0.0f)
                close()
                moveTo(13.22f, 13.24f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(1.22f, 1.2f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.22f, -1.22f)
                lineToRelative(1.21f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.07f, -1.06f)
                lineToRelative(-1.22f, -1.22f)
                lineToRelative(1.21f, -1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.05f, -1.07f)
                lineToRelative(-1.22f, 1.21f)
                lineToRelative(-1.22f, -1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        return _shiftsAvailability!!
    }

private var _shiftsAvailability: ImageVector? = null
