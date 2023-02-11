

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Timer2: ImageVector
    get() {
        if (_timer2 != null) {
            return _timer2!!
        }
        _timer2 = fluentIcon(name = "Regular.Timer2") {
            fluentPath {
                moveTo(20.4f, 12.16f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -5.4f, 9.3f)
                verticalLineToRelative(-0.21f)
                curveToRelative(0.0f, -0.56f, 0.1f, -1.09f, 0.3f, -1.58f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 3.54f, -7.65f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 1.55f, 0.14f)
                close()
                moveTo(12.74f, 8.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.49f, 0.1f)
                verticalLineToRelative(4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                verticalLineToRelative(-4.6f)
                close()
                moveTo(19.23f, 5.17f)
                lineToRelative(-0.08f, -0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.88f, 1.22f)
                lineToRelative(1.16f, 0.96f)
                lineToRelative(0.08f, 0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.88f, -1.21f)
                lineToRelative(-1.16f, -0.97f)
                close()
                moveTo(15.0f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(19.25f, 13.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 16.0f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                arcTo(1.75f, 1.75f, 0.0f, true, true, 19.25f, 18.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 16.0f, 21.25f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(17.5f, 21.5f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, -6.5f)
                close()
            }
        }
        return _timer2!!
    }

private var _timer2: ImageVector? = null
