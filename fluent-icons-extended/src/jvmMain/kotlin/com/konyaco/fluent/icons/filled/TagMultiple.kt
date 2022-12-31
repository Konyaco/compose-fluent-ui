

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TagMultiple: ImageVector
    get() {
        if (_tagMultiple != null) {
            return _tagMultiple!!
        }
        _tagMultiple = fluentIcon(name = "Filled.TagMultiple") {
            fluentPath {
                moveTo(12.75f, 2.0f)
                curveToRelative(-0.83f, 0.0f, -1.64f, 0.32f, -2.24f, 0.9f)
                lineTo(3.7f, 9.4f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -0.04f, 3.22f)
                lineToRelative(6.26f, 6.22f)
                curveToRelative(0.87f, 0.87f, 2.28f, 0.88f, 3.16f, 0.01f)
                lineToRelative(6.95f, -6.83f)
                curveToRelative(0.62f, -0.61f, 0.97f, -1.45f, 0.97f, -2.32f)
                lineTo(21.0f, 4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 2.0f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(16.25f, 7.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(19.25f, 14.18f)
                lineToRelative(1.48f, -1.45f)
                lineToRelative(0.13f, -0.13f)
                curveToRelative(0.31f, 0.95f, 0.08f, 2.05f, -0.69f, 2.8f)
                lineToRelative(-5.33f, 5.24f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -6.67f, -0.02f)
                lineToRelative(-4.35f, -4.3f)
                curveToRelative(-0.77f, -0.77f, -1.0f, -1.86f, -0.69f, -2.82f)
                lineToRelative(1.63f, 1.62f)
                lineToRelative(0.11f, 0.13f)
                lineToRelative(2.41f, 2.38f)
                lineToRelative(1.93f, 1.92f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 4.58f, 0.02f)
                lineToRelative(5.33f, -5.23f)
                lineToRelative(0.14f, -0.16f)
                close()
            }
        }
        return _tagMultiple!!
    }

private var _tagMultiple: ImageVector? = null
