

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleAudience: ImageVector
    get() {
        if (_peopleAudience != null) {
            return _peopleAudience!!
        }
        _peopleAudience = fluentIcon(name = "Filled.PeopleAudience") {
            fluentPath {
                moveTo(14.75f, 10.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(16.5f, 16.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-4.25f)
                curveToRelative(0.0f, -0.97f, 0.79f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(22.0f, 11.75f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(0.4f, 0.47f, 0.63f, 1.08f, 0.63f, 1.75f)
                lineTo(17.5f, 16.0f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(6.5f, 15.0f)
                verticalLineToRelative(-3.25f)
                lineToRelative(0.01f, -0.22f)
                curveToRelative(0.05f, -0.58f, 0.27f, -1.1f, 0.62f, -1.53f)
                lineTo(3.61f, 10.0f)
                curveToRelative(-0.9f, 0.08f, -1.61f, 0.83f, -1.61f, 1.75f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(6.5f, 16.0f)
                verticalLineToRelative(-1.0f)
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
                moveTo(2.0f, 17.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(18.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 18.25f, 22.0f)
                lineTo(5.75f, 22.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 2.0f, 18.25f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        return _peopleAudience!!
    }

private var _peopleAudience: ImageVector? = null
