

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Diagram: ImageVector
    get() {
        if (_diagram != null) {
            return _diagram!!
        }
        _diagram = fluentIcon(name = "Filled.Diagram") {
            fluentPath {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.45f, 3.46f, 2.0f, 5.25f, 2.0f)
                horizontalLineToRelative(10.5f)
                curveTo(17.55f, 2.0f, 19.0f, 3.46f, 19.0f, 5.25f)
                verticalLineToRelative(6.03f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -1.22f, -0.28f)
                horizontalLineToRelative(-0.28f)
                lineTo(17.5f, 5.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(5.25f, 3.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(3.37f)
                lineTo(7.36f, 20.0f)
                lineTo(5.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                lineTo(2.0f, 5.25f)
                close()
                moveTo(6.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(7.07f, 12.43f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.68f, -0.43f)
                horizontalLineToRelative(10.03f)
                curveToRelative(0.52f, 0.0f, 1.01f, 0.23f, 1.34f, 0.62f)
                lineToRelative(3.7f, 4.4f)
                curveToRelative(0.24f, 0.28f, 0.24f, 0.68f, 0.0f, 0.96f)
                lineToRelative(-3.7f, 4.4f)
                curveToRelative(-0.33f, 0.4f, -0.82f, 0.62f, -1.34f, 0.62f)
                lineTo(7.75f, 23.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.57f, -1.23f)
                lineToRelative(3.59f, -4.27f)
                lineToRelative(-3.6f, -4.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -0.8f)
                close()
                moveTo(6.75f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }
        return _diagram!!
    }

private var _diagram: ImageVector? = null
