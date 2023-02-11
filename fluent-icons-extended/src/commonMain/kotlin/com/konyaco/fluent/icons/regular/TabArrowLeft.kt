

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TabArrowLeft: ImageVector
    get() {
        if (_tabArrowLeft != null) {
            return _tabArrowLeft!!
        }
        _tabArrowLeft = fluentIcon(name = "Regular.TabArrowLeft") {
            fluentPath {
                moveTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(6.27f)
                curveToRelative(-0.46f, -0.3f, -0.97f, -0.53f, -1.5f, -0.7f)
                lineTo(19.5f, 5.74f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(5.75f, 4.49f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(5.56f)
                curveToRelative(0.18f, 0.53f, 0.42f, 1.04f, 0.71f, 1.5f)
                lineTo(5.75f, 20.99f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                close()
                moveTo(17.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, 11.0f)
                close()
                moveTo(20.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-4.8f)
                lineToRelative(1.65f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.7f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineTo(15.71f, 18.0f)
                horizontalLineToRelative(4.79f)
                close()
            }
        }
        return _tabArrowLeft!!
    }

private var _tabArrowLeft: ImageVector? = null
