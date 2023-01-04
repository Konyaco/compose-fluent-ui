

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextCaseTitle: ImageVector
    get() {
        if (_textCaseTitle != null) {
            return _textCaseTitle!!
        }
        _textCaseTitle = fluentIcon(name = "Filled.TextCaseTitle") {
            fluentPath {
                moveTo(8.44f, 3.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.87f, -0.03f)
                lineToRelative(-6.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.86f, 0.72f)
                lineTo(3.83f, 16.0f)
                horizontalLineToRelative(6.96f)
                lineToRelative(1.27f, 3.58f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.88f, -0.66f)
                lineToRelative(-5.5f, -15.5f)
                close()
                moveTo(4.6f, 14.0f)
                lineToRelative(2.86f, -7.37f)
                lineTo(10.08f, 14.0f)
                lineTo(4.6f, 14.0f)
                close()
                moveTo(16.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.62f)
                curveToRelative(0.59f, -0.4f, 1.27f, -0.62f, 2.0f, -0.62f)
                curveToRelative(2.2f, 0.0f, 4.0f, 2.07f, 4.0f, 4.63f)
                curveToRelative(0.0f, 2.55f, -1.8f, 4.62f, -4.0f, 4.62f)
                curveToRelative(-0.75f, 0.0f, -1.46f, -0.24f, -2.06f, -0.66f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.94f, -0.34f)
                lineTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(19.0f, 18.25f)
                curveToRelative(0.84f, 0.0f, 2.0f, -0.9f, 2.0f, -2.63f)
                reflectiveCurveTo(19.84f, 13.0f, 19.0f, 13.0f)
                curveToRelative(-0.84f, 0.0f, -2.0f, 0.9f, -2.0f, 2.63f)
                reflectiveCurveToRelative(1.16f, 2.62f, 2.0f, 2.62f)
                close()
            }
        }
        return _textCaseTitle!!
    }

private var _textCaseTitle: ImageVector? = null
