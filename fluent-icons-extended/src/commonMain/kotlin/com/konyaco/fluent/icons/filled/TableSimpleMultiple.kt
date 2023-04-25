

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableSimpleMultiple: ImageVector
    get() {
        if (_tableSimpleMultiple != null) {
            return _tableSimpleMultiple!!
        }
        _tableSimpleMultiple = fluentIcon(name = "Filled.TableSimpleMultiple") {
            fluentPath {
                moveTo(15.75f, 19.0f)
                lineTo(11.5f, 19.0f)
                verticalLineToRelative(-7.5f)
                lineTo(19.0f, 11.5f)
                verticalLineToRelative(4.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(-7.5f)
                lineTo(11.5f, 2.0f)
                horizontalLineToRelative(4.25f)
                curveTo(17.55f, 2.0f, 19.0f, 3.46f, 19.0f, 5.25f)
                lineTo(19.0f, 10.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 2.0f)
                lineTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                lineTo(2.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(10.0f, 19.0f)
                verticalLineToRelative(-7.5f)
                lineTo(2.0f, 11.5f)
                verticalLineToRelative(4.25f)
                curveTo(2.0f, 17.55f, 3.46f, 19.0f, 5.25f, 19.0f)
                lineTo(10.0f, 19.0f)
                close()
                moveTo(8.25f, 22.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.0f, -2.0f)
                horizontalLineToRelative(10.5f)
                curveTo(18.1f, 20.0f, 20.0f, 18.1f, 20.0f, 15.75f)
                lineTo(20.0f, 5.25f)
                curveToRelative(1.18f, 0.49f, 2.0f, 1.65f, 2.0f, 3.0f)
                verticalLineToRelative(8.25f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -5.5f, 5.5f)
                lineTo(8.25f, 22.0f)
                close()
            }
        }
        return _tableSimpleMultiple!!
    }

private var _tableSimpleMultiple: ImageVector? = null
