package com.naufalprakoso.jetpackcompose.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import com.naufalprakoso.jetpackcompose.data.Const
import com.naufalprakoso.jetpackcompose.model.News
import com.naufalprakoso.jetpackcompose.ui.compose.login.NewsCard

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val news = intent?.getParcelableExtra<News>(Const.NEWS_KEY)

        setContent {
            MaterialTheme {
                news?.let { DetailCard(it) }
            }
        }
    }
}

@Composable
fun DetailCard(news: News) {
    NewsCard(news)
}