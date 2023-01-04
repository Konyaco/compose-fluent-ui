

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AttachText: ImageVector
    get() {
        if (_attachText != null) {
            return _attachText!!
        }
        _attachText = fluentIcon(name = "Regular.AttachText") {
            fluentPath {
                moveTo(7.25f, 3.5f)
                curveToRelative(2.28f, 0.0f, 4.14f, 1.8f, 4.25f, 4.04f)
                lineTo(11.5f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.16f)
                lineTo(6.5f, 9.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 8.9f)
                verticalLineToRelative(9.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.12f)
                lineTo(10.0f, 7.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -5.5f, -0.17f)
                lineTo(4.5f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(3.0f, 7.75f)
                curveTo(3.0f, 5.4f, 4.9f, 3.5f, 7.25f, 3.5f)
                close()
                moveTo(16.25f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(2.6f)
                close()
                moveTo(20.25f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(6.6f)
                close()
                moveTo(20.25f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(6.6f)
                close()
                moveTo(20.25f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(6.6f)
                close()
            }
        }
        return _attachText!!
    }

private var _attachText: ImageVector? = null
