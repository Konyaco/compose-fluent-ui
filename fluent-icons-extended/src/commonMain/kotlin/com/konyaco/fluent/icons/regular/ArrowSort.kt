

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSort: ImageVector
    get() {
        if (_arrowSort != null) {
            return _arrowSort!!
        }
        _arrowSort = fluentIcon(name = "Regular.ArrowSort") {
            fluentPath {
                moveTo(17.25f, 4.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                verticalLineToRelative(12.7f)
                lineToRelative(-3.22f, -3.23f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 1.14f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(0.09f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.7f, 0.2f, 0.97f, -0.07f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(0.07f, -0.09f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.7f, -0.07f, -0.98f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineTo(18.0f, 17.45f)
                lineTo(18.0f, 4.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.65f)
                close()
                moveTo(6.21f, 4.22f)
                lineTo(1.72f, 8.72f)
                lineTo(1.65f, 8.8f)
                curveToRelative(-0.22f, 0.3f, -0.2f, 0.7f, 0.07f, 0.98f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.71f, 0.2f, 0.98f, -0.07f)
                lineTo(6.0f, 6.56f)
                lineTo(6.0f, 19.36f)
                curveToRelative(0.05f, 0.36f, 0.37f, 0.64f, 0.75f, 0.64f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                lineTo(7.5f, 6.55f)
                lineToRelative(3.22f, 3.23f)
                lineToRelative(0.08f, 0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.98f, -1.14f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-0.09f, -0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                close()
            }
        }
        return _arrowSort!!
    }

private var _arrowSort: ImageVector? = null
