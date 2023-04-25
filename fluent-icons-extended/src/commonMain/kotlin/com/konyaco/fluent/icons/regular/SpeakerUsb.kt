

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SpeakerUsb: ImageVector
    get() {
        if (_speakerUsb != null) {
            return _speakerUsb!!
        }
        _speakerUsb = fluentIcon(name = "Regular.SpeakerUsb") {
            fluentPath {
                moveTo(15.0f, 4.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.06f, -0.96f)
                lineTo(7.98f, 7.5f)
                lineTo(4.25f, 7.5f)
                curveTo(3.01f, 7.5f, 2.0f, 8.52f, 2.0f, 9.76f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(3.73f)
                lineToRelative(4.96f, 4.2f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.06f, -0.95f)
                lineTo(15.0f, 4.25f)
                close()
                moveTo(8.52f, 9.0f)
                lineToRelative(4.98f, -4.21f)
                lineTo(13.5f, 19.2f)
                lineTo(8.52f, 15.0f)
                lineTo(4.25f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.27f)
                close()
                moveTo(16.16f, 13.95f)
                lineTo(17.5f, 16.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(1.33f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.17f, -0.56f)
                lineTo(23.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(22.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 0.2f, 0.06f, 0.4f, 0.16f, 0.55f)
                close()
                moveTo(18.5f, 7.5f)
                horizontalLineToRelative(2.0f)
                lineTo(20.5f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.5f, 7.5f)
                close()
            }
        }
        return _speakerUsb!!
    }

private var _speakerUsb: ImageVector? = null
