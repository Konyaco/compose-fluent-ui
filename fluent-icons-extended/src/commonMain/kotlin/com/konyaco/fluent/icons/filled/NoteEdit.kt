

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NoteEdit: ImageVector
    get() {
        if (_noteEdit != null) {
            return _noteEdit!!
        }
        _noteEdit = fluentIcon(name = "Filled.NoteEdit") {
            fluentPath {
                moveTo(3.0f, 17.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(4.92f)
                lineToRelative(0.35f, -1.42f)
                curveToRelative(0.16f, -0.65f, 0.5f, -1.24f, 0.97f, -1.72f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 2.61f, -0.95f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(11.0f, 3.0f)
                verticalLineToRelative(4.75f)
                curveTo(11.0f, 9.55f, 9.54f, 11.0f, 7.75f, 11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(6.75f)
                close()
                moveTo(9.5f, 3.44f)
                lineTo(3.44f, 9.5f)
                horizontalLineToRelative(4.31f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(9.5f, 3.44f)
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
