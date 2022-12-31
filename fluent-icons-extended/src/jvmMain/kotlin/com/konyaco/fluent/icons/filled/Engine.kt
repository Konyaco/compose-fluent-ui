

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = fluentIcon(name = "Filled.Engine") {
            fluentPath {
                moveTo(9.75f, 3.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(10.5f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.3f, 0.0f, 0.58f, 0.19f, 0.7f, 0.47f)
                lineToRelative(0.8f, 2.03f)
                horizontalLineToRelative(1.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 10.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.8f, 2.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 0.47f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.09f, -0.55f, -0.24f)
                lineTo(5.74f, 17.6f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.0f, 15.7f)
                lineTo(5.0f, 12.5f)
                lineTo(3.5f, 12.5f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(3.5f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 7.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 7.75f, 5.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(10.5f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(2.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 11.75f, 15.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(14.0f, 13.5f)
                lineTo(14.0f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }
        return _engine!!
    }

private var _engine: ImageVector? = null
