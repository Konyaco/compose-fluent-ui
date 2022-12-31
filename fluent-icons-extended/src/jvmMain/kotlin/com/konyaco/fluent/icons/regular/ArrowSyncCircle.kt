

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSyncCircle: ImageVector
    get() {
        if (_arrowSyncCircle != null) {
            return _arrowSyncCircle!!
        }
        _arrowSyncCircle = fluentIcon(name = "Regular.ArrowSyncCircle") {
            fluentPath {
                moveTo(16.0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(14.0f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.27f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -5.94f, -1.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.16f, -0.96f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 9.0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(10.0f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(8.84f, 13.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 5.84f, 0.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.14f, 0.97f)
                arcTo(5.01f, 5.01f, 0.0f, false, true, 8.0f, 15.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, -17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 17.0f, 0.0f)
                close()
            }
        }
        return _arrowSyncCircle!!
    }

private var _arrowSyncCircle: ImageVector? = null
