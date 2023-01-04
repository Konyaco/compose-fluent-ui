

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextboxAlignTopRotate90: ImageVector
    get() {
        if (_textboxAlignTopRotate90 != null) {
            return _textboxAlignTopRotate90!!
        }
        _textboxAlignTopRotate90 = fluentIcon(name = "Filled.TextboxAlignTopRotate90") {
            fluentPath {
                moveTo(21.0f, 18.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(16.52f, 7.0f)
                lineToRelative(-0.01f, -0.14f)
                curveToRelative(-0.05f, -0.48f, -0.36f, -0.86f, -0.74f, -0.86f)
                curveToRelative(-0.42f, 0.0f, -0.75f, 0.45f, -0.75f, 1.0f)
                verticalLineToRelative(10.14f)
                curveToRelative(0.05f, 0.48f, 0.37f, 0.86f, 0.75f, 0.86f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.45f, 0.75f, -1.0f)
                lineTo(16.52f, 7.0f)
                close()
                moveTo(13.52f, 17.0f)
                lineTo(13.52f, 7.0f)
                lineToRelative(-0.01f, -0.14f)
                curveToRelative(-0.05f, -0.48f, -0.36f, -0.86f, -0.74f, -0.86f)
                curveToRelative(-0.42f, 0.0f, -0.75f, 0.45f, -0.75f, 1.0f)
                verticalLineToRelative(10.14f)
                curveToRelative(0.05f, 0.48f, 0.37f, 0.86f, 0.75f, 0.86f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.45f, 0.75f, -1.0f)
                close()
            }
        }
        return _textboxAlignTopRotate90!!
    }

private var _textboxAlignTopRotate90: ImageVector? = null
