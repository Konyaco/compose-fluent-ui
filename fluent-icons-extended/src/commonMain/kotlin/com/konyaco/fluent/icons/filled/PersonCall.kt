

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonCall: ImageVector
    get() {
        if (_personCall != null) {
            return _personCall!!
        }
        _personCall = fluentIcon(name = "Filled.PersonCall") {
            fluentPath {
                moveTo(17.72f, 15.95f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.57f, -1.95f)
                lineTo(6.25f, 14.0f)
                curveTo(5.01f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveTo(6.06f, 20.92f, 8.58f, 22.0f, 12.0f, 22.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 1.13f, -0.04f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.36f, -2.16f)
                lineToRelative(0.8f, -1.01f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.23f, -0.77f)
                lineToRelative(0.84f, 0.2f)
                curveToRelative(0.52f, -0.43f, 0.83f, -0.97f, 0.95f, -1.64f)
                lineToRelative(-0.6f, -0.63f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(18.2f, 14.0f)
                lineTo(18.67f, 12.79f)
                curveToRelative(0.24f, -0.61f, 0.92f, -0.93f, 1.55f, -0.73f)
                lineToRelative(0.43f, 0.14f)
                curveToRelative(0.72f, 0.24f, 1.32f, 0.8f, 1.35f, 1.57f)
                curveToRelative(0.1f, 3.11f, -2.48f, 7.58f, -5.22f, 9.06f)
                curveToRelative(-0.67f, 0.36f, -1.46f, 0.12f, -2.03f, -0.4f)
                lineToRelative(-0.34f, -0.3f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -0.14f, -1.7f)
                lineToRelative(0.8f, -1.02f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.22f, -0.42f)
                lineToRelative(1.3f, 0.32f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, false, 1.77f, -3.08f)
                lineToRelative(-0.92f, -0.96f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.25f, -1.28f)
                close()
            }
        }
        return _personCall!!
    }

private var _personCall: ImageVector? = null
