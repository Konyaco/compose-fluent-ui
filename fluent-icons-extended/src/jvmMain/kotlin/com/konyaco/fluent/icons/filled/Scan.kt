

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Scan: ImageVector
    get() {
        if (_scan != null) {
            return _scan!!
        }
        _scan = fluentIcon(name = "Filled.Scan") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(15.33f, 14.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.26f, 0.34f)
                lineToRelative(-0.14f, 0.17f)
                lineToRelative(-3.95f, 5.2f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, 6.24f, -1.87f)
                lineToRelative(-1.9f, -3.84f)
                close()
                moveTo(11.43f, 16.02f)
                lineTo(5.09f, 16.02f)
                arcToRelative(8.03f, 8.03f, 0.0f, false, false, 3.82f, 3.36f)
                lineToRelative(2.54f, -3.36f)
                close()
                moveTo(19.75f, 9.99f)
                horizontalLineToRelative(-4.28f)
                lineToRelative(0.06f, 0.13f)
                lineToRelative(0.12f, 0.23f)
                lineToRelative(3.0f, 6.09f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, 1.1f, -6.45f)
                close()
                moveTo(5.05f, 8.05f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -0.8f, 5.97f)
                horizontalLineToRelative(4.29f)
                lineToRelative(-0.06f, -0.09f)
                lineToRelative(-3.44f, -5.88f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.58f, 0.77f)
                lineToRelative(-0.1f, 0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.09f, 0.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.17f, 2.36f)
                lineToRelative(0.16f, -0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, -0.13f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-2.2f, 0.0f, -4.2f, 0.9f, -5.65f, 2.33f)
                lineToRelative(2.17f, 3.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.25f, -0.39f)
                lineTo(12.15f, 4.0f)
                lineTo(12.0f, 4.0f)
                close()
                moveTo(14.28f, 4.33f)
                lineTo(12.1f, 8.0f)
                horizontalLineToRelative(6.83f)
                arcToRelative(8.02f, 8.02f, 0.0f, false, false, -4.64f, -3.66f)
                close()
            }
        }
        return _scan!!
    }

private var _scan: ImageVector? = null
