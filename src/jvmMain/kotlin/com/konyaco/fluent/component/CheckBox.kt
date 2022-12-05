package com.konyaco.fluent.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.Layer

@Composable
fun CheckBox(
    checked: Boolean,
    onCheckStateChange: (checked: Boolean) -> Unit
) {
    // TODO: 2021/6/30 Animation, HoverIndication, PressIndication
    Layer(
        modifier = Modifier.size(20.dp).clickable(onClick = { onCheckStateChange(!checked) }, role = Role.Checkbox),
        shape = RoundedCornerShape(4.dp),
        border = if (checked) null else BorderStroke(1.dp, Color.LightGray),
        color = if (checked) FluentTheme.colors.accent else Color.Transparent
    ) {
// TODO: 2021/6/30  
    }
}