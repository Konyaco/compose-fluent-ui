

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
                moveTo(13.45f, 2.53f)
                curveToRelative(-0.84f, -0.7f, -2.06f, -0.7f, -2.9f, 0.0f)
                lineTo(3.8f, 8.23f)
                curveToRelative(-0.5f, 0.42f, -0.8f, 1.05f, -0.8f, 1.72f)
                verticalLineToRelative(9.8f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.79f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 21.0f, 12.05f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.0f, -0.67f, -0.3f, -1.3f, -0.8f, -1.72f)
                lineToRelative(-6.75f, -5.7f)
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
