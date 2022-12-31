

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSyncCircle: ImageVector
    get() {
        if (_arrowSyncCircle != null) {
            return _arrowSyncCircle!!
        }
        _arrowSyncCircle = fluentIcon(name = "Filled.ArrowSyncCircle") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
                moveTo(15.27f, 10.75f)
                lineTo(14.0f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(17.5f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(16.0f, 9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.83f, -0.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.16f, 0.96f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.94f, 1.02f)
                close()
                moveTo(8.0f, 15.75f)
                lineTo(8.0f, 15.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.82f, 0.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.14f, -0.97f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -5.84f, -0.77f)
                lineTo(10.0f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(7.25f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
            }
        }
        return _arrowSyncCircle!!
    }

private var _arrowSyncCircle: ImageVector? = null
