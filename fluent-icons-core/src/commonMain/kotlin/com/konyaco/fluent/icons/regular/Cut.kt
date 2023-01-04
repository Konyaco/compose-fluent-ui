

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Cut: ImageVector
    get() {
        if (_cut != null) {
            return _cut!!
        }
        _cut = fluentIcon(name = "Regular.Cut") {
            fluentPath {
                moveTo(12.14f, 9.34f)
                lineTo(7.37f, 2.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.24f, 0.84f)
                lineToRelative(5.13f, 7.55f)
                lineToRelative(-2.4f, 3.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 1.18f, 0.94f)
                lineToRelative(2.14f, -3.33f)
                lineToRelative(2.06f, 3.03f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 17.0f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -1.5f, -7.71f)
                lineToRelative(-2.44f, -3.6f)
                lineToRelative(-0.92f, -1.35f)
                close()
                moveTo(4.5f, 18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                close()
                moveTo(14.5f, 18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                close()
                moveTo(13.94f, 9.32f)
                lineToRelative(3.94f, -6.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.26f, -0.8f)
                lineToRelative(-3.6f, 5.62f)
                lineToRelative(0.92f, 1.35f)
                close()
            }
        }
        return _cut!!
    }

private var _cut: ImageVector? = null
