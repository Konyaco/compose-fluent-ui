

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = fluentIcon(name = "Regular.Headset") {
            fluentPath {
                moveTo(12.0f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(17.5f, 10.0f)
                lineTo(17.5f, 9.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.5f, 16.0f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 1.2f, 0.93f, 2.17f, 2.1f, 2.24f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(1.13f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(8.75f, 20.0f)
                curveToRelative(-2.0f, 0.0f, -3.64f, -1.57f, -3.74f, -3.55f)
                lineToRelative(-0.01f, -0.2f)
                lineTo(5.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 14.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 2.0f)
                lineTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                lineTo(14.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -1.0f)
                horizontalLineToRelative(2.62f)
                close()
                moveTo(8.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(17.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.41f)
                lineTo(17.5f, 11.5f)
                close()
            }
        }
        return _headset!!
    }

private var _headset: ImageVector? = null
