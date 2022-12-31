

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = fluentIcon(name = "Regular.Scales") {
            fluentPath {
                moveTo(3.0f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.04f)
                lineToRelative(2.73f, 6.72f)
                curveToRelative(0.04f, 0.09f, 0.06f, 0.18f, 0.06f, 0.28f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                curveToRelative(0.0f, -0.1f, 0.02f, -0.2f, 0.06f, -0.28f)
                lineToRelative(2.73f, -6.72f)
                horizontalLineToRelative(-5.04f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-12.0f)
                lineTo(6.21f, 4.5f)
                lineToRelative(2.73f, 6.72f)
                curveToRelative(0.04f, 0.09f, 0.06f, 0.18f, 0.06f, 0.28f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                curveToRelative(0.0f, -0.1f, 0.02f, -0.2f, 0.06f, -0.28f)
                lineTo(4.79f, 4.5f)
                lineTo(3.75f, 4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 3.75f)
                close()
                moveTo(6.5f, 18.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
                moveTo(7.35f, 12.25f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.7f, 0.0f)
                close()
                moveTo(7.13f, 10.75f)
                lineTo(5.5f, 6.74f)
                lineToRelative(-1.63f, 4.01f)
                horizontalLineToRelative(3.26f)
                close()
                moveTo(18.5f, 13.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, -1.25f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, 1.25f)
                close()
                moveTo(16.87f, 10.75f)
                horizontalLineToRelative(3.26f)
                lineTo(18.5f, 6.74f)
                lineToRelative(-1.63f, 4.01f)
                close()
            }
        }
        return _scales!!
    }

private var _scales: ImageVector? = null
