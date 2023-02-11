

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BranchForkHint: ImageVector
    get() {
        if (_branchForkHint != null) {
            return _branchForkHint!!
        }
        _branchForkHint = fluentIcon(name = "Filled.BranchForkHint") {
            fluentPath {
                moveTo(6.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.0f, 6.86f)
                verticalLineToRelative(5.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(7.0f, 13.0f)
                horizontalLineToRelative(6.25f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 17.0f, 9.25f)
                verticalLineToRelative(-0.29f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -1.5f, -0.1f)
                verticalLineToRelative(0.39f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(7.0f, 11.5f)
                lineTo(7.0f, 8.96f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 2.0f)
                close()
                moveTo(5.34f, 16.88f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.87f, -1.22f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, false, -1.23f, 1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.4f, 0.53f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 0.7f, -0.9f)
                close()
                moveTo(8.54f, 15.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.88f, 1.22f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 0.7f, 0.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.4f, -0.54f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -1.23f, -1.59f)
                close()
                moveTo(4.78f, 19.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.3f, 0.76f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.48f, 1.37f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.66f, -1.35f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.84f, -0.78f)
                close()
                moveTo(9.52f, 20.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.3f, -0.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.84f, 0.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.66f, 1.35f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.48f, -1.37f)
                close()
            }
        }
        return _branchForkHint!!
    }

private var _branchForkHint: ImageVector? = null
