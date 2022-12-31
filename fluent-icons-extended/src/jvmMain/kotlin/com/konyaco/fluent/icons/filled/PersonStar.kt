

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonStar: ImageVector
    get() {
        if (_personStar != null) {
            return _personStar!!
        }
        _personStar = fluentIcon(name = "Filled.PersonStar") {
            fluentPath {
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -1.29f, 0.38f, -2.49f, 1.02f, -3.5f)
                lineTo(5.25f, 14.0f)
                curveTo(4.01f, 14.0f, 3.0f, 15.0f, 3.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(5.06f, 20.92f, 7.58f, 22.0f, 11.0f, 22.0f)
                curveToRelative(0.6f, 0.0f, 1.17f, -0.03f, 1.72f, -0.1f)
                arcTo(6.48f, 6.48f, 0.0f, false, true, 11.0f, 17.5f)
                close()
                moveTo(11.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
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
        return _personStar!!
    }

private var _personStar: ImageVector? = null
