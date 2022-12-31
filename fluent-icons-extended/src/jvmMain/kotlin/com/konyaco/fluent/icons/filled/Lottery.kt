

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Lottery: ImageVector
    get() {
        if (_lottery != null) {
            return _lottery!!
        }
        _lottery = fluentIcon(name = "Filled.Lottery") {
            fluentPath {
                moveTo(15.56f, 4.17f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 6.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.56f, -2.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.12f, 0.0f)
                close()
                moveTo(4.06f, 14.04f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.98f, -6.98f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -6.98f, 6.98f)
                close()
                moveTo(19.94f, 14.04f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -6.98f, -6.98f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.98f, 6.98f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, -14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 14.0f)
                close()
                moveTo(9.5f, 13.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.5f, 1.31f)
                lineToRelative(-0.02f, 0.02f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, -0.26f, 0.26f)
                arcToRelative(9.55f, 9.55f, 0.0f, false, false, -2.25f, 3.86f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.44f, -0.4f)
                curveToRelative(0.4f, -1.5f, 1.15f, -2.7f, 1.78f, -3.54f)
                lineToRelative(0.01f, -0.01f)
                horizontalLineToRelative(-2.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _lottery!!
    }

private var _lottery: ImageVector? = null
