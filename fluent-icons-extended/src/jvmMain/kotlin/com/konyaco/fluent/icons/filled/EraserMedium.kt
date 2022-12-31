

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EraserMedium: ImageVector
    get() {
        if (_eraserMedium != null) {
            return _eraserMedium!!
        }
        _eraserMedium = fluentIcon(name = "Filled.EraserMedium") {
            fluentPath {
                moveTo(12.65f, 2.64f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.2f, 0.02f)
                lineToRelative(4.9f, 5.0f)
                curveToRelative(0.86f, 0.89f, 0.86f, 2.3f, 0.0f, 3.17f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.04f, 5.55f)
                lineTo(5.64f, 11.7f)
                lineTo(4.1f, 13.2f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.78f, 0.0f, 1.07f)
                lineToRelative(5.1f, 5.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(0.8f, -0.81f)
                curveToRelative(0.09f, 0.58f, 0.25f, 1.13f, 0.48f, 1.65f)
                lineToRelative(-0.22f, 0.22f)
                curveToRelative(-0.87f, 0.88f, -2.29f, 0.89f, -3.17f, 0.02f)
                lineToRelative(-5.1f, -5.01f)
                curveToRelative(-0.9f, -0.88f, -0.9f, -2.32f, 0.0f, -3.2f)
                lineToRelative(9.6f, -9.51f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.01f, 10.99f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.5f, 12.0f)
                close()
            }
        }
        return _eraserMedium!!
    }

private var _eraserMedium: ImageVector? = null
