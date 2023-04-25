

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TabInPrivate: ImageVector
    get() {
        if (_tabInPrivate != null) {
            return _tabInPrivate!!
        }
        _tabInPrivate = fluentIcon(name = "Filled.TabInPrivate") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                close()
                moveTo(5.0f, 5.75f)
                verticalLineToRelative(0.54f)
                lineTo(6.3f, 5.0f)
                horizontalLineToRelative(-0.55f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
                moveTo(5.0f, 7.71f)
                verticalLineToRelative(2.58f)
                lineTo(10.3f, 5.0f)
                lineTo(7.7f, 5.0f)
                lineTo(5.0f, 7.7f)
                close()
                moveTo(11.7f, 5.0f)
                lineTo(5.0f, 11.7f)
                verticalLineToRelative(2.6f)
                lineTo(14.3f, 5.0f)
                horizontalLineToRelative(-2.6f)
                close()
                moveTo(15.7f, 5.0f)
                lineTo(5.0f, 15.7f)
                verticalLineToRelative(2.59f)
                lineTo(18.3f, 5.0f)
                lineTo(15.7f, 5.0f)
                close()
                moveTo(19.0f, 5.7f)
                lineTo(5.7f, 19.0f)
                lineTo(8.3f, 19.0f)
                lineTo(19.0f, 8.3f)
                lineTo(19.0f, 5.7f)
                close()
                moveTo(19.0f, 9.7f)
                lineTo(9.7f, 19.0f)
                horizontalLineToRelative(2.6f)
                lineToRelative(6.7f, -6.7f)
                lineTo(19.0f, 9.7f)
                close()
                moveTo(19.0f, 13.7f)
                lineTo(13.7f, 19.0f)
                horizontalLineToRelative(2.6f)
                lineToRelative(2.7f, -2.7f)
                verticalLineToRelative(-2.6f)
                close()
                moveTo(19.0f, 17.7f)
                lineTo(17.7f, 19.0f)
                horizontalLineToRelative(0.55f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-0.54f)
                close()
            }
        }
        return _tabInPrivate!!
    }

private var _tabInPrivate: ImageVector? = null
