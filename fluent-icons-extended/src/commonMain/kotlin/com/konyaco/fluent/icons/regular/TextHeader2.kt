

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextHeader2: ImageVector
    get() {
        if (_textHeader2 != null) {
            return _textHeader2!!
        }
        _textHeader2 = fluentIcon(name = "Regular.TextHeader2") {
            fluentPath {
                moveTo(4.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(4.5f, 12.5f)
                lineTo(11.0f, 12.5f)
                verticalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(11.0f, 11.0f)
                lineTo(4.5f, 11.0f)
                lineTo(4.5f, 5.75f)
                close()
                moveTo(15.42f, 7.84f)
                curveToRelative(0.23f, -0.46f, 0.91f, -1.34f, 2.58f, -1.34f)
                curveToRelative(0.84f, 0.0f, 1.46f, 0.26f, 1.86f, 0.64f)
                curveToRelative(0.4f, 0.37f, 0.64f, 0.92f, 0.64f, 1.61f)
                curveToRelative(0.0f, 1.96f, -1.3f, 3.07f, -2.96f, 4.34f)
                lineToRelative(-0.2f, 0.17f)
                curveTo(15.81f, 14.4f, 14.0f, 15.8f, 14.0f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, 0.75f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.66f)
                curveToRelative(0.32f, -1.25f, 1.43f, -2.11f, 2.87f, -3.22f)
                curveTo(20.05f, 13.06f, 22.0f, 11.54f, 22.0f, 8.75f)
                curveToRelative(0.0f, -1.06f, -0.38f, -2.01f, -1.11f, -2.7f)
                arcTo(4.12f, 4.12f, 0.0f, false, false, 18.0f, 5.0f)
                curveToRelative(-2.33f, 0.0f, -3.48f, 1.3f, -3.92f, 2.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.34f, 0.68f)
                close()
            }
        }
        return _textHeader2!!
    }

private var _textHeader2: ImageVector? = null
