

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BuildingRetailMore: ImageVector
    get() {
        if (_buildingRetailMore != null) {
            return _buildingRetailMore!!
        }
        _buildingRetailMore = fluentIcon(name = "Filled.BuildingRetailMore") {
            fluentPath {
                moveTo(6.22f, 3.0f)
                curveToRelative(-0.52f, 0.0f, -1.01f, 0.23f, -1.35f, 0.63f)
                lineTo(1.3f, 7.95f)
                curveToRelative(-0.67f, 0.82f, -0.1f, 2.05f, 0.96f, 2.05f)
                horizontalLineToRelative(19.5f)
                curveToRelative(1.05f, 0.0f, 1.63f, -1.23f, 0.96f, -2.05f)
                lineToRelative(-3.58f, -4.32f)
                curveToRelative(-0.33f, -0.4f, -0.83f, -0.63f, -1.35f, -0.63f)
                lineTo(6.22f, 3.0f)
                close()
                moveTo(3.0f, 11.5f)
                verticalLineToRelative(7.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                lineTo(21.0f, 11.5f)
                lineTo(3.0f, 11.5f)
                close()
                moveTo(9.0f, 15.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(12.0f, 16.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(17.5f, 15.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
            }
        }
        return _buildingRetailMore!!
    }

private var _buildingRetailMore: ImageVector? = null
