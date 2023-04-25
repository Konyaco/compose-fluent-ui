

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhoneArrowRight: ImageVector
    get() {
        if (_phoneArrowRight != null) {
            return _phoneArrowRight!!
        }
        _phoneArrowRight = fluentIcon(name = "Filled.PhoneArrowRight") {
            fluentPath {
                moveTo(13.75f, 2.0f)
                curveTo(14.99f, 2.0f, 16.0f, 3.0f, 16.0f, 4.25f)
                verticalLineToRelative(5.77f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 10.17f, 18.0f)
                lineTo(8.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(2.08f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, false, 2.3f, 2.5f)
                lineTo(6.26f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(16.5f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(16.72f, 13.59f)
                lineTo(16.65f, 13.65f)
                lineTo(16.59f, 13.72f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.56f)
                lineToRelative(0.06f, 0.07f)
                lineTo(18.29f, 16.0f)
                lineTo(13.4f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.04f, 0.2f, 0.2f, 0.36f, 0.4f, 0.4f)
                lineToRelative(0.1f, 0.01f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                lineToRelative(-0.06f, 0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(0.06f, -0.07f)
                lineToRelative(2.53f, -2.53f)
                lineToRelative(0.04f, -0.05f)
                lineToRelative(0.04f, -0.08f)
                lineToRelative(0.03f, -0.08f)
                lineTo(19.99f, 16.39f)
                lineToRelative(-0.03f, -0.08f)
                lineToRelative(-0.04f, -0.08f)
                lineToRelative(-0.04f, -0.05f)
                lineToRelative(-2.53f, -2.53f)
                lineToRelative(-0.07f, -0.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.49f, -0.04f)
                lineToRelative(-0.07f, 0.04f)
                close()
            }
        }
        return _phoneArrowRight!!
    }

private var _phoneArrowRight: ImageVector? = null
