

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LeafThree: ImageVector
    get() {
        if (_leafThree != null) {
            return _leafThree!!
        }
        _leafThree = fluentIcon(name = "Filled.LeafThree") {
            fluentPath {
                moveTo(13.5f, 2.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.9f, 3.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 5.49f, 3.13f)
                curveToRelative(0.45f, -0.08f, 0.93f, -0.13f, 1.41f, -0.13f)
                horizontalLineToRelative(3.48f)
                lineToRelative(0.02f, -0.5f)
                lineTo(19.0f, 3.44f)
                curveToRelative(0.0f, -0.8f, -0.65f, -1.44f, -1.44f, -1.44f)
                lineTo(13.5f, 2.0f)
                close()
                moveTo(8.43f, 18.0f)
                horizontalLineToRelative(-0.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(2.25f, 7.51f)
                curveToRelative(0.0f, -0.83f, 0.68f, -1.51f, 1.51f, -1.51f)
                horizontalLineToRelative(4.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.8f, 2.4f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, false, -3.93f, 3.16f)
                lineTo(7.53f, 9.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.96f, 1.96f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(9.0f, 15.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 15.5f, 9.0f)
                horizontalLineToRelative(4.91f)
                curveToRelative(0.88f, 0.0f, 1.59f, 0.71f, 1.59f, 1.59f)
                verticalLineToRelative(4.91f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -10.54f, 5.1f)
                lineToRelative(-1.18f, 1.18f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.18f, -1.18f)
                arcTo(6.47f, 6.47f, 0.0f, false, true, 9.0f, 15.5f)
                close()
                moveTo(12.18f, 19.88f)
                lineToRelative(4.6f, -4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-4.6f, 4.6f)
                curveToRelative(0.3f, 0.4f, 0.66f, 0.76f, 1.06f, 1.06f)
                close()
            }
        }
        return _leafThree!!
    }

private var _leafThree: ImageVector? = null
