

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Molecule: ImageVector
    get() {
        if (_molecule != null) {
            return _molecule!!
        }
        _molecule = fluentIcon(name = "Regular.Molecule") {
            fluentPath {
                moveTo(16.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -4.34f, -2.51f)
                lineToRelative(-2.71f, 1.8f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 2.0f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.18f, 2.43f)
                lineToRelative(3.89f, 1.94f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.67f, -1.34f)
                lineToRelative(-3.89f, -1.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.11f, -2.52f)
                lineToRelative(2.86f, -1.9f)
                curveToRelative(0.9f, 0.82f, 2.09f, 1.33f, 3.4f, 1.33f)
                close()
                moveTo(16.0f, 10.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                close()
                moveTo(6.0f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
                moveTo(17.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        return _molecule!!
    }

private var _molecule: ImageVector? = null
