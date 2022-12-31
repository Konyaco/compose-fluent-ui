

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DatabasePerson: ImageVector
    get() {
        if (_databasePerson != null) {
            return _databasePerson!!
        }
        _databasePerson = fluentIcon(name = "Filled.DatabasePerson") {
            fluentPath {
                moveTo(20.0f, 6.0f)
                curveToRelative(0.0f, 2.2f, -3.58f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveTo(4.0f, 8.2f, 4.0f, 6.0f)
                reflectiveCurveToRelative(3.58f, -4.0f, 8.0f, -4.0f)
                reflectiveCurveToRelative(8.0f, 1.8f, 8.0f, 4.0f)
                close()
                moveTo(17.77f, 10.43f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 12.0f, 11.5f)
                curveToRelative(-2.4f, 0.0f, -4.63f, -0.48f, -6.33f, -1.33f)
                arcTo(7.61f, 7.61f, 0.0f, false, true, 4.0f, 9.05f)
                lineTo(4.0f, 18.0f)
                curveToRelative(0.0f, 2.2f, 3.58f, 4.0f, 8.0f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.09f, -0.03f, 1.61f, -0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, false, true, -0.61f, -2.05f)
                verticalLineToRelative(-0.1f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 15.77f, 17.0f)
                horizontalLineToRelative(0.28f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, 0.88f, -5.63f)
                curveToRelative(0.4f, -0.2f, 0.73f, -0.52f, 0.84f, -0.94f)
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
        return _databasePerson!!
    }

private var _databasePerson: ImageVector? = null
