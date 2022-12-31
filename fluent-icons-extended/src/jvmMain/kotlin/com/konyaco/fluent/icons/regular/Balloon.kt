

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = fluentIcon(name = "Regular.Balloon") {
            fluentPath {
                moveTo(12.02f, 5.66f)
                curveToRelative(0.1f, -0.4f, 0.5f, -0.65f, 0.9f, -0.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.97f, 2.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.46f, 0.35f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.85f, -1.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.56f, -0.9f)
                close()
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
                moveTo(12.0f, 3.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.5f, 9.0f)
                curveToRelative(0.0f, 1.73f, 0.58f, 3.64f, 1.59f, 5.1f)
                curveToRelative(1.0f, 1.47f, 2.36f, 2.4f, 3.91f, 2.4f)
                curveToRelative(1.55f, 0.0f, 2.9f, -0.93f, 3.91f, -2.4f)
                arcTo(9.38f, 9.38f, 0.0f, false, false, 17.5f, 9.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 12.0f, 3.5f)
                close()
            }
        }
        return _balloon!!
    }

private var _balloon: ImageVector? = null
