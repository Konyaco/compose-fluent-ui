

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleQueue: ImageVector
    get() {
        if (_peopleQueue != null) {
            return _peopleQueue!!
        }
        _peopleQueue = fluentIcon(name = "Filled.PeopleQueue") {
            fluentPath {
                moveTo(10.92f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(5.17f, 10.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(4.75f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 9.0f, 0.0f)
                verticalLineToRelative(-4.75f)
                curveToRelative(0.0f, -0.97f, -0.79f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(11.27f, 20.85f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.15f, -4.35f)
                verticalLineToRelative(-4.75f)
                curveToRelative(0.0f, -0.66f, -0.24f, -1.27f, -0.63f, -1.75f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.96f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.75f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -5.64f, 4.35f)
                close()
                moveTo(11.93f, 6.0f)
                curveToRelative(0.0f, 1.0f, -0.37f, 1.91f, -0.98f, 2.61f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -5.23f)
                curveToRelative(0.6f, 0.7f, 0.98f, 1.62f, 0.98f, 2.62f)
                close()
                moveTo(15.79f, 20.85f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.14f, -4.35f)
                verticalLineToRelative(-4.75f)
                curveToRelative(0.0f, -0.66f, -0.24f, -1.27f, -0.63f, -1.75f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.96f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.75f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -5.64f, 4.35f)
                close()
                moveTo(16.42f, 6.0f)
                curveToRelative(0.0f, 1.0f, -0.37f, 1.91f, -0.98f, 2.61f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -5.23f)
                curveToRelative(0.6f, 0.7f, 0.98f, 1.62f, 0.98f, 2.62f)
                close()
            }
        }
        return _peopleQueue!!
    }

private var _peopleQueue: ImageVector? = null
