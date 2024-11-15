package com.konyaco.fluent.layout.overflow

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
import androidx.compose.foundation.lazy.layout.MutableIntervalList
import androidx.compose.runtime.Composable

@OptIn(ExperimentalFoundationApi::class)
internal class OverflowRowIntervalContent(
    content: OverflowRowScope.() -> Unit
) : OverflowRowScope, LazyLayoutIntervalContent<OverflowRowInterval>() {

    override val intervals = MutableIntervalList<OverflowRowInterval>()

    init {
        apply(content)
    }

    override fun item(
        key: Any?,
        contentType: Any?,
        content: @Composable OverflowRowItemScope.() -> Unit
    ) {
        intervals.addInterval(
            1,
            OverflowRowInterval(
                key = key?.let { { key } },
                type = { contentType },
                item = { content() }
            )
        )
    }

    override fun items(
        count: Int,
        key: ((index: Int) -> Any)?,
        contentType: (index: Int) -> Any?,
        itemContent: @Composable OverflowRowItemScope.(index: Int) -> Unit
    ) {
        intervals.addInterval(
            count,
            OverflowRowInterval(
                key = key,
                type = contentType,
                item = itemContent
            )
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
internal class OverflowRowInterval(
    override val key: ((index: Int) -> Any)?,
    override val type: ((index: Int) -> Any?),
    val item: @Composable OverflowRowItemScope.(Int) -> Unit
) : LazyLayoutIntervalContent.Interval