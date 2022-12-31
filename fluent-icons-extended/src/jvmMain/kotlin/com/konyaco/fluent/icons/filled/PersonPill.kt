

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonPill: ImageVector
    get() {
        if (_personPill != null) {
            return _personPill!!
        }
        _personPill = fluentIcon(name = "Filled.PersonPill") {
            fluentPath {
                moveTo(11.68f, 22.0f)
                curveToRelative(-0.9f, -1.5f, -0.7f, -3.45f, 0.58f, -4.74f)
                lineTo(15.53f, 14.0f)
                lineTo(6.25f, 14.0f)
                curveTo(5.01f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveToRelative(1.5f, 2.1f, 3.91f, 3.16f, 7.17f, 3.23f)
                close()
                moveTo(17.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 7.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(17.97f, 12.97f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, true, 4.06f, 4.06f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, true, -4.06f, -4.06f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(20.97f, 14.03f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, -1.94f, 0.0f)
                lineTo(17.06f, 16.0f)
                lineTo(19.0f, 17.94f)
                lineToRelative(1.97f, -1.97f)
                curveToRelative(0.54f, -0.54f, 0.54f, -1.4f, 0.0f, -1.94f)
                close()
                moveTo(17.03f, 20.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.0f, -1.0f)
                close()
            }
        }
        return _personPill!!
    }

private var _personPill: ImageVector? = null
