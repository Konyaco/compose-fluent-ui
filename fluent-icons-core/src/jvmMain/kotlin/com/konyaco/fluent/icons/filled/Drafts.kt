

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Drafts: ImageVector
    get() {
        if (_drafts != null) {
            return _drafts!!
        }
        _drafts = fluentIcon(name = "Filled.Drafts") {
            fluentPath {
                moveTo(13.94f, 5.0f)
                lineTo(19.0f, 10.06f)
                lineTo(9.06f, 20.0f)
                curveToRelative(-0.27f, 0.28f, -0.62f, 0.48f, -1.0f, 0.58f)
                lineToRelative(-5.11f, 1.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.92f, -0.93f)
                lineToRelative(1.4f, -5.11f)
                curveToRelative(0.1f, -0.38f, 0.3f, -0.72f, 0.57f, -1.0f)
                lineTo(13.94f, 5.0f)
                close()
                moveTo(6.53f, 11.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(2.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.78f)
                close()
                moveTo(20.88f, 2.83f)
                lineToRelative(0.15f, 0.14f)
                lineToRelative(0.15f, 0.15f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, -0.15f, 4.91f)
                lineToRelative(-0.97f, 0.97f)
                lineTo(15.0f, 3.94f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, 4.9f, -0.14f)
                close()
                moveTo(10.53f, 7.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(2.75f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(7.78f)
                close()
                moveTo(14.53f, 3.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(2.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(11.78f)
                close()
            }
        }
        return _drafts!!
    }

private var _drafts: ImageVector? = null
