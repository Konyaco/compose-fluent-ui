

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ReadingList: ImageVector
    get() {
        if (_readingList != null) {
            return _readingList!!
        }
        _readingList = fluentIcon(name = "Filled.ReadingList") {
            fluentPath {
                moveTo(20.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(20.0f, 18.0f)
                close()
                moveTo(17.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(4.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(20.0f, 12.0f)
                close()
                moveTo(6.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.78f, 1.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.8f, 0.86f)
                lineToRelative(-0.05f, -0.1f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.0f, 9.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(6.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(20.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(11.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(20.0f, 6.0f)
                close()
            }
        }
        return _readingList!!
    }

private var _readingList: ImageVector? = null
