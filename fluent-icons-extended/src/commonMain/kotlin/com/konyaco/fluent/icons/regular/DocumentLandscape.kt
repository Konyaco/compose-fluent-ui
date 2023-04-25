

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentLandscape: ImageVector
    get() {
        if (_documentLandscape != null) {
            return _documentLandscape!!
        }
        _documentLandscape = fluentIcon(name = "Regular.DocumentLandscape") {
            fluentPath {
                moveTo(4.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                lineTo(16.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(14.0f, 5.5f)
                lineTo(4.0f, 5.5f)
                close()
                moveTo(19.38f, 10.5f)
                lineTo(15.5f, 6.62f)
                lineTo(15.5f, 10.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.38f)
                close()
                moveTo(15.58f, 4.59f)
                lineTo(21.41f, 10.41f)
                lineTo(21.48f, 10.5f)
                curveToRelative(0.07f, 0.07f, 0.13f, 0.14f, 0.18f, 0.22f)
                lineToRelative(0.07f, 0.13f)
                lineToRelative(0.12f, 0.21f)
                curveToRelative(0.08f, 0.2f, 0.12f, 0.41f, 0.14f, 0.63f)
                lineToRelative(0.01f, 0.14f)
                lineTo(22.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.42f, 0.59f)
                close()
            }
        }
        return _documentLandscape!!
    }

private var _documentLandscape: ImageVector? = null
