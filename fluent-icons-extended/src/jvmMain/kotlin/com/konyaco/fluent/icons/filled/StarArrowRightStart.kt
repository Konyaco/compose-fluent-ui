

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StarArrowRightStart: ImageVector
    get() {
        if (_starArrowRightStart != null) {
            return _starArrowRightStart!!
        }
        _starArrowRightStart = fluentIcon(name = "Filled.StarArrowRightStart") {
            fluentPath {
                moveTo(10.79f, 3.1f)
                curveToRelative(0.5f, -1.0f, 1.93f, -1.0f, 2.42f, 0.0f)
                lineToRelative(2.36f, 4.78f)
                lineToRelative(5.27f, 0.77f)
                curveToRelative(1.1f, 0.16f, 1.55f, 1.52f, 0.75f, 2.3f)
                lineToRelative(-3.82f, 3.72f)
                lineToRelative(0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.95f, 1.42f)
                lineToRelative(-3.96f, -2.08f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.44f, -7.43f)
                lineToRelative(-0.9f, -0.88f)
                curveToRelative(-0.81f, -0.78f, -0.37f, -2.14f, 0.74f, -2.3f)
                lineToRelative(5.27f, -0.77f)
                lineTo(10.8f, 3.1f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(3.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.7f, 0.7f)
                lineTo(8.29f, 17.0f)
                horizontalLineTo(3.5f)
                close()
            }
        }
        return _starArrowRightStart!!
    }

private var _starArrowRightStart: ImageVector? = null
