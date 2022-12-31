

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShieldBadge: ImageVector
    get() {
        if (_shieldBadge != null) {
            return _shieldBadge!!
        }
        _shieldBadge = fluentIcon(name = "Filled.ShieldBadge") {
            fluentPath {
                moveTo(2.0f, 7.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 5.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.0f, 7.75f)
                verticalLineToRelative(2.47f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, true, -1.4f, -1.04f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, true, -0.17f, -0.2f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.88f, 0.03f)
                lineToRelative(-0.14f, 0.17f)
                curveToRelative(-0.14f, 0.15f, -0.34f, 0.35f, -0.6f, 0.56f)
                curveToRelative(-0.54f, 0.41f, -1.24f, 0.75f, -2.06f, 0.75f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.8f, -1.75f, 1.76f)
                lineTo(11.0f, 15.0f)
                lineTo(4.75f, 15.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 12.25f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(15.57f, 8.98f)
                close()
                moveTo(18.58f, 10.53f)
                curveToRelative(-0.35f, -0.27f, -0.7f, -0.6f, -0.97f, -0.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.22f, 0.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -3.64f, 1.93f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(12.0f, 15.0f)
                curveToRelative(0.0f, 1.64f, 0.44f, 2.95f, 1.3f, 3.98f)
                arcToRelative(7.98f, 7.98f, 0.0f, false, false, 3.44f, 2.22f)
                curveToRelative(0.17f, 0.07f, 0.35f, 0.07f, 0.52f, 0.0f)
                curveToRelative(1.4f, -0.52f, 2.6f, -1.2f, 3.44f, -2.22f)
                arcTo(5.97f, 5.97f, 0.0f, false, false, 22.0f, 15.0f)
                verticalLineToRelative(-2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                curveToRelative(-0.58f, 0.0f, -1.1f, -0.13f, -1.56f, -0.32f)
                curveToRelative(-0.42f, -0.17f, -0.8f, -0.4f, -1.1f, -0.65f)
                close()
            }
        }
        return _shieldBadge!!
    }

private var _shieldBadge: ImageVector? = null
