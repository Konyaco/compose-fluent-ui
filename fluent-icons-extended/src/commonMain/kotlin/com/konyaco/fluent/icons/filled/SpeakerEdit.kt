

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SpeakerEdit: ImageVector
    get() {
        if (_speakerEdit != null) {
            return _speakerEdit!!
        }
        _speakerEdit = fluentIcon(name = "Filled.SpeakerEdit") {
            fluentPath {
                moveTo(15.0f, 4.25f)
                verticalLineToRelative(11.1f)
                lineToRelative(-2.51f, 2.51f)
                curveToRelative(-0.45f, 0.45f, -0.77f, 1.0f, -0.94f, 1.6f)
                lineTo(8.43f, 16.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.5f, -0.2f)
                lineTo(4.25f, 16.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.24f)
                verticalLineToRelative(-4.5f)
                curveTo(2.0f, 8.51f, 3.0f, 7.5f, 4.25f, 7.5f)
                horizontalLineToRelative(3.68f)
                curveToRelative(0.18f, 0.0f, 0.36f, -0.07f, 0.5f, -0.19f)
                lineToRelative(4.49f, -4.0f)
                curveToRelative(0.8f, -0.7f, 2.08f, -0.14f, 2.08f, 0.94f)
                close()
                moveTo(18.4f, 11.96f)
                curveToRelative(0.17f, -0.18f, 0.37f, -0.34f, 0.58f, -0.47f)
                arcToRelative(6.96f, 6.96f, 0.0f, false, false, -0.82f, -2.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.32f, 0.72f)
                arcToRelative(5.47f, 5.47f, 0.0f, false, true, 0.58f, 3.54f)
                lineToRelative(0.97f, -0.97f)
                close()
                moveTo(20.44f, 11.01f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.53f, 0.24f)
                arcToRelative(9.95f, 9.95f, 0.0f, false, false, -1.93f, -5.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.2f, 0.9f)
                arcToRelative(8.45f, 8.45f, 0.0f, false, true, 1.6f, 4.06f)
                close()
                moveTo(19.1f, 12.67f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.71f, 1.25f)
                lineToRelative(-0.46f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.52f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.28f, 2.28f, 0.0f, true, false, -3.23f, -3.24f)
                close()
            }
        }
        return _speakerEdit!!
    }

private var _speakerEdit: ImageVector? = null
