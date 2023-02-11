

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Form: ImageVector
    get() {
        if (_form != null) {
            return _form!!
        }
        _form = fluentIcon(name = "Filled.Form") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 5.75f, 21.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 18.25f)
                lineTo(21.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                lineTo(5.75f, 3.0f)
                close()
                moveTo(7.5f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(8.25f, 8.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                close()
                moveTo(8.25f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(6.0f, 16.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -4.5f, 0.0f)
                close()
                moveTo(12.25f, 10.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(11.5f, 16.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(6.75f, 6.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.75f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _form!!
    }

private var _form: ImageVector? = null
