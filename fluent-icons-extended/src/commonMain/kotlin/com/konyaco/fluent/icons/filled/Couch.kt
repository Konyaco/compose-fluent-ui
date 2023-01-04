

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = fluentIcon(name = "Filled.Couch") {
            fluentPath {
                moveTo(19.25f, 10.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 13.33f)
                verticalLineToRelative(2.92f)
                curveToRelative(0.0f, 0.92f, -0.7f, 1.67f, -1.6f, 1.74f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineTo(3.75f)
                curveToRelative(-0.92f, 0.0f, -1.67f, -0.7f, -1.74f, -1.6f)
                lineTo(2.0f, 16.24f)
                verticalLineTo(13.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.42f, -0.67f)
                lineToRelative(0.03f, 0.17f)
                horizontalLineToRelative(9.1f)
                lineToRelative(0.03f, -0.17f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.67f, -2.08f)
                close()
                moveTo(5.75f, 6.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, 0.7f, 1.74f, 1.6f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(2.08f)
                arcTo(3.77f, 3.77f, 0.0f, false, false, 15.81f, 12.0f)
                horizontalLineTo(8.2f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -4.2f, -2.17f)
                lineTo(4.0f, 7.75f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.74f)
                lineTo(5.76f, 6.0f)
                close()
            }
        }
        return _couch!!
    }

private var _couch: ImageVector? = null
