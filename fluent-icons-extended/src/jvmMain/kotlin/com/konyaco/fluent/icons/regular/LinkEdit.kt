

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LinkEdit: ImageVector
    get() {
        if (_linkEdit != null) {
            return _linkEdit!!
        }
        _linkEdit = fluentIcon(name = "Regular.LinkEdit") {
            fluentPath {
                moveTo(10.0f, 5.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 9.25f, 5.0f)
                horizontalLineToRelative(-2.5f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 15.0f)
                horizontalLineToRelative(2.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.11f, -1.5f)
                lineTo(6.8f, 13.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.2f, -7.0f)
                horizontalLineToRelative(2.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.64f, -0.75f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-2.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(2.46f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.3f, 3.6f)
                curveToRelative(0.51f, 0.12f, 1.0f, 0.37f, 1.43f, 0.75f)
                curveToRelative(0.04f, -0.27f, 0.07f, -0.56f, 0.07f, -0.85f)
                close()
                moveTo(17.0f, 9.25f)
                lineTo(6.9f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(10.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
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
