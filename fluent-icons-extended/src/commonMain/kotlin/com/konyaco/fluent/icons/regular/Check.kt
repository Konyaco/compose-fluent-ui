

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = fluentIcon(name = "Regular.Check") {
            fluentPath {
                moveTo(21.78f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-7.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(7.5f, -7.5f)
                close()
                moveTo(21.95f, 7.03f)
                curveToRelative(0.03f, 0.17f, 0.05f, 0.34f, 0.05f, 0.52f)
                verticalLineToRelative(6.9f)
                curveToRelative(0.0f, 1.4f, -1.14f, 2.55f, -2.55f, 2.55f)
                lineTo(4.55f, 17.0f)
                arcTo(2.55f, 2.55f, 0.0f, false, true, 2.0f, 14.45f)
                verticalLineToRelative(-6.9f)
                curveTo(2.0f, 6.15f, 3.14f, 5.0f, 4.55f, 5.0f)
                horizontalLineToRelative(14.48f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(4.55f, 6.5f)
                curveToRelative(-0.58f, 0.0f, -1.05f, 0.47f, -1.05f, 1.05f)
                verticalLineToRelative(6.9f)
                curveToRelative(0.0f, 0.58f, 0.47f, 1.05f, 1.05f, 1.05f)
                horizontalLineToRelative(14.9f)
                curveToRelative(0.58f, 0.0f, 1.05f, -0.47f, 1.05f, -1.05f)
                lineTo(20.5f, 8.47f)
                lineToRelative(1.45f, -1.44f)
                close()
                moveTo(4.5f, 9.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(4.5f, 12.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _check!!
    }

private var _check: ImageVector? = null
