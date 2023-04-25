

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = fluentIcon(name = "Filled.Scales") {
            fluentPath {
                moveTo(3.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.04f)
                lineToRelative(-2.73f, 6.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.06f, 0.28f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 7.0f, 0.0f)
                curveToRelative(0.0f, -0.1f, -0.02f, -0.2f, -0.06f, -0.28f)
                lineTo(6.21f, 4.5f)
                horizontalLineToRelative(5.04f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                horizontalLineToRelative(9.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(5.04f)
                lineToRelative(-2.73f, 6.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.06f, 0.28f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 7.0f, 0.0f)
                curveToRelative(0.0f, -0.1f, -0.02f, -0.2f, -0.06f, -0.28f)
                lineTo(19.21f, 4.5f)
                horizontalLineToRelative(1.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 3.0f)
                close()
                moveTo(5.5f, 6.74f)
                lineToRelative(1.63f, 4.01f)
                lineTo(3.87f, 10.75f)
                lineTo(5.5f, 6.74f)
                close()
                moveTo(16.87f, 10.75f)
                lineTo(18.5f, 6.74f)
                lineTo(20.13f, 10.75f)
                horizontalLineToRelative(-3.26f)
                close()
            }
        }
        return _scales!!
    }

private var _scales: ImageVector? = null
