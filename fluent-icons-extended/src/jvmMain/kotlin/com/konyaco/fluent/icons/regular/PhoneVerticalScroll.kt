

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PhoneVerticalScroll: ImageVector
    get() {
        if (_phoneVerticalScroll != null) {
            return _phoneVerticalScroll!!
        }
        _phoneVerticalScroll = fluentIcon(name = "Regular.PhoneVerticalScroll") {
            fluentPath {
                moveTo(15.75f, 2.0f)
                curveTo(16.99f, 2.0f, 18.0f, 3.0f, 18.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-7.5f)
                curveTo(7.01f, 22.0f, 6.0f, 21.0f, 6.0f, 19.75f)
                lineTo(6.0f, 4.25f)
                curveTo(6.0f, 3.01f, 7.0f, 2.0f, 8.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(15.75f, 3.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(16.5f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(14.78f, 13.46f)
                curveToRelative(0.26f, 0.27f, 0.3f, 0.68f, 0.08f, 0.98f)
                lineToRelative(-0.07f, 0.09f)
                lineToRelative(-2.25f, 2.3f)
                curveToRelative(-0.27f, 0.26f, -0.7f, 0.29f, -1.0f, 0.07f)
                lineToRelative(-0.08f, -0.08f)
                lineToRelative(-2.25f, -2.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.99f, -1.12f)
                lineToRelative(0.08f, 0.07f)
                lineTo(12.0f, 15.22f)
                lineToRelative(1.71f, -1.75f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(12.54f, 7.23f)
                lineToRelative(2.25f, 2.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.08f, 1.04f)
                lineTo(12.0f, 8.82f)
                lineToRelative(-1.72f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.07f, -1.05f)
                lineToRelative(2.25f, -2.3f)
                curveToRelative(0.3f, -0.3f, 0.78f, -0.3f, 1.08f, 0.0f)
                close()
            }
        }
        return _phoneVerticalScroll!!
    }

private var _phoneVerticalScroll: ImageVector? = null
