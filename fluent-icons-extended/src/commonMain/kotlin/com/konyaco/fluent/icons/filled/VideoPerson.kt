

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoPerson: ImageVector
    get() {
        if (_videoPerson != null) {
            return _videoPerson!!
        }
        _videoPerson = fluentIcon(name = "Filled.VideoPerson") {
            fluentPath {
                moveTo(19.75f, 4.0f)
                curveTo(20.99f, 4.0f, 22.0f, 5.0f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(22.0f, 19.0f, 20.99f, 20.0f, 19.75f, 20.0f)
                lineTo(4.25f, 20.0f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineToRelative(15.5f)
                close()
                moveTo(19.75f, 5.5f)
                lineTo(4.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.42f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(7.0f, 18.5f)
                verticalLineToRelative(-2.75f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.74f)
                lineToRelative(0.15f, -0.01f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.91f, 0.0f, 1.67f, 0.7f, 1.74f, 1.6f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(2.76f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                lineTo(20.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
            }
        }
        return _videoPerson!!
    }

private var _videoPerson: ImageVector? = null
