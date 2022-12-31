

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentQuestionMark: ImageVector
    get() {
        if (_documentQuestionMark != null) {
            return _documentQuestionMark!!
        }
        _documentQuestionMark = fluentIcon(name = "Filled.DocumentQuestionMark") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-6.81f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 4.0f, 11.5f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.5f, 2.5f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(1.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -11.0f, 0.0f)
                close()
                moveTo(5.75f, 20.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(4.5f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                curveToRelative(0.0f, 0.73f, -0.21f, 1.14f, -0.75f, 1.7f)
                lineToRelative(-0.27f, 0.28f)
                lineToRelative(-0.11f, 0.12f)
                curveToRelative(-0.29f, 0.32f, -0.37f, 0.53f, -0.37f, 0.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                curveToRelative(0.0f, -0.73f, 0.21f, -1.14f, 0.75f, -1.7f)
                lineToRelative(0.27f, -0.28f)
                lineToRelative(0.11f, -0.12f)
                curveToRelative(0.29f, -0.32f, 0.37f, -0.53f, 0.37f, -0.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                close()
            }
        }
        return _documentQuestionMark!!
    }

private var _documentQuestionMark: ImageVector? = null
