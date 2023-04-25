

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LightbulbPerson: ImageVector
    get() {
        if (_lightbulbPerson != null) {
            return _lightbulbPerson!!
        }
        _lightbulbPerson = fluentIcon(name = "Filled.LightbulbPerson") {
            fluentPath {
                moveToRelative(15.42f, 19.5f)
                lineToRelative(-0.17f, 0.76f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.02f, 1.73f)
                lineToRelative(-0.17f, 0.01f)
                horizontalLineToRelative(-2.12f)
                curveToRelative(-0.99f, 0.0f, -1.85f, -0.65f, -2.14f, -1.58f)
                lineToRelative(-0.05f, -0.16f)
                lineToRelative(-0.17f, -0.76f)
                horizontalLineToRelative(6.84f)
                close()
                moveTo(15.77f, 18.0f)
                lineTo(15.97f, 17.1f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -7.95f, 0.0f)
                lineToRelative(0.21f, 0.9f)
                horizontalLineToRelative(7.54f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.64f, 0.0f, -3.14f, 0.54f, -4.36f, 1.45f)
                lineToRelative(-0.05f, -0.23f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.07f, -0.13f)
                curveToRelative(-1.83f, -1.75f, -2.77f, -3.7f, -2.77f, -5.84f)
                arcToRelative(7.25f, 7.25f, 0.0f, true, true, 14.5f, 0.0f)
                curveToRelative(0.0f, 2.14f, -0.94f, 4.1f, -2.77f, 5.84f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.07f, 0.13f)
                lineToRelative(-0.05f, 0.24f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 12.0f, 14.0f)
                close()
                moveTo(10.25f, 9.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 0.0f, 6.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 12.0f, 6.0f)
                close()
            }
        }
        return _lightbulbPerson!!
    }

private var _lightbulbPerson: ImageVector? = null
