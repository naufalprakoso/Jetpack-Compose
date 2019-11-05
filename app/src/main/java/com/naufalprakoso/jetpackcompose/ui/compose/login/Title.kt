package com.naufalprakoso.jetpackcompose.ui.compose.login

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.LayoutSize
import androidx.ui.material.themeTextStyle
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight

@Composable
fun Title() {
    Column(
        crossAxisSize = LayoutSize.Expand,
        crossAxisAlignment = CrossAxisAlignment.Center
    ) {
        Text(
            text = "Hello",
            style = (+themeTextStyle { h2 }).merge(TextStyle(fontWeight = FontWeight.Bold))
        )
        Text(text = "Have a nice day!", style = +themeTextStyle { body1 })
    }
}