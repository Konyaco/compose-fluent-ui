

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LinkEdit: ImageVector
    get() {
        if (_linkEdit != null) {
            return _linkEdit!!
        }
        _linkEdit = fluentIcon(name = "Filled.LinkEdit") {
            fluentPath {
                moveTo(10.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(6.78f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 15.0f)
                horizontalLineToRelative(2.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 13.0f)
                lineTo(6.82f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 7.0f)
                horizontalLineToRelative(2.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 6.0f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-2.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 7.0f)
                horizontalLineToRelative(2.17f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 10.0f)
                lineTo(20.0f, 10.0f)
                curveToRelative(0.7f, 0.06f, 1.37f, 0.34f, 1.93f, 0.84f)
                curveToRelative(0.04f, -0.27f, 0.07f, -0.56f, 0.07f, -0.85f)
                close()
                moveTo(17.77f, 10.64f)
                curveToRelative(-0.1f, 0.07f, -0.2f, 0.15f, -0.29f, 0.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.36f, 0.11f)
                lineTo(7.0f, 10.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -1.98f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.77f, 1.64f)
                close()
                moveTo(18.1f, 11.67f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.34f, -0.6f, 0.78f, -0.71f, 1.25f)
                lineToRelative(-0.46f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.52f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _linkEdit!!
    }

private var _linkEdit: ImageVector? = null
