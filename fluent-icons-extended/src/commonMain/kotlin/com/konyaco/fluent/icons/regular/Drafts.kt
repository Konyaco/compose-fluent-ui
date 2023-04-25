

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Drafts: ImageVector
    get() {
        if (_drafts != null) {
            return _drafts!!
        }
        _drafts = fluentIcon(name = "Regular.Drafts") {
            fluentPath {
                moveToRelative(20.88f, 2.83f)
                lineToRelative(0.15f, 0.14f)
                lineToRelative(0.15f, 0.15f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, -0.15f, 4.91f)
                lineTo(9.06f, 20.0f)
                curveToRelative(-0.27f, 0.28f, -0.62f, 0.48f, -1.0f, 0.58f)
                lineToRelative(-5.11f, 1.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.92f, -0.93f)
                lineToRelative(1.4f, -5.11f)
                curveToRelative(0.1f, -0.38f, 0.3f, -0.72f, 0.57f, -1.0f)
                lineTo(15.97f, 2.97f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, 4.9f, -0.14f)
                close()
                moveTo(15.0f, 6.06f)
                lineTo(5.06f, 16.0f)
                curveToRelative(-0.09f, 0.1f, -0.16f, 0.2f, -0.19f, 0.33f)
                lineToRelative(-1.05f, 3.85f)
                lineToRelative(3.85f, -1.05f)
                curveToRelative(0.13f, -0.03f, 0.24f, -0.1f, 0.33f, -0.2f)
                lineTo(17.94f, 9.0f)
                lineTo(15.0f, 6.06f)
                close()
                moveTo(6.53f, 11.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(2.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.78f)
                close()
                moveTo(10.53f, 7.0f)
                lineTo(9.03f, 8.5f)
                lineTo(2.75f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(7.78f)
                close()
                moveTo(17.03f, 4.03f)
                lineTo(16.06f, 5.0f)
                lineTo(19.0f, 7.94f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(2.08f, 2.08f, 0.0f, true, false, -2.94f, -2.94f)
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
