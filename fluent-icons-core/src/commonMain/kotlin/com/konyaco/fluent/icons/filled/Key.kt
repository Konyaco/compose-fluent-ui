

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = fluentIcon(name = "Filled.Key") {
            fluentPath {
                moveTo(8.95f, 8.6f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, 6.55f, -6.55f)
                curveToRelative(3.6f, 0.0f, 6.55f, 2.82f, 6.55f, 6.45f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, -8.1f, 6.35f)
                curveToRelative(-0.03f, 0.67f, -0.58f, 1.2f, -1.25f, 1.2f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(7.95f, 19.05f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.7f, 22.05f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0.0f, -0.73f, 0.29f, -1.43f, 0.8f, -1.95f)
                lineTo(9.0f, 9.95f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.07f, -0.25f)
                arcToRelative(6.39f, 6.39f, 0.0f, false, true, -0.11f, -1.1f)
                close()
                moveTo(18.25f, 7.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
            }
        }
        return _key!!
    }

private var _key: ImageVector? = null
