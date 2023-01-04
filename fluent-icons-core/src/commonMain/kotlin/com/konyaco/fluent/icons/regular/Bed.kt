

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = fluentIcon(name = "Regular.Bed") {
            fluentPath {
                moveTo(6.75f, 4.0f)
                horizontalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.0f, 6.58f)
                verticalLineToRelative(3.52f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.0f, 2.46f)
                verticalLineToRelative(7.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(20.5f, 18.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.26f, 0.85f, -2.32f, 2.0f, -2.65f)
                lineTo(4.0f, 6.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.58f, -2.74f)
                lineTo(6.75f, 4.0f)
                close()
                moveTo(19.25f, 11.5f)
                lineTo(4.75f, 11.5f)
                curveToRelative(-0.65f, 0.0f, -1.18f, 0.5f, -1.24f, 1.12f)
                lineToRelative(-0.01f, 0.13f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0.0f, -0.65f, -0.5f, -1.18f, -1.12f, -1.24f)
                lineToRelative(-0.13f, -0.01f)
                close()
                moveTo(17.25f, 5.5f)
                lineTo(6.75f, 5.5f)
                curveToRelative(-0.65f, 0.0f, -1.18f, 0.5f, -1.24f, 1.12f)
                lineToRelative(-0.01f, 0.13f)
                lineTo(5.5f, 10.0f)
                lineTo(7.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(17.0f, 10.0f)
                horizontalLineToRelative(1.5f)
                lineTo(18.5f, 6.75f)
                curveToRelative(0.0f, -0.65f, -0.5f, -1.18f, -1.12f, -1.24f)
                lineToRelative(-0.13f, -0.01f)
                close()
            }
        }
        return _bed!!
    }

private var _bed: ImageVector? = null
