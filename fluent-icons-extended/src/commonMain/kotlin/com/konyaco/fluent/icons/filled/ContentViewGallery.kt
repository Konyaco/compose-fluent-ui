

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ContentViewGallery: ImageVector
    get() {
        if (_contentViewGallery != null) {
            return _contentViewGallery!!
        }
        _contentViewGallery = fluentIcon(name = "Filled.ContentViewGallery") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                horizontalLineToRelative(8.25f)
                verticalLineToRelative(18.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                close()
                moveTo(17.75f, 21.0f)
                lineTo(16.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                close()
                moveTo(21.0f, 14.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(1.75f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(6.0f, 13.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
                moveTo(7.25f, 6.5f)
                curveTo(6.56f, 6.5f, 6.0f, 7.06f, 6.0f, 7.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(7.5f, 10.0f)
                lineTo(7.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(6.0f, 16.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
            }
        }
        return _contentViewGallery!!
    }

private var _contentViewGallery: ImageVector? = null
