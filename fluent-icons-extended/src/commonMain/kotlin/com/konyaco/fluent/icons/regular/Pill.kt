

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = fluentIcon(name = "Regular.Pill") {
            fluentPath {
                moveTo(10.53f, 15.47f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.84f, 0.84f, -2.2f, 0.85f, -3.05f, 0.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 17.26f)
                curveToRelative(0.2f, 0.0f, 0.4f, 0.08f, 0.53f, 0.22f)
                curveToRelative(0.26f, 0.26f, 0.68f, 0.26f, 0.94f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(13.3f, 3.53f)
                arcToRelative(5.07f, 5.07f, 0.0f, true, true, 7.17f, 7.17f)
                lineToRelative(-9.77f, 9.77f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, true, -7.18f, -7.17f)
                lineToRelative(9.78f, -9.77f)
                close()
                moveTo(19.41f, 4.59f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -5.05f, 0.0f)
                lineTo(10.0f, 8.94f)
                lineTo(15.05f, 14.0f)
                lineToRelative(4.36f, -4.35f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 0.0f, -5.05f)
                close()
                moveTo(14.0f, 15.06f)
                lineTo(8.94f, 10.0f)
                lineTo(4.6f, 14.36f)
                arcToRelative(3.57f, 3.57f, 0.0f, true, false, 5.05f, 5.05f)
                lineToRelative(4.35f, -4.35f)
                close()
            }
        }
        return _pill!!
    }

private var _pill: ImageVector? = null
