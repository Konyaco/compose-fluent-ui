

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = fluentIcon(name = "Regular.Ribbon") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 5.0f, 11.9f)
                verticalLineToRelative(7.35f)
                curveToRelative(0.0f, 0.57f, -0.6f, 0.92f, -1.1f, 0.67f)
                lineToRelative(-0.08f, -0.06f)
                lineTo(12.0f, 19.18f)
                lineToRelative(-3.82f, 2.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.17f, -0.5f)
                verticalLineToRelative(-0.11f)
                lineTo(7.0f, 13.9f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(15.5f, 19.8f)
                verticalLineToRelative(-4.74f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -7.0f, 0.0f)
                verticalLineToRelative(4.74f)
                lineToRelative(3.07f, -2.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.76f, -0.06f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(3.07f, 2.16f)
                verticalLineToRelative(-4.75f)
                verticalLineToRelative(4.75f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                close()
            }
        }
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
