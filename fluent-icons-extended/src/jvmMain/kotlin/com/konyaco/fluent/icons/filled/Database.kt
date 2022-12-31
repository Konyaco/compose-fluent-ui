

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = fluentIcon(name = "Filled.Database") {
            fluentPath {
                moveTo(12.0f, 10.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -1.8f, 8.0f, -4.0f)
                reflectiveCurveToRelative(-3.58f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveToRelative(-8.0f, 1.8f, -8.0f, 4.0f)
                reflectiveCurveToRelative(3.58f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(18.33f, 10.17f)
                curveToRelative(0.59f, -0.3f, 1.17f, -0.67f, 1.67f, -1.12f)
                lineTo(20.0f, 18.0f)
                curveToRelative(0.0f, 2.2f, -3.58f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, -1.8f, -8.0f, -4.0f)
                lineTo(4.0f, 9.05f)
                curveToRelative(0.5f, 0.45f, 1.08f, 0.83f, 1.67f, 1.12f)
                curveToRelative(1.7f, 0.85f, 3.94f, 1.33f, 6.33f, 1.33f)
                curveToRelative(2.4f, 0.0f, 4.63f, -0.48f, 6.33f, -1.33f)
                close()
            }
        }
        return _database!!
    }

private var _database: ImageVector? = null
