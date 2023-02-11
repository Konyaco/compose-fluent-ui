

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ScanObject: ImageVector
    get() {
        if (_scanObject != null) {
            return _scanObject!!
        }
        _scanObject = fluentIcon(name = "Filled.ScanObject") {
            fluentPath {
                moveTo(3.5f, 5.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.5f, 5.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveTo(20.55f, 2.0f, 22.0f, 3.46f, 22.0f, 5.25f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.25f, 20.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.0f)
                curveTo(2.0f, 20.55f, 3.46f, 22.0f, 5.25f, 22.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(20.5f, 18.75f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.82f, 8.23f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.64f, 0.0f)
                lineToRelative(-3.05f, 4.2f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 8.95f, 16.0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(1.84f, 0.0f, 2.9f, -2.09f, 1.82f, -3.57f)
                lineToRelative(-3.05f, -4.2f)
                close()
            }
        }
        return _scanObject!!
    }

private var _scanObject: ImageVector? = null
