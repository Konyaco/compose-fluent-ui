

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowEnterUp: ImageVector
    get() {
        if (_arrowEnterUp != null) {
            return _arrowEnterUp!!
        }
        _arrowEnterUp = fluentIcon(name = "Filled.ArrowEnterUp") {
            fluentPath {
                moveTo(20.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                horizontalLineTo(12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.0f, 18.7f)
                verticalLineTo(5.4f)
                lineToRelative(-3.3f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.31f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.11f, -0.1f)
                lineToRelative(0.12f, -0.07f)
                lineToRelative(0.1f, -0.05f)
                lineToRelative(0.11f, -0.03f)
                lineToRelative(0.12f, -0.03f)
                horizontalLineToRelative(0.06f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(0.08f)
                lineToRelative(0.12f, 0.02f)
                lineToRelative(0.11f, 0.03f)
                lineToRelative(0.11f, 0.04f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(0.09f, 0.08f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.5f)
                lineToRelative(-0.1f, -0.08f)
                lineTo(11.0f, 5.4f)
                verticalLineTo(18.5f)
                curveToRelative(0.0f, 0.78f, 0.6f, 1.42f, 1.36f, 1.5f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        return _arrowEnterUp!!
    }

private var _arrowEnterUp: ImageVector? = null
