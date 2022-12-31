

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BranchCompare: ImageVector
    get() {
        if (_branchCompare != null) {
            return _branchCompare!!
        }
        _branchCompare = fluentIcon(name = "Regular.BranchCompare") {
            fluentPath {
                moveTo(9.0f, 5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, 3.46f)
                lineTo(6.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(2.69f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(0.97f, -0.97f)
                lineTo(9.0f, 19.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 4.5f, 15.0f)
                lineTo(4.5f, 8.86f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 9.0f, 5.5f)
                close()
                moveTo(7.5f, 5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                close()
                moveTo(22.0f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -4.0f, -3.46f)
                lineTo(18.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-0.97f, 0.97f)
                lineTo(15.0f, 4.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 19.5f, 9.0f)
                verticalLineToRelative(6.14f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.0f, 18.5f)
                close()
                moveTo(20.5f, 18.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                close()
            }
        }
        return _branchCompare!!
    }

private var _branchCompare: ImageVector? = null
