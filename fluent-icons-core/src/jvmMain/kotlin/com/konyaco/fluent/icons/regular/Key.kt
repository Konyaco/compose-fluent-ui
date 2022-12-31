

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = fluentIcon(name = "Regular.Key") {
            fluentPath {
                moveTo(18.25f, 7.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(15.5f, 2.05f)
                arcTo(6.55f, 6.55f, 0.0f, false, false, 9.06f, 9.7f)
                curveToRelative(0.02f, 0.1f, -0.02f, 0.2f, -0.07f, 0.25f)
                lineToRelative(-6.24f, 6.23f)
                curveToRelative(-0.51f, 0.52f, -0.8f, 1.22f, -0.8f, 1.95f)
                verticalLineToRelative(2.17f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-1.25f)
                horizontalLineTo(9.7f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.67f, 0.0f, 1.22f, -0.54f, 1.25f, -1.2f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, false, 8.1f, -6.35f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -6.55f, -6.45f)
                close()
                moveTo(10.45f, 8.6f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, true, 5.05f, -5.05f)
                curveToRelative(2.8f, 0.0f, 5.05f, 2.18f, 5.05f, 4.95f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, true, -7.06f, 4.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.04f, 0.69f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(10.7f)
                curveToRelative(-0.7f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(1.75f)
                horizontalLineTo(7.7f)
                curveToRelative(-0.7f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                horizontalLineTo(3.7f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0.0f, -0.33f, 0.13f, -0.65f, 0.37f, -0.89f)
                lineToRelative(6.23f, -6.23f)
                curveToRelative(0.42f, -0.42f, 0.58f, -1.0f, 0.49f, -1.57f)
                curveToRelative(-0.06f, -0.3f, -0.1f, -0.58f, -0.1f, -0.84f)
                close()
            }
        }
        return _key!!
    }

private var _key: ImageVector? = null
