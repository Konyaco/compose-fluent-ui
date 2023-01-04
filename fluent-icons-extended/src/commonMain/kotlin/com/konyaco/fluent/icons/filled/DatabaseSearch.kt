

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DatabaseSearch: ImageVector
    get() {
        if (_databaseSearch != null) {
            return _databaseSearch!!
        }
        _databaseSearch = fluentIcon(name = "Filled.DatabaseSearch") {
            fluentPath {
                moveTo(12.0f, 10.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -1.8f, 8.0f, -4.0f)
                reflectiveCurveToRelative(-3.58f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveToRelative(-8.0f, 1.8f, -8.0f, 4.0f)
                reflectiveCurveToRelative(3.58f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(18.33f, 10.17f)
                curveToRelative(0.59f, -0.3f, 1.17f, -0.67f, 1.67f, -1.12f)
                verticalLineToRelative(3.2f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -4.02f, -1.23f)
                curveToRelative(0.86f, -0.21f, 1.65f, -0.5f, 2.35f, -0.85f)
                close()
                moveTo(11.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.83f, 5.24f)
                curveToRelative(-0.88f, 0.17f, -1.83f, 0.26f, -2.83f, 0.26f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -1.8f, -8.0f, -4.0f)
                lineTo(4.0f, 9.05f)
                curveToRelative(0.5f, 0.45f, 1.08f, 0.83f, 1.67f, 1.12f)
                curveToRelative(1.7f, 0.85f, 3.94f, 1.33f, 6.33f, 1.33f)
                curveToRelative(0.96f, 0.0f, 1.9f, -0.08f, 2.78f, -0.22f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 11.0f, 16.5f)
                close()
                moveTo(16.5f, 21.0f)
                curveToRelative(0.97f, 0.0f, 1.87f, -0.3f, 2.6f, -0.83f)
                lineToRelative(2.62f, 2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.61f, -2.61f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 16.5f, 21.0f)
                close()
                moveTo(16.5f, 19.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        return _databaseSearch!!
    }

private var _databaseSearch: ImageVector? = null
