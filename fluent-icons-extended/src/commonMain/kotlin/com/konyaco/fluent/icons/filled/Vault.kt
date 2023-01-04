

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Vault: ImageVector
    get() {
        if (_vault != null) {
            return _vault!!
        }
        _vault = fluentIcon(name = "Filled.Vault") {
            fluentPath {
                moveTo(14.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(2.0f, 7.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 5.75f, 4.0f)
                horizontalLineToRelative(12.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 22.0f, 7.75f)
                verticalLineToRelative(8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 18.25f, 20.0f)
                lineTo(5.75f, 20.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 2.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(5.75f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-8.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 5.75f, 7.0f)
                close()
                moveTo(11.28f, 8.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.2f, 1.2f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 0.0f, 3.04f)
                lineToRelative(-1.2f, 1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.2f, -1.2f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 3.04f, 0.0f)
                lineToRelative(1.2f, 1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.2f, -1.2f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 0.0f, -3.04f)
                lineToRelative(1.2f, -1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-1.2f, 1.2f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -3.04f, 0.0f)
                lineToRelative(-1.2f, -1.2f)
                close()
            }
        }
        return _vault!!
    }

private var _vault: ImageVector? = null
