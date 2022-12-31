

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LearningApp: ImageVector
    get() {
        if (_learningApp != null) {
            return _learningApp!!
        }
        _learningApp = fluentIcon(name = "Filled.LearningApp") {
            fluentPath {
                moveTo(5.5f, 2.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(6.81f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -8.19f, 8.19f)
                lineTo(4.5f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.23f)
                curveToRelative(0.29f, 0.55f, 0.65f, 1.06f, 1.08f, 1.5f)
                lineTo(5.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 2.0f)
                close()
                moveTo(7.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(16.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(16.91f, 15.1f)
                lineToRelative(2.81f, 1.84f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.28f, 0.52f)
                curveToRelative(0.0f, 0.1f, -0.02f, 0.2f, -0.07f, 0.3f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.2f, 0.22f)
                lineToRelative(-2.8f, 1.92f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, -0.17f, 0.07f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.4f, -0.02f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.18f, -0.13f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.18f, -0.44f)
                verticalLineToRelative(-3.76f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.37f, -0.57f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.55f, 0.05f)
                close()
            }
        }
        return _learningApp!!
    }

private var _learningApp: ImageVector? = null
