package com.konyaco.fluent.layout.overflow

import androidx.compose.runtime.Composable

sealed interface OverflowRowScope {

    fun item(
        key: Any? = null,
        contentType: Any? = null,
        content: @Composable OverflowRowItemScope.() -> Unit
    )

    fun items(
        count: Int,
        key: ((index: Int) -> Any)? = null,
        contentType: (index: Int) -> Any? = { null },
        itemContent: @Composable OverflowRowItemScope.(index: Int) -> Unit
    )
}