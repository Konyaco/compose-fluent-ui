

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClosedCaptionOff: ImageVector
    get() {
        if (_closedCaptionOff != null) {
            return _closedCaptionOff!!
        }
        _closedCaptionOff = fluentIcon(name = "Filled.ClosedCaptionOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.25f, 1.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(13.69f)
                lineToRelative(1.78f, 1.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(8.58f, 9.63f)
                curveTo(7.68f, 9.78f, 7.0f, 10.63f, 7.0f, 12.0f)
                curveToRelative(0.0f, 2.0f, 1.48f, 2.9f, 2.88f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.74f, 1.3f)
                curveToRelative(-2.4f, 1.37f, -5.12f, -0.26f, -5.12f, -3.4f)
                curveToRelative(0.0f, -1.7f, 0.8f, -2.96f, 1.9f, -3.54f)
                lineToRelative(1.17f, 1.17f)
                close()
                moveTo(17.38f, 9.9f)
                curveToRelative(-1.24f, -0.7f, -2.55f, -0.08f, -2.83f, 1.47f)
                lineToRelative(7.01f, 7.01f)
                curveToRelative(0.28f, -0.48f, 0.44f, -1.03f, 0.44f, -1.63f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(7.18f, 4.0f)
                lineToRelative(6.18f, 6.17f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, 4.76f, -1.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 1.3f)
                close()
            }
        }
        return _closedCaptionOff!!
    }

private var _closedCaptionOff: ImageVector? = null
