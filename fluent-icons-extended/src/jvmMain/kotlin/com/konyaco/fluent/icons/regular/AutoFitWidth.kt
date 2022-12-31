

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AutoFitWidth: ImageVector
    get() {
        if (_autoFitWidth != null) {
            return _autoFitWidth!!
        }
        _autoFitWidth = fluentIcon(name = "Regular.AutoFitWidth") {
            fluentPath {
                moveTo(3.0f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(4.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(19.5f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(21.0f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(14.15f, 14.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, 0.98f)
                lineToRelative(2.37f, -2.37f)
                curveToRelative(0.2f, -0.12f, 0.35f, -0.37f, 0.35f, -0.66f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, false, -0.35f, -0.66f)
                lineToRelative(-2.37f, -2.37f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineToRelative(-0.07f, 0.08f)
                curveToRelative(-0.22f, 0.3f, -0.2f, 0.71f, 0.07f, 0.98f)
                lineToRelative(1.22f, 1.22f)
                lineTo(8.56f, 11.25f)
                lineToRelative(1.22f, -1.22f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -0.88f)
                lineToRelative(-0.08f, -0.08f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.88f, 0.0f)
                lineToRelative(-0.08f, 0.08f)
                lineToRelative(-2.37f, 2.37f)
                lineToRelative(-0.07f, 0.05f)
                arcTo(0.79f, 0.79f, 0.0f, false, false, 6.0f, 12.0f)
                curveToRelative(0.0f, 0.29f, 0.14f, 0.54f, 0.35f, 0.66f)
                lineToRelative(2.37f, 2.37f)
                lineToRelative(0.08f, 0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.05f, -1.04f)
                lineToRelative(-0.07f, -0.09f)
                lineToRelative(-1.22f, -1.22f)
                lineTo(15.44f, 12.75f)
                lineToRelative(-1.22f, 1.22f)
                lineToRelative(-0.07f, 0.08f)
                close()
            }
        }
        return _autoFitWidth!!
    }

private var _autoFitWidth: ImageVector? = null
