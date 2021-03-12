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
            post.shared = post.shared + 1
            val shareCount = findViewById<TextView>(R.id.textView3)
            var count:Int = post.shared
            if (post.shared > 0) count++
            val count1 = count / 1000
            val count2 = count / 100 % 10
            val count3 = count / 1000000
           val countK = when {
             count1 >= 1 && count / 10000 < 1 -> "$count1 , $count2 K"
               count / 10000 >= 1 -> "$count1 K"
               count >= 1000000 ->"$count3 M"
               else -> "$count"
           }

            if (post.shared > 0){
                (shareCount as TextView).setText(countK)
            }
            else{
                (shareCount as TextView).setText(countK)
            }
        }


    }
}

