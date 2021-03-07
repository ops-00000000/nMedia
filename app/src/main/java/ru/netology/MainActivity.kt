package ru.netology

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import ru.netology.R.drawable.ic_baseline_favorite_24

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val post = Post(
            getString(R.string.content),
            false
    )
  val likeView = findViewById<ImageView>(R.id.imageView)
    likeView.setOnClickListener {
        post.liked = !post.liked
        (it as ImageView).setImageResource(if (post.liked) ic_baseline_favorite_24 else R.drawable.ic_baseline_favorite_border_24)
    }
    }
}

