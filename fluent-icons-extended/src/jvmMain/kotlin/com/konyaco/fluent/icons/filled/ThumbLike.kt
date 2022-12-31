

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ThumbLike: ImageVector
    get() {
        if (_thumbLike != null) {
            return _thumbLike!!
        }
        _thumbLike = fluentIcon(name = "Filled.ThumbLike") {
            fluentPath {
                moveTo(15.06f, 9.0f)
                curveToRelative(0.46f, -1.42f, 0.69f, -2.67f, 0.69f, -3.75f)
                curveToRelative(0.0f, -2.4f, -0.94f, -4.25f, -2.5f, -4.25f)
                curveToRelative(-0.85f, 0.0f, -1.11f, 0.5f, -1.44f, 1.75f)
                arcToRelative(64.9f, 64.9f, 0.0f, false, true, -0.77f, 2.72f)
                lineTo(8.17f, 9.95f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, true, -2.85f, 2.33f)
                lineToRelative(-1.26f, 0.48f)
                curveToRelative(-0.8f, 0.3f, -1.25f, 1.13f, -1.09f, 1.97f)
                lineToRelative(0.69f, 3.54f)
                curveToRelative(0.16f, 0.86f, 0.82f, 1.54f, 1.67f, 1.75f)
                lineToRelative(8.25f, 2.03f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 5.73f, -3.44f)
                lineToRelative(1.58f, -6.18f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.22f, 9.0f)
                horizontalLineToRelative(-3.16f)
                close()
            }
        }
        return _thumbLike!!
    }

private var _thumbLike: ImageVector? = null
