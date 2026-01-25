package io.github.composefluent.gallery.annotation

@Target(AnnotationTarget.FUNCTION)
annotation class Component(
    val name: String = "",
    val icon: String = "",
    val description: String = "",
    val group: String = "_Auto",
    val index: Int = -1,
    val enabled: Boolean = true
)