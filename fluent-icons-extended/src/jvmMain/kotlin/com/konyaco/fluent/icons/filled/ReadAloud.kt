

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ReadAloud: ImageVector
    get() {
        if (_readAloud != null) {
            return _readAloud!!
        }
        _readAloud = fluentIcon(name = "Filled.ReadAloud") {
            fluentPath {
                moveTo(14.6f, 2.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.49f)
                curveToRelative(0.26f, 0.14f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.02f, 0.02f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 0.3f, 0.16f)
                arcToRelative(12.27f, 12.27f, 0.0f, false, true, 3.11f, 2.5f)
                arcTo(10.75f, 10.75f, 0.0f, false, true, 22.0f, 13.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.98f, -0.26f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -2.13f, -7.27f)
                arcToRelative(10.27f, 10.27f, 0.0f, false, false, -2.8f, -2.19f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.49f, -1.33f)
                close()
                moveTo(9.92f, 4.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.86f, 0.0f)
                lineToRelative(-5.5f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.86f, 0.74f)
                lineTo(6.15f, 15.0f)
                horizontalLineToRelative(5.7f)
                lineToRelative(1.72f, 4.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.86f, -0.74f)
                lineToRelative(-5.5f, -14.0f)
                close()
                moveTo(11.07f, 13.0f)
                lineTo(6.93f, 13.0f)
                lineTo(9.0f, 7.73f)
                lineTo(11.07f, 13.0f)
                close()
                moveTo(15.45f, 5.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.9f, 1.8f)
                curveToRelative(0.3f, 0.14f, 0.8f, 0.57f, 1.23f, 1.26f)
                curveToRelative(0.42f, 0.67f, 0.72f, 1.48f, 0.72f, 2.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.31f, -0.45f, -2.5f, -1.03f, -3.41f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -2.02f, -1.98f)
                close()
            }
        }
        return _readAloud!!
    }

private var _readAloud: ImageVector? = null
