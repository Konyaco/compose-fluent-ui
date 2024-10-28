package com.konyaco.fluent.gallery.annotation

@Target(AnnotationTarget.PROPERTY)
annotation class ComponentGroup(
    val icon: String,
    val iconGlyph: Char = 'A',
    val index: Int = Int.MAX_VALUE,
    val generateScreen: Boolean = true,
    val packageMap: String = ""
)
