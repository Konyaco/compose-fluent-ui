

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookQuestionMark: ImageVector
    get() {
        if (_bookQuestionMark != null) {
            return _bookQuestionMark!!
        }
        _bookQuestionMark = fluentIcon(name = "Filled.BookQuestionMark") {
            fluentPath {
                moveTo(4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 22.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(6.5f, 20.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(14.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(20.5f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 2.0f)
                lineTo(6.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                close()
                moveTo(11.0f, 8.02f)
                curveToRelative(0.0f, 0.4f, -0.34f, 0.73f, -0.75f, 0.73f)
                curveTo(9.5f, 8.75f, 9.5f, 8.0f, 9.5f, 8.0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 0.0f, -0.13f)
                lineToRelative(0.06f, -0.28f)
                curveToRelative(0.05f, -0.22f, 0.16f, -0.5f, 0.37f, -0.8f)
                curveToRelative(0.45f, -0.6f, 1.27f, -1.05f, 2.58f, -1.03f)
                curveToRelative(0.95f, 0.02f, 1.8f, 0.41f, 2.32f, 1.07f)
                curveToRelative(0.54f, 0.67f, 0.72f, 1.57f, 0.37f, 2.46f)
                curveToRelative(-0.37f, 0.9f, -1.19f, 1.26f, -1.66f, 1.47f)
                lineToRelative(-0.05f, 0.02f)
                curveToRelative(-0.28f, 0.13f, -0.4f, 0.19f, -0.49f, 0.25f)
                verticalLineToRelative(0.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.5f, 11.0f)
                curveToRelative(0.0f, -0.52f, 0.25f, -0.9f, 0.56f, -1.15f)
                curveToRelative(0.25f, -0.2f, 0.57f, -0.34f, 0.79f, -0.43f)
                lineToRelative(0.04f, -0.02f)
                curveToRelative(0.54f, -0.24f, 0.8f, -0.39f, 0.91f, -0.68f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.13f, -0.96f)
                curveToRelative(-0.23f, -0.27f, -0.63f, -0.5f, -1.18f, -0.51f)
                curveToRelative(-0.94f, -0.02f, -1.25f, 0.29f, -1.36f, 0.43f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, -0.13f, 0.33f)
                close()
                moveTo(13.25f, 14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        return _bookQuestionMark!!
    }

private var _bookQuestionMark: ImageVector? = null
