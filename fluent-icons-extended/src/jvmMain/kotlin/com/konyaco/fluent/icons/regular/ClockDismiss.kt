

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClockDismiss: ImageVector
    get() {
        if (_clockDismiss != null) {
            return _clockDismiss!!
        }
        _clockDismiss = fluentIcon(name = "Regular.ClockDismiss") {
            fluentPath {
                moveTo(6.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(13.0f, 1.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -1.0f, 19.95f)
                curveToRelative(0.32f, -0.5f, 0.57f, -1.04f, 0.74f, -1.62f)
                horizontalLineTo(13.0f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, false, 0.0f, -16.66f)
                arcTo(8.34f, 8.34f, 0.0f, false, false, 4.67f, 11.0f)
                verticalLineToRelative(0.26f)
                curveToRelative(-0.58f, 0.17f, -1.12f, 0.42f, -1.62f, 0.73f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 13.0f, 1.0f)
                close()
                moveTo(3.72f, 14.59f)
                lineToRelative(-0.07f, 0.06f)
                lineToRelative(-0.06f, 0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.56f)
                lineToRelative(0.06f, 0.07f)
                lineToRelative(2.14f, 2.15f)
                lineToRelative(-2.14f, 2.15f)
                lineToRelative(-0.06f, 0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.56f)
                lineToRelative(0.06f, 0.07f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.17f, 0.12f, 0.4f, 0.12f, 0.56f, 0.0f)
                lineToRelative(0.07f, -0.06f)
                lineToRelative(2.15f, -2.14f)
                lineToRelative(2.15f, 2.14f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.17f, 0.12f, 0.4f, 0.12f, 0.56f, 0.0f)
                lineToRelative(0.07f, -0.06f)
                lineToRelative(0.06f, -0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.56f)
                lineToRelative(-0.06f, -0.07f)
                lineToRelative(-2.14f, -2.15f)
                lineToRelative(2.14f, -2.15f)
                lineToRelative(0.06f, -0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.56f)
                lineToRelative(-0.06f, -0.07f)
                lineToRelative(-0.07f, -0.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.56f, 0.0f)
                lineToRelative(-0.07f, 0.06f)
                lineToRelative(-2.15f, 2.14f)
                lineToRelative(-2.15f, -2.14f)
                lineToRelative(-0.07f, -0.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.49f, -0.04f)
                lineToRelative(-0.07f, 0.04f)
                close()
                moveTo(12.25f, 5.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _clockDismiss!!
    }

private var _clockDismiss: ImageVector? = null
