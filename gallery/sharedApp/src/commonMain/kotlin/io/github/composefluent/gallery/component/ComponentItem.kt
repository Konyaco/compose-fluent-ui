package io.github.composefluent.gallery.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.decodeStructure
import kotlinx.serialization.encoding.encodeStructure

@Serializable(with = ComponentItem.Companion.ItemSerializer::class)
class ComponentItem(
    val name: String = "",
    val group: String,
    val description: String,
    val items: List<ComponentItem>? = null,
    val icon: ImageVector? = null,
    val content: (@Composable ComponentItem.(navigator: ComponentNavigator) -> Unit)?
): NavKey {

    companion object {
        class ItemSerializer: KSerializer<ComponentItem> {
            override val descriptor: SerialDescriptor
                get() = buildClassSerialDescriptor("ComponentItem") {
                    element("name", String.serializer().descriptor)
                    element("group", String.serializer().descriptor)
                }

            override fun deserialize(decoder: Decoder): ComponentItem {
                var name = ""
                var group = ""
                decoder.decodeStructure(descriptor) {
                    name = decodeStringElement(descriptor, 0)
                    group = decodeStringElement(descriptor, 1)
                }
                return flatMapComponents.firstOrNull { componentItem -> componentItem.name == name && componentItem.group == group } ?: ComponentItem(name, group, "", content = null)
            }

            override fun serialize(encoder: Encoder, value: ComponentItem) {
                encoder.encodeStructure(descriptor) {
                    encodeStringElement(descriptor, 0, value.name)
                    encodeStringElement(descriptor, 1, value.group)
                }
            }
        }
    }
}
