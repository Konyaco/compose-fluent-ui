

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageTable: ImageVector
    get() {
        if (_imageTable != null) {
            return _imageTable!!
        }
        _imageTable = fluentIcon(name = "Filled.ImageTable") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 6.5f)
                verticalLineToRelative(-0.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                close()
                moveTo(3.0f, 16.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 16.0f)
                close()
                moveTo(16.0f, 6.5f)
                lineTo(8.0f, 6.5f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(17.5f, 6.5f)
                lineTo(17.5f, 3.0f)
                horizontalLineToRelative(0.25f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(17.5f, 8.0f)
                lineTo(21.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(17.5f, 8.0f)
                close()
                moveTo(17.5f, 17.5f)
                lineTo(21.0f, 17.5f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(16.0f, 17.5f)
                lineTo(16.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(6.5f, 17.5f)
                lineTo(6.5f, 21.0f)
                horizontalLineToRelative(-0.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(8.0f, 15.07f)
                lineToRelative(2.4f, -2.41f)
                curveToRelative(0.89f, -0.88f, 2.31f, -0.88f, 3.2f, 0.0f)
                lineToRelative(2.4f, 2.4f)
                lineTo(16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(7.07f)
                close()
                moveTo(14.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(14.81f, 16.0f)
                lineTo(12.53f, 13.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineTo(9.19f, 16.0f)
                horizontalLineToRelative(5.62f)
                close()
            }
        }
        return _imageTable!!
    }

private var _imageTable: ImageVector? = null
