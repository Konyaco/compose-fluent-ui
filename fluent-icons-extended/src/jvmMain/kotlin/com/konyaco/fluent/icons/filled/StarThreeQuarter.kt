

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StarThreeQuarter: ImageVector
    get() {
        if (_starThreeQuarter != null) {
            return _starThreeQuarter!!
        }
        _starThreeQuarter = fluentIcon(name = "Filled.StarThreeQuarter") {
            fluentPath {
                moveTo(15.0f, 6.73f)
                lineTo(13.21f, 3.1f)
                curveToRelative(-0.25f, -0.5f, -0.73f, -0.75f, -1.21f, -0.75f)
                reflectiveCurveToRelative(-0.96f, 0.25f, -1.21f, 0.75f)
                lineTo(8.43f, 7.88f)
                lineToRelative(-5.27f, 0.77f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.75f, 2.3f)
                lineToRelative(3.81f, 3.72f)
                lineToRelative(-0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 1.96f, 1.42f)
                lineTo(12.0f, 18.86f)
                lineToRelative(3.0f, 1.58f)
                verticalLineTo(6.73f)
                close()
            }
        }
        return _starThreeQuarter!!
    }

private var _starThreeQuarter: ImageVector? = null
