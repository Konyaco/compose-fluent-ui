

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideArrowRight: ImageVector
    get() {
        if (_slideArrowRight != null) {
            return _slideArrowRight!!
        }
        _slideArrowRight = fluentIcon(name = "Regular.SlideArrowRight") {
            fluentPath {
                moveTo(6.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(6.0f, 11.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.21f, 0.0f, 0.4f, 0.09f, 0.54f, 0.23f)
                curveToRelative(-0.91f, 0.25f, -1.74f, 0.68f, -2.44f, 1.27f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(20.5f, 6.75f)
                verticalLineToRelative(4.98f)
                curveToRelative(0.55f, 0.29f, 1.06f, 0.65f, 1.5f, 1.08f)
                lineTo(22.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                lineTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                horizontalLineToRelative(6.75f)
                curveToRelative(-0.2f, -0.47f, -0.34f, -0.98f, -0.42f, -1.5f)
                lineTo(4.75f, 18.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(3.5f, 6.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(11.31f, 15.5f)
                curveToRelative(0.18f, -0.53f, 0.42f, -1.04f, 0.71f, -1.5f)
                lineTo(6.75f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.56f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(14.5f, 17.0f)
                close()
            }
        }
        return _slideArrowRight!!
    }

private var _slideArrowRight: ImageVector? = null
