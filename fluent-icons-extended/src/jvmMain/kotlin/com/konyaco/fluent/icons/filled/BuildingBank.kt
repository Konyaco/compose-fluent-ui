

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BuildingBank: ImageVector
    get() {
        if (_buildingBank != null) {
            return _buildingBank!!
        }
        _buildingBank = fluentIcon(name = "Filled.BuildingBank") {
            fluentPath {
                moveTo(10.97f, 2.32f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.06f, 0.0f)
                lineToRelative(7.42f, 5.42f)
                curveToRelative(0.98f, 0.71f, 0.48f, 2.26f, -0.73f, 2.26f)
                lineTo(4.28f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -0.73f, -2.26f)
                lineToRelative(7.42f, -5.42f)
                close()
                moveTo(13.0f, 6.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(11.25f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.75f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(18.5f, 16.0f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(18.75f, 17.0f)
                lineTo(5.25f, 17.0f)
                curveTo(4.01f, 17.0f, 3.0f, 18.0f, 3.0f, 19.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(7.75f, 16.0f)
                lineTo(5.5f, 16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        return _buildingBank!!
    }

private var _buildingBank: ImageVector? = null
