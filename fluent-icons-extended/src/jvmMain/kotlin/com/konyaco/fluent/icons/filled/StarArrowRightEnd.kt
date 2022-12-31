

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StarArrowRightEnd: ImageVector
    get() {
        if (_starArrowRightEnd != null) {
            return _starArrowRightEnd!!
        }
        _starArrowRightEnd = fluentIcon(name = "Filled.StarArrowRightEnd") {
            fluentPath {
                moveTo(10.79f, 3.1f)
                curveToRelative(0.5f, -1.0f, 1.92f, -1.0f, 2.42f, 0.0f)
                lineToRelative(2.36f, 4.78f)
                lineToRelative(5.27f, 0.77f)
                curveToRelative(1.1f, 0.16f, 1.55f, 1.52f, 0.75f, 2.3f)
                lineToRelative(-0.9f, 0.88f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.44f, 7.43f)
                lineToRelative(-3.97f, 2.08f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.96f, -1.42f)
                lineToRelative(0.9f, -5.25f)
                lineToRelative(-3.81f, -3.72f)
                curveToRelative(-0.8f, -0.78f, -0.36f, -2.14f, 0.75f, -2.3f)
                lineToRelative(5.27f, -0.77f)
                lineToRelative(2.36f, -4.78f)
                close()
                moveTo(22.99f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.49f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.71f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.7f, 0.7f)
                lineTo(19.28f, 17.0f)
                horizontalLineToRelative(-4.8f)
                close()
            }
        }
        return _starArrowRightEnd!!
    }

private var _starArrowRightEnd: ImageVector? = null
