

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextDirectionVertical: ImageVector
    get() {
        if (_textDirectionVertical != null) {
            return _textDirectionVertical!!
        }
        _textDirectionVertical = fluentIcon(name = "Regular.TextDirectionVertical") {
            fluentPath {
                moveTo(6.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(14.69f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.72f, 0.72f)
                lineTo(6.0f, 3.75f)
                close()
                moveTo(11.55f, 12.97f)
                lineTo(15.31f, 3.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.34f, -0.1f)
                lineToRelative(0.05f, 0.1f)
                lineToRelative(3.75f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.35f, 0.65f)
                lineToRelative(-0.05f, -0.1f)
                lineToRelative(-1.0f, -2.52f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(-1.0f, 2.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.88f, 0.45f)
                lineToRelative(-0.1f, -0.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.45f, -0.87f)
                lineToRelative(0.03f, -0.1f)
                close()
                moveTo(16.0f, 5.79f)
                lineTo(14.54f, 9.5f)
                horizontalLineToRelative(2.92f)
                lineTo(16.0f, 5.8f)
                close()
                moveTo(16.25f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.69f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-0.72f, 0.72f)
                verticalLineToRelative(-3.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        return _textDirectionVertical!!
    }

private var _textDirectionVertical: ImageVector? = null
