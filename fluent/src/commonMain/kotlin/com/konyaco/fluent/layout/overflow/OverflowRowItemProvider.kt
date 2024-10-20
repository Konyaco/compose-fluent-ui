package com.konyaco.fluent.layout.overflow

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem
import androidx.compose.runtime.Composable

@OptIn(ExperimentalFoundationApi::class)
internal class OverflowRowItemProvider(
    private val state: OverflowRowState,
    private val intervalContent: OverflowRowIntervalContent
): LazyLayoutItemProvider {

    override val itemCount: Int
        get() = intervalContent.itemCount

    override fun getKey(index: Int): Any = intervalContent.getKey(index)

    override fun getContentType(index: Int): Any? = intervalContent.getContentType(index)

    @Composable
    override fun Item(index: Int, key: Any) {
        Item(index, key, itemScope = OverflowRowItemScope.OnContent)
    }

    @Composable
    fun Item(index: Int, key: Any, itemScope: OverflowRowItemScope) {
        LazyLayoutPinnableItem(key, index, state.pinnedItems) {
            intervalContent.withInterval(index) { localIndex, content ->
                content.item(itemScope, localIndex)
            }
        }
    }
}