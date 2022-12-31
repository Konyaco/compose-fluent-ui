

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Vault: ImageVector
    get() {
        if (_vault != null) {
            return _vault!!
        }
        _vault = fluentIcon(name = "Regular.Vault") {
            fluentPath {
                moveTo(16.58f, 13.52f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 0.0f, -3.04f)
                lineToRelative(1.2f, -1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-1.2f, 1.2f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -3.04f, 0.0f)
                lineToRelative(-1.2f, -1.2f)
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
                close()
                moveTo(14.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(6.5f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-8.5f)
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
                moveTo(5.75f, 5.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                lineTo(5.75f, 5.5f)
                close()
            }
        }
        return _vault!!
    }

private var _vault: ImageVector? = null
