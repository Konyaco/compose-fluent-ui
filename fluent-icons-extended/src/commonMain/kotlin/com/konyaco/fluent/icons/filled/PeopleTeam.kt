

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleTeam: ImageVector
    get() {
        if (_peopleTeam != null) {
            return _peopleTeam!!
        }
        _peopleTeam = fluentIcon(name = "Filled.PeopleTeam") {
            fluentPath {
                moveTo(14.75f, 10.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.75f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -9.0f, 0.0f)
                verticalLineToRelative(-4.75f)
                curveToRelative(0.0f, -0.97f, 0.79f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(7.13f, 10.0f)
                curveToRelative(-0.35f, 0.42f, -0.57f, 0.95f, -0.62f, 1.53f)
                verticalLineToRelative(4.97f)
                curveToRelative(0.0f, 0.85f, 0.18f, 1.65f, 0.52f, 2.36f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.0f, 15.0f)
                verticalLineToRelative(-3.24f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.74f)
                lineToRelative(0.15f, -0.01f)
                horizontalLineToRelative(3.38f)
                close()
                moveTo(16.87f, 10.0f)
                horizontalLineToRelative(3.38f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(22.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.03f, 3.87f)
                curveToRelative(0.3f, -0.63f, 0.48f, -1.32f, 0.53f, -2.06f)
                verticalLineToRelative(-5.06f)
                curveToRelative(0.0f, -0.67f, -0.23f, -1.28f, -0.63f, -1.75f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(18.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(5.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
            }
        }
        return _peopleTeam!!
    }

private var _peopleTeam: ImageVector? = null
