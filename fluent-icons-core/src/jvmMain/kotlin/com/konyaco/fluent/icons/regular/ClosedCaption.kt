

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClosedCaption: ImageVector
    get() {
        if (_closedCaption != null) {
            return _closedCaption!!
        }
        _closedCaption = fluentIcon(name = "Regular.ClosedCaption") {
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
                moveTo(18.75f, 5.5f)
                lineTo(5.11f, 5.5f)
                curveToRelative(-0.9f, 0.08f, -1.61f, 0.83f, -1.61f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(5.5f, 12.0f)
                curveToRelative(0.0f, -3.15f, 2.71f, -4.78f, 5.12f, -3.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 1.3f)
                curveTo(8.48f, 9.1f, 7.0f, 10.0f, 7.0f, 12.0f)
                reflectiveCurveToRelative(1.48f, 2.9f, 2.88f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.74f, 1.3f)
                curveToRelative(-2.4f, 1.37f, -5.12f, -0.26f, -5.12f, -3.4f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(0.0f, -3.15f, 2.71f, -4.78f, 5.12f, -3.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 1.3f)
                curveToRelative(-1.4f, -0.8f, -2.88f, 0.1f, -2.88f, 2.1f)
                reflectiveCurveToRelative(1.48f, 2.9f, 2.88f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.74f, 1.3f)
                curveTo(15.72f, 16.78f, 13.0f, 15.15f, 13.0f, 12.0f)
                close()
            }
        }
        return _closedCaption!!
    }

private var _closedCaption: ImageVector? = null
