

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.People: ImageVector
    get() {
        if (_people != null) {
            return _people!!
        }
        _people = fluentIcon(name = "Regular.People") {
            fluentPath {
                moveTo(5.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(15.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(17.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(14.25f, 19.04f)
                curveToRelative(0.7f, 0.28f, 1.6f, 0.46f, 2.75f, 0.46f)
                curveToRelative(2.28f, 0.0f, 3.59f, -0.7f, 4.3f, -1.56f)
                arcToRelative(3.14f, 3.14f, 0.0f, false, false, 0.7f, -1.73f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.0f, -1.2f, -0.97f, -2.18f, -2.18f, -2.18f)
                lineTo(14.1f, 14.0f)
                curveToRelative(0.4f, 0.41f, 0.68f, 0.93f, 0.81f, 1.5f)
                horizontalLineToRelative(4.91f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.68f, 0.7f)
                lineToRelative(-0.04f, 0.18f)
                curveToRelative(-0.04f, 0.16f, -0.13f, 0.38f, -0.32f, 0.6f)
                curveTo(19.8f, 17.42f, 18.97f, 18.0f, 17.0f, 18.0f)
                curveToRelative(-0.98f, 0.0f, -1.67f, -0.15f, -2.17f, -0.34f)
                curveToRelative(-0.1f, 0.4f, -0.28f, 0.88f, -0.58f, 1.38f)
                close()
                moveTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.28f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, 0.01f, 0.2f)
                curveToRelative(0.02f, 0.14f, 0.04f, 0.32f, 0.1f, 0.53f)
                curveToRelative(0.09f, 0.42f, 0.29f, 0.98f, 0.68f, 1.55f)
                curveTo(3.61f, 19.97f, 5.17f, 21.0f, 8.0f, 21.0f)
                reflectiveCurveToRelative(4.39f, -1.03f, 5.2f, -2.2f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, 0.8f, -2.27f)
                verticalLineToRelative(-0.28f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(3.5f, 16.5f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.34f)
                lineToRelative(-0.06f, 0.33f)
                curveToRelative(-0.07f, 0.28f, -0.2f, 0.65f, -0.46f, 1.02f)
                curveToRelative(-0.5f, 0.71f, -1.56f, 1.56f, -3.98f, 1.56f)
                reflectiveCurveToRelative(-3.49f, -0.85f, -3.98f, -1.56f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, -0.52f, -1.43f)
                close()
            }
        }
        return _people!!
    }

private var _people: ImageVector? = null
