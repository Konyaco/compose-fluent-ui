

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WrenchScrewdriver: ImageVector
    get() {
        if (_wrenchScrewdriver != null) {
            return _wrenchScrewdriver!!
        }
        _wrenchScrewdriver = fluentIcon(name = "Filled.WrenchScrewdriver") {
            fluentPath {
                moveTo(16.08f, 2.41f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.67f, -0.41f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0.0f, 0.54f, 0.16f, 0.67f, 0.41f)
                lineToRelative(1.0f, 2.0f)
                curveToRelative(0.11f, 0.23f, 0.1f, 0.5f, -0.02f, 0.71f)
                lineTo(19.0f, 6.7f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.7f)
                lineToRelative(-0.9f, -1.58f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.02f, -0.7f)
                lineToRelative(1.0f, -2.0f)
                close()
                moveTo(14.0f, 16.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 7.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(8.83f, 2.21f)
                curveToRelative(0.2f, -0.14f, 0.47f, -0.17f, 0.7f, -0.07f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.5f, 10.0f)
                verticalLineToRelative(7.32f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, true, -5.07f, 0.0f)
                verticalLineToRelative(-7.33f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.51f, -10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.03f, 0.7f)
                verticalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(2.83f)
                curveToRelative(0.0f, -0.25f, 0.12f, -0.48f, 0.33f, -0.62f)
                close()
            }
        }
        return _wrenchScrewdriver!!
    }

private var _wrenchScrewdriver: ImageVector? = null
