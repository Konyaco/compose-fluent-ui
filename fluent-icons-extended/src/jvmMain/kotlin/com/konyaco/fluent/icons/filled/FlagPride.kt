

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FlagPride: ImageVector
    get() {
        if (_flagPride != null) {
            return _flagPride!!
        }
        _flagPride = fluentIcon(name = "Filled.FlagPride") {
            fluentPath {
                moveTo(4.0f, 4.25f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(4.0f)
                close()
            }
            fluentPath {
                moveTo(4.0f, 5.75f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(4.0f)
                close()
            }
            fluentPath {
                moveTo(4.0f, 7.25f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                close()
            }
            fluentPath {
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(4.0f)
                close()
            }
            fluentPath {
                moveTo(4.0f, 10.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.75f)
                horizontalLineTo(4.0f)
                close()
            }
            fluentPath {
                moveTo(4.0f, 12.25f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(4.0f)
                close()
            }
            fluentPath {
                moveTo(4.0f, 13.75f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(4.0f)
                close()
            }
            fluentPath {
                moveTo(3.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(4.5f, 16.5f)
                horizontalLineToRelative(15.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(3.75f, 3.0f)
                close()
                moveTo(4.5f, 4.5f)
                horizontalLineToRelative(15.0f)
                lineTo(19.5f, 15.0f)
                horizontalLineToRelative(-15.0f)
                lineTo(4.5f, 4.5f)
                close()
            }
        }
        return _flagPride!!
    }

private var _flagPride: ImageVector? = null
