

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextCaseTitle: ImageVector
    get() {
        if (_textCaseTitle != null) {
            return _textCaseTitle!!
        }
        _textCaseTitle = fluentIcon(name = "Regular.TextCaseTitle") {
            fluentPath {
                moveTo(15.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.24f)
                curveToRelative(0.68f, 0.62f, 1.55f, 0.99f, 2.5f, 0.99f)
                curveToRelative(2.2f, 0.0f, 4.0f, -2.01f, 4.0f, -4.5f)
                reflectiveCurveTo(21.2f, 11.0f, 19.0f, 11.0f)
                curveToRelative(-0.95f, 0.0f, -1.82f, 0.37f, -2.5f, 0.99f)
                lineTo(16.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(16.5f, 15.5f)
                curveToRelative(0.0f, -1.83f, 1.28f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveToRelative(2.5f, 1.17f, 2.5f, 3.0f)
                reflectiveCurveToRelative(-1.28f, 3.0f, -2.5f, 3.0f)
                reflectiveCurveToRelative(-2.5f, -1.17f, -2.5f, -3.0f)
                close()
                moveTo(7.76f, 3.0f)
                curveToRelative(0.31f, 0.0f, 0.6f, 0.2f, 0.7f, 0.5f)
                lineToRelative(5.5f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.42f, 0.5f)
                lineToRelative(-1.42f, -4.0f)
                lineTo(4.01f, 15.5f)
                lineToRelative(-1.56f, 4.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.4f, -0.54f)
                lineToRelative(6.0f, -15.5f)
                curveToRelative(0.11f, -0.3f, 0.4f, -0.48f, 0.71f, -0.48f)
                close()
                moveTo(7.72f, 5.9f)
                lineTo(4.59f, 14.0f)
                horizontalLineToRelative(6.0f)
                lineTo(7.72f, 5.9f)
                close()
            }
        }
        return _textCaseTitle!!
    }

private var _textCaseTitle: ImageVector? = null
