package com.konyaco.fluent.layout.overflow

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
internal fun rememberOverflowRowState(): OverflowRowState {
    return remember { OverflowRowState() }
}
internal class OverflowRowState() {

    @OptIn(ExperimentalFoundationApi::class)
    internal val pinnedItems = LazyLayoutPinnedItemList()

    internal var overflowRange: IntRange by mutableStateOf(0..0)

}