

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentLandscapeSplit: ImageVector
    get() {
        if (_documentLandscapeSplit != null) {
            return _documentLandscapeSplit!!
        }
        _documentLandscapeSplit = fluentIcon(name = "Regular.DocumentLandscapeSplit") {
            fluentPath {
                moveTo(3.5f, 6.0f)
                curveToRelative(0.0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(13.0f)
                lineTo(4.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(3.5f, 6.0f)
                close()
                moveTo(12.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(15.5f, 6.62f)
                lineTo(19.38f, 10.5f)
                lineTo(16.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(15.5f, 6.62f)
                close()
                moveTo(21.41f, 10.42f)
                lineTo(15.6f, 4.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.17f, 4.0f)
                lineTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-6.17f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.0f, -0.08f)
                lineToRelative(-0.01f, -0.06f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -0.14f, -0.63f)
                lineToRelative(-0.09f, -0.16f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, true, -0.1f, -0.18f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, -0.2f, -0.26f)
                lineToRelative(-0.05f, -0.05f)
                close()
            }
        }
        return _documentLandscapeSplit!!
    }

private var _documentLandscapeSplit: ImageVector? = null
