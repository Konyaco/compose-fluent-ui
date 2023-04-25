

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonFeedback: ImageVector
    get() {
        if (_personFeedback != null) {
            return _personFeedback!!
        }
        _personFeedback = fluentIcon(name = "Filled.PersonFeedback") {
            fluentPath {
                moveTo(14.77f, 12.4f)
                curveToRelative(0.15f, 0.07f, 0.32f, 0.1f, 0.48f, 0.1f)
                curveToRelative(0.33f, 0.0f, 0.64f, -0.13f, 0.88f, -0.36f)
                lineTo(18.31f, 10.0f)
                horizontalLineToRelative(0.94f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 7.25f)
                verticalLineToRelative(-2.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 2.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 12.0f, 4.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.26f, 0.85f, 2.32f, 2.0f, 2.65f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.0f, 0.5f, 0.31f, 0.95f, 0.77f, 1.15f)
                close()
                moveTo(8.0f, 13.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                close()
                moveTo(8.0f, 22.0f)
                curveToRelative(-2.06f, 0.0f, -3.64f, -0.56f, -4.7f, -1.67f)
                curveToRelative(-1.34f, -1.4f, -1.3f, -3.17f, -1.3f, -3.36f)
                verticalLineToRelative(-0.01f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.13f, 0.05f, 1.92f, -1.3f, 3.33f)
                curveTo(11.64f, 21.44f, 10.06f, 22.0f, 8.0f, 22.0f)
                close()
            }
        }
        return _personFeedback!!
    }

private var _personFeedback: ImageVector? = null
