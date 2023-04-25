

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HomePerson: ImageVector
    get() {
        if (_homePerson != null) {
            return _homePerson!!
        }
        _homePerson = fluentIcon(name = "Filled.HomePerson") {
            fluentPath {
                moveTo(10.55f, 2.53f)
                curveToRelative(0.84f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(6.75f, 5.7f)
                curveToRelative(0.5f, 0.43f, 0.8f, 1.05f, 0.8f, 1.72f)
                verticalLineToRelative(2.1f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -6.0f, 2.45f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, false, -1.22f, -1.0f)
                horizontalLineToRelative(-3.56f)
                curveToRelative(-0.68f, 0.02f, -1.22f, 0.57f, -1.22f, 1.25f)
                verticalLineToRelative(4.0f)
                curveTo(9.0f, 20.22f, 8.22f, 21.0f, 7.25f, 21.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(3.78f, 21.0f, 3.0f, 20.22f, 3.0f, 19.25f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.67f, 0.3f, -1.3f, 0.8f, -1.72f)
                lineToRelative(6.75f, -5.7f)
                close()
                moveTo(21.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(23.0f, 19.88f)
                curveToRelative(0.0f, 1.55f, -1.29f, 3.12f, -4.5f, 3.12f)
                reflectiveCurveTo(14.0f, 21.44f, 14.0f, 19.87f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.98f, 0.8f, -1.77f, 1.77f, -1.77f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _homePerson!!
    }

private var _homePerson: ImageVector? = null
