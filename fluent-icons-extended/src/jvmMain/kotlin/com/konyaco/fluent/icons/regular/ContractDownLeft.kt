

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ContractDownLeft: ImageVector
    get() {
        if (_contractDownLeft != null) {
            return _contractDownLeft!!
        }
        _contractDownLeft = fluentIcon(name = "Regular.ContractDownLeft") {
            fluentPath {
                moveTo(4.5f, 6.25f)
                lineTo(4.5f, 12.0f)
                horizontalLineToRelative(4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 12.0f, 14.75f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(5.75f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                close()
                moveTo(4.5f, 13.5f)
                verticalLineToRelative(4.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(-4.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(4.5f, 13.5f)
                close()
                moveTo(15.56f, 9.5f)
                horizontalLineToRelative(4.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.69f)
                lineToRelative(5.22f, -5.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(15.56f, 9.5f)
                close()
            }
        }
        return _contractDownLeft!!
    }

private var _contractDownLeft: ImageVector? = null
