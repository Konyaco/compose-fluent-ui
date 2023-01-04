

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BuildingBank: ImageVector
    get() {
        if (_buildingBank != null) {
            return _buildingBank!!
        }
        _buildingBank = fluentIcon(name = "Regular.BuildingBank") {
            fluentPath {
                moveTo(13.0f, 6.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(13.03f, 2.32f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.06f, 0.0f)
                lineTo(3.55f, 7.74f)
                curveToRelative(-0.98f, 0.71f, -0.48f, 2.26f, 0.73f, 2.26f)
                horizontalLineToRelative(0.22f)
                verticalLineToRelative(5.8f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 18.25f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.07f, -0.61f, -2.0f, -1.5f, -2.45f)
                lineTo(19.5f, 10.0f)
                horizontalLineToRelative(0.22f)
                curveToRelative(1.2f, 0.0f, 1.71f, -1.55f, 0.73f, -2.26f)
                lineToRelative(-7.42f, -5.42f)
                close()
                moveTo(11.85f, 3.54f)
                curveToRelative(0.09f, -0.07f, 0.21f, -0.07f, 0.3f, 0.0f)
                lineToRelative(6.8f, 4.96f)
                lineTo(5.05f, 8.5f)
                lineToRelative(6.8f, -4.96f)
                close()
                moveTo(18.0f, 10.0f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.5f, 10.0f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1.75f)
                lineTo(12.75f, 10.0f)
                horizontalLineToRelative(1.75f)
                close()
                moveTo(11.25f, 10.0f)
                verticalLineToRelative(5.5f)
                lineTo(9.5f, 15.5f)
                lineTo(9.5f, 10.0f)
                horizontalLineToRelative(1.75f)
                close()
                moveTo(5.75f, 17.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                lineTo(19.5f, 19.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                close()
                moveTo(6.0f, 15.5f)
                lineTo(6.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.5f)
                lineTo(6.0f, 15.5f)
                close()
            }
        }
        return _buildingBank!!
    }

private var _buildingBank: ImageVector? = null
