package com.naufalprakoso.jetpackcompose.compose.login

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import com.naufalprakoso.jetpackcompose.R
import com.naufalprakoso.jetpackcompose.model.News

@Composable
fun StoryCard(news: News) {
    val image = +imageResource(R.drawable.morning)

    Card(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        Column(
            crossAxisSize = LayoutSize.Expand,
            modifier = Spacing(16.dp)
        ) {
            Container(expanded = true, height = 180.dp) {
                Clip(shape = RoundedCornerShape(8.dp)) {
                    DrawImage(image = image)
                }
            }

            HeightSpacer(height = 16.dp)

            Text(
                text = news.title,
                maxLines = 2, overflow = TextOverflow.Ellipsis,
                style = (+themeTextStyle { h6 }).withOpacity(0.87f)
            )
            Text(
                text = news.date,
                style = (+themeTextStyle { body2 }).withOpacity(0.87f)
            )
            HeightSpacer(height = 16.dp)
            Text(
                text = news.desc,
                style = (+themeTextStyle { body2 }).withOpacity(0.6f)
            )
        }
    }
    HeightSpacer(height = 16.dp)
}