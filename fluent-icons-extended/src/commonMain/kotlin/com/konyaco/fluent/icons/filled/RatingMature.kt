

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RatingMature: ImageVector
    get() {
        if (_ratingMature != null) {
            return _ratingMature!!
        }
        _ratingMature = fluentIcon(name = "Filled.RatingMature") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
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
            }
        }
        return _ratingMature!!
    }

private var _ratingMature: ImageVector? = null
