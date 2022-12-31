

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShiftsAvailability: ImageVector
    get() {
        if (_shiftsAvailability != null) {
            return _shiftsAvailability!!
        }
        _shiftsAvailability = fluentIcon(name = "Regular.ShiftsAvailability") {
            fluentPath {
                moveTo(8.5f, 3.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.23f, 10.0f)
                curveToRelative(-0.13f, 0.47f, -0.22f, 0.97f, -0.25f, 1.48f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 6.96f, -6.96f)
                curveToRelative(-0.5f, 0.03f, -1.0f, 0.12f, -1.49f, 0.25f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.5f, 3.5f)
                close()
                moveTo(14.28f, 13.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.07f)
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
                close()
                moveTo(15.5f, 9.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                close()
                moveTo(10.5f, 15.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                close()
                moveTo(11.28f, 6.72f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(0.97f, 0.97f)
                lineToRelative(2.47f, -2.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _shiftsAvailability!!
    }

private var _shiftsAvailability: ImageVector? = null
