

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TagMultiple: ImageVector
    get() {
        if (_tagMultiple != null) {
            return _tagMultiple!!
        }
        _tagMultiple = fluentIcon(name = "Regular.TagMultiple") {
            fluentPath {
                moveTo(17.5f, 6.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(10.5f, 2.9f)
                curveToRelative(0.61f, -0.58f, 1.42f, -0.9f, 2.25f, -0.9f)
                horizontalLineToRelative(5.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 4.75f)
                lineTo(21.0f, 9.7f)
                curveToRelative(0.0f, 0.87f, -0.35f, 1.7f, -0.97f, 2.32f)
                lineToRelative(-6.95f, 6.83f)
                curveToRelative(-0.88f, 0.87f, -2.29f, 0.86f, -3.16f, 0.0f)
                lineToRelative(-6.26f, -6.23f)
                curveToRelative(-0.9f, -0.9f, -0.88f, -2.35f, 0.04f, -3.23f)
                lineToRelative(6.8f, -6.5f)
                close()
                moveTo(12.75f, 3.5f)
                curveToRelative(-0.45f, 0.0f, -0.88f, 0.17f, -1.2f, 0.48f)
                lineToRelative(-6.82f, 6.5f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.78f, -0.01f, 1.07f)
                lineToRelative(6.26f, 6.23f)
                curveToRelative(0.29f, 0.3f, 0.76f, 0.3f, 1.05f, 0.0f)
                lineToRelative(6.95f, -6.83f)
                curveToRelative(0.33f, -0.33f, 0.52f, -0.78f, 0.52f, -1.25f)
                lineTo(19.5f, 4.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(20.73f, 12.73f)
                lineToRelative(-1.47f, 1.45f)
                lineToRelative(-0.14f, 0.16f)
                lineToRelative(-5.33f, 5.23f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -4.58f, -0.02f)
                lineToRelative(-1.93f, -1.92f)
                lineToRelative(-2.4f, -2.38f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, -0.12f, -0.13f)
                lineTo(3.13f, 13.5f)
                curveToRelative(-0.3f, 0.96f, -0.08f, 2.05f, 0.69f, 2.81f)
                lineToRelative(4.35f, 4.31f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 6.67f, 0.02f)
                lineToRelative(5.33f, -5.23f)
                curveToRelative(0.77f, -0.76f, 1.0f, -1.86f, 0.7f, -2.81f)
                lineToRelative(-0.14f, 0.13f)
                close()
            }
        }
        return _tagMultiple!!
    }

private var _tagMultiple: ImageVector? = null
