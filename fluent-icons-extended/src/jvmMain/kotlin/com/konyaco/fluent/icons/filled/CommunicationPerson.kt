

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommunicationPerson: ImageVector
    get() {
        if (_communicationPerson != null) {
            return _communicationPerson!!
        }
        _communicationPerson = fluentIcon(name = "Filled.CommunicationPerson") {
            fluentPath {
                moveTo(4.0f, 13.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.8f, -1.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.16f, 2.7f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -17.03f, 6.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.42f)
                arcTo(7.97f, 7.97f, 0.0f, false, true, 4.0f, 13.0f)
                close()
                moveTo(17.7f, 11.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.94f, 6.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.41f, -1.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.74f, -3.68f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.78f, -1.06f)
                close()
                moveTo(10.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
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
