

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleStar: ImageVector
    get() {
        if (_peopleStar != null) {
            return _peopleStar!!
        }
        _peopleStar = fluentIcon(name = "Filled.PeopleStar") {
            fluentPath {
                moveTo(8.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(17.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(4.25f, 13.0f)
                curveTo(3.01f, 13.0f, 2.0f, 14.0f, 2.0f, 15.25f)
                verticalLineToRelative(0.25f)
                reflectiveCurveTo(2.0f, 20.0f, 8.0f, 20.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.28f, -0.61f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 1.36f, -6.2f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, -0.89f, -0.19f)
                horizontalLineToRelative(-7.5f)
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
        return _peopleStar!!
    }

private var _peopleStar: ImageVector? = null
