

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = fluentIcon(name = "Regular.Document") {
            fluentPath {
                moveTo(18.5f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(6.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(5.5f, 4.0f)
                curveToRelative(0.0f, -0.27f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(13.5f, 4.62f)
                lineToRelative(3.88f, 3.88f)
                lineTo(14.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(13.5f, 4.62f)
                close()
                moveTo(19.41f, 8.42f)
                lineTo(13.6f, 2.58f)
                lineToRelative(-0.09f, -0.07f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, -0.22f, -0.18f)
                lineToRelative(-0.13f, -0.07f)
                lineToRelative(-0.21f, -0.12f)
                curveToRelative(-0.2f, -0.08f, -0.41f, -0.12f, -0.63f, -0.14f)
                lineTo(12.17f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 9.83f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.42f)
                close()
            }
        }
        return _document!!
    }

private var _document: ImageVector? = null
