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

  val likeView = findViewById<ImageView>(R.id.imageView)
    likeView.setOnClickListener {
        post.liked = !post.liked


        (it as ImageView).setImageResource(if (post.liked){
            ic_baseline_favorite_24
        }else {R.drawable.ic_baseline_favorite_border_24})
    }

       val likeCount = findViewById<TextView>(R.id.textView)
        likeCount.setOnClickListener{
            post.liked = !post.liked
            var count:Int = post.countLike
            if (post.liked){
                count++
                (it as TextView).setText("$count")
            }
            else{
                (it as TextView).setText("$count")
            }
        }

        val ShareCount = findViewById<TextView>(R.id.textView3)
        ShareCount.setOnClickListener{
            post.shared = !post.shared
            var count:Int = post.countShares
            if (post.shared){
                count++
                (it as TextView).setText("$count")
            }
            else{
                (it as TextView).setText("$count")
            }
        }


    }
}

