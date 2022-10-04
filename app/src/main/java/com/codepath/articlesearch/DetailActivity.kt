package com.codepath.articlesearch

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var movieImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var dateView: TextView
    private lateinit var languageTextView: TextView
    private lateinit var overviewView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        movieImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        dateView = findViewById(R.id.mediaDate)
        languageTextView = findViewById(R.id.mediaLanguage)
        overviewView = findViewById(R.id.mediaOverview)

        // TODO: Get the extra from the Intent
        val movie = intent.getSerializableExtra(ARTICLE_EXTRA) as Movie
        // TODO: Set the title, byline, and abstract information from the article

        titleTextView.text = movie.originalTitle
        dateView.text = movie.date
        languageTextView.text = movie.originalLanguage
        overviewView.text = movie.overview

        // TODO: Load the media image
        Glide.with(this)
            .load(movie.bgdUrl)
            .into(movieImageView)
    }
}