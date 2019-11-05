package com.naufalprakoso.jetpackcompose.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.*
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import com.naufalprakoso.jetpackcompose.data.Const
import com.naufalprakoso.jetpackcompose.ui.compose.login.Title
import com.naufalprakoso.jetpackcompose.model.News
import com.naufalprakoso.jetpackcompose.ui.compose.login.NewsCard
import com.naufalprakoso.jetpackcompose.ui.detail.DetailActivity

class HomeActivity : AppCompatActivity() {

    private val news: ArrayList<News> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadData()

        setContent {
            MaterialTheme {
                VerticalScroller {
                    Column {
                        Title()
                        HeightSpacer(height = 16.dp)
                        NewsStory(news, applicationContext)
                    }
                }
            }
        }
    }

    private fun loadData() {
        news.add(
            News(
                "Best Coffee Shop in Binus University",
                "24 January 2019",
                "Lorem ipsum dolor sit amet"
            )
        )
        news.add(
            News(
                "Best Booking app 2019",
                "25 January 2019",
                "Lorem ipsum dolor sit amet"
            )
        )
        news.add(
            News(
                "Best Movie app 2019",
                "25 January 2019",
                "Lorem ipsum dolor sit amet"
            )
        )
    }
}

@Composable
fun NewsStory(news: ArrayList<News>, context: Context) {
    VerticalScroller {
        Column(modifier = Spacing(16.dp)) {
            for (data: News in news)
                Clickable(onClick = {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    intent.putExtra(Const.NEWS_KEY, data)
                    context.startActivity(intent)
                }) {
                    NewsCard(data)
                }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Column {
            Title()
            HeightSpacer(height = 16.dp)
        }
    }
}