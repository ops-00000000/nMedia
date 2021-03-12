package ru.netology

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import ru.netology.R.drawable.ic_baseline_favorite_24

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val post = Post(
            getString(R.string.content),
            false,
            0,
            false,
            0
    )

  val likeView = findViewById<ImageView>(R.id.like)
    likeView.setOnClickListener {
        post.liked = !post.liked
        var count:Int = post.countLike
        val likeCount = findViewById<TextView>(R.id.textView)

        (it as ImageView).setImageResource(if (post.liked){
            ic_baseline_favorite_24
        }else {R.drawable.ic_baseline_favorite_border_24})
        if (post.liked){
            count++
            (likeCount as TextView).setText("$count")
        }
        else{
            (likeCount as TextView).setText("$count")
        }
    }



        val shareView = findViewById<ImageView>(R.id.share)
        shareView.setOnClickListener{
            post.shared = !post.shared
            val shareCount = findViewById<TextView>(R.id.textView3)
            var count:Int = post.countShares
            if (post.shared){
                count++
                (shareCount as TextView).setText("$count")
            }
            else{
                (shareCount as TextView).setText("$count")
            }
        }


    }
}

