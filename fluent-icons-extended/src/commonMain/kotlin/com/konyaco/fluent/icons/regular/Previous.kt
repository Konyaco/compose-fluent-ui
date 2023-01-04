

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = fluentIcon(name = "Regular.Previous") {
            fluentPath {
                moveTo(21.0f, 4.75f)
                curveToRelative(0.0f, -1.4f, -1.58f, -2.24f, -2.74f, -1.44f)
                lineToRelative(-10.5f, 7.2f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.87f)
                lineToRelative(10.5f, 7.3f)
                curveToRelative(1.15f, 0.81f, 2.74f, -0.02f, 2.74f, -1.43f)
                lineTo(21.0f, 4.75f)
                close()
                moveTo(19.1f, 4.55f)
                curveToRelative(0.17f, -0.12f, 0.4f, 0.0f, 0.4f, 0.2f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.2f, -0.23f, 0.32f, -0.4f, 0.2f)
                lineToRelative(-10.5f, -7.3f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.01f, -0.41f)
                lineToRelative(10.5f, -7.2f)
                close()
                moveTo(3.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 3.75f)
                close()
            }
        }
        return _previous!!
    }

private var _previous: ImageVector? = null
