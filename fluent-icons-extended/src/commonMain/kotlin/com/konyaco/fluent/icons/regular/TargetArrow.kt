

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TargetArrow: ImageVector
    get() {
        if (_targetArrow != null) {
            return _targetArrow!!
        }
        _targetArrow = fluentIcon(name = "Regular.TargetArrow") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                curveToRelative(1.2f, 0.0f, 2.36f, 0.21f, 3.42f, 0.6f)
                lineToRelative(-1.19f, 1.2f)
                arcToRelative(8.51f, 8.51f, 0.0f, true, false, 5.97f, 5.97f)
                lineToRelative(1.2f, -1.2f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.52f, 0.0f, 1.02f, 0.07f, 1.5f, 0.19f)
                verticalLineToRelative(1.57f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 2.74f, 2.74f)
                horizontalLineToRelative(1.57f)
                arcTo(6.01f, 6.01f, 0.0f, true, true, 12.0f, 6.0f)
                close()
                moveTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.22f, -1.84f)
                lineToRelative(1.72f, -1.72f)
                lineTo(14.5f, 5.25f)
                curveToRelative(0.0f, -0.2f, 0.08f, -0.39f, 0.22f, -0.53f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.28f, 0.53f)
                lineTo(18.5f, 5.5f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.53f, 1.28f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, 0.22f)
                horizontalLineToRelative(-3.19f)
                lineToRelative(-1.72f, 1.72f)
                curveToRelative(0.1f, 0.24f, 0.16f, 0.5f, 0.16f, 0.78f)
                close()
                moveTo(18.44f, 8.0f)
                lineTo(19.44f, 7.0f)
                horizontalLineToRelative(-1.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(17.0f, 4.56f)
                lineToRelative(-1.0f, 1.0f)
                verticalLineToRelative(2.38f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.06f, 0.06f)
                horizontalLineToRelative(2.38f)
                close()
            }
        }
        return _targetArrow!!
    }

private var _targetArrow: ImageVector? = null
