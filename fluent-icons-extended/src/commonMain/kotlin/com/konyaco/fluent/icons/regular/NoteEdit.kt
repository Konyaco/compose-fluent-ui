

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.NoteEdit: ImageVector
    get() {
        if (_noteEdit != null) {
            return _noteEdit!!
        }
        _noteEdit = fluentIcon(name = "Regular.NoteEdit") {
            fluentPath {
                moveTo(3.0f, 17.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(4.92f)
                lineToRelative(0.35f, -1.42f)
                lineToRelative(0.02f, -0.08f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.5f, 11.0f)
                horizontalLineToRelative(3.43f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 11.0f, 7.74f)
                lineTo(11.0f, 4.5f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.98f)
                curveToRelative(0.48f, -0.19f, 1.0f, -0.26f, 1.5f, -0.22f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                horizontalLineToRelative(-6.88f)
                curveToRelative(-0.6f, 0.0f, -1.17f, 0.24f, -1.59f, 0.66f)
                lineTo(3.66f, 9.28f)
                curveToRelative(-0.42f, 0.42f, -0.66f, 1.0f, -0.66f, 1.6f)
                verticalLineToRelative(6.87f)
                close()
                moveTo(7.75f, 9.5f)
                lineTo(5.56f, 9.5f)
                lineTo(9.5f, 5.56f)
                lineTo(9.5f, 7.9f)
                curveToRelative(-0.08f, 0.9f, -0.83f, 1.61f, -1.75f, 1.61f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.2f, 18.57f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _noteEdit!!
    }

private var _noteEdit: ImageVector? = null
