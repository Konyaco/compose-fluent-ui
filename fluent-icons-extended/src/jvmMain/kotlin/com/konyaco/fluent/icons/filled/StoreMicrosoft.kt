

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StoreMicrosoft: ImageVector
    get() {
        if (_storeMicrosoft != null) {
            return _storeMicrosoft!!
        }
        _storeMicrosoft = fluentIcon(name = "Filled.StoreMicrosoft") {
            fluentPath {
                moveTo(8.0f, 3.75f)
                lineTo(8.0f, 6.0f)
                lineTo(2.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 21.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 18.25f)
                lineTo(22.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(16.0f, 6.0f)
                lineTo(16.0f, 3.75f)
                curveTo(16.0f, 2.78f, 15.22f, 2.0f, 14.25f, 2.0f)
                horizontalLineToRelative(-4.5f)
                curveTo(8.78f, 2.0f, 8.0f, 2.78f, 8.0f, 3.75f)
                close()
                moveTo(9.75f, 3.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.11f, 0.25f, 0.25f)
                lineTo(14.5f, 6.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 3.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(8.0f, 9.5f)
                horizontalLineToRelative(3.5f)
                lineTo(11.5f, 13.0f)
                lineTo(8.0f, 13.0f)
                close()
                moveTo(8.0f, 17.5f)
                lineTo(8.0f, 14.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                lineTo(8.0f, 17.5f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.5f, 9.5f)
                lineTo(16.0f, 9.5f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(12.5f, 17.5f)
                lineTo(12.5f, 14.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        return _storeMicrosoft!!
    }

private var _storeMicrosoft: ImageVector? = null
