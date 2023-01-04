

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Lottery: ImageVector
    get() {
        if (_lottery != null) {
            return _lottery!!
        }
        _lottery = fluentIcon(name = "Regular.Lottery") {
            fluentPath {
                moveTo(14.15f, 4.72f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.3f, 0.0f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, -1.41f, -0.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.12f, 0.0f)
                curveToRelative(-0.5f, 0.13f, -0.97f, 0.31f, -1.41f, 0.55f)
                close()
                moveTo(9.38f, 7.44f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, 1.66f, -0.38f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -6.98f, 6.98f)
                curveToRelative(0.07f, -0.57f, 0.2f, -1.13f, 0.38f, -1.66f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 4.95f, -4.95f)
                close()
                moveTo(19.94f, 14.04f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -6.98f, -6.98f)
                curveToRelative(0.57f, 0.07f, 1.13f, 0.2f, 1.66f, 0.38f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 4.95f, 4.95f)
                curveToRelative(0.18f, 0.52f, 0.3f, 1.08f, 0.37f, 1.65f)
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
                moveTo(12.0f, 22.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, -14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 14.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, 11.0f)
                close()
            }
        }
        return _lottery!!
    }

private var _lottery: ImageVector? = null
