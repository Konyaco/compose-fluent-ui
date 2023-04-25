

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlideTextPerson: ImageVector
    get() {
        if (_slideTextPerson != null) {
            return _slideTextPerson!!
        }
        _slideTextPerson = fluentIcon(name = "Filled.SlideTextPerson") {
            fluentPath {
                moveTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                lineTo(13.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -0.13f)
                verticalLineToRelative(-0.1f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 15.77f, 17.0f)
                horizontalLineToRelative(0.28f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, -0.42f, -4.5f)
                lineTo(6.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.37f, 0.0f, 0.69f, 0.27f, 0.74f, 0.63f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 21.96f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                lineTo(4.75f, 4.0f)
                close()
                moveTo(6.0f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 8.75f)
                close()
                moveTo(6.75f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
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
        return _slideTextPerson!!
    }

private var _slideTextPerson: ImageVector? = null
