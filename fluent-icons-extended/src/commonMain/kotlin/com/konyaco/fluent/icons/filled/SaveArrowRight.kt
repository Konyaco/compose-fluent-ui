

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SaveArrowRight: ImageVector
    get() {
        if (_saveArrowRight != null) {
            return _saveArrowRight!!
        }
        _saveArrowRight = fluentIcon(name = "Filled.SaveArrowRight") {
            fluentPath {
                moveTo(6.75f, 3.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 5.75f, 21.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(4.81f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, 7.94f, -0.73f)
                lineTo(21.0f, 8.3f)
                curveToRelative(0.0f, -0.87f, -0.34f, -1.7f, -0.95f, -2.3f)
                lineTo(18.0f, 3.95f)
                curveToRelative(-0.6f, -0.6f, -1.41f, -0.94f, -2.26f, -0.95f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(9.0f, 9.75f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                lineTo(6.75f, 3.0f)
                close()
                moveTo(8.25f, 14.25f)
                horizontalLineToRelative(3.62f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 0.15f, 6.75f)
                lineTo(7.5f, 21.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(14.25f, 3.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(9.0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(8.25f, 3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(14.5f, 17.0f)
                close()
            }
        }
        return _saveArrowRight!!
    }

private var _saveArrowRight: ImageVector? = null
