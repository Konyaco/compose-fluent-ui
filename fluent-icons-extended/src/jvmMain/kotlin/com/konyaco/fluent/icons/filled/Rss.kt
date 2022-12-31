

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = fluentIcon(name = "Filled.Rss") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(6.75f, 7.5f)
                arcTo(0.74f, 0.74f, 0.0f, false, true, 6.0f, 6.78f)
                verticalLineToRelative(-0.06f)
                curveToRelative(0.0f, -0.39f, 0.3f, -0.72f, 0.7f, -0.72f)
                horizontalLineToRelative(0.05f)
                curveTo(12.96f, 6.0f, 18.0f, 11.04f, 18.0f, 17.25f)
                verticalLineToRelative(0.05f)
                curveToRelative(0.0f, 0.4f, -0.33f, 0.7f, -0.72f, 0.7f)
                horizontalLineToRelative(-0.06f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.72f, -0.75f)
                arcTo(9.75f, 9.75f, 0.0f, false, false, 6.75f, 7.5f)
                close()
                moveTo(13.29f, 18.0f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-0.4f, 0.0f, -0.7f, -0.35f, -0.7f, -0.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -5.75f, -5.75f)
                curveToRelative(-0.4f, 0.0f, -0.75f, -0.3f, -0.75f, -0.7f)
                verticalLineToRelative(-0.1f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.75f, -0.7f)
                arcTo(7.25f, 7.25f, 0.0f, false, true, 14.0f, 17.33f)
                curveToRelative(0.0f, 0.38f, -0.33f, 0.67f, -0.7f, 0.67f)
                close()
                moveTo(7.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        return _rss!!
    }

private var _rss: ImageVector? = null
