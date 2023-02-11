

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentLandscapeData: ImageVector
    get() {
        if (_documentLandscapeData != null) {
            return _documentLandscapeData!!
        }
        _documentLandscapeData = fluentIcon(name = "Regular.DocumentLandscapeData") {
            fluentPath {
                moveTo(10.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(12.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(12.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(5.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(17.5f, 12.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(2.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 20.0f)
                lineTo(4.75f, 20.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 17.25f)
                lineTo(2.0f, 6.75f)
                close()
                moveTo(4.75f, 5.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(20.5f, 6.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(4.75f, 5.5f)
                close()
            }
        }
        return _documentLandscapeData!!
    }

private var _documentLandscapeData: ImageVector? = null
