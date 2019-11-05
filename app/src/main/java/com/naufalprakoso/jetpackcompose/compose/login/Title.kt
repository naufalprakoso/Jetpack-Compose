package com.naufalprakoso.jetpackcompose.compose.login

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.LayoutSize
import androidx.ui.material.themeTextStyle

@Composable
fun Title() {
    Column(
        crossAxisSize = LayoutSize.Expand,
        crossAxisAlignment = CrossAxisAlignment.Center
    ) {
        Text(text = "Hello", style = (+themeTextStyle { h2 }))
        Text(text = "Have a nice day!", style = +themeTextStyle { body1 })
    }
}