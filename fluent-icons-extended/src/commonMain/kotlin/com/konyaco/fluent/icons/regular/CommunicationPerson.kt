

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CommunicationPerson: ImageVector
    get() {
        if (_communicationPerson != null) {
            return _communicationPerson!!
        }
        _communicationPerson = fluentIcon(name = "Regular.CommunicationPerson") {
            fluentPath {
                moveTo(3.5f, 13.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 16.88f, -1.46f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.58f, 2.4f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -17.03f, 6.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.05f, -1.05f)
                arcTo(8.47f, 8.47f, 0.0f, false, true, 3.5f, 13.0f)
                close()
                moveTo(18.2f, 11.01f)
                arcTo(6.5f, 6.5f, 0.0f, true, false, 7.4f, 17.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.07f, -1.06f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 8.3f, -5.07f)
                curveToRelative(0.42f, -0.25f, 0.9f, -0.41f, 1.42f, -0.46f)
                close()
                moveTo(9.5f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(21.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(23.0f, 19.88f)
                curveToRelative(0.0f, 1.55f, -1.29f, 3.12f, -4.5f, 3.12f)
                reflectiveCurveTo(14.0f, 21.44f, 14.0f, 19.87f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.98f, 0.8f, -1.77f, 1.77f, -1.77f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _communicationPerson!!
    }

private var _communicationPerson: ImageVector? = null
