

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BuildingFactory: ImageVector
    get() {
        if (_buildingFactory != null) {
            return _buildingFactory!!
        }
        _buildingFactory = fluentIcon(name = "Filled.BuildingFactory") {
            fluentPath {
                moveTo(2.92f, 4.13f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 5.17f, 2.0f)
                horizontalLineToRelative(1.16f)
                curveToRelative(1.2f, 0.0f, 2.18f, 0.93f, 2.24f, 2.13f)
                lineToRelative(0.84f, 15.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 7.17f, 22.0f)
                horizontalLineTo(4.33f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.24f, -2.37f)
                lineToRelative(0.83f, -15.5f)
                close()
                moveTo(9.52f, 22.0f)
                horizontalLineToRelative(10.23f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineTo(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.26f, -0.55f)
                lineToRelative(-5.24f, 4.84f)
                verticalLineTo(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.26f, -0.55f)
                lineTo(9.87f, 9.49f)
                lineToRelative(0.54f, 10.08f)
                curveToRelative(0.05f, 0.94f, -0.3f, 1.8f, -0.9f, 2.43f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        return _buildingFactory!!
    }

private var _buildingFactory: ImageVector? = null
