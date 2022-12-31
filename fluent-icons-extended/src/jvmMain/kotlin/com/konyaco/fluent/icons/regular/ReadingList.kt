

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ReadingList: ImageVector
    get() {
        if (_readingList != null) {
            return _readingList!!
        }
        _readingList = fluentIcon(name = "Regular.ReadingList") {
            fluentPath {
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(7.0f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(7.0f, 18.0f)
                close()
                moveTo(17.0f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(4.0f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(7.0f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(20.0f, 12.0f)
                close()
                moveTo(6.0f, 5.0f)
                curveToRelative(1.13f, 0.0f, 2.13f, 0.69f, 2.55f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.35f, 0.65f)
                lineToRelative(-0.04f, -0.09f)
                arcTo(1.25f, 1.25f, 0.0f, true, false, 6.0f, 9.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(6.0f, 10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 6.0f, 5.0f)
                close()
                moveTo(20.0f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(11.0f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(20.0f, 6.0f)
                close()
            }
        }
        return _readingList!!
    }

private var _readingList: ImageVector? = null
