

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextDensity: ImageVector
    get() {
        if (_textDensity != null) {
            return _textDensity!!
        }
        _textDensity = fluentIcon(name = "Regular.TextDensity") {
            fluentPath {
                moveTo(12.25f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.5f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(10.0f, 5.0f)
                lineTo(2.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(10.0f, 6.5f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(2.75f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(10.0f, 10.5f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(10.0f, 13.0f)
                lineTo(2.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(10.0f, 14.5f)
                lineTo(10.0f, 13.0f)
                close()
                moveTo(10.0f, 17.0f)
                lineTo(2.75f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(10.0f, 18.5f)
                lineTo(10.0f, 17.0f)
                close()
                moveTo(19.75f, 18.0f)
                lineTo(14.5f, 18.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(14.5f, 15.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                close()
                moveTo(19.75f, 10.5f)
                lineTo(14.5f, 10.5f)
                lineTo(14.5f, 9.0f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(14.5f, 7.5f)
                lineTo(14.5f, 6.0f)
                horizontalLineToRelative(5.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                close()
            }
        }
        return _textDensity!!
    }

private var _textDensity: ImageVector? = null
