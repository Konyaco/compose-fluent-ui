

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BuildingRetailMore: ImageVector
    get() {
        if (_buildingRetailMore != null) {
            return _buildingRetailMore!!
        }
        _buildingRetailMore = fluentIcon(name = "Regular.BuildingRetailMore") {
            fluentPath {
                moveTo(7.75f, 16.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(13.25f, 14.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(16.25f, 16.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(4.87f, 3.63f)
                curveToRelative(0.34f, -0.4f, 0.83f, -0.63f, 1.35f, -0.63f)
                horizontalLineToRelative(11.56f)
                curveToRelative(0.52f, 0.0f, 1.02f, 0.23f, 1.35f, 0.63f)
                lineToRelative(3.58f, 4.32f)
                curveToRelative(0.67f, 0.82f, 0.1f, 2.05f, -0.96f, 2.05f)
                lineTo(21.0f, 10.0f)
                verticalLineToRelative(8.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -0.96f, -2.05f)
                lineToRelative(3.58f, -4.32f)
                close()
                moveTo(6.22f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.2f, 0.09f)
                lineTo(2.8f, 8.5f)
                lineTo(21.2f, 8.5f)
                lineToRelative(-3.24f, -3.91f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.19f, -0.09f)
                lineTo(6.22f, 4.5f)
                close()
                moveTo(4.5f, 10.0f)
                verticalLineToRelative(8.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(19.5f, 10.0f)
                horizontalLineToRelative(-15.0f)
                close()
            }
        }
        return _buildingRetailMore!!
    }

private var _buildingRetailMore: ImageVector? = null
