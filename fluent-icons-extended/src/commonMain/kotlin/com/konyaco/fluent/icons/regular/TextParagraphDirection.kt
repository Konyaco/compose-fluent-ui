

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextParagraphDirection: ImageVector
    get() {
        if (_textParagraphDirection != null) {
            return _textParagraphDirection!!
        }
        _textParagraphDirection = fluentIcon(name = "Regular.TextParagraphDirection") {
            fluentPath {
                moveTo(13.5f, 3.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                lineTo(15.0f, 14.0f)
                verticalLineToRelative(7.2f)
                curveToRelative(0.0f, 0.45f, 0.34f, 0.8f, 0.75f, 0.8f)
                reflectiveCurveToRelative(0.75f, -0.35f, 0.75f, -0.8f)
                lineTo(16.5f, 4.5f)
                lineTo(18.0f, 4.5f)
                verticalLineToRelative(16.7f)
                curveToRelative(0.0f, 0.45f, 0.34f, 0.8f, 0.75f, 0.8f)
                reflectiveCurveToRelative(0.75f, -0.35f, 0.75f, -0.8f)
                lineTo(19.5f, 4.5f)
                horizontalLineToRelative(0.67f)
                curveToRelative(0.47f, -0.06f, 0.83f, -0.37f, 0.83f, -0.75f)
                curveToRelative(0.0f, -0.41f, -0.43f, -0.75f, -0.95f, -0.75f)
                lineTo(13.5f, 3.0f)
                close()
                moveTo(13.5f, 4.5f)
                lineTo(15.0f, 4.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
                moveTo(4.08f, 11.86f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, -0.9f, -0.99f)
                lineTo(4.9f, 9.0f)
                lineTo(3.18f, 7.13f)
                lineToRelative(-0.06f, -0.08f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, 1.03f, -0.84f)
                lineTo(6.3f, 8.54f)
                lineToRelative(0.06f, 0.08f)
                curveToRelative(0.18f, 0.26f, 0.16f, 0.6f, -0.06f, 0.84f)
                lineToRelative(-2.15f, 2.33f)
                lineToRelative(-0.07f, 0.07f)
                close()
                moveTo(5.4f, 19.86f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, 0.9f, -0.99f)
                lineTo(4.59f, 17.0f)
                lineToRelative(1.7f, -1.87f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, -1.03f, -0.84f)
                lineToRelative(-2.15f, 2.33f)
                lineToRelative(-0.06f, 0.08f)
                curveToRelative(-0.18f, 0.26f, -0.16f, 0.6f, 0.06f, 0.84f)
                lineToRelative(2.15f, 2.33f)
                lineToRelative(0.07f, 0.07f)
                close()
            }
        }
        return _textParagraphDirection!!
    }

private var _textParagraphDirection: ImageVector? = null
