

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataUsage: ImageVector
    get() {
        if (_dataUsage != null) {
            return _dataUsage!!
        }
        _dataUsage = fluentIcon(name = "Regular.DataUsage") {
            fluentPath {
                moveTo(18.25f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(18.25f, 4.5f)
                lineTo(5.75f, 4.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(19.5f, 5.75f)
                curveToRelative(0.0f, -0.7f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveTo(7.75f, 9.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.64f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(6.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-6.6f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(16.25f, 7.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.27f, 0.74f, 0.63f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(8.54f)
                curveToRelative(0.0f, 0.4f, -0.34f, 0.73f, -0.75f, 0.73f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.74f, -0.63f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(15.5f, 7.73f)
                curveToRelative(0.0f, -0.4f, 0.34f, -0.73f, 0.75f, -0.73f)
                close()
                moveTo(11.98f, 12.0f)
                curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.73f, 0.62f)
                verticalLineToRelative(0.1f)
                lineToRelative(0.04f, 3.54f)
                curveToRelative(0.0f, 0.4f, -0.32f, 0.73f, -0.73f, 0.74f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.73f, -0.62f)
                verticalLineToRelative(-0.1f)
                lineToRelative(-0.04f, -3.55f)
                curveToRelative(0.0f, -0.4f, 0.32f, -0.73f, 0.73f, -0.73f)
                close()
            }
        }
        return _dataUsage!!
    }

private var _dataUsage: ImageVector? = null
