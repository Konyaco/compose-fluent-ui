

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AnimalRabbit: ImageVector
    get() {
        if (_animalRabbit != null) {
            return _animalRabbit!!
        }
        _animalRabbit = fluentIcon(name = "Filled.AnimalRabbit") {
            fluentPath {
                moveToRelative(15.53f, 5.44f)
                lineToRelative(5.43f, 5.43f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, -3.35f, 6.0f)
                verticalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.1f)
                verticalLineToRelative(-0.75f)
                lineToRelative(-0.01f, -0.17f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.57f, -2.58f)
                horizontalLineTo(9.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineTo(10.87f)
                curveToRelative(0.6f, 0.07f, 1.06f, 0.53f, 1.12f, 1.12f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.2f, 0.02f, -0.39f, 0.04f, -0.57f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 1.87f, -3.12f)
                arcTo(4.46f, 4.46f, 0.0f, false, true, 9.5f, 10.0f)
                horizontalLineToRelative(3.6f)
                curveToRelative(0.6f, 0.0f, 1.18f, 0.11f, 1.71f, 0.33f)
                curveToRelative(0.16f, -0.28f, 0.36f, -0.54f, 0.6f, -0.78f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.11f, -2.1f)
                close()
            }
        }
        return _animalRabbit!!
    }

private var _animalRabbit: ImageVector? = null
