

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Class: ImageVector
    get() {
        if (_class != null) {
            return _class!!
        }
        _class = fluentIcon(name = "Regular.Class") {
            fluentPath {
                moveTo(17.25f, 2.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.0f, 4.75f)
                verticalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 17.25f, 22.0f)
                lineTo(6.75f, 22.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.0f, 19.25f)
                lineTo(4.0f, 4.75f)
                curveToRelative(0.0f, -1.26f, 0.85f, -2.32f, 2.0f, -2.65f)
                verticalLineToRelative(1.65f)
                curveToRelative(-0.3f, 0.23f, -0.5f, 0.6f, -0.5f, 1.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.7f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(18.5f, 4.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(15.0f, 3.5f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(2.25f)
                close()
                moveTo(14.0f, 2.0f)
                verticalLineToRelative(8.14f)
                curveToRelative(0.0f, 0.75f, -0.8f, 1.03f, -1.29f, 0.76f)
                lineToRelative(-0.08f, -0.05f)
                lineToRelative(-2.13f, -1.28f)
                lineToRelative(-2.08f, 1.25f)
                curveToRelative(-0.5f, 0.36f, -1.33f, 0.14f, -1.41f, -0.56f)
                lineTo(7.0f, 10.14f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(12.5f, 3.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.52f)
                lineToRelative(1.57f, -0.95f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.82f, -0.02f)
                lineToRelative(1.61f, 0.97f)
                lineTo(12.5f, 3.5f)
                close()
            }
        }
        return _class!!
    }

private var _class: ImageVector? = null
