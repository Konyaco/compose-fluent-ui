

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RatingMature: ImageVector
    get() {
        if (_ratingMature != null) {
            return _ratingMature!!
        }
        _ratingMature = fluentIcon(name = "Regular.RatingMature") {
            fluentPath {
                moveTo(8.83f, 8.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.33f, 0.48f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineToRelative(-4.43f)
                lineToRelative(2.42f, 2.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.16f, 0.0f)
                lineToRelative(2.42f, -2.9f)
                verticalLineToRelative(4.42f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.33f, -0.48f)
                lineTo(12.0f, 12.07f)
                lineToRelative(-3.17f, -3.8f)
                close()
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineTo(6.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        return _ratingMature!!
    }

private var _ratingMature: ImageVector? = null
