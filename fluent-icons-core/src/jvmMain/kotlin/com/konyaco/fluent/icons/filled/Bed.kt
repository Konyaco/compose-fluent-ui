

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = fluentIcon(name = "Filled.Bed") {
            fluentPath {
                moveTo(19.25f, 11.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 13.58f)
                verticalLineToRelative(6.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-6.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.58f, -2.74f)
                lineToRelative(0.17f, -0.01f)
                horizontalLineToRelative(14.5f)
                close()
                moveTo(6.75f, 4.0f)
                horizontalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.0f, 6.58f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, -0.87f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.88f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, -0.87f)
                lineTo(10.0f, 9.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.88f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.58f, -2.74f)
                lineTo(6.75f, 4.0f)
                close()
            }
        }
        return _bed!!
    }

private var _bed: ImageVector? = null
