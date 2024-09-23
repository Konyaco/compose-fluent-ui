@file:Suppress("UNCHECKED_CAST")

package com.konyaco.fluent.gallery.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.InternalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.node.PointerInputModifierNode
import androidx.compose.ui.scene.ComposeScene
import androidx.compose.ui.util.fastForEachReversed
import androidx.compose.ui.util.packFloats

@OptIn(InternalComposeUiApi::class)
@Composable
fun rememberLayoutHitTestOwner(): LayoutHitTestOwner {
    val scene = getLocalComposeScene()?.current ?: error("no compose scene")
    return remember(scene) {
        when(scene::class.qualifiedName) {
            "androidx.compose.ui.scene.MultiLayerComposeSceneImpl" -> {
                MultiLayerLayoutHitTestOwner(scene)
            }
            "androidx.compose.ui.scene.SingleLayerComposeSceneImpl" -> {
                SingleLayerLayoutHitTestOwner(scene)
            }
            else -> error("unsupported compose scene")
        }
    }
}

@OptIn(InternalComposeUiApi::class)
@Stable
private fun getLocalComposeScene(): ProvidableCompositionLocal<ComposeScene>? {
    val classLoader = ComposeScene::class.java.classLoader
    val composeSceneClass = classLoader.loadClass("androidx.compose.ui.scene.ComposeScene_skikoKt")
    val methodRef = composeSceneClass.getMethod("getLocalComposeScene")
    methodRef.trySetAccessible()
   return methodRef.invoke(null) as? ProvidableCompositionLocal<ComposeScene>
}

interface LayoutHitTestOwner {

    fun hitTest(x: Float, y: Float): Boolean {
        return false
    }
}

/*
* reflect implementation for compose 1.6
 */
internal abstract class ReflectLayoutHitTestOwner: LayoutHitTestOwner {

    @OptIn(InternalComposeUiApi::class)
    protected val classLoader = ComposeScene::class.java.classLoader!!

    private val rootNodeOwnerOwnerField = classLoader.loadClass("androidx.compose.ui.node.RootNodeOwner")
        .getDeclaredField("owner").apply {
            trySetAccessible()
        }

    private val ownerRootField = classLoader.loadClass("androidx.compose.ui.node.Owner")
        .getDeclaredMethod("getRoot").apply {
            trySetAccessible()
        }

    private val hitTestResultClass = classLoader.loadClass("androidx.compose.ui.node.HitTestResult")

    private val layoutNodeHitTestMethod = classLoader.loadClass("androidx.compose.ui.node.LayoutNode")
        .declaredMethods.first { it.name.startsWith("hitTest-") && it.parameterCount == 4 }

    protected fun getLayoutNode(rootNodeOwner: Any): Any {
        val owner = rootNodeOwnerOwnerField.get(rootNodeOwner)
        return ownerRootField.invoke(owner)
    }

    protected fun Any.layoutNodeHitTest(x: Float, y: Float): Boolean {
        val result = hitTestResultClass.getDeclaredConstructor().newInstance() as List<Modifier.Node>
        layoutNodeHitTestMethod.invoke(this, packFloats(x, y), result, false, true)
        val lastNode = result.lastOrNull()
        return lastNode is PointerInputModifierNode
    }

    protected class CopiedList<T>(
        private val populate: (MutableList<T>) -> Unit
    ) : MutableList<T> by mutableListOf() {
        inline fun withCopy(
            block: (List<T>) -> Unit
        ) {
            // In case of recursive calls, allocate new list
            val copy = if (isEmpty()) this else mutableListOf()
            populate(copy)
            try {
                block(copy)
            } finally {
                copy.clear()
            }
        }
    }
}

@OptIn(InternalComposeUiApi::class)
internal class SingleLayerLayoutHitTestOwner(scene: ComposeScene): ReflectLayoutHitTestOwner() {

    private val sceneClass = classLoader.loadClass("androidx.compose.ui.scene.SingleLayerComposeSceneImpl")

    private val mainOwnerRef = sceneClass.getDeclaredMethod("getMainOwner").let {
        it.trySetAccessible()
        it.invoke(scene)
    }

    override fun hitTest(x: Float, y: Float): Boolean {
        return getLayoutNode(mainOwnerRef).layoutNodeHitTest(x, y)
    }
}

@OptIn(InternalComposeUiApi::class)
internal class MultiLayerLayoutHitTestOwner(private val scene: ComposeScene): ReflectLayoutHitTestOwner() {

    private val sceneClass = classLoader.loadClass("androidx.compose.ui.scene.MultiLayerComposeSceneImpl")
    private val layerClass = sceneClass.declaredClasses.first {it.name == "androidx.compose.ui.scene.MultiLayerComposeSceneImpl\$AttachedComposeSceneLayer" }

    private val mainOwnerRef = sceneClass.getDeclaredField("mainOwner").let {
        it.trySetAccessible()
        it.get(scene)
    }

    private val layersRef = sceneClass.getDeclaredField("layers").let {
        it.trySetAccessible()
        it.get(scene)
    } as MutableList<Any>

    private val focusedLayerField = sceneClass.getDeclaredField("focusedLayer").apply {
        trySetAccessible()
    }

    private val layerOwnerField = layerClass
        .getDeclaredField("owner").apply {
            trySetAccessible()
        }

    private val layerIsInBoundMethod = layerClass
        .declaredMethods.first { it.name.startsWith("isInBounds") }.apply {
            trySetAccessible()
        }

    private val _layers = CopiedList {
        for (layer in layersRef) {
            it.add(layer)
        }
    }

    override fun hitTest(x: Float, y: Float): Boolean {
        _layers.withCopy {
            it.fastForEachReversed { layer ->
                if (layerIsInBoundMethod.invoke(layer, packFloats(x, y)) == true) {
                    return getLayoutNode(layerOwnerField.get(layer)).layoutNodeHitTest(x, y)
                } else if (layer == focusedLayerField.get(scene)) {
                    return false
                }
            }
        }
        return getLayoutNode(mainOwnerRef).layoutNodeHitTest(x, y)
    }

}