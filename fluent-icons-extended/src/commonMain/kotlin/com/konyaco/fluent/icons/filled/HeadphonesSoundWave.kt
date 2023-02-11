

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HeadphonesSoundWave: ImageVector
    get() {
        if (_headphonesSoundWave != null) {
            return _headphonesSoundWave!!
        }
        _headphonesSoundWave = fluentIcon(name = "Filled.HeadphonesSoundWave") {
            fluentPath {
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 17.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(19.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -20.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(3.5f, 14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.75f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-10.5f)
                close()
                moveTo(8.75f, 14.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(16.0f, 14.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }
        return _headphonesSoundWave!!
    }

private var _headphonesSoundWave: ImageVector? = null
