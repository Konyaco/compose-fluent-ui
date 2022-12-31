

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TargetArrow: ImageVector
    get() {
        if (_targetArrow != null) {
            return _targetArrow!!
        }
        _targetArrow = fluentIcon(name = "Filled.TargetArrow") {
            fluentPath {
                moveTo(21.78f, 6.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.53f, -1.28f)
                lineTo(18.5f, 5.5f)
                lineTo(18.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.28f, -0.53f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.22f, 0.53f)
                verticalLineToRelative(2.84f)
                lineToRelative(-1.98f, 1.98f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 1.41f, 1.41f)
                lineToRelative(1.98f, -1.98f)
                horizontalLineToRelative(2.84f)
                curveToRelative(0.2f, 0.0f, 0.39f, -0.08f, 0.53f, -0.22f)
                lineToRelative(2.5f, -2.5f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.2f, 0.0f, 2.36f, 0.21f, 3.42f, 0.6f)
                lineToRelative(-1.4f, 1.41f)
                lineToRelative(-0.18f, 0.2f)
                arcTo(8.02f, 8.02f, 0.0f, false, false, 4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.79f, -1.84f)
                lineToRelative(0.2f, -0.17f)
                lineToRelative(1.4f, -1.41f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.52f, 0.0f, 1.02f, 0.07f, 1.5f, 0.19f)
                verticalLineToRelative(1.48f)
                lineToRelative(-0.41f, 0.42f)
                lineToRelative(-0.05f, 0.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 2.82f, 2.82f)
                lineToRelative(0.05f, -0.05f)
                lineToRelative(0.42f, -0.41f)
                horizontalLineToRelative(1.48f)
                arcTo(6.01f, 6.01f, 0.0f, true, true, 12.0f, 6.0f)
                close()
            }
        }
        return _targetArrow!!
    }

private var _targetArrow: ImageVector? = null
