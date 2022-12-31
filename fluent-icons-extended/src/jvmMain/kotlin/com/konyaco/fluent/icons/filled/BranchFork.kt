

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BranchFork: ImageVector
    get() {
        if (_branchFork != null) {
            return _branchFork!!
        }
        _branchFork = fluentIcon(name = "Filled.BranchFork") {
            fluentPath {
                moveTo(11.0f, 5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, 3.46f)
                verticalLineToRelative(2.54f)
                horizontalLineToRelative(6.25f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-0.4f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 1.5f, 0.11f)
                verticalLineToRelative(0.29f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 14.25f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.04f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.5f, 0.1f)
                verticalLineTo(8.86f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 11.0f, 5.5f)
                close()
            }
        }
        return _branchFork!!
    }

private var _branchFork: ImageVector? = null
