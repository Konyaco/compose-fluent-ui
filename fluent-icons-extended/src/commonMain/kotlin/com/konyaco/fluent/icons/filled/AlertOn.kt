

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlertOn: ImageVector
    get() {
        if (_alertOn != null) {
            return _alertOn!!
        }
        _alertOn = fluentIcon(name = "Filled.AlertOn") {
            fluentPath {
                moveTo(9.04f, 19.0f)
                horizontalLineToRelative(5.92f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.92f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.5f, 7.5f)
                verticalLineToRelative(4.0f)
                lineToRelative(1.42f, 3.16f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.87f, 1.34f)
                lineTo(3.95f, 18.0f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.86f, -1.34f)
                lineTo(4.5f, 13.5f)
                lineTo(4.5f, 9.24f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(23.0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(21.0f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(23.0f, 8.25f)
                close()
                moveTo(3.0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(1.0f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(3.0f, 8.25f)
                close()
                moveTo(22.6f, 2.55f)
                curveToRelative(0.23f, 0.3f, 0.2f, 0.72f, -0.07f, 0.98f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-2.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, -1.13f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(2.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.05f, 0.15f)
                close()
                moveTo(2.45f, 2.4f)
                lineToRelative(2.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.9f, 1.2f)
                lineToRelative(-2.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.9f, -1.2f)
                close()
            }
        }
        return _alertOn!!
    }

private var _alertOn: ImageVector? = null
