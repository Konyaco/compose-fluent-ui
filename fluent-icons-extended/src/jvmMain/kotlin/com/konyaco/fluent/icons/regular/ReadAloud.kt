

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ReadAloud: ImageVector
    get() {
        if (_readAloud != null) {
            return _readAloud!!
        }
        _readAloud = fluentIcon(name = "Regular.ReadAloud") {
            fluentPath {
                moveTo(15.86f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.72f, 1.3f)
                arcToRelative(10.23f, 10.23f, 0.0f, false, true, 4.1f, 3.83f)
                curveToRelative(0.9f, 1.53f, 1.31f, 3.35f, 1.26f, 5.46f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.04f)
                curveToRelative(0.06f, -2.38f, -0.43f, -4.47f, -1.46f, -6.25f)
                arcToRelative(11.72f, 11.72f, 0.0f, false, false, -4.68f, -4.39f)
                close()
                moveTo(15.62f, 5.7f)
                arcTo(0.75f, 0.75f, 0.0f, true, false, 14.91f, 7.0f)
                curveToRelative(0.72f, 0.4f, 1.3f, 0.96f, 1.73f, 1.72f)
                curveToRelative(0.44f, 0.76f, 0.65f, 1.54f, 0.63f, 2.37f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.03f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -0.83f, -3.15f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -2.32f, -2.29f)
                close()
                moveTo(9.0f, 4.0f)
                curveToRelative(0.3f, 0.0f, 0.58f, 0.19f, 0.7f, 0.47f)
                lineToRelative(5.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.4f, 0.56f)
                lineTo(12.25f, 15.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-1.8f, 4.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.4f, -0.56f)
                lineTo(8.3f, 4.47f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.0f, 4.0f)
                close()
                moveTo(9.0f, 6.78f)
                lineTo(6.34f, 13.5f)
                horizontalLineToRelative(5.32f)
                lineTo(9.0f, 6.78f)
                close()
            }
        }
        return _readAloud!!
    }

private var _readAloud: ImageVector? = null
