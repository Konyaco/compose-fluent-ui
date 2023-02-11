

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonArrowLeft: ImageVector
    get() {
        if (_personArrowLeft != null) {
            return _personArrowLeft!!
        }
        _personArrowLeft = fluentIcon(name = "Filled.PersonArrowLeft") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(12.02f, 14.0f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 0.6f, 7.8f)
                curveToRelative(-0.8f, 0.13f, -1.68f, 0.2f, -2.62f, 0.2f)
                curveToRelative(-2.89f, 0.0f, -5.13f, -0.66f, -6.7f, -2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 2.0f, 17.16f)
                verticalLineToRelative(-0.91f)
                curveTo(2.0f, 15.01f, 3.01f, 14.0f, 4.25f, 14.0f)
                horizontalLineToRelative(7.77f)
                close()
                moveTo(16.72f, 14.59f)
                lineToRelative(-0.07f, 0.06f)
                lineToRelative(-2.52f, 2.51f)
                lineToRelative(-0.04f, 0.05f)
                lineToRelative(-0.03f, 0.06f)
                lineToRelative(-0.03f, 0.08f)
                lineToRelative(-0.01f, 0.04f)
                lineToRelative(-0.02f, 0.09f)
                verticalLineToRelative(0.09f)
                lineToRelative(0.03f, 0.08f)
                lineToRelative(0.03f, 0.08f)
                lineToRelative(0.02f, 0.04f)
                lineToRelative(0.05f, 0.07f)
                lineToRelative(2.52f, 2.51f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.76f, -0.63f)
                lineToRelative(-0.05f, -0.07f)
                lineTo(15.7f, 18.0f)
                horizontalLineToRelative(4.79f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.41f)
                verticalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.5f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(1.65f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.05f, -0.63f)
                lineToRelative(-0.05f, -0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.64f, -0.06f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
            }
        }
        return _personArrowLeft!!
    }

private var _personArrowLeft: ImageVector? = null
