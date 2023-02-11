

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.HomePerson: ImageVector
    get() {
        if (_homePerson != null) {
            return _homePerson!!
        }
        _homePerson = fluentIcon(name = "Regular.HomePerson") {
            fluentPath {
                moveTo(10.55f, 2.53f)
                curveToRelative(0.84f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(6.75f, 5.7f)
                curveToRelative(0.5f, 0.42f, 0.8f, 1.05f, 0.8f, 1.71f)
                verticalLineToRelative(2.11f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.5f, -0.9f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.0f, -0.23f, -0.1f, -0.44f, -0.27f, -0.58f)
                lineToRelative(-6.75f, -5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.96f, 0.0f)
                lineToRelative(-6.75f, 5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.27f, 0.57f)
                verticalLineToRelative(9.8f)
                curveToRelative(0.0f, 0.15f, 0.11f, 0.26f, 0.25f, 0.26f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.38f)
                curveToRelative(-0.3f, 0.44f, -0.52f, 0.95f, -0.6f, 1.5f)
                lineTo(10.26f, 14.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.96f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-3.5f)
                curveTo(3.78f, 21.5f, 3.0f, 20.7f, 3.0f, 19.75f)
                verticalLineToRelative(-9.8f)
                curveToRelative(0.0f, -0.67f, 0.3f, -1.3f, 0.8f, -1.73f)
                lineToRelative(6.75f, -5.69f)
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
