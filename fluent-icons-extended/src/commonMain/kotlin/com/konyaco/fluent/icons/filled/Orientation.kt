

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Orientation: ImageVector
    get() {
        if (_orientation != null) {
            return _orientation!!
        }
        _orientation = fluentIcon(name = "Filled.Orientation") {
            fluentPath {
                moveTo(6.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(3.5f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(2.0f, 12.9f)
                curveToRelative(0.0f, -1.05f, 0.85f, -1.9f, 1.9f, -1.9f)
                horizontalLineToRelative(10.2f)
                curveToRelative(1.05f, 0.0f, 1.9f, 0.85f, 1.9f, 1.9f)
                verticalLineToRelative(5.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.9f, 1.9f)
                lineTo(3.9f, 20.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 2.0f, 18.1f)
                verticalLineToRelative(-5.2f)
                close()
                moveTo(12.25f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                close()
                moveTo(3.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                curveTo(2.0f, 4.78f, 2.78f, 4.0f, 3.75f, 4.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(11.5f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(17.0f, 16.08f)
                curveToRelative(0.0f, 0.48f, 0.42f, 0.87f, 0.89f, 0.74f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 17.5f, 6.1f)
                lineToRelative(0.3f, -0.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.13f, -0.98f)
                lineToRelative(-1.5f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 0.98f)
                lineToRelative(1.5f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.14f, -0.98f)
                lineToRelative(-0.6f, -0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.37f, 7.79f)
                curveToRelative(-0.33f, 0.1f, -0.59f, 0.38f, -0.59f, 0.73f)
                close()
            }
        }
        return _orientation!!
    }

private var _orientation: ImageVector? = null
