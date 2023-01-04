

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = fluentIcon(name = "Filled.Balloon") {
            fluentPath {
                moveTo(5.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 14.0f, 0.0f)
                curveToRelative(0.0f, 2.03f, -0.67f, 4.24f, -1.85f, 5.96f)
                arcToRelative(6.58f, 6.58f, 0.0f, false, true, -4.4f, 2.99f)
                verticalLineToRelative(0.3f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.25f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(13.5f, 20.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-0.3f)
                arcToRelative(6.58f, 6.58f, 0.0f, false, true, -4.4f, -3.0f)
                arcTo(10.88f, 10.88f, 0.0f, false, true, 5.0f, 9.0f)
                close()
                moveTo(12.92f, 5.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.34f, 1.47f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.85f, 1.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.46f, -0.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.97f, -2.96f)
                close()
            }
        }
        return _balloon!!
    }

private var _balloon: ImageVector? = null
