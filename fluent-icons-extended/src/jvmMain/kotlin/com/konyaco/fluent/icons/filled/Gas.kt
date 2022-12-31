

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Gas: ImageVector
    get() {
        if (_gas != null) {
            return _gas!!
        }
        _gas = fluentIcon(name = "Filled.Gas") {
            fluentPath {
                moveTo(13.15f, 2.3f)
                curveToRelative(0.14f, -0.19f, 0.36f, -0.3f, 0.6f, -0.3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(19.0f, 6.5f)
                lineToRelative(-0.01f, 0.12f)
                curveToRelative(0.62f, 0.5f, 1.01f, 1.27f, 1.01f, 2.13f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 17.25f, 22.0f)
                lineTo(6.75f, 22.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.0f, 19.25f)
                lineTo(4.0f, 8.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 6.75f, 6.0f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-0.25f)
                curveTo(7.5f, 4.78f, 6.72f, 4.0f, 5.75f, 4.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.0f)
                curveTo(7.55f, 2.5f, 9.0f, 3.96f, 9.0f, 5.75f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(1.44f)
                lineToRelative(2.7f, -3.7f)
                close()
                moveTo(17.5f, 3.5f)
                horizontalLineToRelative(-3.37f)
                lineTo(12.3f, 6.0f)
                horizontalLineToRelative(4.95f)
                lineToRelative(0.25f, 0.01f)
                lineTo(17.5f, 3.5f)
                close()
                moveTo(8.22f, 10.22f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineTo(10.94f, 14.0f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(12.0f, 15.06f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(13.06f, 14.0f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(12.0f, 12.94f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
            }
        }
        return _gas!!
    }

private var _gas: ImageVector? = null
