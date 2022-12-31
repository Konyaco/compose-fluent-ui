

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SportSoccer: ImageVector
    get() {
        if (_sportSoccer != null) {
            return _sportSoccer!!
        }
        _sportSoccer = fluentIcon(name = "Filled.SportSoccer") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(8.24f, 4.37f)
                lineToRelative(3.01f, 1.8f)
                verticalLineToRelative(2.2f)
                lineToRelative(-2.79f, 2.02f)
                lineToRelative(-2.04f, -0.7f)
                lineToRelative(-0.59f, -3.54f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, true, 2.41f, -1.78f)
                close()
                moveTo(3.62f, 13.44f)
                lineToRelative(2.33f, -2.33f)
                lineToRelative(2.04f, 0.7f)
                lineToRelative(1.08f, 3.34f)
                lineToRelative(-0.97f, 1.58f)
                lineToRelative(-3.3f, -0.2f)
                curveToRelative(-0.58f, -0.92f, -0.99f, -1.97f, -1.18f, -3.1f)
                close()
                moveTo(10.53f, 20.37f)
                lineToRelative(-1.18f, -2.8f)
                lineToRelative(0.96f, -1.57f)
                horizontalLineToRelative(3.37f)
                lineToRelative(0.91f, 1.58f)
                lineToRelative(-1.04f, 2.78f)
                arcToRelative(8.55f, 8.55f, 0.0f, false, true, -3.02f, 0.01f)
                close()
                moveTo(18.89f, 16.97f)
                lineToRelative(-3.02f, -0.18f)
                lineToRelative(-0.94f, -1.63f)
                lineToRelative(1.09f, -3.34f)
                lineToRelative(2.01f, -0.7f)
                lineToRelative(2.31f, 2.52f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, -1.45f, 3.34f)
                close()
                moveTo(18.17f, 6.16f)
                lineToRelative(-0.59f, 3.53f)
                lineToRelative(-2.04f, 0.7f)
                lineToRelative(-2.79f, -2.02f)
                verticalLineToRelative(-2.2f)
                lineToRelative(3.0f, -1.8f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, true, 2.42f, 1.79f)
                close()
            }
        }
        return _sportSoccer!!
    }

private var _sportSoccer: ImageVector? = null
