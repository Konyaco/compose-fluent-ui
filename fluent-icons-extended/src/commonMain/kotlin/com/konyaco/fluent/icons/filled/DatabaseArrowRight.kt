

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DatabaseArrowRight: ImageVector
    get() {
        if (_databaseArrowRight != null) {
            return _databaseArrowRight!!
        }
        _databaseArrowRight = fluentIcon(name = "Filled.DatabaseArrowRight") {
            fluentPath {
                moveTo(12.0f, 10.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -1.8f, 8.0f, -4.0f)
                reflectiveCurveToRelative(-3.58f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveToRelative(-8.0f, 1.8f, -8.0f, 4.0f)
                reflectiveCurveToRelative(3.58f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(18.33f, 10.17f)
                curveToRelative(0.59f, -0.3f, 1.17f, -0.67f, 1.67f, -1.12f)
                verticalLineToRelative(2.45f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -7.2f, 10.48f)
                lineTo(12.0f, 22.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -1.8f, -8.0f, -4.0f)
                lineTo(4.0f, 9.05f)
                curveToRelative(0.5f, 0.45f, 1.08f, 0.83f, 1.67f, 1.12f)
                curveToRelative(1.7f, 0.85f, 3.94f, 1.33f, 6.33f, 1.33f)
                curveToRelative(2.4f, 0.0f, 4.63f, -0.48f, 6.33f, -1.33f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(14.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(14.5f, 17.0f)
                close()
            }
        }
        return _databaseArrowRight!!
    }

private var _databaseArrowRight: ImageVector? = null
