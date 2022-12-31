

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RatioOneToOne: ImageVector
    get() {
        if (_ratioOneToOne != null) {
            return _ratioOneToOne!!
        }
        _ratioOneToOne = fluentIcon(name = "Filled.RatioOneToOne") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(8.5f, 8.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-5.1f)
                lineToRelative(-0.33f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.84f, -1.24f)
                lineToRelative(1.5f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.17f, 0.62f)
                close()
                moveTo(17.5f, 8.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-5.1f)
                lineToRelative(-0.33f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.84f, -1.24f)
                lineToRelative(1.5f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.17f, 0.62f)
                close()
                moveTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        return _ratioOneToOne!!
    }

private var _ratioOneToOne: ImageVector? = null
