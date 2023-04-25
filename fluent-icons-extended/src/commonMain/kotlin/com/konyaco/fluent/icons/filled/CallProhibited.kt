

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CallProhibited: ImageVector
    get() {
        if (_callProhibited != null) {
            return _callProhibited!!
        }
        _callProhibited = fluentIcon(name = "Filled.CallProhibited") {
            fluentPath {
                moveTo(20.93f, 5.66f)
                curveToRelative(-1.96f, -1.73f, -5.02f, -2.6f, -9.18f, -2.59f)
                curveToRelative(-4.16f, 0.0f, -7.13f, 0.88f, -8.9f, 2.6f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, -0.73f, 2.86f)
                lineToRelative(0.31f, 1.03f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, false, 2.28f, 1.51f)
                lineToRelative(2.03f, -0.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.71f, -1.55f)
                lineToRelative(0.4f, -2.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 6.22f, -0.18f)
                lineToRelative(0.64f, 2.35f)
                curveToRelative(0.22f, 0.85f, 0.98f, 1.48f, 1.87f, 1.57f)
                lineToRelative(2.05f, 0.2f)
                curveToRelative(1.03f, 0.1f, 1.94f, -0.56f, 2.12f, -1.53f)
                lineToRelative(0.2f, -1.04f)
                curveToRelative(0.2f, -1.02f, -0.2f, -2.1f, -1.02f, -2.83f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, 11.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -6.25f)
                lineToRelative(-5.55f, 5.56f)
                curveToRelative(0.64f, 0.44f, 1.42f, 0.69f, 2.25f, 0.69f)
                close()
                moveTo(8.7f, 18.75f)
                lineTo(14.25f, 13.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.56f, 5.56f)
                close()
            }
        }
        return _callProhibited!!
    }

private var _callProhibited: ImageVector? = null
