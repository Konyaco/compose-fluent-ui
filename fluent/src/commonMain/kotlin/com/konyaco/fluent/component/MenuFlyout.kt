package com.konyaco.fluent.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun MenuFlyoutContainer(
    flyout: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    initialVisible: Boolean = false,
    placement: FlyoutPlacement = FlyoutPlacement.Top,
    content: @Composable FlyoutScope.() -> Unit
) {
    BasicFlyoutContainer(
        flyout = {
            MenuFlyout(
                visible = isFlyoutVisible,
                onDismissRequest = { isFlyoutVisible = false },
                placement = placement,
                content = flyout
            )
        },
        content = content,
        modifier = modifier,
        initialVisible = initialVisible
    )
}

@Composable
fun MenuFlyout(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    placement: FlyoutPlacement = FlyoutPlacement.Top,
    shape: Shape = RoundedCornerShape(8.dp),
    content: @Composable () -> Unit
) {
    BasicFlyout(
        visible,
        onDismissRequest,
        modifier,
        placement,
        shape,
        PaddingValues(0.dp)
    ) {
        Column {
            content()
        }
    }
}