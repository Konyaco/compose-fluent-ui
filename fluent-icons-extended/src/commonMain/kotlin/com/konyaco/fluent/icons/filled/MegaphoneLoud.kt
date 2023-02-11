

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MegaphoneLoud: ImageVector
    get() {
        if (_megaphoneLoud != null) {
            return _megaphoneLoud!!
        }
        _megaphoneLoud = fluentIcon(name = "Filled.MegaphoneLoud") {
            fluentPath {
                moveTo(17.21f, 2.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.42f, -0.48f)
                lineToRelative(-0.75f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.42f, 0.48f)
                lineToRelative(0.75f, -2.25f)
                close()
                moveTo(21.78f, 2.22f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(2.5f, -2.5f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(12.88f, 3.74f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, false, -3.8f, 0.58f)
                lineToRelative(-5.9f, 12.24f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.39f, 2.09f)
                lineTo(5.0f, 20.01f)
                curveToRelative(0.53f, 0.5f, 1.3f, 0.63f, 1.97f, 0.33f)
                lineToRelative(1.42f, -0.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.3f, -3.24f)
                lineToRelative(3.43f, -1.51f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, false, 0.76f, -3.71f)
                lineToRelative(-7.0f, -7.5f)
                close()
                moveTo(14.33f, 17.08f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.57f, 2.03f)
                lineToRelative(4.57f, -2.03f)
                close()
                moveTo(19.0f, 8.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _megaphoneLoud!!
    }

private var _megaphoneLoud: ImageVector? = null
