

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClosedCaption: ImageVector
    get() {
        if (_closedCaption != null) {
            return _closedCaption!!
        }
        _closedCaption = fluentIcon(name = "Filled.ClosedCaption") {
            fluentPath {
                moveTo(18.75f, 4.0f)
                curveTo(20.55f, 4.0f, 22.0f, 5.46f, 22.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(5.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                close()
                moveTo(10.62f, 8.6f)
                curveTo(8.22f, 7.22f, 5.5f, 8.85f, 5.5f, 12.0f)
                curveToRelative(0.0f, 3.14f, 2.72f, 4.77f, 5.12f, 3.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.74f, -1.3f)
                curveTo(8.48f, 14.9f, 7.0f, 14.0f, 7.0f, 12.0f)
                reflectiveCurveToRelative(1.48f, -2.9f, 2.88f, -2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.74f, -1.3f)
                close()
                moveTo(18.12f, 8.6f)
                curveTo(15.72f, 7.22f, 13.0f, 8.85f, 13.0f, 12.0f)
                curveToRelative(0.0f, 3.14f, 2.72f, 4.77f, 5.12f, 3.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.74f, -1.3f)
                curveToRelative(-1.4f, 0.8f, -2.88f, -0.1f, -2.88f, -2.1f)
                reflectiveCurveToRelative(1.48f, -2.9f, 2.88f, -2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.74f, -1.3f)
                close()
            }
        }
        return _closedCaption!!
    }

private var _closedCaption: ImageVector? = null
