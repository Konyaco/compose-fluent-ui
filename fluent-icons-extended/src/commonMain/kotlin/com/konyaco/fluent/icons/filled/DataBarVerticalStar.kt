

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataBarVerticalStar: ImageVector
    get() {
        if (_dataBarVerticalStar != null) {
            return _dataBarVerticalStar!!
        }
        _dataBarVerticalStar = fluentIcon(name = "Filled.DataBarVerticalStar") {
            fluentPath {
                moveTo(18.25f, 3.0f)
                curveTo(17.01f, 3.0f, 16.0f, 4.0f, 16.0f, 5.25f)
                verticalLineToRelative(5.92f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, true, 4.5f, 0.56f)
                lineTo(20.5f, 5.25f)
                curveTo(20.5f, 4.0f, 19.5f, 3.0f, 18.25f, 3.0f)
                close()
                moveTo(14.0f, 9.25f)
                verticalLineToRelative(2.77f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -1.99f, 8.96f)
                lineToRelative(-0.26f, 0.02f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                close()
                moveTo(3.0f, 13.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(18.06f, 14.42f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -1.12f, 0.0f)
                lineToRelative(-0.55f, 1.79f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-0.57f, 0.0f, -0.8f, 0.75f, -0.35f, 1.1f)
                lineToRelative(1.46f, 1.1f)
                lineToRelative(-0.56f, 1.79f)
                curveToRelative(-0.17f, 0.56f, 0.44f, 1.03f, 0.9f, 0.68f)
                lineToRelative(1.46f, -1.1f)
                lineToRelative(1.46f, 1.1f)
                curveToRelative(0.46f, 0.35f, 1.07f, -0.12f, 0.9f, -0.68f)
                lineToRelative(-0.56f, -1.79f)
                lineToRelative(1.46f, -1.1f)
                curveToRelative(0.46f, -0.35f, 0.22f, -1.1f, -0.35f, -1.1f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(-0.55f, -1.79f)
                close()
            }
        }
        return _dataBarVerticalStar!!
    }

private var _dataBarVerticalStar: ImageVector? = null
