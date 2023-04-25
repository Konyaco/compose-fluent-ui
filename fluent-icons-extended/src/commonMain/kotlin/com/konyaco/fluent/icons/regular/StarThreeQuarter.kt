

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.StarThreeQuarter: ImageVector
    get() {
        if (_starThreeQuarter != null) {
            return _starThreeQuarter!!
        }
        _starThreeQuarter = fluentIcon(name = "Regular.StarThreeQuarter") {
            fluentPath {
                moveTo(13.21f, 3.1f)
                lineTo(15.0f, 6.73f)
                lineToRelative(0.57f, 1.15f)
                lineToRelative(5.27f, 0.77f)
                curveToRelative(1.1f, 0.16f, 1.55f, 1.52f, 0.75f, 2.3f)
                lineToRelative(-3.82f, 3.72f)
                lineToRelative(0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.96f, 1.42f)
                lineTo(12.0f, 18.86f)
                lineToRelative(-4.72f, 2.48f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, -1.96f, -1.42f)
                lineToRelative(0.9f, -5.25f)
                lineToRelative(-3.81f, -3.72f)
                curveToRelative(-0.8f, -0.78f, -0.36f, -2.14f, 0.75f, -2.3f)
                lineToRelative(5.27f, -0.77f)
                lineToRelative(2.36f, -4.78f)
                curveToRelative(0.25f, -0.5f, 0.73f, -0.75f, 1.2f, -0.75f)
                curveToRelative(0.5f, 0.0f, 0.97f, 0.25f, 1.22f, 0.75f)
                close()
                moveTo(15.0f, 9.28f)
                verticalLineToRelative(9.47f)
                lineToRelative(2.14f, 1.12f)
                lineToRelative(-0.86f, -5.03f)
                curveToRelative(-0.07f, -0.43f, 0.07f, -0.88f, 0.39f, -1.2f)
                lineToRelative(3.65f, -3.55f)
                lineToRelative(-5.05f, -0.74f)
                curveToRelative(-0.1f, -0.01f, -0.18f, -0.03f, -0.27f, -0.07f)
                close()
            }
        }
        return _starThreeQuarter!!
    }

private var _starThreeQuarter: ImageVector? = null
