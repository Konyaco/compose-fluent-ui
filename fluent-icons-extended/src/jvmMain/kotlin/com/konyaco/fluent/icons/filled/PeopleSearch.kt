

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleSearch: ImageVector
    get() {
        if (_peopleSearch != null) {
            return _peopleSearch!!
        }
        _peopleSearch = fluentIcon(name = "Filled.PeopleSearch") {
            fluentPath {
                moveTo(11.9f, 14.0f)
                horizontalLineToRelative(7.85f)
                curveTo(21.0f, 14.0f, 22.0f, 15.0f, 22.0f, 16.25f)
                verticalLineToRelative(0.9f)
                curveToRelative(0.0f, 1.1f, -0.47f, 2.14f, -1.3f, 2.85f)
                curveToRelative(-1.57f, 1.34f, -3.81f, 2.0f, -6.7f, 2.0f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(0.3f, -0.6f, 0.23f, -1.36f, -0.22f, -1.9f)
                lineToRelative(-0.11f, -0.12f)
                lineToRelative(-2.23f, -2.22f)
                arcTo(5.48f, 5.48f, 0.0f, false, false, 11.9f, 14.0f)
                close()
                moveTo(6.5f, 10.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.46f, 7.38f)
                lineToRelative(2.82f, 2.81f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.97f, 1.14f)
                lineToRelative(-0.09f, -0.08f)
                lineToRelative(-2.9f, -2.9f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 6.5f, 10.5f)
                close()
                moveTo(6.5f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(14.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
            }
        }
        return _peopleSearch!!
    }

private var _peopleSearch: ImageVector? = null
