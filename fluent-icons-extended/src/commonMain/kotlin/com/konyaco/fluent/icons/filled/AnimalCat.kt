

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AnimalCat: ImageVector
    get() {
        if (_animalCat != null) {
            return _animalCat!!
        }
        _animalCat = fluentIcon(name = "Filled.AnimalCat") {
            fluentPath {
                moveTo(7.25f, 22.0f)
                horizontalLineTo(5.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.78f, -6.39f)
                lineToRelative(1.14f, -1.22f)
                arcToRelative(3.06f, 3.06f, 0.0f, false, false, -0.08f, -4.25f)
                lineTo(2.97f, 9.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(1.11f, 1.11f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, true, 0.11f, 6.34f)
                lineToRelative(-1.13f, 1.21f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 5.8f, 20.5f)
                horizontalLineToRelative(0.67f)
                arcTo(23.84f, 23.84f, 0.0f, false, true, 7.0f, 15.45f)
                curveToRelative(0.34f, -1.46f, 0.91f, -3.0f, 1.9f, -4.17f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 3.6f, -1.99f)
                verticalLineTo(5.15f)
                arcTo(3.15f, 3.15f, 0.0f, false, true, 15.64f, 2.0f)
                curveTo(16.4f, 2.0f, 17.0f, 2.6f, 17.0f, 3.35f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.64f)
                curveToRelative(0.95f, 0.0f, 1.83f, 0.5f, 2.33f, 1.3f)
                lineToRelative(0.62f, 1.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.09f, 4.19f)
                verticalLineToRelative(9.26f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-2.25f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 12.74f, 16.0f)
                horizontalLineTo(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(1.25f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.25f)
                close()
            }
        }
        return _animalCat!!
    }

private var _animalCat: ImageVector? = null
