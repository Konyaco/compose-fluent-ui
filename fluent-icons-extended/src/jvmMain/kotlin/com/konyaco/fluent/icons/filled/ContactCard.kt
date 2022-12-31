

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ContactCard: ImageVector
    get() {
        if (_contactCard != null) {
            return _contactCard!!
        }
        _contactCard = fluentIcon(name = "Filled.ContactCard") {
            fluentPath {
                moveTo(19.75f, 4.0f)
                curveTo(20.99f, 4.0f, 22.0f, 5.0f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(22.0f, 19.0f, 21.0f, 20.0f, 19.75f, 20.0f)
                lineTo(4.25f, 20.0f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineToRelative(15.5f)
                close()
                moveTo(9.75f, 12.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.17f, 1.11f, 1.1f, 1.65f, 2.5f, 1.65f)
                curveToRelative(1.33f, 0.0f, 2.24f, -0.49f, 2.46f, -1.5f)
                lineToRelative(0.03f, -0.15f)
                lineToRelative(0.01f, -0.1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                close()
                moveTo(17.75f, 13.0f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                lineTo(17.85f, 14.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.49f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(8.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(17.75f, 9.5f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(17.85f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _contactCard!!
    }

private var _contactCard: ImageVector? = null
