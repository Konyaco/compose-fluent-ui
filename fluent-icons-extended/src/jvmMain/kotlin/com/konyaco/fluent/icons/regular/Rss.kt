

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = fluentIcon(name = "Regular.Rss") {
            fluentPath {
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
            }
            fluentPath {
                moveTo(13.3f, 18.0f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.7f, -0.75f)
                arcTo(7.25f, 7.25f, 0.0f, false, false, 6.67f, 10.0f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.67f, 0.7f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.4f, 0.35f, 0.7f, 0.75f, 0.7f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 5.75f, 5.75f)
                curveToRelative(0.0f, 0.4f, 0.3f, 0.75f, 0.7f, 0.75f)
                horizontalLineToRelative(0.1f)
                close()
            }
            fluentPath {
                moveTo(9.0f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
            fluentPath {
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
        return _rss!!
    }

private var _rss: ImageVector? = null
