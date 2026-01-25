package io.github.composefluent.gallery.annotation

@Target(AnnotationTarget.PROPERTY)
annotation class ComponentGroup(
    val icon: String,
    val index: Int = Int.MAX_VALUE,
    val generateScreen: Boolean = true,
    val packageMap: String = ""
)
