

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentFolder: ImageVector
    get() {
        if (_documentFolder != null) {
            return _documentFolder!!
        }
        _documentFolder = fluentIcon(name = "Regular.DocumentFolder") {
            fluentPath {
                moveTo(18.5f, 4.63f)
                lineTo(18.5f, 15.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.5f, 4.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-9.0f)
                curveTo(5.01f, 2.0f, 4.0f, 3.0f, 4.0f, 4.25f)
                verticalLineToRelative(4.13f)
                curveToRelative(-0.6f, 0.4f, -1.0f, 1.09f, -1.0f, 1.87f)
                verticalLineToRelative(8.5f)
                curveTo(3.0f, 20.55f, 4.46f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.78f, -0.4f, -1.47f, -1.0f, -1.87f)
                lineTo(20.0f, 6.75f)
                curveToRelative(0.0f, -0.98f, -0.63f, -1.81f, -1.5f, -2.12f)
                close()
                moveTo(5.5f, 8.0f)
                lineTo(5.5f, 4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(16.0f, 15.0f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.09f, -0.55f, -0.24f)
                lineToRelative(-5.6f, -6.04f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 8.1f, 8.0f)
                lineTo(5.5f, 8.0f)
                close()
                moveTo(4.5f, 10.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(8.1f, 9.5f)
                curveToRelative(0.2f, 0.0f, 0.4f, 0.09f, 0.55f, 0.24f)
                lineToRelative(5.6f, 6.04f)
                curveToRelative(0.43f, 0.46f, 1.03f, 0.72f, 1.65f, 0.72f)
                horizontalLineToRelative(2.85f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(6.25f, 20.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                close()
            }
        }
        return _documentFolder!!
    }

private var _documentFolder: ImageVector? = null
