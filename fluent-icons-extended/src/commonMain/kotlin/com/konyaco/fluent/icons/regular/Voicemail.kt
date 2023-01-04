

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = fluentIcon(name = "Regular.Voicemail") {
            fluentPath {
                moveTo(19.75f, 4.0f)
                curveTo(20.99f, 4.0f, 22.0f, 5.0f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(22.0f, 19.0f, 21.0f, 20.0f, 19.75f, 20.0f)
                lineTo(4.25f, 20.0f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineToRelative(15.5f)
                close()
                moveTo(19.75f, 5.5f)
                lineTo(4.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.42f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                lineTo(20.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.6f, 1.5f)
                horizontalLineToRelative(-2.8f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 7.82f, 9.0f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(8.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(16.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
