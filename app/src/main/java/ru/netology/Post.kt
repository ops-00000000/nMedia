package ru.netology

data class Post(
   val content: String,
   var liked: Boolean,
   var countLike: Int,
   var shared: Int

)