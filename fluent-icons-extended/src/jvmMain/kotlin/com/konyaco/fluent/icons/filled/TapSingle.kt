

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TapSingle: ImageVector
    get() {
        if (_tapSingle != null) {
            return _tapSingle!!
        }
        _tapSingle = fluentIcon(name = "Filled.TapSingle") {
            fluentPath {
                moveTo(11.75f, 6.0f)
                curveToRelative(1.36f, 0.0f, 1.95f, 0.9f, 2.0f, 2.33f)
                lineTo(13.75f, 11.0f)
                lineToRelative(2.87f, 0.41f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.3f, 3.29f)
                lineToRelative(-0.05f, 0.17f)
                lineToRelative(-1.22f, 4.44f)
                curveToRelative(-0.17f, 0.62f, -0.67f, 1.1f, -1.3f, 1.24f)
                lineToRelative(-0.14f, 0.03f)
                lineToRelative(-3.06f, 0.43f)
                curveToRelative(-0.76f, 0.11f, -1.5f, -0.29f, -1.83f, -0.97f)
                lineToRelative(-0.06f, -0.14f)
                lineToRelative(-0.21f, -0.57f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, false, -1.18f, -1.67f)
                lineToRelative(-0.2f, -0.17f)
                lineToRelative(-1.6f, -1.2f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.27f, -0.16f)
                lineToRelative(-0.14f, -0.07f)
                lineToRelative(-2.2f, -0.86f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.47f, -0.66f)
                curveToRelative(-0.03f, -0.73f, 0.5f, -1.25f, 1.42f, -1.72f)
                curveToRelative(0.72f, -0.36f, 1.73f, -0.33f, 3.07f, 0.05f)
                lineToRelative(0.27f, 0.08f)
                lineTo(9.75f, 8.5f)
                curveToRelative(0.0f, -1.54f, 0.58f, -2.51f, 2.0f, -2.51f)
                close()
                moveTo(11.75f, 2.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 5.3f, 7.99f)
                lineToRelative(0.17f, 0.04f)
                lineToRelative(-0.45f, -0.1f)
                lineToRelative(-1.27f, -0.18f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, -6.75f, 1.02f)
                verticalLineToRelative(0.41f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.67f, -0.07f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 4.67f, -9.1f)
                close()
            }
        }
        return _tapSingle!!
    }

private var _tapSingle: ImageVector? = null
