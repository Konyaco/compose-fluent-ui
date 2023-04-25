

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HatGraduation: ImageVector
    get() {
        if (_hatGraduation != null) {
            return _hatGraduation!!
        }
        _hatGraduation = fluentIcon(name = "Filled.HatGraduation") {
            fluentPath {
                moveTo(5.0f, 17.75f)
                verticalLineToRelative(-3.77f)
                lineToRelative(4.06f, 2.66f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, false, 5.88f, 0.0f)
                lineTo(19.0f, 13.98f)
                verticalLineToRelative(3.77f)
                curveToRelative(0.0f, 0.16f, -0.05f, 0.32f, -0.15f, 0.45f)
                lineToRelative(-0.01f, 0.02f)
                lineToRelative(-0.02f, 0.01f)
                verticalLineToRelative(0.02f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -0.41f, 0.43f)
                curveToRelative(-0.28f, 0.27f, -0.7f, 0.61f, -1.25f, 0.96f)
                arcTo(9.7f, 9.7f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, -5.16f, -1.36f)
                arcToRelative(7.43f, 7.43f, 0.0f, false, true, -1.68f, -1.42f)
                verticalLineToRelative(-0.01f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.16f, -0.46f)
                close()
                moveTo(22.16f, 10.13f)
                lineTo(14.12f, 15.38f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -4.24f, 0.0f)
                lineTo(3.0f, 10.88f)
                verticalLineToRelative(5.37f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(1.5f, 10.0f)
                curveToRelative(0.0f, -0.09f, 0.02f, -0.17f, 0.04f, -0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.3f, -0.88f)
                lineTo(9.92f, 3.7f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, 4.18f, 0.0f)
                lineToRelative(8.06f, 5.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.01f, 1.26f)
                close()
            }
        }
        return _hatGraduation!!
    }

private var _hatGraduation: ImageVector? = null
