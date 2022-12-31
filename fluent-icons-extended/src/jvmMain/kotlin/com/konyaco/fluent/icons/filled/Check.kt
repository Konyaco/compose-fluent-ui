

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = fluentIcon(name = "Filled.Check") {
            fluentPath {
                moveTo(21.77f, 5.79f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.04f, -1.08f)
                lineToRelative(-6.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.04f, 1.08f)
                lineToRelative(6.75f, -6.5f)
                close()
                moveTo(18.99f, 5.0f)
                lineTo(4.55f, 5.0f)
                arcTo(2.55f, 2.55f, 0.0f, false, false, 2.0f, 7.55f)
                verticalLineToRelative(6.9f)
                curveTo(2.0f, 15.85f, 3.14f, 17.0f, 4.55f, 17.0f)
                horizontalLineToRelative(14.9f)
                curveToRelative(1.4f, 0.0f, 2.55f, -1.14f, 2.55f, -2.55f)
                verticalLineToRelative(-6.9f)
                curveToRelative(0.0f, -0.18f, -0.02f, -0.36f, -0.06f, -0.54f)
                lineToRelative(-6.23f, 6.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.42f, -2.52f)
                lineTo(18.99f, 5.0f)
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
