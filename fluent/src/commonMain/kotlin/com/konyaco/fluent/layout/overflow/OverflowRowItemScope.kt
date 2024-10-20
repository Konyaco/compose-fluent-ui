package com.konyaco.fluent.layout.overflow

sealed interface OverflowRowItemScope {

    val isOverflow: Boolean

    data object OnContent: OverflowRowItemScope {
        override val isOverflow: Boolean = false
    }

    data object OnOverflow: OverflowRowItemScope {
        override val isOverflow: Boolean = true
    }
}
